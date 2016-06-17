/*
 * Copyright (c) 2012, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.oracle.javafx.scenebuilder.kit.editor.panel.content.guides;

import com.oracle.javafx.scenebuilder.kit.editor.panel.content.guides.node.AlignmentType;
import com.oracle.javafx.scenebuilder.kit.editor.panel.content.guides.node.NodeHorizontalLineIndex;
import com.oracle.javafx.scenebuilder.kit.editor.panel.content.guides.node.NodeSegment;
import com.oracle.javafx.scenebuilder.kit.editor.panel.content.guides.node.NodeVerticalLineIndex;
import com.oracle.javafx.scenebuilder.kit.util.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Paint;

/**
 *
 */
public class MovingGuideController {

    private final double MATCH_DISTANCE = 6.0;

    private final HorizontalLineIndex horizontalLineIndex = new HorizontalLineIndex();
    private final VerticalLineIndex verticalLineIndex = new VerticalLineIndex();

    private final NodeHorizontalLineIndex nodeHorizontalLineIndex = new NodeHorizontalLineIndex();
    private final NodeVerticalLineIndex nodeVerticalLineIndex = new NodeVerticalLineIndex();

    private final MovingGuideRenderer renderer;
    private double suggestedDX;
    private double suggestedDY;

    public MovingGuideController(Paint chromeColor, Bounds scopeInScene) {
        this.renderer = new MovingGuideRenderer(chromeColor, scopeInScene);
    }

    public void addNodeSegments(Node node) {
        assert node != null;
        assert node.getScene() != null;

        final Bounds layoutBounds = node.getLayoutBounds();
        final Bounds boundsInScene = node.localToScene(layoutBounds);
        addNodeSegments(node, boundsInScene, true /* addMiddle */);
    }

    public void addNodeSegments(Node node, Bounds boundsInScene, boolean addMiddle) {
        final double minX = boundsInScene.getMinX();
        final double minY = boundsInScene.getMinY();
        final double maxX = boundsInScene.getMaxX();
        final double maxY = boundsInScene.getMaxY();
        final double midX = (minX + maxX) / 2.0;
        final double midY = (minY + maxY) / 2.0;

        nodeHorizontalLineIndex.addLine(new NodeSegment(node, new HorizontalSegment("TOP", minX, maxX, minY), AlignmentType.TOP));
        nodeHorizontalLineIndex.addLine(new NodeSegment(node, new HorizontalSegment("BOTTOM", minX, maxX, maxY), AlignmentType.BOTTOM));
        nodeVerticalLineIndex.addLine(new NodeSegment(node, new HorizontalSegment("LEFT", minX, minY, maxY), AlignmentType.LEFT));
        nodeVerticalLineIndex.addLine(new NodeSegment(node, new HorizontalSegment("RIGHT", maxX, minY, maxY), AlignmentType.RIGHT));

        if (addMiddle) {
            nodeHorizontalLineIndex.addLine(new NodeSegment(node, new HorizontalSegment("MIDDLE_X", minX, maxX, midY), AlignmentType.MIDDLE));
            nodeVerticalLineIndex.addLine(new NodeSegment(node, new HorizontalSegment("MIDDLE_Y", midX, minY, maxY), AlignmentType.MIDDLE));
        }
    }

    public void clearNodeSegments() {
        nodeHorizontalLineIndex.clear();
        nodeVerticalLineIndex.clear();
//        clear();
    }

    public boolean hasNodeSegments() {
        return (nodeHorizontalLineIndex.isEmpty() == false) || (nodeVerticalLineIndex.isEmpty() == false);
    }

