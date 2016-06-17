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
//package org.netbeans.jfluidon.controller;
//
//import javax.swing.SwingUtilities;
//import org.netbeans.jfluidon.component.hierarchy.HierarchyTopComponent;
//import org.netbeans.jfluidon.component.library.LibraryTopComponent;
//
///**
// *
// * @author Gaurav Gupta
// */
//public class JFXPanelVisibilityControllerImpl implements JFXPanelVisibilityController {
//
//    @Override
//    public void showLibraryPanel() {
//
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                LibraryTopComponent libraryTopComponent = LibraryTopComponent.getInstance();
//                if (!libraryTopComponent.isOpened()) {
//                    libraryTopComponent.open();
//                }
//                libraryTopComponent.requestActive();
//            }
//        });
//    }
//
//    @Override
//    public void hideLibraryPanel() {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                LibraryTopComponent libraryTopComponent = LibraryTopComponent.getInstance();
//
//                if (libraryTopComponent.isOpened()) {
//                    libraryTopComponent.close();
//                }
//            }
//        });
//    }
//
//    @Override
//    public void showHierarchyPanel() {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                HierarchyTopComponent hierarchyTopComponent = HierarchyTopComponent.getInstance();
//                if (!hierarchyTopComponent.isOpened()) {
//                    hierarchyTopComponent.open();
//                }
//                hierarchyTopComponent.requestActive();
//            }
//        });
//
//    }
//
//    @Override
//    public void hideHierarchyPanel() {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                HierarchyTopComponent hierarchyTopComponent = HierarchyTopComponent.getInstance();
//
//                if (hierarchyTopComponent.isOpened()) {
//                    hierarchyTopComponent.close();
//                }
//            }
//        });
//    }
//
//    @Override
//    public void showCSSPanel() {
//
////        SwingUtilities.invokeLater(new Runnable() {
////            @Override
////            public void run() {
////                CSSAnalyzerTopComponent cssAnalyzerTopComponent = CSSAnalyzerTopComponent.getInstance();
////                if (!cssAnalyzerTopComponent.isOpened()) {
////                    cssAnalyzerTopComponent.open();
////                }
////                cssAnalyzerTopComponent.requestActive();
////            }
////        });
//    }
//
//    @Override
//    public void hideCSSPanel() {
////        SwingUtilities.invokeLater(new Runnable() {
////            @Override
////            public void run() {
////                CSSAnalyzerTopComponent cssAnalyzerTopComponent = CSSAnalyzerTopComponent.getInstance();
////                if (cssAnalyzerTopComponent.isOpened()) {
////                    cssAnalyzerTopComponent.close();
////                }
////            }
////        });
//    }
//
//    @Override
//    public boolean isLibraryPanelVisible() {
//        return LibraryTopComponent.getInstance().isVisible();//isOpened require EDT thread
//    }
//
//    @Override
//    public boolean isHierarchyPanelVisible() {
//        return HierarchyTopComponent.getInstance().isVisible();
//    }
//
//    @Override
//    public boolean isCSSPanelVisible() {
//        return false;//CSSAnalyzerTopComponent.getInstance().isVisible();
//    }
//
//}
