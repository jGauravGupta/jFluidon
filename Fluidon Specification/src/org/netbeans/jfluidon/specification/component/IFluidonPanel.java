/**
 * Copyright [2014] Gaurav Gupta
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
package org.netbeans.jfluidon.specification.component;

import org.netbeans.jfluidon.controller.IWindowController;
import org.netbeans.jfluidon.controller.document.IDocumentWindowController;
import org.netbeans.jfluidon.file.IFluidonFile;
//import org.openide.explorer.ExplorerManager;

public interface IFluidonPanel {

    void componentClosed();

    void componentOpened();

    void open();

    boolean close();

    boolean isOpened();

    void requestActive();

    void init(IFluidonFile file);

    public IFluidonFile getFluidonFile();

//    ExplorerManager getExplorerManager(); //jFluidon has its own property editor
//    void setActivatedNodes(Node[] activatedNodes); //jFluidon has its own property editor
//    void changePersistenceState(boolean state);//jFluidon Framework changed the save functionality implementation
//    boolean isPersistenceState();//jFluidon Framework changed the save functionality implementation
//    void forceClose();// pending
    String getToolTipText();

    /* Custom */
    public boolean isLoaded();

    /**
     * @return the hierarchyWindowController
     */
    public IWindowController getHierarchyWindowController();

    /**
     * @return the inspectorWindowController
     */
    public IWindowController getInspectorWindowController();

    /**
     * @return the libraryWindowController
     */
    public IWindowController getLibraryWindowController();

    /**
     * @return the documentWindowController
     */
    public IDocumentWindowController getDocumentWindowController();

}