    public List<NodeSegment> getSelectedNodeSegments(Bounds targetBounds) {

        List<NodeSegment> matchingLines;
        List<NodeSegment> horizontalMatchingLines;
        List<NodeSegment> verticalMatchingLines;
        boolean matchedHorizontally = false;
        boolean matchedVertically = false;

        // Match horizontal center line of targetBounds
        horizontalMatchingLines
                = nodeHorizontalLineIndex.matchCenter(targetBounds, MATCH_DISTANCE);
        if (horizontalMatchingLines.isEmpty() == false) {
            matchedHorizontally = true;
//            final NodeSegment line = horizontalMatchingLines.get(0);
//            assert MathUtils.equals(line.getSegment().getY1(), line.getSegment().getY2());
//            final double targetMinY = targetBounds.getMinY();
//            final double targetMaxY = targetBounds.getMaxY();
//            final double targetMidY = (targetMinY + targetMaxY) / 2.0;
//            suggestedDY = line.getSegment().getY1() - targetMidY;
        }

        // Match north boundary of targetBounds
        if (matchedHorizontally == false) {
            horizontalMatchingLines
                    = nodeHorizontalLineIndex.matchNorth(targetBounds, MATCH_DISTANCE);
            if (horizontalMatchingLines.isEmpty() == false) {
                matchedHorizontally = true;
//                final NodeSegment line = horizontalMatchingLines.get(0);
//                assert MathUtils.equals(line.getSegment().getY1(), line.getSegment().getY2());
//                suggestedDY = line.getSegment().getY1() - targetBounds.getMinY();
            }
        }

        // Match south boundary of targetBounds
        if (matchedHorizontally == false) {
            horizontalMatchingLines
                    = nodeHorizontalLineIndex.matchSouth(targetBounds, MATCH_DISTANCE);
            if (horizontalMatchingLines.isEmpty() == false) {
                matchedHorizontally = true;
//                final NodeSegment line = horizontalMatchingLines.get(0);
//                assert MathUtils.equals(line.getSegment().getY1(), line.getSegment().getY2());
//                suggestedDY = line.getSegment().getY1() - targetBounds.getMaxY();
            }
        }

//        if (matchedHorizontally == false) {
//            suggestedDY = 0.0;
//        }
        // Match vertical center line of targetBounds
        verticalMatchingLines
                = nodeVerticalLineIndex.matchCenter(targetBounds, MATCH_DISTANCE);
        if (verticalMatchingLines.isEmpty() == false) {
            matchedVertically = true;
//            final NodeSegment line = verticalMatchingLines.get(0);
//            assert MathUtils.equals(line.getSegment().getX1(), line.getSegment().getX2());
//            final double targetMinX = targetBounds.getMinX();
//            final double targetMaxX = targetBounds.getMaxX();
//            final double targetMidX = (targetMinX + targetMaxX) / 2.0;
//            suggestedDX = line.getSegment().getX1() - targetMidX;
        }

        // Match west boundary of targetBounds
        if (matchedVertically == false) {
            verticalMatchingLines
                    = nodeVerticalLineIndex.matchWest(targetBounds, MATCH_DISTANCE);
            if (verticalMatchingLines.isEmpty() == false) {
                matchedVertically = true;
//                final NodeSegment line = verticalMatchingLines.get(0);
//                assert MathUtils.equals(line.getSegment().getX1(), line.getSegment().getX2());
//                suggestedDX = line.getSegment().getX1() - targetBounds.getMinX();
            }
        }

        // Match east boundary of targetBounds
        if (matchedVertically == false) {
            verticalMatchingLines
                    = nodeVerticalLineIndex.matchEast(targetBounds, MATCH_DISTANCE);
            if (verticalMatchingLines.isEmpty() == false) {
                matchedVertically = true;
//                final NodeSegment line = verticalMatchingLines.get(0);
//                assert MathUtils.equals(line.getSegment().getX1(), line.getSegment().getX2());
//                suggestedDX = line.getSegment().getX1() - targetBounds.getMaxX();
            }
        }

//        if (matchedVertically == false) {
//            suggestedDX = 0.0;
//        }
//        renderer.setLines(horizontalMatchingLines, verticalMatchingLines);
        matchingLines = new ArrayList<>(horizontalMatchingLines);
        matchingLines.addAll(verticalMatchingLines);
        return matchingLines;
    }

    public void addSampleBounds(Node node) {
        assert node != null;
        assert node.getScene() != null;

        final Bounds layoutBounds = node.getLayoutBounds();
        final Bounds boundsInScene = node.localToScene(layoutBounds);
        addSampleBounds(boundsInScene, true /* addMiddle */);
    }

    public void addSampleBounds(Bounds boundsInScene, boolean addMiddle) {
        final double minX = boundsInScene.getMinX();
        final double minY = boundsInScene.getMinY();
        final double maxX = boundsInScene.getMaxX();
        final double maxY = boundsInScene.getMaxY();
        final double midX = (minX + maxX) / 2.0;
        final double midY = (minY + maxY) / 2.0;

        horizontalLineIndex.addLine(new HorizontalSegment("X_MINY", minX, maxX, minY));
        horizontalLineIndex.addLine(new HorizontalSegment("X_MAXY", minX, maxX, maxY));
        verticalLineIndex.addLine(new VerticalSegment("MINX_Y", minX, minY, maxY));
        verticalLineIndex.addLine(new VerticalSegment("MAXX_Y", maxX, minY, maxY));

        if (addMiddle) {
            horizontalLineIndex.addLine(new HorizontalSegment("MIDDLE_Y", minX, maxX, midY));
            verticalLineIndex.addLine(new VerticalSegment("MIDDLE_X", midX, minY, maxY));
        }
    }

