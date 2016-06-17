/**
 * Copyright [2015] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.oracle.javafx.scenebuilder.kit.editor.panel.content.guides.node;

import com.oracle.javafx.scenebuilder.kit.editor.panel.content.guides.AbstractSegment;
import javafx.scene.Node;

/**
 *
 * @author Gaurav Gupta
 */
public class NodeSegment {
    
    private Node node;
    private AbstractSegment segment;
    private AlignmentType alignment;
//    private OrientationType orientation;

    public NodeSegment(Node node, AbstractSegment segment, AlignmentType alignment) {
        this.node = node;
        this.segment = segment;
        this.alignment = alignment;
    }
    
    
    

    /**
     * @return the node
     */
    public Node getNode() {
        return node;
    }

    /**
     * @param node the node to set
     */
    public void setNode(Node node) {
        this.node = node;
    }

    /**
     * @return the segment
     */
    public AbstractSegment getSegment() {
        return segment;
    }

    /**
     * @param segment the segment to set
     */
    public void setSegment(AbstractSegment segment) {
        this.segment = segment;
    }

    /**
     * @return the alignment
     */
    public AlignmentType getAlignment() {
        return alignment;
    }

    /**
     * @param alignment the alignment to set
     */
    public void setAlignment(AlignmentType alignment) {
        this.alignment = alignment;
    }

//    /**
//     * @return the orientation
//     */
//    public OrientationType getOrientation() {
//        return orientation;
//    }
//
//    /**
//     * @param orientation the orientation to set
//     */
//    public void setOrientation(OrientationType orientation) {
//        this.orientation = orientation;
//    }
    
}

//enum AlignmentType {
//    
//  
//    
//}
//
//enum OrientationType {
//    
//    VERTICAL , HORIZONTAL;
//    
//}
