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

import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import org.netbeans.jfluidon.controller.IWindowController;
import org.openide.windows.TopComponent;

/**
 *
 * @author Gaurav Gupta
 */
public abstract class AbstractFluidonTopComponent extends TopComponent {

    protected Scene scene;

    public AbstractFluidonTopComponent() {
         initComponent();
    }

    public AbstractFluidonTopComponent(String name, String tooltipText) {
        initComponent();
        setName(name);
        setToolTipText(tooltipText);
    }

    private JFXPanel container;

    protected final void initComponent() {

        container = new JFXPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(container);
        container.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    /**
     * @return the container
     */
    public JFXPanel getContainer() {
        return container;
    }

    private IWindowController windowController;

    public IWindowController getWindowController() {
        return windowController;
    }

    public void setWindowController(IWindowController windowController) {
        this.windowController = windowController;
    }

}