    public void clearSampleBounds() {
        horizontalLineIndex.clear();
        verticalLineIndex.clear();
        clear();
    }

    public boolean hasSampleBounds() {
        return (horizontalLineIndex.isEmpty() == false) || (verticalLineIndex.isEmpty() == false);
    }

    public void clear() {
        renderer.setLines(Collections.emptyList(), Collections.emptyList());
    }

    public void match(Bounds targetBounds) {
        List<HorizontalSegment> horizontalMatchingLines;
        List<VerticalSegment> verticalMatchingLines;
        boolean matchedHorizontally = false;
        boolean matchedVertically = false;

        // Match horizontal center line of targetBounds
        horizontalMatchingLines
                = horizontalLineIndex.matchCenter(targetBounds, MATCH_DISTANCE);
        if (horizontalMatchingLines.isEmpty() == false) {
            matchedHorizontally = true;
            final HorizontalSegment line = horizontalMatchingLines.get(0);
            assert MathUtils.equals(line.getY1(), line.getY2());
            final double targetMinY = targetBounds.getMinY();
            final double targetMaxY = targetBounds.getMaxY();
            final double targetMidY = (targetMinY + targetMaxY) / 2.0;
            suggestedDY = line.getY1() - targetMidY;
        }

        // Match north boundary of targetBounds
        if (matchedHorizontally == false) {
            horizontalMatchingLines
                    = horizontalLineIndex.matchNorth(targetBounds, MATCH_DISTANCE);
            if (horizontalMatchingLines.isEmpty() == false) {
                matchedHorizontally = true;
                final HorizontalSegment line = horizontalMatchingLines.get(0);
                assert MathUtils.equals(line.getY1(), line.getY2());
                suggestedDY = line.getY1() - targetBounds.getMinY();
            }
        }

        // Match south boundary of targetBounds
        if (matchedHorizontally == false) {
            horizontalMatchingLines
                    = horizontalLineIndex.matchSouth(targetBounds, MATCH_DISTANCE);
            if (horizontalMatchingLines.isEmpty() == false) {
                matchedHorizontally = true;
                final HorizontalSegment line = horizontalMatchingLines.get(0);
                assert MathUtils.equals(line.getY1(), line.getY2());
                suggestedDY = line.getY1() - targetBounds.getMaxY();
            }
        }

        if (matchedHorizontally == false) {
            suggestedDY = 0.0;
        }

        // Match vertical center line of targetBounds
        verticalMatchingLines
                = verticalLineIndex.matchCenter(targetBounds, MATCH_DISTANCE);
        if (verticalMatchingLines.isEmpty() == false) {
            matchedVertically = true;
            final VerticalSegment line = verticalMatchingLines.get(0);
            assert MathUtils.equals(line.getX1(), line.getX2());
            final double targetMinX = targetBounds.getMinX();
            final double targetMaxX = targetBounds.getMaxX();
            final double targetMidX = (targetMinX + targetMaxX) / 2.0;
            suggestedDX = line.getX1() - targetMidX;
        }

        // Match west boundary of targetBounds
        if (matchedVertically == false) {
            verticalMatchingLines
                    = verticalLineIndex.matchWest(targetBounds, MATCH_DISTANCE);
            if (verticalMatchingLines.isEmpty() == false) {
                matchedVertically = true;
                final VerticalSegment line = verticalMatchingLines.get(0);
                assert MathUtils.equals(line.getX1(), line.getX2());
                suggestedDX = line.getX1() - targetBounds.getMinX();
            }
        }

        // Match east boundary of targetBounds
        if (matchedVertically == false) {
            verticalMatchingLines
                    = verticalLineIndex.matchEast(targetBounds, MATCH_DISTANCE);
            if (verticalMatchingLines.isEmpty() == false) {
                matchedVertically = true;
                final VerticalSegment line = verticalMatchingLines.get(0);
                assert MathUtils.equals(line.getX1(), line.getX2());
                suggestedDX = line.getX1() - targetBounds.getMaxX();
            }
        }

        if (matchedVertically == false) {
            suggestedDX = 0.0;
        }

        renderer.setLines(horizontalMatchingLines, verticalMatchingLines);
    }

    public double getSuggestedDX() {
        return suggestedDX;
    }

    public double getSuggestedDY() {
        return suggestedDY;
    }

    public Group getGuideGroup() {
        return renderer.getGuideGroup();
    }
}
