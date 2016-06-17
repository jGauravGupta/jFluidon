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
package org.netbeans.jfluidon.component.inspector;

import org.netbeans.jfluidon.specification.component.IFluidonPanel;
import org.netbeans.jfluidon.component.AbstractFluidonPanel;

/**
 * Top component which displays something.
 */

public abstract class InspectorTopComponent extends AbstractFluidonPanel {

    public InspectorTopComponent(String name, String tooltipText) {
        super(name, tooltipText);
    }
    /**
     *
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public void reload(final IFluidonPanel component) {
//        Platform.runLater(() -> {
//            InspectorTopComponent inspectorTopComponent = InspectorTopComponent.getInstance();
//            System.out.println("inspectorTopComponent.getRoot() " + inspectorTopComponent.getWindowController());
//            System.out.println("component.getDocumentWindowController() " + component.getDocumentWindowController());
//            inspectorTopComponent.init(component.getInspectorWindowController());
//        });
        init(component.getInspectorWindowController());
    }



}