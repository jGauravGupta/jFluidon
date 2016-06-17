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
package org.netbeans.jfluidon.component;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.List;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javax.swing.SwingUtilities;
import org.netbeans.jfluidon.controller.IWindowController;
import org.netbeans.jfluidon.specification.component.IFluidonPanel;
import org.openide.util.Exceptions;
import org.openide.windows.TopComponent;

/**
 *
 * @author Gaurav Gupta
 */
public abstract class AbstractFluidonPanel extends AbstractFluidonTopComponent implements PropertyChangeListener {

//    public AbstractFluidonPanel(String name, String tooltipText) {
//        super(name, tooltipText);
//    }
    private boolean opened;

    public AbstractFluidonPanel(String name, String tooltipText) {
        super(name, tooltipText);
    }

    public void init(final IWindowController windowController) {
        Platform.setImplicitExit(false);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setWindowController(windowController);
                try {
                    if (scene == null) {
                        scene = new Scene(getWindowController().getPanelRoot());
                        getContainer().setScene(scene);
                    } else {
                        scene.setRoot(getWindowController().getPanelRoot());
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    Exceptions.printStackTrace(ex);
                }

            }
        });
    }

    @Override
    public void componentOpened() {
        TopComponent.getRegistry().addPropertyChangeListener(this);
        opened = true;
    }

    @Override
    public void componentClosed() {
        TopComponent.getRegistry().removePropertyChangeListener(this);
        opened = false;
    }

    private final static String[] skipNodes = {
        "ProjectTab",
        "NavigatorTC",
        "ServicesTab"
    };

    private final static List<String> skipNodesList = Arrays.asList(skipNodes);

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
//        System.out.println(opened +  " - " + TopComponent.getRegistry().getActivated() );
        if (TopComponent.getRegistry().getActivated() != null
                && (skipNodesList.contains(TopComponent.getRegistry().getActivated().getClass().getSimpleName()) || (TopComponent.getRegistry().getActivated() instanceof AbstractFluidonPanel))) {
            //skip
        } else if (opened && "activated".equals(evt.getPropertyName()) && TopComponent.getRegistry().getActivated() instanceof IFluidonPanel) {
            final IFluidonPanel fluidonPanel = (IFluidonPanel) TopComponent.getRegistry().getActivated();
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    if (fluidonPanel.isLoaded()) {
                        reload(fluidonPanel);
                        System.out.println(opened + " - " + TopComponent.getRegistry().getActivated());

                    }
                }
            });
        } else if (opened) {
            designEmptyPanel();
        }
//        else if ("tcClosed".equals(evt.getPropertyName())) {
////            hideOverrideView();
//        } else if ("tcOpened".equals(evt.getPropertyName())) {
////            hideOverrideView();
//        }

    }

    public abstract void reload(IFluidonPanel component);

    private void designEmptyPanel() {
        Platform.setImplicitExit(false);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                final Label label = new Label("No Fluidon Designer selected");
                final DropShadow dropShadow = new DropShadow();
                dropShadow.setOffsetY(3.0f);
                dropShadow.setColor(Color.color(0.4f, 0.4f, 0.4f));
                final Glow glow = new Glow(.8);
                label.setTextFill(Color.web("#606B6F"));

                label.setEffect(dropShadow);
                label.setFont(Font.font(null, FontWeight.NORMAL, 10));
                label.setOnMouseEntered(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        label.setTextFill(Color.web("#0076a3"));
                        label.setEffect(glow);
                    }
                });
                label.setOnMouseExited(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        label.setTextFill(Color.web("#606B6F"));
                        label.setEffect(dropShadow);
                    }
                });
                BorderPane borderPane = new BorderPane();
                borderPane.setCenter(label);
                if (scene == null) {
                    scene = new Scene(borderPane);
                    getContainer().setScene(scene);
                } else {
                    scene.setRoot(borderPane);
                }
            }
        });
    }
}
