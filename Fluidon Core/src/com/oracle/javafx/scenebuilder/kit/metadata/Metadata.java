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
package com.oracle.javafx.scenebuilder.kit.metadata;

/*
 * THIS CODE IS AUTOMATICALLY GENERATED !
 */
import com.oracle.javafx.scenebuilder.kit.metadata.klass.ComponentClassMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.ComponentPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.ValuePropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.BooleanPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.BoundsPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.CursorPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoubleArrayPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.EnumerationPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.EventHandlerPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.FontPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.ImagePropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.InsetsPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.IntegerPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.ListCellPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.MaterialPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.MeshPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.ObjectPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.Point3DPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.Rectangle2DPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.StringConverterPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.StringPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.TableViewResizePolicyPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.ToggleGroupPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.TreeTableViewResizePolicyPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.effect.EffectPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.keycombination.KeyCombinationPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.list.DoubleListPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.list.StringListPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.list.TickMarkListPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.paint.ColorPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.paint.PaintPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.util.InspectorPath;
import com.oracle.javafx.scenebuilder.kit.metadata.util.InspectorPathComparator;
import com.oracle.javafx.scenebuilder.kit.metadata.util.PropertyName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.netbeans.jfluidon.config.library.ILibraryConfig;
import org.netbeans.jfluidon.config.library.entity.Category;
import org.netbeans.jfluidon.config.library.entity.LibraryWidget;
import org.netbeans.jfluidon.config.property.IPropertyConfig;
import org.netbeans.jfluidon.config.property.enity.BaseProperty;
import org.netbeans.jfluidon.config.property.enity.Component;
import org.netbeans.jfluidon.config.property.enity.CustomProperty;
import org.netbeans.jfluidon.config.property.enity.Property;
import org.netbeans.jfluidon.specification.fxom.IFXOMInstance;
import org.netbeans.jfluidon.specification.metadata.IMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IComponentClassMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IInspectorPath;
import org.netbeans.jfluidon.specification.metadata.entity.IPropertyMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IPropertyName;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

/**
 *
 */
public class Metadata implements IMetadata {

    private IPropertyConfig propertyConfig;
    private ILibraryConfig libraryConfig;

    private Map<Class<?>, IComponentClassMetadata> componentClassMap;
    private final Map<Class<?>, IComponentClassMetadata> customComponentClassMap = new WeakHashMap<>();
    private final Set<IPropertyName> hiddenProperties = new HashSet<>();
    private final Set<IPropertyName> parentRelatedProperties = new HashSet<>();
    private final List<String> sectionNames = new ArrayList<>();
    private final Map<String, List<String>> subSectionMap = new HashMap<>();

    private final Comparator<IInspectorPath> INSPECTOR_PATH_COMPARATOR
            = new InspectorPathComparator(sectionNames, subSectionMap);

//      private static Metadata metadata = null;
//
//    public static synchronized Metadata getMetadata() {
//        if (metadata == null) {
//            metadata = new Metadata();
//        }
//        return metadata;
//    }
    @Override
    public IComponentClassMetadata queryComponentMetadata(Class<?> componentClass) {
        final IComponentClassMetadata result;

        final IComponentClassMetadata componentMetadata
                = componentClassMap.get(componentClass);
        if (componentMetadata != null) {
            // componentClass is a certified component
            result = componentMetadata;
        } else {
            // componentClass is a custom component
            final IComponentClassMetadata customMetadata
                    = customComponentClassMap.get(componentClass);
            if (customMetadata != null) {
                // componentClass has already been introspected
                result = customMetadata;
            } else {
                // componentClass must be introspected
                // Let's find the first certified ancestor
                Class<?> ancestorClass = componentClass.getSuperclass();
                IComponentClassMetadata ancestorMetadata = null;
                while ((ancestorClass != null) && (ancestorMetadata == null)) {
                    ancestorMetadata = componentClassMap.get(ancestorClass);
                    ancestorClass = ancestorClass.getSuperclass();
                }
                final MetadataIntrospector introspector
                        = new MetadataIntrospector(this, componentClass, ancestorMetadata);
                result = introspector.introspect();
                customComponentClassMap.put(componentClass, result);
            }
        }

        return result;
    }

    @Override
    public Set<IPropertyMetadata> queryProperties(Class<?> componentClass) {
        final Map<IPropertyName, IPropertyMetadata> result = new HashMap<>();
        IComponentClassMetadata classMetadata = queryComponentMetadata(componentClass);

        while (classMetadata != null) {
            for (IPropertyMetadata pm : classMetadata.getProperties()) {
                if (result.containsKey(pm.getName()) == false) {
                    result.put(pm.getName(), pm);
                }
            }
            classMetadata = classMetadata.getParentMetadata();
        }

        return new HashSet<>(result.values());
    }

    @Override
    public Set<IPropertyMetadata> queryProperties(IComponentClassMetadata classMetadata) {
        final Map<IPropertyName, IPropertyMetadata> result = new HashMap<>();

        while (classMetadata != null) {
            for (IPropertyMetadata pm : classMetadata.getProperties()) {
                if (result.containsKey(pm.getName()) == false) {
                    result.put(pm.getName(), pm);
                }
            }
            classMetadata = classMetadata.getParentMetadata();
        }

        return new HashSet<>(result.values());
    }

    @Override
    public Set<IPropertyMetadata> queryProperties(Collection<Class<?>> componentClasses) {
        final Set<IPropertyMetadata> result = new HashSet<>();

        int count = 0;
        for (Class<?> componentClass : componentClasses) {
            final Set<IPropertyMetadata> propertyMetadata = queryProperties(componentClass);
            if (count == 0) {
                result.addAll(propertyMetadata);
            } else {
                result.retainAll(propertyMetadata);
            }
            count++;
        }

        return result;
    }

    @Override
    public Set<ComponentPropertyMetadata> queryComponentProperties(Class<?> componentClass) {
        final Set<ComponentPropertyMetadata> result = new HashSet<>();

        for (IPropertyMetadata propertyMetadata : queryProperties(Arrays.asList(componentClass))) {
            if (propertyMetadata instanceof ComponentPropertyMetadata) {
                result.add((ComponentPropertyMetadata) propertyMetadata);
            }
        }
        return result;
    }

    @Override
    public Set<ValuePropertyMetadata> queryValueProperties(Set<Class<?>> componentClasses) {
        final Set<ValuePropertyMetadata> result = new HashSet<>();

        for (IPropertyMetadata propertyMetadata : queryProperties(componentClasses)) {
            if (propertyMetadata instanceof ValuePropertyMetadata) {
                result.add((ValuePropertyMetadata) propertyMetadata);
            }
        }
        return result;
    }

    @Override
    public IPropertyMetadata queryProperty(Class<?> componentClass, IPropertyName targetName) {
        final Set<IPropertyMetadata> propertyMetadataSet = queryProperties(componentClass);
        final Iterator<IPropertyMetadata> iterator = propertyMetadataSet.iterator();
        IPropertyMetadata result = null;

        while ((result == null) && iterator.hasNext()) {
            final IPropertyMetadata propertyMetadata = iterator.next();
            if (propertyMetadata.getName().equals(targetName)) {
                result = propertyMetadata;
            }
        }
        if (result == null) {
            System.out.println("Property Not Found in MetaData [componentClass : " + componentClass + " targetName : " + targetName + "]");
        }
        return result;
    }

    @Override
    public IPropertyMetadata queryProperty(IComponentClassMetadata classMetadata, Property property) {
        final Set<IPropertyMetadata> propertyMetadataSet = queryProperties(classMetadata);
        final Iterator<IPropertyMetadata> iterator = propertyMetadataSet.iterator();
//        String[] prropertyClassRe/f = null;
//        if (property.getKlass() != null) {
//            prropertyClassRef = property.getKlass().split(",");
//        }
        IPropertyMetadata result = null;
        while ((result == null) && iterator.hasNext()) {
            final IPropertyMetadata propertyMetadata = iterator.next();
            if (propertyMetadata.getName().getName().equals(property.getId())) {
                if (propertyMetadata.getName().getResidenceClass() == null && property.getResidenceClass() == null) { //example : <basic id="promptText" />
                    result = propertyMetadata;
                } else if (propertyMetadata.getName().getResidenceClass().isAssignableFrom(classMetadata.getKlass())) {
                    result = propertyMetadata;
                } else {
//                    if (prropertyClassRef != null) { //example : <basic id="margin" class="javafx.scene.layout.HBox,javafx.scene.layout.VBox"/> for TextField
//                        for (String prropertyClass : prropertyClassRef) {
                    if (propertyMetadata.getName().getResidenceClass().getCanonicalName().equals(property.getResidenceClass())) {
                        result = propertyMetadata;
                        break;
                    }
//                        }
//                    }
                }
            }
        }
        return result;
    }

    @Override
    public ValuePropertyMetadata queryValueProperty(IFXOMInstance fxomInstance, IPropertyName targetName) {
        final ValuePropertyMetadata result;
        assert fxomInstance != null;
        assert targetName != null;

        if (fxomInstance.getSceneGraphObject() == null) {
            // FXOM object is unresolved
            result = null;
        } else {
            final Class<?> componentClass = fxomInstance.getSceneGraphObject().getClass();
            final IPropertyMetadata m = this.queryProperty(componentClass, targetName);//Metadata.getMetadata().queryProperty(componentClass, targetName);
            if (m instanceof ValuePropertyMetadata) {
                result = (ValuePropertyMetadata) m;
            } else {
                result = null;
            }
        }

        return result;
    }

    @Override
    public Collection<IComponentClassMetadata> getComponentClasses() {
        return componentClassMap.values();
    }

    @Override
    public Set<IPropertyName> getHiddenProperties() {
        return hiddenProperties;
    }

    @Override
    public boolean isPropertyTrimmingNeeded(IPropertyName name) {
        final boolean result;

        if (name.getResidenceClass() != null) {
            // It's a static property eg GridPane.rowIndex
            // All static property are "parent related" and needs trimming
            result = true;
        } else {
            result = parentRelatedProperties.contains(name);
        }

        return result;
    }

    @Override
    public synchronized void init() {

//        if (componentClassMap == null) {
//            componentClassMap = new HashMap<>();
//        } else {
//            return; //init already called
//        }
        componentClassMap = new HashMap<>();
        // Abstract Component Classes
        final ComponentClassMetadata NodeMetadata
                = new ComponentClassMetadata(javafx.scene.Node.class, null);
        final ComponentClassMetadata ParentMetadata
                = new ComponentClassMetadata(javafx.scene.Parent.class, NodeMetadata);
        final ComponentClassMetadata RegionMetadata
                = new ComponentClassMetadata(javafx.scene.layout.Region.class, ParentMetadata);
        final ComponentClassMetadata PaneMetadata
                = new ComponentClassMetadata(javafx.scene.layout.Pane.class, RegionMetadata);
        final ComponentClassMetadata ControlMetadata
                = new ComponentClassMetadata(javafx.scene.control.Control.class, RegionMetadata);
        final ComponentClassMetadata LabeledMetadata
                = new ComponentClassMetadata(javafx.scene.control.Labeled.class, ControlMetadata);
        final ComponentClassMetadata ButtonBaseMetadata
                = new ComponentClassMetadata(javafx.scene.control.ButtonBase.class, LabeledMetadata);

        final ComponentClassMetadata ComboBoxBaseMetadata
                = new ComponentClassMetadata(javafx.scene.control.ComboBoxBase.class, ControlMetadata);
        final ComponentClassMetadata PopupWindowMetadata
                = new ComponentClassMetadata(javafx.stage.PopupWindow.class, null);
        final ComponentClassMetadata PopupControlMetadata
                = new ComponentClassMetadata(javafx.scene.control.PopupControl.class, PopupWindowMetadata);
        final ComponentClassMetadata TextInputControlMetadata
                = new ComponentClassMetadata(javafx.scene.control.TextInputControl.class, ControlMetadata);
        final ComponentClassMetadata TableColumnBaseMetadata
                = new ComponentClassMetadata(javafx.scene.control.TableColumnBase.class, null);
        final ComponentClassMetadata MenuItemMetadata
                = new ComponentClassMetadata(javafx.scene.control.MenuItem.class, null);
        final ComponentClassMetadata TextFieldMetadata
                = new ComponentClassMetadata(javafx.scene.control.TextField.class, TextInputControlMetadata);
        final ComponentClassMetadata ProgressIndicatorMetadata
                = new ComponentClassMetadata(javafx.scene.control.ProgressIndicator.class, ControlMetadata);
        final ComponentClassMetadata ToggleButtonMetadata
                = new ComponentClassMetadata(javafx.scene.control.ToggleButton.class, ButtonBaseMetadata);
        final ComponentClassMetadata AxisMetadata
                = new ComponentClassMetadata(javafx.scene.chart.Axis.class, RegionMetadata);
        final ComponentClassMetadata ChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.Chart.class, RegionMetadata);
        final ComponentClassMetadata ValueAxisMetadata
                = new ComponentClassMetadata(javafx.scene.chart.ValueAxis.class, AxisMetadata);
        final ComponentClassMetadata XYChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.XYChart.class, ChartMetadata);
        final ComponentClassMetadata ShapeMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Shape.class, NodeMetadata);
        final ComponentClassMetadata PathElementMetadata
                = new ComponentClassMetadata(javafx.scene.shape.PathElement.class, null);
        final ComponentClassMetadata CameraMetadata
                = new ComponentClassMetadata(javafx.scene.Camera.class, NodeMetadata);
        final ComponentClassMetadata LightBaseMetadata
                = new ComponentClassMetadata(javafx.scene.LightBase.class, NodeMetadata);
        final ComponentClassMetadata Shape3DMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Shape3D.class, NodeMetadata);

        // Other Component Classes (in alphabetical order)
        final ComponentClassMetadata SwingNodeMetadata
                = new ComponentClassMetadata(javafx.embed.swing.SwingNode.class, NodeMetadata);
        final ComponentClassMetadata AmbientLightMetadata
                = new ComponentClassMetadata(javafx.scene.AmbientLight.class, LightBaseMetadata);
        final ComponentClassMetadata GroupMetadata
                = new ComponentClassMetadata(javafx.scene.Group.class, ParentMetadata);
        final ComponentClassMetadata ParallelCameraMetadata
                = new ComponentClassMetadata(javafx.scene.ParallelCamera.class, CameraMetadata);
        final ComponentClassMetadata PerspectiveCameraMetadata
                = new ComponentClassMetadata(javafx.scene.PerspectiveCamera.class, CameraMetadata);
        final ComponentClassMetadata PointLightMetadata
                = new ComponentClassMetadata(javafx.scene.PointLight.class, LightBaseMetadata);
        final ComponentClassMetadata CanvasMetadata
                = new ComponentClassMetadata(javafx.scene.canvas.Canvas.class, NodeMetadata);
        final ComponentClassMetadata AreaChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.AreaChart.class, XYChartMetadata);
        final ComponentClassMetadata BarChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.BarChart.class, XYChartMetadata);
        final ComponentClassMetadata BubbleChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.BubbleChart.class, XYChartMetadata);
        final ComponentClassMetadata CategoryAxisMetadata
                = new ComponentClassMetadata(javafx.scene.chart.CategoryAxis.class, AxisMetadata);
        final ComponentClassMetadata LineChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.LineChart.class, XYChartMetadata);
        final ComponentClassMetadata NumberAxisMetadata
                = new ComponentClassMetadata(javafx.scene.chart.NumberAxis.class, ValueAxisMetadata);
        final ComponentClassMetadata PieChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.PieChart.class, ChartMetadata);
        final ComponentClassMetadata ScatterChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.ScatterChart.class, XYChartMetadata);
        final ComponentClassMetadata StackedAreaChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.StackedAreaChart.class, XYChartMetadata);
        final ComponentClassMetadata StackedBarChartMetadata
                = new ComponentClassMetadata(javafx.scene.chart.StackedBarChart.class, XYChartMetadata);
        final ComponentClassMetadata AccordionMetadata
                = new ComponentClassMetadata(javafx.scene.control.Accordion.class, ControlMetadata);
        final ComponentClassMetadata ButtonMetadata
                = new ComponentClassMetadata(javafx.scene.control.Button.class, ButtonBaseMetadata);
        final ComponentClassMetadata CheckBoxMetadata
                = new ComponentClassMetadata(javafx.scene.control.CheckBox.class, ButtonBaseMetadata);
        final ComponentClassMetadata CheckMenuItemMetadata
                = new ComponentClassMetadata(javafx.scene.control.CheckMenuItem.class, MenuItemMetadata);
        final ComponentClassMetadata ChoiceBoxMetadata
                = new ComponentClassMetadata(javafx.scene.control.ChoiceBox.class, ControlMetadata);
        final ComponentClassMetadata ColorPickerMetadata
                = new ComponentClassMetadata(javafx.scene.control.ColorPicker.class, ComboBoxBaseMetadata);
        final ComponentClassMetadata ComboBoxMetadata
                = new ComponentClassMetadata(javafx.scene.control.ComboBox.class, ComboBoxBaseMetadata);
        final ComponentClassMetadata ContextMenuMetadata
                = new ComponentClassMetadata(javafx.scene.control.ContextMenu.class, PopupControlMetadata);
        final ComponentClassMetadata CustomMenuItemMetadata
                = new ComponentClassMetadata(javafx.scene.control.CustomMenuItem.class, MenuItemMetadata);
        final ComponentClassMetadata DatePickerMetadata
                = new ComponentClassMetadata(javafx.scene.control.DatePicker.class, ComboBoxBaseMetadata);
        final ComponentClassMetadata HyperlinkMetadata
                = new ComponentClassMetadata(javafx.scene.control.Hyperlink.class, ButtonBaseMetadata);
        final ComponentClassMetadata LabelMetadata
                = new ComponentClassMetadata(javafx.scene.control.Label.class, LabeledMetadata);
        final ComponentClassMetadata ListViewMetadata
                = new ComponentClassMetadata(javafx.scene.control.ListView.class, ControlMetadata);
        final ComponentClassMetadata MenuMetadata
                = new ComponentClassMetadata(javafx.scene.control.Menu.class, MenuItemMetadata);
        final ComponentClassMetadata MenuBarMetadata
                = new ComponentClassMetadata(javafx.scene.control.MenuBar.class, ControlMetadata);
        final ComponentClassMetadata MenuButtonMetadata
                = new ComponentClassMetadata(javafx.scene.control.MenuButton.class, ButtonBaseMetadata);
        final ComponentClassMetadata PaginationMetadata
                = new ComponentClassMetadata(javafx.scene.control.Pagination.class, ControlMetadata);
        final ComponentClassMetadata PasswordFieldMetadata
                = new ComponentClassMetadata(javafx.scene.control.PasswordField.class, TextFieldMetadata);
        final ComponentClassMetadata ProgressBarMetadata
                = new ComponentClassMetadata(javafx.scene.control.ProgressBar.class, ProgressIndicatorMetadata);
        final ComponentClassMetadata RadioButtonMetadata
                = new ComponentClassMetadata(javafx.scene.control.RadioButton.class, ToggleButtonMetadata);
        final ComponentClassMetadata RadioMenuItemMetadata
                = new ComponentClassMetadata(javafx.scene.control.RadioMenuItem.class, MenuItemMetadata);
        final ComponentClassMetadata ScrollBarMetadata
                = new ComponentClassMetadata(javafx.scene.control.ScrollBar.class, ControlMetadata);
        final ComponentClassMetadata ScrollPaneMetadata
                = new ComponentClassMetadata(javafx.scene.control.ScrollPane.class, ControlMetadata);
        final ComponentClassMetadata SeparatorMetadata
                = new ComponentClassMetadata(javafx.scene.control.Separator.class, ControlMetadata);
        final ComponentClassMetadata SeparatorMenuItemMetadata
                = new ComponentClassMetadata(javafx.scene.control.SeparatorMenuItem.class, CustomMenuItemMetadata);
        final ComponentClassMetadata SliderMetadata
                = new ComponentClassMetadata(javafx.scene.control.Slider.class, ControlMetadata);
        final ComponentClassMetadata SplitMenuButtonMetadata
                = new ComponentClassMetadata(javafx.scene.control.SplitMenuButton.class, MenuButtonMetadata);
        final ComponentClassMetadata SplitPaneMetadata
                = new ComponentClassMetadata(javafx.scene.control.SplitPane.class, ControlMetadata);
        final ComponentClassMetadata TabMetadata
                = new ComponentClassMetadata(javafx.scene.control.Tab.class, null);
        final ComponentClassMetadata TabPaneMetadata
                = new ComponentClassMetadata(javafx.scene.control.TabPane.class, ControlMetadata);
        final ComponentClassMetadata TableColumnMetadata
                = new ComponentClassMetadata(javafx.scene.control.TableColumn.class, TableColumnBaseMetadata);
        final ComponentClassMetadata TableViewMetadata
                = new ComponentClassMetadata(javafx.scene.control.TableView.class, ControlMetadata);
        final ComponentClassMetadata TextAreaMetadata
                = new ComponentClassMetadata(javafx.scene.control.TextArea.class, TextInputControlMetadata);
        final ComponentClassMetadata TitledPaneMetadata
                = new ComponentClassMetadata(javafx.scene.control.TitledPane.class, LabeledMetadata);
        final ComponentClassMetadata ToolBarMetadata
                = new ComponentClassMetadata(javafx.scene.control.ToolBar.class, ControlMetadata);
        final ComponentClassMetadata TooltipMetadata
                = new ComponentClassMetadata(javafx.scene.control.Tooltip.class, PopupControlMetadata);
        final ComponentClassMetadata TreeTableColumnMetadata
                = new ComponentClassMetadata(javafx.scene.control.TreeTableColumn.class, TableColumnBaseMetadata);
        final ComponentClassMetadata TreeTableViewMetadata
                = new ComponentClassMetadata(javafx.scene.control.TreeTableView.class, ControlMetadata);
        final ComponentClassMetadata TreeViewMetadata
                = new ComponentClassMetadata(javafx.scene.control.TreeView.class, ControlMetadata);
        final ComponentClassMetadata ImageViewMetadata
                = new ComponentClassMetadata(javafx.scene.image.ImageView.class, NodeMetadata);
        final ComponentClassMetadata AnchorPaneMetadata
                = new ComponentClassMetadata(javafx.scene.layout.AnchorPane.class, PaneMetadata);
        final ComponentClassMetadata BorderPaneMetadata
                = new ComponentClassMetadata(javafx.scene.layout.BorderPane.class, PaneMetadata);
        final ComponentClassMetadata ColumnConstraintsMetadata
                = new ComponentClassMetadata(javafx.scene.layout.ColumnConstraints.class, null);
        final ComponentClassMetadata FlowPaneMetadata
                = new ComponentClassMetadata(javafx.scene.layout.FlowPane.class, PaneMetadata);
        final ComponentClassMetadata GridPaneMetadata
                = new ComponentClassMetadata(javafx.scene.layout.GridPane.class, PaneMetadata);
        final ComponentClassMetadata HBoxMetadata
                = new ComponentClassMetadata(javafx.scene.layout.HBox.class, PaneMetadata);
        final ComponentClassMetadata RowConstraintsMetadata
                = new ComponentClassMetadata(javafx.scene.layout.RowConstraints.class, null);
        final ComponentClassMetadata StackPaneMetadata
                = new ComponentClassMetadata(javafx.scene.layout.StackPane.class, PaneMetadata);
        final ComponentClassMetadata TilePaneMetadata
                = new ComponentClassMetadata(javafx.scene.layout.TilePane.class, PaneMetadata);
        final ComponentClassMetadata VBoxMetadata
                = new ComponentClassMetadata(javafx.scene.layout.VBox.class, PaneMetadata);
        final ComponentClassMetadata MediaViewMetadata
                = new ComponentClassMetadata(javafx.scene.media.MediaView.class, NodeMetadata);
        final ComponentClassMetadata ArcMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Arc.class, ShapeMetadata);
        final ComponentClassMetadata ArcToMetadata
                = new ComponentClassMetadata(javafx.scene.shape.ArcTo.class, PathElementMetadata);
        final ComponentClassMetadata BoxMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Box.class, Shape3DMetadata);
        final ComponentClassMetadata CircleMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Circle.class, ShapeMetadata);
        final ComponentClassMetadata ClosePathMetadata
                = new ComponentClassMetadata(javafx.scene.shape.ClosePath.class, PathElementMetadata);
        final ComponentClassMetadata CubicCurveMetadata
                = new ComponentClassMetadata(javafx.scene.shape.CubicCurve.class, ShapeMetadata);
        final ComponentClassMetadata CubicCurveToMetadata
                = new ComponentClassMetadata(javafx.scene.shape.CubicCurveTo.class, PathElementMetadata);
        final ComponentClassMetadata CylinderMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Cylinder.class, Shape3DMetadata);
        final ComponentClassMetadata EllipseMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Ellipse.class, ShapeMetadata);
        final ComponentClassMetadata HLineToMetadata
                = new ComponentClassMetadata(javafx.scene.shape.HLineTo.class, PathElementMetadata);
        final ComponentClassMetadata LineMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Line.class, ShapeMetadata);
        final ComponentClassMetadata LineToMetadata
                = new ComponentClassMetadata(javafx.scene.shape.LineTo.class, PathElementMetadata);
        final ComponentClassMetadata MeshViewMetadata
                = new ComponentClassMetadata(javafx.scene.shape.MeshView.class, Shape3DMetadata);
        final ComponentClassMetadata MoveToMetadata
                = new ComponentClassMetadata(javafx.scene.shape.MoveTo.class, PathElementMetadata);
        final ComponentClassMetadata PathMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Path.class, ShapeMetadata);
        final ComponentClassMetadata PolygonMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Polygon.class, ShapeMetadata);
        final ComponentClassMetadata PolylineMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Polyline.class, ShapeMetadata);
        final ComponentClassMetadata QuadCurveMetadata
                = new ComponentClassMetadata(javafx.scene.shape.QuadCurve.class, ShapeMetadata);
        final ComponentClassMetadata QuadCurveToMetadata
                = new ComponentClassMetadata(javafx.scene.shape.QuadCurveTo.class, PathElementMetadata);
        final ComponentClassMetadata RectangleMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Rectangle.class, ShapeMetadata);
        final ComponentClassMetadata SVGPathMetadata
                = new ComponentClassMetadata(javafx.scene.shape.SVGPath.class, ShapeMetadata);
        final ComponentClassMetadata SphereMetadata
                = new ComponentClassMetadata(javafx.scene.shape.Sphere.class, Shape3DMetadata);
        final ComponentClassMetadata VLineToMetadata
                = new ComponentClassMetadata(javafx.scene.shape.VLineTo.class, PathElementMetadata);
        final ComponentClassMetadata TextMetadata
                = new ComponentClassMetadata(javafx.scene.text.Text.class, ShapeMetadata);
        final ComponentClassMetadata TextFlowMetadata
                = new ComponentClassMetadata(javafx.scene.text.TextFlow.class, PaneMetadata);
        final ComponentClassMetadata HTMLEditorMetadata
                = new ComponentClassMetadata(javafx.scene.web.HTMLEditor.class, ControlMetadata);
        final ComponentClassMetadata WebViewMetadata
                = new ComponentClassMetadata(javafx.scene.web.WebView.class, ParentMetadata);

        // Property Names
        final IPropertyName absoluteName
                = new PropertyName("absolute");
        final IPropertyName acceleratorName
                = new PropertyName("accelerator");
        final IPropertyName alignmentName
                = new PropertyName("alignment");
        final IPropertyName allowIndeterminateName
                = new PropertyName("allowIndeterminate");
        final IPropertyName alternativeColumnFillVisibleName
                = new PropertyName("alternativeColumnFillVisible");
        final IPropertyName alternativeRowFillVisibleName
                = new PropertyName("alternativeRowFillVisible");
        final IPropertyName anchorLocationName
                = new PropertyName("anchorLocation");
        final IPropertyName anchorXName
                = new PropertyName("anchorX");
        final IPropertyName anchorYName
                = new PropertyName("anchorY");
        final IPropertyName animatedName
                = new PropertyName("animated");
        final IPropertyName arcHeightName
                = new PropertyName("arcHeight");
        final IPropertyName arcWidthName
                = new PropertyName("arcWidth");
        final IPropertyName autoFixName
                = new PropertyName("autoFix");
        final IPropertyName autoHideName
                = new PropertyName("autoHide");
        final IPropertyName autoRangingName
                = new PropertyName("autoRanging");
        final IPropertyName autoSizeChildrenName
                = new PropertyName("autoSizeChildren");
        final IPropertyName barGapName
                = new PropertyName("barGap");
        final IPropertyName baselineOffsetName
                = new PropertyName("baselineOffset");
        final IPropertyName blendModeName
                = new PropertyName("blendMode");
        final IPropertyName blockIncrementName
                = new PropertyName("blockIncrement");
        final IPropertyName bottomName
                = new PropertyName("bottom");
        final IPropertyName boundsInLocalName
                = new PropertyName("boundsInLocal");
        final IPropertyName boundsInParentName
                = new PropertyName("boundsInParent");
        final IPropertyName boundsTypeName
                = new PropertyName("boundsType");
        final IPropertyName buttonCellName
                = new PropertyName("buttonCell");
        final IPropertyName cacheName
                = new PropertyName("cache");
        final IPropertyName cacheHintName
                = new PropertyName("cacheHint");
        final IPropertyName cacheShapeName
                = new PropertyName("cacheShape");
        final IPropertyName cancelButtonName
                = new PropertyName("cancelButton");
        final IPropertyName categoriesName
                = new PropertyName("categories");
        final IPropertyName categoryGapName
                = new PropertyName("categoryGap");
        final IPropertyName categorySpacingName
                = new PropertyName("categorySpacing");
        final IPropertyName centerName
                = new PropertyName("center");
        final IPropertyName centerShapeName
                = new PropertyName("centerShape");
        final IPropertyName centerXName
                = new PropertyName("centerX");
        final IPropertyName centerYName
                = new PropertyName("centerY");
        final IPropertyName childrenName
                = new PropertyName("children");
        final IPropertyName clipName
                = new PropertyName("clip");
        final IPropertyName clockwiseName
                = new PropertyName("clockwise");
        final IPropertyName closableName
                = new PropertyName("closable");
        final IPropertyName collapsibleName
                = new PropertyName("collapsible");
        final IPropertyName colorName
                = new PropertyName("color");
        final IPropertyName columnConstraintsName
                = new PropertyName("columnConstraints");
        final IPropertyName columnHalignmentName
                = new PropertyName("columnHalignment");
        final IPropertyName columnResizePolicyName
                = new PropertyName("columnResizePolicy");
        final IPropertyName columnsName
                = new PropertyName("columns");
        final IPropertyName consumeAutoHidingEventsName
                = new PropertyName("consumeAutoHidingEvents");
        final IPropertyName contentName
                = new PropertyName("content");
        final IPropertyName contentBiasName
                = new PropertyName("contentBias");
        final IPropertyName contentDisplayName
                = new PropertyName("contentDisplay");
        final IPropertyName contextMenuName
                = new PropertyName("contextMenu");
        final IPropertyName contextMenuEnabledName
                = new PropertyName("contextMenuEnabled");
        final IPropertyName controlXName
                = new PropertyName("controlX");
        final IPropertyName controlX1Name
                = new PropertyName("controlX1");
        final IPropertyName controlX2Name
                = new PropertyName("controlX2");
        final IPropertyName controlYName
                = new PropertyName("controlY");
        final IPropertyName controlY1Name
                = new PropertyName("controlY1");
        final IPropertyName controlY2Name
                = new PropertyName("controlY2");
        final IPropertyName createSymbolsName
                = new PropertyName("createSymbols");
        final IPropertyName cullFaceName
                = new PropertyName("cullFace");
        final IPropertyName currentPageIndexName
                = new PropertyName("currentPageIndex");
        final IPropertyName cursorName
                = new PropertyName("cursor");
        final IPropertyName defaultButtonName
                = new PropertyName("defaultButton");
        final IPropertyName depthName
                = new PropertyName("depth");
        final IPropertyName depthTestName
                = new PropertyName("depthTest");
        final IPropertyName disableName
                = new PropertyName("disable");
        final IPropertyName dividerPositionsName
                = new PropertyName("dividerPositions");
        final IPropertyName divisionsName
                = new PropertyName("divisions");
        final IPropertyName drawModeName
                = new PropertyName("drawMode");
        final IPropertyName editableName
                = new PropertyName("editable");
        final IPropertyName effectName
                = new PropertyName("effect");
        final IPropertyName effectiveNodeOrientationName
                = new PropertyName("effectiveNodeOrientation");
        final IPropertyName elementsName
                = new PropertyName("elements");
        final IPropertyName ellipsisStringName
                = new PropertyName("ellipsisString");
        final IPropertyName endMarginName
                = new PropertyName("endMargin");
        final IPropertyName endXName
                = new PropertyName("endX");
        final IPropertyName endYName
                = new PropertyName("endY");
        final IPropertyName expandedName
                = new PropertyName("expanded");
        final IPropertyName expandedItemCountName
                = new PropertyName("expandedItemCount");
        final IPropertyName farClipName
                = new PropertyName("farClip");
        final IPropertyName fieldOfViewName
                = new PropertyName("fieldOfView");
        final IPropertyName fillName
                = new PropertyName("fill");
        final IPropertyName fillHeightName
                = new PropertyName("fillHeight");
        final IPropertyName fillRuleName
                = new PropertyName("fillRule");
        final IPropertyName fillWidthName
                = new PropertyName("fillWidth");
        final IPropertyName fitHeightName
                = new PropertyName("fitHeight");
        final IPropertyName fitToHeightName
                = new PropertyName("fitToHeight");
        final IPropertyName fitToWidthName
                = new PropertyName("fitToWidth");
        final IPropertyName fitWidthName
                = new PropertyName("fitWidth");
        final IPropertyName fixedCellSizeName
                = new PropertyName("fixedCellSize");
        final IPropertyName fixedEyeAtCameraZeroName
                = new PropertyName("fixedEyeAtCameraZero");
        final IPropertyName focusTraversableName
                = new PropertyName("focusTraversable");
        final IPropertyName fontName
                = new PropertyName("font");
        final IPropertyName fontScaleName
                = new PropertyName("fontScale");
        final IPropertyName fontSmoothingTypeName
                = new PropertyName("fontSmoothingType");
        final IPropertyName forceZeroInRangeName
                = new PropertyName("forceZeroInRange");
        final IPropertyName gapStartAndEndName
                = new PropertyName("gapStartAndEnd");
        final IPropertyName graphicName
                = new PropertyName("graphic");
        final IPropertyName graphicTextGapName
                = new PropertyName("graphicTextGap");
        final IPropertyName gridLinesVisibleName
                = new PropertyName("gridLinesVisible");
        final IPropertyName halignmentName
                = new PropertyName("halignment");
        final IPropertyName hbarPolicyName
                = new PropertyName("hbarPolicy");
        final IPropertyName heightName
                = new PropertyName("height");
        final IPropertyName hgapName
                = new PropertyName("hgap");
        final IPropertyName hgrowName
                = new PropertyName("hgrow");
        final IPropertyName hideOnClickName
                = new PropertyName("hideOnClick");
        final IPropertyName hideOnEscapeName
                = new PropertyName("hideOnEscape");
        final IPropertyName hmaxName
                = new PropertyName("hmax");
        final IPropertyName hminName
                = new PropertyName("hmin");
        final IPropertyName horizontalGridLinesVisibleName
                = new PropertyName("horizontalGridLinesVisible");
        final IPropertyName horizontalZeroLineVisibleName
                = new PropertyName("horizontalZeroLineVisible");
        final IPropertyName htmlTextName
                = new PropertyName("htmlText");
        final IPropertyName hvalueName
                = new PropertyName("hvalue");
        final IPropertyName idName
                = new PropertyName("id");
        final IPropertyName imageName
                = new PropertyName("image");
        final IPropertyName indeterminateName
                = new PropertyName("indeterminate");
        final IPropertyName insetsName
                = new PropertyName("insets");
        final IPropertyName itemsName
                = new PropertyName("items");
        final IPropertyName labelName
                = new PropertyName("label");
        final IPropertyName labelForName
                = new PropertyName("labelFor");
        final IPropertyName labelFormatterName
                = new PropertyName("labelFormatter");
        final IPropertyName labelLineLengthName
                = new PropertyName("labelLineLength");
        final IPropertyName labelPaddingName
                = new PropertyName("labelPadding");
        final IPropertyName labelsVisibleName
                = new PropertyName("labelsVisible");
        final IPropertyName largeArcFlagName
                = new PropertyName("largeArcFlag");
        final IPropertyName layoutBoundsName
                = new PropertyName("layoutBounds");
        final IPropertyName layoutXName
                = new PropertyName("layoutX");
        final IPropertyName layoutYName
                = new PropertyName("layoutY");
        final IPropertyName leftName
                = new PropertyName("left");
        final IPropertyName legendSideName
                = new PropertyName("legendSide");
        final IPropertyName legendVisibleName
                = new PropertyName("legendVisible");
        final IPropertyName lengthName
                = new PropertyName("length");
        final IPropertyName lightOnName
                = new PropertyName("lightOn");
        final IPropertyName lineSpacingName
                = new PropertyName("lineSpacing");
        final IPropertyName lowerBoundName
                = new PropertyName("lowerBound");
        final IPropertyName majorTickUnitName
                = new PropertyName("majorTickUnit");
        final IPropertyName materialName
                = new PropertyName("material");
        final IPropertyName maxName
                = new PropertyName("max");
        final IPropertyName maxHeightName
                = new PropertyName("maxHeight");
        final IPropertyName maxPageIndicatorCountName
                = new PropertyName("maxPageIndicatorCount");
        final IPropertyName maxWidthName
                = new PropertyName("maxWidth");
        final IPropertyName menusName
                = new PropertyName("menus");

        final IPropertyName meshName
                = new PropertyName("mesh");
        final IPropertyName minName
                = new PropertyName("min");
        final IPropertyName minHeightName
                = new PropertyName("minHeight");
        final IPropertyName minorTickCountName
                = new PropertyName("minorTickCount");
        final IPropertyName minorTickLengthName
                = new PropertyName("minorTickLength");
        final IPropertyName minorTickVisibleName
                = new PropertyName("minorTickVisible");
        final IPropertyName minWidthName
                = new PropertyName("minWidth");
        final IPropertyName mnemonicParsingName
                = new PropertyName("mnemonicParsing");
        final IPropertyName mouseTransparentName
                = new PropertyName("mouseTransparent");
        final IPropertyName nearClipName
                = new PropertyName("nearClip");
        final IPropertyName nodeOrientationName
                = new PropertyName("nodeOrientation");
        final IPropertyName onActionName
                = new PropertyName("onAction");
        final IPropertyName onAutoHideName
                = new PropertyName("onAutoHide");
        final IPropertyName onClosedName
                = new PropertyName("onClosed");
        final IPropertyName onCloseRequestName
                = new PropertyName("onCloseRequest");
        final IPropertyName onContextMenuRequestedName
                = new PropertyName("onContextMenuRequested");
        final IPropertyName onDragDetectedName
                = new PropertyName("onDragDetected");
        final IPropertyName onDragDoneName
                = new PropertyName("onDragDone");
        final IPropertyName onDragDroppedName
                = new PropertyName("onDragDropped");
        final IPropertyName onDragEnteredName
                = new PropertyName("onDragEntered");
        final IPropertyName onDragExitedName
                = new PropertyName("onDragExited");
        final IPropertyName onDragOverName
                = new PropertyName("onDragOver");
        final IPropertyName onEditCancelName
                = new PropertyName("onEditCancel");
        final IPropertyName onEditCommitName
                = new PropertyName("onEditCommit");
        final IPropertyName onEditStartName
                = new PropertyName("onEditStart");
        final IPropertyName onErrorName
                = new PropertyName("onError");
        final IPropertyName onHiddenName
                = new PropertyName("onHidden");
        final IPropertyName onHidingName
                = new PropertyName("onHiding");
        final IPropertyName onInputMethodTextChangedName
                = new PropertyName("onInputMethodTextChanged");
        final IPropertyName onKeyPressedName
                = new PropertyName("onKeyPressed");
        final IPropertyName onKeyReleasedName
                = new PropertyName("onKeyReleased");
        final IPropertyName onKeyTypedName
                = new PropertyName("onKeyTyped");
        final IPropertyName onMenuValidationName
                = new PropertyName("onMenuValidation");
        final IPropertyName onMouseClickedName
                = new PropertyName("onMouseClicked");
        final IPropertyName onMouseDragEnteredName
                = new PropertyName("onMouseDragEntered");
        final IPropertyName onMouseDragExitedName
                = new PropertyName("onMouseDragExited");
        final IPropertyName onMouseDraggedName
                = new PropertyName("onMouseDragged");
        final IPropertyName onMouseDragOverName
                = new PropertyName("onMouseDragOver");
        final IPropertyName onMouseDragReleasedName
                = new PropertyName("onMouseDragReleased");
        final IPropertyName onMouseEnteredName
                = new PropertyName("onMouseEntered");
        final IPropertyName onMouseExitedName
                = new PropertyName("onMouseExited");
        final IPropertyName onMouseMovedName
                = new PropertyName("onMouseMoved");
        final IPropertyName onMousePressedName
                = new PropertyName("onMousePressed");
        final IPropertyName onMouseReleasedName
                = new PropertyName("onMouseReleased");
        final IPropertyName onRotateName
                = new PropertyName("onRotate");
        final IPropertyName onRotationFinishedName
                = new PropertyName("onRotationFinished");
        final IPropertyName onRotationStartedName
                = new PropertyName("onRotationStarted");
        final IPropertyName onScrollName
                = new PropertyName("onScroll");
        final IPropertyName onScrollFinishedName
                = new PropertyName("onScrollFinished");
        final IPropertyName onScrollStartedName
                = new PropertyName("onScrollStarted");
        final IPropertyName onScrollToName
                = new PropertyName("onScrollTo");
        final IPropertyName onScrollToColumnName
                = new PropertyName("onScrollToColumn");
        final IPropertyName onSelectionChangedName
                = new PropertyName("onSelectionChanged");
        final IPropertyName onShowingName
                = new PropertyName("onShowing");
        final IPropertyName onShownName
                = new PropertyName("onShown");
        final IPropertyName onSortName
                = new PropertyName("onSort");
        final IPropertyName onSwipeDownName
                = new PropertyName("onSwipeDown");
        final IPropertyName onSwipeLeftName
                = new PropertyName("onSwipeLeft");
        final IPropertyName onSwipeRightName
                = new PropertyName("onSwipeRight");
        final IPropertyName onSwipeUpName
                = new PropertyName("onSwipeUp");
        final IPropertyName onTouchMovedName
                = new PropertyName("onTouchMoved");
        final IPropertyName onTouchPressedName
                = new PropertyName("onTouchPressed");
        final IPropertyName onTouchReleasedName
                = new PropertyName("onTouchReleased");
        final IPropertyName onTouchStationaryName
                = new PropertyName("onTouchStationary");
        final IPropertyName onZoomName
                = new PropertyName("onZoom");
        final IPropertyName onZoomFinishedName
                = new PropertyName("onZoomFinished");
        final IPropertyName onZoomStartedName
                = new PropertyName("onZoomStarted");
        final IPropertyName opacityName
                = new PropertyName("opacity");
        final IPropertyName opaqueInsetsName
                = new PropertyName("opaqueInsets");
        final IPropertyName orientationName
                = new PropertyName("orientation");
        final IPropertyName paddingName
                = new PropertyName("padding");
        final IPropertyName pageCountName
                = new PropertyName("pageCount");
        final IPropertyName panesName
                = new PropertyName("panes");
        final IPropertyName pannableName
                = new PropertyName("pannable");
        final IPropertyName percentHeightName
                = new PropertyName("percentHeight");
        final IPropertyName percentWidthName
                = new PropertyName("percentWidth");
        final IPropertyName pickOnBoundsName
                = new PropertyName("pickOnBounds");
        final IPropertyName placeholderName
                = new PropertyName("placeholder");
        final IPropertyName pointsName
                = new PropertyName("points");
        final IPropertyName popupSideName
                = new PropertyName("popupSide");
        final IPropertyName prefColumnCountName
                = new PropertyName("prefColumnCount");
        final IPropertyName prefColumnsName
                = new PropertyName("prefColumns");
        final IPropertyName prefHeightName
                = new PropertyName("prefHeight");
        final IPropertyName prefRowCountName
                = new PropertyName("prefRowCount");
        final IPropertyName prefRowsName
                = new PropertyName("prefRows");
        final IPropertyName prefTileHeightName
                = new PropertyName("prefTileHeight");
        final IPropertyName prefTileWidthName
                = new PropertyName("prefTileWidth");
        final IPropertyName prefViewportHeightName
                = new PropertyName("prefViewportHeight");
        final IPropertyName prefViewportWidthName
                = new PropertyName("prefViewportWidth");
        final IPropertyName prefWidthName
                = new PropertyName("prefWidth");
        final IPropertyName prefWrapLengthName
                = new PropertyName("prefWrapLength");
        final IPropertyName preserveRatioName
                = new PropertyName("preserveRatio");
        final IPropertyName progressName
                = new PropertyName("progress");
        final IPropertyName promptTextName
                = new PropertyName("promptText");
        final IPropertyName radiusName
                = new PropertyName("radius");
        final IPropertyName radiusXName
                = new PropertyName("radiusX");
        final IPropertyName radiusYName
                = new PropertyName("radiusY");
        final IPropertyName resizableName
                = new PropertyName("resizable");
        final IPropertyName rightName
                = new PropertyName("right");
        final IPropertyName rotateName
                = new PropertyName("rotate");
        final IPropertyName rotateGraphicName
                = new PropertyName("rotateGraphic");
        final IPropertyName rotationAxisName
                = new PropertyName("rotationAxis");
        final IPropertyName rowConstraintsName
                = new PropertyName("rowConstraints");
        final IPropertyName rowValignmentName
                = new PropertyName("rowValignment");
        final IPropertyName scaleName
                = new PropertyName("scale");
        final IPropertyName scaleShapeName
                = new PropertyName("scaleShape");
        final IPropertyName scaleXName
                = new PropertyName("scaleX");
        final IPropertyName scaleYName
                = new PropertyName("scaleY");
        final IPropertyName scaleZName
                = new PropertyName("scaleZ");
        final IPropertyName scopeName
                = new PropertyName("scope");
        final IPropertyName scrollLeftName
                = new PropertyName("scrollLeft");
        final IPropertyName scrollTopName
                = new PropertyName("scrollTop");
        final IPropertyName selectedName
                = new PropertyName("selected");
        final IPropertyName shapeName
                = new PropertyName("shape");
        final IPropertyName showRootName
                = new PropertyName("showRoot");
        final IPropertyName showTickLabelsName
                = new PropertyName("showTickLabels");
        final IPropertyName showTickMarksName
                = new PropertyName("showTickMarks");
        final IPropertyName showWeekNumbersName
                = new PropertyName("showWeekNumbers");
        final IPropertyName sideName
                = new PropertyName("side");
        final IPropertyName smoothName
                = new PropertyName("smooth");
        final IPropertyName snapToPixelName
                = new PropertyName("snapToPixel");
        final IPropertyName snapToTicksName
                = new PropertyName("snapToTicks");
        final IPropertyName sortableName
                = new PropertyName("sortable");
        final IPropertyName sortModeName
                = new PropertyName("sortMode");
        final IPropertyName sortNodeName
                = new PropertyName("sortNode");
        final IPropertyName sortOrderName
                = new PropertyName("sortOrder");
        final IPropertyName sortTypeName
                = new PropertyName("sortType");
        final IPropertyName spacingName
                = new PropertyName("spacing");
        final IPropertyName startAngleName
                = new PropertyName("startAngle");
        final IPropertyName startMarginName
                = new PropertyName("startMargin");
        final IPropertyName startXName
                = new PropertyName("startX");
        final IPropertyName startYName
                = new PropertyName("startY");
        final IPropertyName strikethroughName
                = new PropertyName("strikethrough");
        final IPropertyName strokeName
                = new PropertyName("stroke");
        final IPropertyName strokeDashArrayName
                = new PropertyName("strokeDashArray");
        final IPropertyName strokeDashOffsetName
                = new PropertyName("strokeDashOffset");
        final IPropertyName strokeLineCapName
                = new PropertyName("strokeLineCap");
        final IPropertyName strokeLineJoinName
                = new PropertyName("strokeLineJoin");
        final IPropertyName strokeMiterLimitName
                = new PropertyName("strokeMiterLimit");
        final IPropertyName strokeTypeName
                = new PropertyName("strokeType");
        final IPropertyName strokeWidthName
                = new PropertyName("strokeWidth");
        final IPropertyName styleName
                = new PropertyName("style");
        final IPropertyName styleClassName
                = new PropertyName("styleClass");
        final IPropertyName stylesheetsName
                = new PropertyName("stylesheets");
        final IPropertyName sweepFlagName
                = new PropertyName("sweepFlag");
        final IPropertyName tabClosingPolicyName
                = new PropertyName("tabClosingPolicy");
        final IPropertyName tableMenuButtonVisibleName
                = new PropertyName("tableMenuButtonVisible");
        final IPropertyName tabMaxHeightName
                = new PropertyName("tabMaxHeight");
        final IPropertyName tabMaxWidthName
                = new PropertyName("tabMaxWidth");
        final IPropertyName tabMinHeightName
                = new PropertyName("tabMinHeight");
        final IPropertyName tabMinWidthName
                = new PropertyName("tabMinWidth");
        final IPropertyName tabsName
                = new PropertyName("tabs");
        final IPropertyName textName
                = new PropertyName("text");
        final IPropertyName actionName
                = new PropertyName("action");
        final IPropertyName textAlignmentName
                = new PropertyName("textAlignment");
        final IPropertyName textFillName
                = new PropertyName("textFill");
        final IPropertyName textOriginName
                = new PropertyName("textOrigin");
        final IPropertyName textOverrunName
                = new PropertyName("textOverrun");
        final IPropertyName tickLabelFillName
                = new PropertyName("tickLabelFill");
        final IPropertyName tickLabelFontName
                = new PropertyName("tickLabelFont");
        final IPropertyName tickLabelFormatterName
                = new PropertyName("tickLabelFormatter");
        final IPropertyName tickLabelGapName
                = new PropertyName("tickLabelGap");
        final IPropertyName tickLabelRotationName
                = new PropertyName("tickLabelRotation");
        final IPropertyName tickLabelsVisibleName
                = new PropertyName("tickLabelsVisible");
        final IPropertyName tickLengthName
                = new PropertyName("tickLength");
        final IPropertyName tickMarksName
                = new PropertyName("tickMarks");
        final IPropertyName tickMarkVisibleName
                = new PropertyName("tickMarkVisible");
        final IPropertyName tickUnitName
                = new PropertyName("tickUnit");
        final IPropertyName tileAlignmentName
                = new PropertyName("tileAlignment");
        final IPropertyName tileHeightName
                = new PropertyName("tileHeight");
        final IPropertyName tileWidthName
                = new PropertyName("tileWidth");
        final IPropertyName titleName
                = new PropertyName("title");
        final IPropertyName titleSideName
                = new PropertyName("titleSide");
        final IPropertyName toggleGroupName
                = new PropertyName("toggleGroup");
        final IPropertyName tooltipName
                = new PropertyName("tooltip");
        final IPropertyName topName
                = new PropertyName("top");
        final IPropertyName translateXName
                = new PropertyName("translateX");
        final IPropertyName translateYName
                = new PropertyName("translateY");
        final IPropertyName translateZName
                = new PropertyName("translateZ");
        final IPropertyName treeColumnName
                = new PropertyName("treeColumn");
        final IPropertyName typeName
                = new PropertyName("type");
        final IPropertyName underlineName
                = new PropertyName("underline");
        final IPropertyName unitIncrementName
                = new PropertyName("unitIncrement");
        final IPropertyName upperBoundName
                = new PropertyName("upperBound");
        final IPropertyName valignmentName
                = new PropertyName("valignment");
        final IPropertyName valueName
                = new PropertyName("value");
        final IPropertyName vbarPolicyName
                = new PropertyName("vbarPolicy");
        final IPropertyName verticalFieldOfViewName
                = new PropertyName("verticalFieldOfView");
        final IPropertyName verticalGridLinesVisibleName
                = new PropertyName("verticalGridLinesVisible");
        final IPropertyName verticalZeroLineVisibleName
                = new PropertyName("verticalZeroLineVisible");
        final IPropertyName vgapName
                = new PropertyName("vgap");
        final IPropertyName vgrowName
                = new PropertyName("vgrow");
        final IPropertyName viewportName
                = new PropertyName("viewport");
        final IPropertyName viewportBoundsName
                = new PropertyName("viewportBounds");
        final IPropertyName visibleName
                = new PropertyName("visible");
        final IPropertyName visibleAmountName
                = new PropertyName("visibleAmount");
        final IPropertyName visibleRowCountName
                = new PropertyName("visibleRowCount");
        final IPropertyName visitedName
                = new PropertyName("visited");
        final IPropertyName vmaxName
                = new PropertyName("vmax");
        final IPropertyName vminName
                = new PropertyName("vmin");
        final IPropertyName vvalueName
                = new PropertyName("vvalue");
        final IPropertyName widthName
                = new PropertyName("width");
        final IPropertyName wrappingWidthName
                = new PropertyName("wrappingWidth");
        final IPropertyName wrapTextName
                = new PropertyName("wrapText");
        final IPropertyName xName
                = new PropertyName("x");
        final IPropertyName XAxisName
                = new PropertyName("XAxis");
        final IPropertyName XAxisRotationName
                = new PropertyName("XAxisRotation");
        final IPropertyName yName
                = new PropertyName("y");
        final IPropertyName YAxisName
                = new PropertyName("YAxis");
        final IPropertyName zeroPositionName
                = new PropertyName("zeroPosition");
        final IPropertyName zoomName
                = new PropertyName("zoom");
        final IPropertyName SplitPane_resizableWithParentName
                = new PropertyName("resizableWithParent", javafx.scene.control.SplitPane.class);
        final IPropertyName AnchorPane_bottomAnchorName
                = new PropertyName("bottomAnchor", javafx.scene.layout.AnchorPane.class);
        final IPropertyName AnchorPane_leftAnchorName
                = new PropertyName("leftAnchor", javafx.scene.layout.AnchorPane.class);
        final IPropertyName AnchorPane_rightAnchorName
                = new PropertyName("rightAnchor", javafx.scene.layout.AnchorPane.class);
        final IPropertyName AnchorPane_topAnchorName
                = new PropertyName("topAnchor", javafx.scene.layout.AnchorPane.class);
        final IPropertyName BorderPane_alignmentName
                = new PropertyName("alignment", javafx.scene.layout.BorderPane.class);
        final IPropertyName BorderPane_marginName
                = new PropertyName("margin", javafx.scene.layout.BorderPane.class);
        final IPropertyName FlowPane_marginName
                = new PropertyName("margin", javafx.scene.layout.FlowPane.class);
        final IPropertyName GridPane_columnIndexName
                = new PropertyName("columnIndex", javafx.scene.layout.GridPane.class);
        final IPropertyName GridPane_columnSpanName
                = new PropertyName("columnSpan", javafx.scene.layout.GridPane.class);
        final IPropertyName GridPane_halignmentName
                = new PropertyName("halignment", javafx.scene.layout.GridPane.class);
        final IPropertyName GridPane_hgrowName
                = new PropertyName("hgrow", javafx.scene.layout.GridPane.class);
        final IPropertyName GridPane_marginName
                = new PropertyName("margin", javafx.scene.layout.GridPane.class);
        final IPropertyName GridPane_rowIndexName
                = new PropertyName("rowIndex", javafx.scene.layout.GridPane.class);
        final IPropertyName GridPane_rowSpanName
                = new PropertyName("rowSpan", javafx.scene.layout.GridPane.class);
        final IPropertyName GridPane_valignmentName
                = new PropertyName("valignment", javafx.scene.layout.GridPane.class);
        final IPropertyName GridPane_vgrowName
                = new PropertyName("vgrow", javafx.scene.layout.GridPane.class);
        final IPropertyName HBox_hgrowName
                = new PropertyName("hgrow", javafx.scene.layout.HBox.class);
        final IPropertyName HBox_marginName
                = new PropertyName("margin", javafx.scene.layout.HBox.class);
        final IPropertyName StackPane_alignmentName
                = new PropertyName("alignment", javafx.scene.layout.StackPane.class);
        final IPropertyName StackPane_marginName
                = new PropertyName("margin", javafx.scene.layout.StackPane.class);
        final IPropertyName TilePane_alignmentName
                = new PropertyName("alignment", javafx.scene.layout.TilePane.class);
        final IPropertyName TilePane_marginName
                = new PropertyName("margin", javafx.scene.layout.TilePane.class);
        final IPropertyName VBox_marginName
                = new PropertyName("margin", javafx.scene.layout.VBox.class);
        final IPropertyName VBox_vgrowName
                = new PropertyName("vgrow", javafx.scene.layout.VBox.class);

        // Property Metadata
        final ValuePropertyMetadata absolutePropertyMetadata
                = new BooleanPropertyMetadata(
                        absoluteName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 0));
        final ValuePropertyMetadata acceleratorPropertyMetadata
                = new KeyCombinationPropertyMetadata(
                        acceleratorName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 1));
        final ValuePropertyMetadata alignment_TOP_LEFT_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        alignmentName,
                        javafx.geometry.Pos.class,
                        true, /* readWrite */
                        javafx.geometry.Pos.TOP_LEFT, /* defaultValue */
                        new InspectorPath("Properties", "Node", 0));
        final ValuePropertyMetadata alignment_CENTER_LEFT_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        alignmentName,
                        javafx.geometry.Pos.class,
                        true, /* readWrite */
                        javafx.geometry.Pos.CENTER_LEFT, /* defaultValue */
                        new InspectorPath("Properties", "Node", 0));
        final ValuePropertyMetadata alignment_CENTER_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        alignmentName,
                        javafx.geometry.Pos.class,
                        true, /* readWrite */
                        javafx.geometry.Pos.CENTER, /* defaultValue */
                        new InspectorPath("Properties", "Node", 0));
        final ValuePropertyMetadata allowIndeterminatePropertyMetadata
                = new BooleanPropertyMetadata(
                        allowIndeterminateName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 2));
        final ValuePropertyMetadata alternativeColumnFillVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        alternativeColumnFillVisibleName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 88));
        final ValuePropertyMetadata alternativeRowFillVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        alternativeRowFillVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 95));
        final ValuePropertyMetadata anchorLocationPropertyMetadata
                = new EnumerationPropertyMetadata(
                        anchorLocationName,
                        javafx.stage.PopupWindow.AnchorLocation.class,
                        true, /* readWrite */
                        javafx.stage.PopupWindow.AnchorLocation.CONTENT_TOP_LEFT, /* defaultValue */
                        new InspectorPath("Layout", "Position", 11));
        final ValuePropertyMetadata anchorXPropertyMetadata
                = new DoublePropertyMetadata(
                        anchorXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        Double.NaN, /* defaultValue */
                        new InspectorPath("Layout", "Position", 9));
        final ValuePropertyMetadata anchorYPropertyMetadata
                = new DoublePropertyMetadata(
                        anchorYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        Double.NaN, /* defaultValue */
                        new InspectorPath("Layout", "Position", 10));
        final ValuePropertyMetadata animatedPropertyMetadata
                = new BooleanPropertyMetadata(
                        animatedName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 41));
        final ValuePropertyMetadata arcHeightPropertyMetadata
                = new DoublePropertyMetadata(
                        arcHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 42));
        final ValuePropertyMetadata arcWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        arcWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 3));
        final ValuePropertyMetadata autoFixPropertyMetadata
                = new BooleanPropertyMetadata(
                        autoFixName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 4));
        final ValuePropertyMetadata autoHide_true_PropertyMetadata
                = new BooleanPropertyMetadata(
                        autoHideName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 43));
        final ValuePropertyMetadata autoHide_false_PropertyMetadata
                = new BooleanPropertyMetadata(
                        autoHideName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 43));
        final ValuePropertyMetadata autoRangingPropertyMetadata
                = new BooleanPropertyMetadata(
                        autoRangingName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 70));
        final ValuePropertyMetadata autoSizeChildrenPropertyMetadata
                = new BooleanPropertyMetadata(
                        autoSizeChildrenName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Layout", "Extras", 0));
        final ValuePropertyMetadata barGapPropertyMetadata
                = new DoublePropertyMetadata(
                        barGapName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        4.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 76));
        final ValuePropertyMetadata baselineOffsetPropertyMetadata
                = new DoublePropertyMetadata(
                        baselineOffsetName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Extras", 1));
        final ValuePropertyMetadata blendModePropertyMetadata
                = new EnumerationPropertyMetadata(
                        blendModeName,
                        javafx.scene.effect.BlendMode.class,
                        "SRC_OVER", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Properties", "Extras", 0));
        final ValuePropertyMetadata blockIncrementPropertyMetadata
                = new DoublePropertyMetadata(
                        blockIncrementName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        10.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 71));
        final ComponentPropertyMetadata bottomPropertyMetadata
                = new ComponentPropertyMetadata(
                        bottomName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata boundsInLocalPropertyMetadata
                = new BoundsPropertyMetadata(
                        boundsInLocalName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Bounds", 2));
        final ValuePropertyMetadata boundsInParentPropertyMetadata
                = new BoundsPropertyMetadata(
                        boundsInParentName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Bounds", 3));
        final ValuePropertyMetadata boundsTypePropertyMetadata
                = new EnumerationPropertyMetadata(
                        boundsTypeName,
                        javafx.scene.text.TextBoundsType.class,
                        true, /* readWrite */
                        javafx.scene.text.TextBoundsType.LOGICAL, /* defaultValue */
                        new InspectorPath("Layout", "Extras", 2));
        final ValuePropertyMetadata buttonCellPropertyMetadata
                = new ListCellPropertyMetadata(
                        buttonCellName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 38));
        final ValuePropertyMetadata cachePropertyMetadata
                = new BooleanPropertyMetadata(
                        cacheName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Extras", 2));
        final ValuePropertyMetadata cacheHintPropertyMetadata
                = new EnumerationPropertyMetadata(
                        cacheHintName,
                        javafx.scene.CacheHint.class,
                        true, /* readWrite */
                        javafx.scene.CacheHint.DEFAULT, /* defaultValue */
                        new InspectorPath("Properties", "Extras", 3));
        final ValuePropertyMetadata cacheShapePropertyMetadata
                = new BooleanPropertyMetadata(
                        cacheShapeName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Node", 7));
        final ValuePropertyMetadata cancelButtonPropertyMetadata
                = new BooleanPropertyMetadata(
                        cancelButtonName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 44));
        final ValuePropertyMetadata categoriesPropertyMetadata
                = new StringListPropertyMetadata(
                        categoriesName,
                        true, /* readWrite */
                        Collections.emptyList(), /* defaultValue */
                        new InspectorPath("Properties", "Specific", 77));
        final ValuePropertyMetadata categoryGapPropertyMetadata
                = new DoublePropertyMetadata(
                        categoryGapName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        10.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 78));
        final ValuePropertyMetadata categorySpacingPropertyMetadata
                = new DoublePropertyMetadata(
                        categorySpacingName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "Specific", 79));
        final ComponentPropertyMetadata centerPropertyMetadata
                = new ComponentPropertyMetadata(
                        centerName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata centerShapePropertyMetadata
                = new BooleanPropertyMetadata(
                        centerShapeName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Node", 8));
        final ValuePropertyMetadata centerXPropertyMetadata
                = new DoublePropertyMetadata(
                        centerXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 0));
        final ValuePropertyMetadata centerYPropertyMetadata
                = new DoublePropertyMetadata(
                        centerYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 1));
        final ComponentPropertyMetadata childrenPropertyMetadata
                = new ComponentPropertyMetadata(
                        childrenName,
                        NodeMetadata,
                        true); /* collection */

        final ComponentPropertyMetadata clipPropertyMetadata
                = new ComponentPropertyMetadata(
                        clipName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata clockwisePropertyMetadata
                = new BooleanPropertyMetadata(
                        clockwiseName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 89));
        final ValuePropertyMetadata closablePropertyMetadata
                = new BooleanPropertyMetadata(
                        closableName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 5));
        final ValuePropertyMetadata collapsiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        collapsibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 60));
        final ValuePropertyMetadata colorPropertyMetadata
                = new ColorPropertyMetadata(
                        colorName,
                        true, /* readWrite */
                        javafx.scene.paint.Color.WHITE, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 6));
        final ComponentPropertyMetadata columnConstraintsPropertyMetadata
                = new ComponentPropertyMetadata(
                        columnConstraintsName,
                        ColumnConstraintsMetadata,
                        true); /* collection */

        final ValuePropertyMetadata columnHalignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        columnHalignmentName,
                        javafx.geometry.HPos.class,
                        true, /* readWrite */
                        javafx.geometry.HPos.LEFT, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 61));
        final ValuePropertyMetadata columnResizePolicy_TABLEVIEW_UNCONSTRAINED_PropertyMetadata
                = new TableViewResizePolicyPropertyMetadata(
                        columnResizePolicyName,
                        true, /* readWrite */
                        javafx.scene.control.TableView.UNCONSTRAINED_RESIZE_POLICY, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 32));
        final ValuePropertyMetadata columnResizePolicy_TREETABLEVIEW_UNCONSTRAINED_PropertyMetadata
                = new TreeTableViewResizePolicyPropertyMetadata(
                        columnResizePolicyName,
                        true, /* readWrite */
                        javafx.scene.control.TreeTableView.UNCONSTRAINED_RESIZE_POLICY, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 32));
        final ComponentPropertyMetadata columns_TableColumn_PropertyMetadata
                = new ComponentPropertyMetadata(
                        columnsName,
                        TableColumnMetadata,
                        true); /* collection */

        final ComponentPropertyMetadata columns_TreeTableColumn_PropertyMetadata
                = new ComponentPropertyMetadata(
                        columnsName,
                        TreeTableColumnMetadata,
                        true); /* collection */

        final ValuePropertyMetadata consumeAutoHidingEventsPropertyMetadata
                = new BooleanPropertyMetadata(
                        consumeAutoHidingEventsName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 62));
        final ComponentPropertyMetadata content_Node_NULL_PropertyMetadata
                = new ComponentPropertyMetadata(
                        contentName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata content_String_PropertyMetadata
                = new StringPropertyMetadata(
                        contentName,
                        true, /* readWrite */
                        "", /* defaultValue */
                        new InspectorPath("Properties", "Specific", 9));
        final ComponentPropertyMetadata content_Node_SEPARATOR_PropertyMetadata
                = new ComponentPropertyMetadata(
                        contentName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata contentBiasPropertyMetadata
                = new EnumerationPropertyMetadata(
                        contentBiasName,
                        javafx.geometry.Orientation.class,
                        "NONE", /* null equivalent */
                        false, /* readWrite */
                        new InspectorPath("Layout", "Extras", 4));
        final ValuePropertyMetadata contentDisplayPropertyMetadata
                = new EnumerationPropertyMetadata(
                        contentDisplayName,
                        javafx.scene.control.ContentDisplay.class,
                        true, /* readWrite */
                        javafx.scene.control.ContentDisplay.LEFT, /* defaultValue */
                        new InspectorPath("Properties", "Graphic", 1));
        final ComponentPropertyMetadata contextMenuPropertyMetadata
                = new ComponentPropertyMetadata(
                        contextMenuName,
                        ContextMenuMetadata,
                        false); /* collection */

        final ValuePropertyMetadata contextMenuEnabledPropertyMetadata
                = new BooleanPropertyMetadata(
                        contextMenuEnabledName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 10));
        final ValuePropertyMetadata controlXPropertyMetadata
                = new DoublePropertyMetadata(
                        controlXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 14));
        final ValuePropertyMetadata controlX1PropertyMetadata
                = new DoublePropertyMetadata(
                        controlX1Name,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 16));
        final ValuePropertyMetadata controlX2PropertyMetadata
                = new DoublePropertyMetadata(
                        controlX2Name,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 18));
        final ValuePropertyMetadata controlYPropertyMetadata
                = new DoublePropertyMetadata(
                        controlYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 15));
        final ValuePropertyMetadata controlY1PropertyMetadata
                = new DoublePropertyMetadata(
                        controlY1Name,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 17));
        final ValuePropertyMetadata controlY2PropertyMetadata
                = new DoublePropertyMetadata(
                        controlY2Name,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 19));
        final ValuePropertyMetadata createSymbolsPropertyMetadata
                = new BooleanPropertyMetadata(
                        createSymbolsName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 80));
        final ValuePropertyMetadata cullFacePropertyMetadata
                = new EnumerationPropertyMetadata(
                        cullFaceName,
                        javafx.scene.shape.CullFace.class,
                        true, /* readWrite */
                        javafx.scene.shape.CullFace.BACK, /* defaultValue */
                        new InspectorPath("Properties", "3D", 8));
        final ValuePropertyMetadata currentPageIndexPropertyMetadata
                = new IntegerPropertyMetadata(
                        currentPageIndexName,
                        true, /* readWrite */
                        0, /* defaultValue */
                        new InspectorPath("Properties", "Pagination", 0));
        final ValuePropertyMetadata cursor_HAND_PropertyMetadata
                = new CursorPropertyMetadata(
                        cursorName,
                        true, /* readWrite */
                        javafx.scene.Cursor.HAND, /* defaultValue */
                        new InspectorPath("Properties", "Node", 13));
        final ValuePropertyMetadata cursor_NULL_PropertyMetadata
                = new CursorPropertyMetadata(
                        cursorName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Node", 13));
        final ValuePropertyMetadata defaultButtonPropertyMetadata
                = new BooleanPropertyMetadata(
                        defaultButtonName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 12));
        final ValuePropertyMetadata depthPropertyMetadata
                = new DoublePropertyMetadata(
                        depthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        2.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 29));
        final ValuePropertyMetadata depthTestPropertyMetadata
                = new EnumerationPropertyMetadata(
                        depthTestName,
                        javafx.scene.DepthTest.class,
                        true, /* readWrite */
                        javafx.scene.DepthTest.INHERIT, /* defaultValue */
                        new InspectorPath("Properties", "Extras", 4));
        final ValuePropertyMetadata disablePropertyMetadata
                = new BooleanPropertyMetadata(
                        disableName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Node", 1));
        final ValuePropertyMetadata dividerPositionsPropertyMetadata
                = new DoubleArrayPropertyMetadata(
                        dividerPositionsName,
                        true, /* readWrite */
                        Collections.emptyList(), /* defaultValue */
                        new InspectorPath("Properties", "Specific", 14));
        final ValuePropertyMetadata divisionsPropertyMetadata
                = new IntegerPropertyMetadata(
                        divisionsName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "3D", 10));
        final ValuePropertyMetadata drawModePropertyMetadata
                = new EnumerationPropertyMetadata(
                        drawModeName,
                        javafx.scene.shape.DrawMode.class,
                        true, /* readWrite */
                        javafx.scene.shape.DrawMode.FILL, /* defaultValue */
                        new InspectorPath("Properties", "3D", 9));
        final ValuePropertyMetadata editable_false_PropertyMetadata
                = new BooleanPropertyMetadata(
                        editableName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 15));
        final ValuePropertyMetadata editable_true_PropertyMetadata
                = new BooleanPropertyMetadata(
                        editableName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 15));
        final ValuePropertyMetadata effectPropertyMetadata
                = new EffectPropertyMetadata(
                        effectName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Node", 14));
        final ValuePropertyMetadata effectiveNodeOrientationPropertyMetadata
                = new EnumerationPropertyMetadata(
                        effectiveNodeOrientationName,
                        javafx.geometry.NodeOrientation.class,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Extras", 7));
        final ComponentPropertyMetadata elementsPropertyMetadata
                = new ComponentPropertyMetadata(
                        elementsName,
                        PathElementMetadata,
                        true); /* collection */

        final ValuePropertyMetadata ellipsisStringPropertyMetadata
                = new StringPropertyMetadata(
                        ellipsisStringName,
                        true, /* readWrite */
                        "...", /* defaultValue */
                        new InspectorPath("Properties", "Text", 10));
        final ValuePropertyMetadata endMarginPropertyMetadata
                = new DoublePropertyMetadata(
                        endMarginName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        5.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 96));
        final ValuePropertyMetadata endXPropertyMetadata
                = new DoublePropertyMetadata(
                        endXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 7));
        final ValuePropertyMetadata endYPropertyMetadata
                = new DoublePropertyMetadata(
                        endYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 8));
        final ValuePropertyMetadata expandedPropertyMetadata
                = new BooleanPropertyMetadata(
                        expandedName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 16));
        final ValuePropertyMetadata expandedItemCountPropertyMetadata
                = new IntegerPropertyMetadata(
                        expandedItemCountName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "Specific", 17));
        final ValuePropertyMetadata farClipPropertyMetadata
                = new DoublePropertyMetadata(
                        farClipName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        100.0, /* defaultValue */
                        new InspectorPath("Properties", "3D", 3));
        final ValuePropertyMetadata fieldOfViewPropertyMetadata
                = new DoublePropertyMetadata(
                        fieldOfViewName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.ANGLE,
                        true, /* readWrite */
                        30.0, /* defaultValue */
                        new InspectorPath("Properties", "3D", 4));
        final ValuePropertyMetadata fill_NULL_PropertyMetadata
                = new PaintPropertyMetadata(
                        fillName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 18));
        final ValuePropertyMetadata fill_BLACK_PropertyMetadata
                = new PaintPropertyMetadata(
                        fillName,
                        true, /* readWrite */
                        javafx.scene.paint.Color.BLACK, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 18));
        final ValuePropertyMetadata fillHeightPropertyMetadata
                = new BooleanPropertyMetadata(
                        fillHeightName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Layout", "Specific", 0));
        final ValuePropertyMetadata fillRulePropertyMetadata
                = new EnumerationPropertyMetadata(
                        fillRuleName,
                        javafx.scene.shape.FillRule.class,
                        true, /* readWrite */
                        javafx.scene.shape.FillRule.NON_ZERO, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 19));
        final ValuePropertyMetadata fillWidthPropertyMetadata
                = new BooleanPropertyMetadata(
                        fillWidthName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Layout", "Specific", 1));
        final ValuePropertyMetadata fitHeightPropertyMetadata
                = new DoublePropertyMetadata(
                        fitHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 22));
        final ValuePropertyMetadata fitToHeightPropertyMetadata
                = new BooleanPropertyMetadata(
                        fitToHeightName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Layout", "Size", 20));
        final ValuePropertyMetadata fitToWidthPropertyMetadata
                = new BooleanPropertyMetadata(
                        fitToWidthName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Layout", "Size", 19));
        final ValuePropertyMetadata fitWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        fitWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 21));
        final ValuePropertyMetadata fixedCellSizePropertyMetadata
                = new DoublePropertyMetadata(
                        fixedCellSizeName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 127));
        final ValuePropertyMetadata fixedEyeAtCameraZeroPropertyMetadata
                = new BooleanPropertyMetadata(
                        fixedEyeAtCameraZeroName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "3D", 6));
        final ValuePropertyMetadata focusTraversable_true_PropertyMetadata
                = new BooleanPropertyMetadata(
                        focusTraversableName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Node", 6));
        final ValuePropertyMetadata focusTraversable_false_PropertyMetadata
                = new BooleanPropertyMetadata(
                        focusTraversableName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Node", 6));
        final ValuePropertyMetadata fontPropertyMetadata
                = new FontPropertyMetadata(
                        fontName,
                        true, /* readWrite */
                        javafx.scene.text.Font.getDefault(), /* defaultValue */
                        new InspectorPath("Properties", "Text", 3));
        final ValuePropertyMetadata fontScalePropertyMetadata
                = new DoublePropertyMetadata(
                        fontScaleName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Properties", "Text", 0));
        final ValuePropertyMetadata fontSmoothingType_GRAY_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        fontSmoothingTypeName,
                        javafx.scene.text.FontSmoothingType.class,
                        true, /* readWrite */
                        javafx.scene.text.FontSmoothingType.GRAY, /* defaultValue */
                        new InspectorPath("Properties", "Text", 4));
        final ValuePropertyMetadata fontSmoothingType_LCD_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        fontSmoothingTypeName,
                        javafx.scene.text.FontSmoothingType.class,
                        true, /* readWrite */
                        javafx.scene.text.FontSmoothingType.LCD, /* defaultValue */
                        new InspectorPath("Properties", "Text", 4));
        final ValuePropertyMetadata forceZeroInRangePropertyMetadata
                = new BooleanPropertyMetadata(
                        forceZeroInRangeName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 120));
        final ValuePropertyMetadata gapStartAndEndPropertyMetadata
                = new BooleanPropertyMetadata(
                        gapStartAndEndName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 101));
        final ComponentPropertyMetadata graphicPropertyMetadata
                = new ComponentPropertyMetadata(
                        graphicName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata graphicTextGapPropertyMetadata
                = new DoublePropertyMetadata(
                        graphicTextGapName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        4.0, /* defaultValue */
                        new InspectorPath("Properties", "Graphic", 0));
        final ValuePropertyMetadata gridLinesVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        gridLinesVisibleName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 20));
        final ValuePropertyMetadata halignment_NULL_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        halignmentName,
                        javafx.geometry.HPos.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Specific", 4));
        final ValuePropertyMetadata halignment_CENTER_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        halignmentName,
                        javafx.geometry.HPos.class,
                        true, /* readWrite */
                        javafx.geometry.HPos.CENTER, /* defaultValue */
                        new InspectorPath("Layout", "Specific", 4));
        final ValuePropertyMetadata hbarPolicyPropertyMetadata
                = new EnumerationPropertyMetadata(
                        hbarPolicyName,
                        javafx.scene.control.ScrollPane.ScrollBarPolicy.class,
                        true, /* readWrite */
                        javafx.scene.control.ScrollPane.ScrollBarPolicy.AS_NEEDED, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 46));
        final ValuePropertyMetadata height_Double_200_PropertyMetadata
                = new DoublePropertyMetadata(
                        heightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        2.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 7));
        final ValuePropertyMetadata height_Double_0_PropertyMetadata
                = new DoublePropertyMetadata(
                        heightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 7));
        final ValuePropertyMetadata height_Double_ro_PropertyMetadata
                = new DoublePropertyMetadata(
                        heightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Size", 7));
        final ValuePropertyMetadata hgapPropertyMetadata
                = new DoublePropertyMetadata(
                        hgapName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Internal", 0));
        final ValuePropertyMetadata hgrowPropertyMetadata
                = new EnumerationPropertyMetadata(
                        hgrowName,
                        javafx.scene.layout.Priority.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Specific", 2));
        final ValuePropertyMetadata hideOnClick_true_PropertyMetadata
                = new BooleanPropertyMetadata(
                        hideOnClickName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 21));
        final ValuePropertyMetadata hideOnClick_false_PropertyMetadata
                = new BooleanPropertyMetadata(
                        hideOnClickName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 21));
        final ValuePropertyMetadata hideOnEscapePropertyMetadata
                = new BooleanPropertyMetadata(
                        hideOnEscapeName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 63));
        final ValuePropertyMetadata hmaxPropertyMetadata
                = new DoublePropertyMetadata(
                        hmaxName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 90));
        final ValuePropertyMetadata hminPropertyMetadata
                = new DoublePropertyMetadata(
                        hminName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 81));
        final ValuePropertyMetadata horizontalGridLinesVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        horizontalGridLinesVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 102));
        final ValuePropertyMetadata horizontalZeroLineVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        horizontalZeroLineVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 107));
        final ValuePropertyMetadata htmlTextPropertyMetadata
                = new StringPropertyMetadata(
                        htmlTextName,
                        true, /* readWrite */
                        "<html><head></head><body contenteditable=\"true\"></body></html>", /* defaultValue */
                        new InspectorPath("Properties", "Specific", 22));
        final ValuePropertyMetadata hvaluePropertyMetadata
                = new DoublePropertyMetadata(
                        hvalueName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 72));
        final ValuePropertyMetadata idPropertyMetadata
                = new StringPropertyMetadata(
                        idName,
                        true, /* readWrite */
                        "", /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 3));
        final ValuePropertyMetadata imagePropertyMetadata
                = new ImagePropertyMetadata(
                        imageName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 23));
        final ValuePropertyMetadata indeterminate_Boolean_PropertyMetadata
                = new BooleanPropertyMetadata(
                        indeterminateName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 47));
        final ValuePropertyMetadata indeterminate_Boolean_ro_PropertyMetadata
                = new BooleanPropertyMetadata(
                        indeterminateName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "Specific", 47));
        final ValuePropertyMetadata insetsPropertyMetadata
                = new InsetsPropertyMetadata(
                        insetsName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "Extras", 5));
        final ComponentPropertyMetadata items_MenuItem_PropertyMetadata
                = new ComponentPropertyMetadata(
                        itemsName,
                        MenuItemMetadata,
                        true); /* collection */

        final ComponentPropertyMetadata items_Node_PropertyMetadata
                = new ComponentPropertyMetadata(
                        itemsName,
                        NodeMetadata,
                        true); /* collection */

        final ValuePropertyMetadata labelPropertyMetadata
                = new StringPropertyMetadata(
                        labelName,
                        true, /* readWrite */
                        "", /* defaultValue */
                        new InspectorPath("Properties", "Specific", 24));
        final ComponentPropertyMetadata labelForPropertyMetadata
                = new ComponentPropertyMetadata(
                        labelForName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata labelFormatterPropertyMetadata
                = new StringConverterPropertyMetadata(
                        labelFormatterName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 111));
        final ValuePropertyMetadata labelLineLengthPropertyMetadata
                = new DoublePropertyMetadata(
                        labelLineLengthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        20.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 108));
        final ValuePropertyMetadata labelPaddingPropertyMetadata
                = new InsetsPropertyMetadata(
                        labelPaddingName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "Extras", 6));
        final ValuePropertyMetadata labelsVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        labelsVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 103));
        final ValuePropertyMetadata largeArcFlagPropertyMetadata
                = new BooleanPropertyMetadata(
                        largeArcFlagName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 125));
        final ValuePropertyMetadata layoutBoundsPropertyMetadata
                = new BoundsPropertyMetadata(
                        layoutBoundsName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Bounds", 0));
        final ValuePropertyMetadata layoutXPropertyMetadata
                = new DoublePropertyMetadata(
                        layoutXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 2));
        final ValuePropertyMetadata layoutYPropertyMetadata
                = new DoublePropertyMetadata(
                        layoutYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 3));
        final ComponentPropertyMetadata leftPropertyMetadata
                = new ComponentPropertyMetadata(
                        leftName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata legendSidePropertyMetadata
                = new EnumerationPropertyMetadata(
                        legendSideName,
                        javafx.geometry.Side.class,
                        true, /* readWrite */
                        javafx.geometry.Side.BOTTOM, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 73));
        final ValuePropertyMetadata legendVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        legendVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 64));
        final ValuePropertyMetadata length_Double_PropertyMetadata
                = new DoublePropertyMetadata(
                        lengthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 31));
        final ValuePropertyMetadata length_Integer_ro_PropertyMetadata
                = new IntegerPropertyMetadata(
                        lengthName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Size", 31));
        final ValuePropertyMetadata lightOnPropertyMetadata
                = new BooleanPropertyMetadata(
                        lightOnName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "3D", 7));
        final ValuePropertyMetadata lineSpacingPropertyMetadata
                = new DoublePropertyMetadata(
                        lineSpacingName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Text", 13));
        final ValuePropertyMetadata lowerBoundPropertyMetadata
                = new DoublePropertyMetadata(
                        lowerBoundName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 91));
        final ValuePropertyMetadata majorTickUnitPropertyMetadata
                = new DoublePropertyMetadata(
                        majorTickUnitName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        25.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 92));
        final ValuePropertyMetadata materialPropertyMetadata
                = new MaterialPropertyMetadata(
                        materialName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "3D", 0));
        final ValuePropertyMetadata maxPropertyMetadata
                = new DoublePropertyMetadata(
                        maxName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        100.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 48));
        final ValuePropertyMetadata maxHeight_COMPUTED_PropertyMetadata
                = new DoublePropertyMetadata(
                        maxHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 5));
        final ValuePropertyMetadata maxHeight_MAX_PropertyMetadata
                = new DoublePropertyMetadata(
                        maxHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        Double.MAX_VALUE, /* defaultValue */
                        new InspectorPath("Layout", "Size", 5));
        final ValuePropertyMetadata maxPageIndicatorCountPropertyMetadata
                = new IntegerPropertyMetadata(
                        maxPageIndicatorCountName,
                        true, /* readWrite */
                        10, /* defaultValue */
                        new InspectorPath("Properties", "Pagination", 1));
        final ValuePropertyMetadata maxWidth_COMPUTED_PropertyMetadata
                = new DoublePropertyMetadata(
                        maxWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 4));
        final ValuePropertyMetadata maxWidth_500000_PropertyMetadata
                = new DoublePropertyMetadata(
                        maxWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        5000.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 4));
        final ValuePropertyMetadata maxWidth_MAX_PropertyMetadata
                = new DoublePropertyMetadata(
                        maxWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        Double.MAX_VALUE, /* defaultValue */
                        new InspectorPath("Layout", "Size", 4));
        final ComponentPropertyMetadata menusPropertyMetadata
                = new ComponentPropertyMetadata(
                        menusName,
                        MenuMetadata,
                        true); /* collection */

        final ValuePropertyMetadata meshPropertyMetadata
                = new MeshPropertyMetadata(
                        meshName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "3D", 1));
        final ValuePropertyMetadata minPropertyMetadata
                = new DoublePropertyMetadata(
                        minName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 27));
        final ValuePropertyMetadata minHeight_COMPUTED_PropertyMetadata
                = new DoublePropertyMetadata(
                        minHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 1));
        final ValuePropertyMetadata minHeight_0_PropertyMetadata
                = new DoublePropertyMetadata(
                        minHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 1));
        final ValuePropertyMetadata minorTickCount_3_PropertyMetadata
                = new IntegerPropertyMetadata(
                        minorTickCountName,
                        true, /* readWrite */
                        3, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 97));
        final ValuePropertyMetadata minorTickCount_5_PropertyMetadata
                = new IntegerPropertyMetadata(
                        minorTickCountName,
                        true, /* readWrite */
                        5, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 97));
        final ValuePropertyMetadata minorTickLengthPropertyMetadata
                = new DoublePropertyMetadata(
                        minorTickLengthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        5.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 119));
        final ValuePropertyMetadata minorTickVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        minorTickVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 117));
        final ValuePropertyMetadata minWidth_COMPUTED_PropertyMetadata
                = new DoublePropertyMetadata(
                        minWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 0));
        final ValuePropertyMetadata minWidth_1000_PropertyMetadata
                = new DoublePropertyMetadata(
                        minWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        10.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 0));
        final ValuePropertyMetadata minWidth_0_PropertyMetadata
                = new DoublePropertyMetadata(
                        minWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_PREF_SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 0));
        final ValuePropertyMetadata mnemonicParsing_false_PropertyMetadata
                = new BooleanPropertyMetadata(
                        mnemonicParsingName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Extras", 1));
        final ValuePropertyMetadata mnemonicParsing_true_PropertyMetadata
                = new BooleanPropertyMetadata(
                        mnemonicParsingName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Extras", 1));
        final ValuePropertyMetadata mouseTransparentPropertyMetadata
                = new BooleanPropertyMetadata(
                        mouseTransparentName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Extras", 7));
        final ValuePropertyMetadata nearClipPropertyMetadata
                = new DoublePropertyMetadata(
                        nearClipName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.1, /* defaultValue */
                        new InspectorPath("Properties", "3D", 2));
        final ValuePropertyMetadata nodeOrientation_LEFT_TO_RIGHT_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        nodeOrientationName,
                        javafx.geometry.NodeOrientation.class,
                        true, /* readWrite */
                        javafx.geometry.NodeOrientation.LEFT_TO_RIGHT, /* defaultValue */
                        new InspectorPath("Properties", "Node", 4));
        final ValuePropertyMetadata nodeOrientation_INHERIT_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        nodeOrientationName,
                        javafx.geometry.NodeOrientation.class,
                        true, /* readWrite */
                        javafx.geometry.NodeOrientation.INHERIT, /* defaultValue */
                        new InspectorPath("Properties", "Node", 4));
        final ValuePropertyMetadata onActionPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onActionName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Main", 0));
        final ValuePropertyMetadata onAutoHidePropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onAutoHideName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "HideShow", 2));
        final ValuePropertyMetadata onClosedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onClosedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Closing", 1));
        final ValuePropertyMetadata onCloseRequestPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onCloseRequestName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Closing", 0));
        final ValuePropertyMetadata onContextMenuRequestedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onContextMenuRequestedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 0));
        final ValuePropertyMetadata onDragDetectedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onDragDetectedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 0));
        final ValuePropertyMetadata onDragDonePropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onDragDoneName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 1));
        final ValuePropertyMetadata onDragDroppedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onDragDroppedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 2));
        final ValuePropertyMetadata onDragEnteredPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onDragEnteredName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 3));
        final ValuePropertyMetadata onDragExitedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onDragExitedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 4));
        final ValuePropertyMetadata onDragOverPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onDragOverName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 5));
        final ValuePropertyMetadata onEditCancelPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onEditCancelName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Edit", 2));
        final ValuePropertyMetadata onEditCommitPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onEditCommitName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Edit", 1));
        final ValuePropertyMetadata onEditStartPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onEditStartName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Edit", 0));
        final ValuePropertyMetadata onErrorPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onErrorName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Main", 2));
        final ValuePropertyMetadata onHiddenPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onHiddenName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "HideShow", 0));
        final ValuePropertyMetadata onHidingPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onHidingName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "HideShow", 1));
        final ValuePropertyMetadata onInputMethodTextChangedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onInputMethodTextChangedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Keyboard", 0));
        final ValuePropertyMetadata onKeyPressedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onKeyPressedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Keyboard", 1));
        final ValuePropertyMetadata onKeyReleasedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onKeyReleasedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Keyboard", 2));
        final ValuePropertyMetadata onKeyTypedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onKeyTypedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Keyboard", 3));
        final ValuePropertyMetadata onMenuValidationPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMenuValidationName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Main", 1));
        final ValuePropertyMetadata onMouseClickedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseClickedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 1));
        final ValuePropertyMetadata onMouseDragEnteredPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseDragEnteredName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 6));
        final ValuePropertyMetadata onMouseDragExitedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseDragExitedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 7));
        final ValuePropertyMetadata onMouseDraggedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseDraggedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 2));
        final ValuePropertyMetadata onMouseDragOverPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseDragOverName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 8));
        final ValuePropertyMetadata onMouseDragReleasedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseDragReleasedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "DragDrop", 9));
        final ValuePropertyMetadata onMouseEnteredPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseEnteredName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 3));
        final ValuePropertyMetadata onMouseExitedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseExitedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 4));
        final ValuePropertyMetadata onMouseMovedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseMovedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 5));
        final ValuePropertyMetadata onMousePressedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMousePressedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 6));
        final ValuePropertyMetadata onMouseReleasedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onMouseReleasedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 7));
        final ValuePropertyMetadata onRotatePropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onRotateName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Rotation", 0));
        final ValuePropertyMetadata onRotationFinishedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onRotationFinishedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Rotation", 2));
        final ValuePropertyMetadata onRotationStartedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onRotationStartedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Rotation", 1));
        final ValuePropertyMetadata onScrollPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onScrollName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 8));
        final ValuePropertyMetadata onScrollFinishedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onScrollFinishedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 10));
        final ValuePropertyMetadata onScrollStartedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onScrollStartedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 9));
        final ValuePropertyMetadata onScrollToPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onScrollToName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 11));
        final ValuePropertyMetadata onScrollToColumnPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onScrollToColumnName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Mouse", 12));
        final ValuePropertyMetadata onSelectionChangedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onSelectionChangedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Edit", 3));
        final ValuePropertyMetadata onShowingPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onShowingName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "HideShow", 3));
        final ValuePropertyMetadata onShownPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onShownName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "HideShow", 4));
        final ValuePropertyMetadata onSortPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onSortName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Main", 3));
        final ValuePropertyMetadata onSwipeDownPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onSwipeDownName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Swipe", 3));
        final ValuePropertyMetadata onSwipeLeftPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onSwipeLeftName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Swipe", 0));
        final ValuePropertyMetadata onSwipeRightPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onSwipeRightName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Swipe", 1));
        final ValuePropertyMetadata onSwipeUpPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onSwipeUpName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Swipe", 2));
        final ValuePropertyMetadata onTouchMovedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onTouchMovedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Touch", 0));
        final ValuePropertyMetadata onTouchPressedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onTouchPressedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Touch", 1));
        final ValuePropertyMetadata onTouchReleasedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onTouchReleasedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Touch", 2));
        final ValuePropertyMetadata onTouchStationaryPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onTouchStationaryName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Touch", 3));
        final ValuePropertyMetadata onZoomPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onZoomName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Zoom", 0));
        final ValuePropertyMetadata onZoomFinishedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onZoomFinishedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Zoom", 2));
        final ValuePropertyMetadata onZoomStartedPropertyMetadata
                = new EventHandlerPropertyMetadata(
                        onZoomStartedName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Code", "Zoom", 1));
        final ValuePropertyMetadata opacityPropertyMetadata
                = new DoublePropertyMetadata(
                        opacityName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.OPACITY,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Properties", "Node", 2));
        final ValuePropertyMetadata opaqueInsetsPropertyMetadata
                = new InsetsPropertyMetadata(
                        opaqueInsetsName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Node", 12));
        final ValuePropertyMetadata orientation_HORIZONTAL_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        orientationName,
                        javafx.geometry.Orientation.class,
                        true, /* readWrite */
                        javafx.geometry.Orientation.HORIZONTAL, /* defaultValue */
                        new InspectorPath("Properties", "Node", 3));
        final ValuePropertyMetadata orientation_VERTICAL_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        orientationName,
                        javafx.geometry.Orientation.class,
                        true, /* readWrite */
                        javafx.geometry.Orientation.VERTICAL, /* defaultValue */
                        new InspectorPath("Properties", "Node", 3));
        final ValuePropertyMetadata paddingPropertyMetadata
                = new InsetsPropertyMetadata(
                        paddingName,
                        true, /* readWrite */
                        javafx.geometry.Insets.EMPTY, /* defaultValue */
                        new InspectorPath("Layout", "Internal", 2));
        final ValuePropertyMetadata pageCountPropertyMetadata
                = new IntegerPropertyMetadata(
                        pageCountName,
                        true, /* readWrite */
                        2147483647, /* defaultValue */
                        new InspectorPath("Properties", "Pagination", 2));
        final ComponentPropertyMetadata panesPropertyMetadata
                = new ComponentPropertyMetadata(
                        panesName,
                        TitledPaneMetadata,
                        true); /* collection */

        final ValuePropertyMetadata pannablePropertyMetadata
                = new BooleanPropertyMetadata(
                        pannableName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 28));
        final ValuePropertyMetadata percentHeightPropertyMetadata
                = new DoublePropertyMetadata(
                        percentHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.PERCENTAGE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 33));
        final ValuePropertyMetadata percentWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        percentWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.PERCENTAGE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 32));
        final ValuePropertyMetadata pickOnBounds_false_PropertyMetadata
                = new BooleanPropertyMetadata(
                        pickOnBoundsName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Extras", 8));
        final ValuePropertyMetadata pickOnBounds_true_PropertyMetadata
                = new BooleanPropertyMetadata(
                        pickOnBoundsName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Extras", 8));
        final ComponentPropertyMetadata placeholderPropertyMetadata
                = new ComponentPropertyMetadata(
                        placeholderName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata pointsPropertyMetadata
                = new DoubleListPropertyMetadata(
                        pointsName,
                        true, /* readWrite */
                        Collections.emptyList(), /* defaultValue */
                        new InspectorPath("Layout", "Position", 4));
        final ValuePropertyMetadata popupSidePropertyMetadata
                = new EnumerationPropertyMetadata(
                        popupSideName,
                        javafx.geometry.Side.class,
                        true, /* readWrite */
                        javafx.geometry.Side.BOTTOM, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 29));
        final ValuePropertyMetadata prefColumnCount_40_PropertyMetadata
                = new IntegerPropertyMetadata(
                        prefColumnCountName,
                        true, /* readWrite */
                        40, /* defaultValue */
                        new InspectorPath("Layout", "Size", 8));
        final ValuePropertyMetadata prefColumnCount_12_PropertyMetadata
                = new IntegerPropertyMetadata(
                        prefColumnCountName,
                        true, /* readWrite */
                        12, /* defaultValue */
                        new InspectorPath("Layout", "Size", 8));
        final ValuePropertyMetadata prefColumnsPropertyMetadata
                = new IntegerPropertyMetadata(
                        prefColumnsName,
                        true, /* readWrite */
                        5, /* defaultValue */
                        new InspectorPath("Layout", "Size", 28));
        final ValuePropertyMetadata prefHeight_COMPUTED_PropertyMetadata
                = new DoublePropertyMetadata(
                        prefHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_COMPUTED_SIZE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 3));
        final ValuePropertyMetadata prefHeight_60000_PropertyMetadata
                = new DoublePropertyMetadata(
                        prefHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_COMPUTED_SIZE,
                        true, /* readWrite */
                        600.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 3));
        final ValuePropertyMetadata prefRowCountPropertyMetadata
                = new IntegerPropertyMetadata(
                        prefRowCountName,
                        true, /* readWrite */
                        10, /* defaultValue */
                        new InspectorPath("Layout", "Size", 9));
        final ValuePropertyMetadata prefRowsPropertyMetadata
                = new IntegerPropertyMetadata(
                        prefRowsName,
                        true, /* readWrite */
                        5, /* defaultValue */
                        new InspectorPath("Layout", "Size", 27));
        final ValuePropertyMetadata prefTileHeightPropertyMetadata
                = new DoublePropertyMetadata(
                        prefTileHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 23));
        final ValuePropertyMetadata prefTileWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        prefTileWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 10));
        final ValuePropertyMetadata prefViewportHeightPropertyMetadata
                = new DoublePropertyMetadata(
                        prefViewportHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 11));
        final ValuePropertyMetadata prefViewportWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        prefViewportWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 24));
        final ValuePropertyMetadata prefWidth_COMPUTED_PropertyMetadata
                = new DoublePropertyMetadata(
                        prefWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_COMPUTED_SIZE,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 2));
        final ValuePropertyMetadata prefWidth_8000_PropertyMetadata
                = new DoublePropertyMetadata(
                        prefWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_COMPUTED_SIZE,
                        true, /* readWrite */
                        80.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 2));
        final ValuePropertyMetadata prefWidth_80000_PropertyMetadata
                = new DoublePropertyMetadata(
                        prefWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.USE_COMPUTED_SIZE,
                        true, /* readWrite */
                        800.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 2));
        final ValuePropertyMetadata prefWrapLengthPropertyMetadata
                = new DoublePropertyMetadata(
                        prefWrapLengthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        400.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 74));
        final ValuePropertyMetadata preserveRatio_false_PropertyMetadata
                = new BooleanPropertyMetadata(
                        preserveRatioName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 30));
        final ValuePropertyMetadata preserveRatio_true_PropertyMetadata
                = new BooleanPropertyMetadata(
                        preserveRatioName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 30));
        final ValuePropertyMetadata progressPropertyMetadata
                = new DoublePropertyMetadata(
                        progressName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.PROGRESS,
                        true, /* readWrite */
                        -1.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 31));
        final ValuePropertyMetadata promptTextPropertyMetadata
                = new StringPropertyMetadata(
                        promptTextName,
                        true, /* readWrite */
                        "", /* defaultValue */
                        new InspectorPath("Properties", "Text", 1));
        final ValuePropertyMetadata radius_0_PropertyMetadata
                = new DoublePropertyMetadata(
                        radiusName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 12));
        final ValuePropertyMetadata radius_100_PropertyMetadata
                = new DoublePropertyMetadata(
                        radiusName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 12));
        final ValuePropertyMetadata radiusXPropertyMetadata
                = new DoublePropertyMetadata(
                        radiusXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 13));
        final ValuePropertyMetadata radiusYPropertyMetadata
                = new DoublePropertyMetadata(
                        radiusYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 14));
        final ValuePropertyMetadata resizable_Boolean_ro_PropertyMetadata
                = new BooleanPropertyMetadata(
                        resizableName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Extras", 3));
        final ValuePropertyMetadata resizable_Boolean_PropertyMetadata
                = new BooleanPropertyMetadata(
                        resizableName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Layout", "Extras", 3));
        final ComponentPropertyMetadata rightPropertyMetadata
                = new ComponentPropertyMetadata(
                        rightName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata rotatePropertyMetadata
                = new DoublePropertyMetadata(
                        rotateName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.ANGLE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Transforms", 0));
        final ValuePropertyMetadata rotateGraphicPropertyMetadata
                = new BooleanPropertyMetadata(
                        rotateGraphicName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 65));
        final ValuePropertyMetadata rotationAxisPropertyMetadata
                = new Point3DPropertyMetadata(
                        rotationAxisName,
                        true, /* readWrite */
                        new javafx.geometry.Point3D(0.0, 0.0, 1.0), /* defaultValue */
                        new InspectorPath("Layout", "Transforms", 1));
        final ComponentPropertyMetadata rowConstraintsPropertyMetadata
                = new ComponentPropertyMetadata(
                        rowConstraintsName,
                        RowConstraintsMetadata,
                        true); /* collection */

        final ValuePropertyMetadata rowValignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        rowValignmentName,
                        javafx.geometry.VPos.class,
                        true, /* readWrite */
                        javafx.geometry.VPos.CENTER, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 49));
        final ValuePropertyMetadata scalePropertyMetadata
                = new DoublePropertyMetadata(
                        scaleName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "Specific", 82));
        final ValuePropertyMetadata scaleShapePropertyMetadata
                = new BooleanPropertyMetadata(
                        scaleShapeName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Node", 9));
        final ValuePropertyMetadata scaleXPropertyMetadata
                = new DoublePropertyMetadata(
                        scaleXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Layout", "Transforms", 2));
        final ValuePropertyMetadata scaleYPropertyMetadata
                = new DoublePropertyMetadata(
                        scaleYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Layout", "Transforms", 3));
        final ValuePropertyMetadata scaleZPropertyMetadata
                = new DoublePropertyMetadata(
                        scaleZName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Layout", "Transforms", 4));
        final ComponentPropertyMetadata scopePropertyMetadata
                = new ComponentPropertyMetadata(
                        scopeName,
                        NodeMetadata,
                        true); /* collection */

        final ValuePropertyMetadata scrollLeftPropertyMetadata
                = new DoublePropertyMetadata(
                        scrollLeftName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Text", 14));
        final ValuePropertyMetadata scrollTopPropertyMetadata
                = new DoublePropertyMetadata(
                        scrollTopName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Text", 15));
        final ValuePropertyMetadata selected_Boolean_PropertyMetadata
                = new BooleanPropertyMetadata(
                        selectedName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 33));
        final ValuePropertyMetadata selected_Boolean_ro_PropertyMetadata
                = new BooleanPropertyMetadata(
                        selectedName,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "Specific", 33));
        final ComponentPropertyMetadata shapePropertyMetadata
                = new ComponentPropertyMetadata(
                        shapeName,
                        ShapeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata showRootPropertyMetadata
                = new BooleanPropertyMetadata(
                        showRootName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 50));
        final ValuePropertyMetadata showTickLabelsPropertyMetadata
                = new BooleanPropertyMetadata(
                        showTickLabelsName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 83));
        final ValuePropertyMetadata showTickMarksPropertyMetadata
                = new BooleanPropertyMetadata(
                        showTickMarksName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 75));
        final ValuePropertyMetadata showWeekNumbersPropertyMetadata
                = new BooleanPropertyMetadata(
                        showWeekNumbersName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 126));
        final ValuePropertyMetadata side_NULL_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        sideName,
                        javafx.geometry.Side.class,
                        "BOTTOM", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Properties", "Specific", 34));
        final ValuePropertyMetadata side_TOP_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        sideName,
                        javafx.geometry.Side.class,
                        true, /* readWrite */
                        javafx.geometry.Side.TOP, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 34));
        final ValuePropertyMetadata smoothPropertyMetadata
                = new BooleanPropertyMetadata(
                        smoothName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 51));
        final ValuePropertyMetadata snapToPixelPropertyMetadata
                = new BooleanPropertyMetadata(
                        snapToPixelName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Layout", "Extras", 5));
        final ValuePropertyMetadata snapToTicksPropertyMetadata
                = new BooleanPropertyMetadata(
                        snapToTicksName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 104));
        final ValuePropertyMetadata sortablePropertyMetadata
                = new BooleanPropertyMetadata(
                        sortableName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 52));
        final ValuePropertyMetadata sortModePropertyMetadata
                = new EnumerationPropertyMetadata(
                        sortModeName,
                        javafx.scene.control.TreeSortMode.class,
                        true, /* readWrite */
                        javafx.scene.control.TreeSortMode.ALL_DESCENDANTS, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 54));
        final ComponentPropertyMetadata sortNodePropertyMetadata
                = new ComponentPropertyMetadata(
                        sortNodeName,
                        NodeMetadata,
                        false); /* collection */

        final ComponentPropertyMetadata sortOrderPropertyMetadata
                = new ComponentPropertyMetadata(
                        sortOrderName,
                        TableColumnMetadata,
                        true); /* collection */

        final ValuePropertyMetadata sortType_SortType_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        sortTypeName,
                        javafx.scene.control.TableColumn.SortType.class,
                        true, /* readWrite */
                        javafx.scene.control.TableColumn.SortType.ASCENDING, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 66));
        final ValuePropertyMetadata spacingPropertyMetadata
                = new DoublePropertyMetadata(
                        spacingName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Internal", 3));
        final ValuePropertyMetadata startAnglePropertyMetadata
                = new DoublePropertyMetadata(
                        startAngleName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.ANGLE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 30));
        final ValuePropertyMetadata startMarginPropertyMetadata
                = new DoublePropertyMetadata(
                        startMarginName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        5.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 93));
        final ValuePropertyMetadata startXPropertyMetadata
                = new DoublePropertyMetadata(
                        startXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 5));
        final ValuePropertyMetadata startYPropertyMetadata
                = new DoublePropertyMetadata(
                        startYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 6));
        final ValuePropertyMetadata strikethroughPropertyMetadata
                = new BooleanPropertyMetadata(
                        strikethroughName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Text", 11));
        final ValuePropertyMetadata stroke_BLACK_PropertyMetadata
                = new PaintPropertyMetadata(
                        strokeName,
                        true, /* readWrite */
                        javafx.scene.paint.Color.BLACK, /* defaultValue */
                        new InspectorPath("Properties", "Stroke", 0));
        final ValuePropertyMetadata stroke_NULL_PropertyMetadata
                = new PaintPropertyMetadata(
                        strokeName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Stroke", 0));
        final ValuePropertyMetadata strokeDashArrayPropertyMetadata
                = new DoubleListPropertyMetadata(
                        strokeDashArrayName,
                        true, /* readWrite */
                        Collections.emptyList(), /* defaultValue */
                        new InspectorPath("Properties", "Specific", 122));
        final ValuePropertyMetadata strokeDashOffsetPropertyMetadata
                = new DoublePropertyMetadata(
                        strokeDashOffsetName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Stroke", 6));
        final ValuePropertyMetadata strokeLineCapPropertyMetadata
                = new EnumerationPropertyMetadata(
                        strokeLineCapName,
                        javafx.scene.shape.StrokeLineCap.class,
                        true, /* readWrite */
                        javafx.scene.shape.StrokeLineCap.SQUARE, /* defaultValue */
                        new InspectorPath("Properties", "Stroke", 3));
        final ValuePropertyMetadata strokeLineJoinPropertyMetadata
                = new EnumerationPropertyMetadata(
                        strokeLineJoinName,
                        javafx.scene.shape.StrokeLineJoin.class,
                        true, /* readWrite */
                        javafx.scene.shape.StrokeLineJoin.MITER, /* defaultValue */
                        new InspectorPath("Properties", "Stroke", 4));
        final ValuePropertyMetadata strokeMiterLimitPropertyMetadata
                = new DoublePropertyMetadata(
                        strokeMiterLimitName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        10.0, /* defaultValue */
                        new InspectorPath("Properties", "Stroke", 5));
        final ValuePropertyMetadata strokeTypePropertyMetadata
                = new EnumerationPropertyMetadata(
                        strokeTypeName,
                        javafx.scene.shape.StrokeType.class,
                        true, /* readWrite */
                        javafx.scene.shape.StrokeType.CENTERED, /* defaultValue */
                        new InspectorPath("Properties", "Stroke", 2));
        final ValuePropertyMetadata strokeWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        strokeWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Properties", "Stroke", 1));
        final ValuePropertyMetadata stylePropertyMetadata
                = new StringPropertyMetadata(
                        styleName,
                        true, /* readWrite */
                        "", /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 0));
        final ValuePropertyMetadata styleClass_c4_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("accordion"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c33_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("chart"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c41_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("axis"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c1_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("chart", "bar-chart"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c17_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("button"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c37_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("radio-button"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c10_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("check-box"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c26_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("menu-item", "check-menu-item"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c39_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("choice-box"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c5_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("combo-box-base", "color-picker"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c11_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("combo-box-base", "combo-box"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c8_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("context-menu"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c23_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("hyperlink"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c25_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("menu-item", "custom-menu-item"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c9_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("combo-box-base", "date-picker"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c20_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("html-editor"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c3_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("label"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c31_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("list-view"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c27_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("menu-item", "menu"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c18_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("menu-bar"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c47_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("menu-button"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c32_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("menu-item"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_empty_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Collections.emptyList(), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c35_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("pagination"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c48_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("text-input", "text-field", "password-field"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c13_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("progress-bar"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c45_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("progress-indicator"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c7_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("menu-item", "radio-menu-item"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c30_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("scroll-bar"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c34_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("scroll-pane"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c28_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("separator"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c22_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("menu-item", "custom-menu-item", "separator-menu-item"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c36_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("slider"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c2_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("split-menu-button"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c14_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("split-pane"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c12_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("chart", "stacked-bar-chart"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c19_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("tab"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c6_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("tab-pane"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c38_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("table-column"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c44_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("table-view"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c46_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("text-input", "text-area"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c42_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("text-input", "text-field"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c24_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("titled-pane"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c40_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("toggle-button"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c16_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("tool-bar"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c15_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("tooltip"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c29_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("tree-table-view"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c21_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("tree-view"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata styleClass_c43_PropertyMetadata
                = new StringListPropertyMetadata(
                        styleClassName,
                        true, /* readWrite */
                        Arrays.asList("web-view"), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 1));
        final ValuePropertyMetadata stylesheetsPropertyMetadata
                = new StringListPropertyMetadata(
                        stylesheetsName,
                        true, /* readWrite */
                        Collections.emptyList(), /* defaultValue */
                        new InspectorPath("Properties", "JavaFX CSS", 2));
        final ValuePropertyMetadata sweepFlagPropertyMetadata
                = new BooleanPropertyMetadata(
                        sweepFlagName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 123));
        final ValuePropertyMetadata tabClosingPolicyPropertyMetadata
                = new EnumerationPropertyMetadata(
                        tabClosingPolicyName,
                        javafx.scene.control.TabPane.TabClosingPolicy.class,
                        true, /* readWrite */
                        javafx.scene.control.TabPane.TabClosingPolicy.SELECTED_TAB, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 55));
        final ValuePropertyMetadata tableMenuButtonVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        tableMenuButtonVisibleName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 56));
        final ValuePropertyMetadata tabMaxHeightPropertyMetadata
                = new DoublePropertyMetadata(
                        tabMaxHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        Double.MAX_VALUE, /* defaultValue */
                        new InspectorPath("Layout", "Size", 18));
        final ValuePropertyMetadata tabMaxWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        tabMaxWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        Double.MAX_VALUE, /* defaultValue */
                        new InspectorPath("Layout", "Size", 17));
        final ValuePropertyMetadata tabMinHeightPropertyMetadata
                = new DoublePropertyMetadata(
                        tabMinHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 16));
        final ValuePropertyMetadata tabMinWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        tabMinWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 15));
        final ComponentPropertyMetadata tabsPropertyMetadata
                = new ComponentPropertyMetadata(
                        tabsName,
                        TabMetadata,
                        true); /* collection */

        final ValuePropertyMetadata textPropertyMetadata
                = new StringPropertyMetadata(
                        textName,
                        true, /* readWrite */
                        "", /* defaultValue */
                        new InspectorPath("Properties", "Text", 2));
        final ValuePropertyMetadata actionPropertyMetadata
                = new StringPropertyMetadata(
                        actionName,
                        true, /* readWrite */
                        "", /* defaultValue */
                        new InspectorPath("Properties", "Action", 3));
        final ValuePropertyMetadata textAlignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        textAlignmentName,
                        javafx.scene.text.TextAlignment.class,
                        true, /* readWrite */
                        javafx.scene.text.TextAlignment.LEFT, /* defaultValue */
                        new InspectorPath("Properties", "Text", 7));
        final ValuePropertyMetadata textFillPropertyMetadata
                = new PaintPropertyMetadata(
                        textFillName,
                        true, /* readWrite */
                        javafx.scene.paint.Color.BLACK, /* defaultValue */
                        new InspectorPath("Properties", "Text", 5));
        final ValuePropertyMetadata textOriginPropertyMetadata
                = new EnumerationPropertyMetadata(
                        textOriginName,
                        javafx.geometry.VPos.class,
                        true, /* readWrite */
                        javafx.geometry.VPos.BASELINE, /* defaultValue */
                        new InspectorPath("Layout", "Extras", 6));
        final ValuePropertyMetadata textOverrunPropertyMetadata
                = new EnumerationPropertyMetadata(
                        textOverrunName,
                        javafx.scene.control.OverrunStyle.class,
                        true, /* readWrite */
                        javafx.scene.control.OverrunStyle.ELLIPSIS, /* defaultValue */
                        new InspectorPath("Properties", "Text", 9));
        final ValuePropertyMetadata tickLabelFillPropertyMetadata
                = new PaintPropertyMetadata(
                        tickLabelFillName,
                        true, /* readWrite */
                        javafx.scene.paint.Color.BLACK, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 98));
        final ValuePropertyMetadata tickLabelFontPropertyMetadata
                = new FontPropertyMetadata(
                        tickLabelFontName,
                        true, /* readWrite */
                        javafx.scene.text.Font.font("System", 8.0), /* defaultValue */
                        new InspectorPath("Properties", "Specific", 94));
        final ValuePropertyMetadata tickLabelFormatterPropertyMetadata
                = new StringConverterPropertyMetadata(
                        tickLabelFormatterName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 86));
        final ValuePropertyMetadata tickLabelGapPropertyMetadata
                = new DoublePropertyMetadata(
                        tickLabelGapName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        3.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 105));
        final ValuePropertyMetadata tickLabelRotationPropertyMetadata
                = new DoublePropertyMetadata(
                        tickLabelRotationName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.ANGLE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 109));
        final ValuePropertyMetadata tickLabelsVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        tickLabelsVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 85));
        final ValuePropertyMetadata tickLengthPropertyMetadata
                = new DoublePropertyMetadata(
                        tickLengthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        8.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 114));
        final ValuePropertyMetadata tickMarksPropertyMetadata
                = new TickMarkListPropertyMetadata(
                        tickMarksName,
                        true, /* readWrite */
                        Collections.emptyList(), /* defaultValue */
                        new InspectorPath("Properties", "Specific", 84));
        final ValuePropertyMetadata tickMarkVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        tickMarkVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 112));
        final ValuePropertyMetadata tickUnitPropertyMetadata
                = new DoublePropertyMetadata(
                        tickUnitName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        5.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 118));
        final ValuePropertyMetadata tileAlignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        tileAlignmentName,
                        javafx.geometry.Pos.class,
                        true, /* readWrite */
                        javafx.geometry.Pos.CENTER, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 57));
        final ValuePropertyMetadata tileHeightPropertyMetadata
                = new DoublePropertyMetadata(
                        tileHeightName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Size", 26));
        final ValuePropertyMetadata tileWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        tileWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Size", 25));
        final ValuePropertyMetadata titlePropertyMetadata
                = new StringPropertyMetadata(
                        titleName,
                        true, /* readWrite */
                        "", /* defaultValue */
                        new InspectorPath("Properties", "Specific", 35));
        final ValuePropertyMetadata titleSidePropertyMetadata
                = new EnumerationPropertyMetadata(
                        titleSideName,
                        javafx.geometry.Side.class,
                        true, /* readWrite */
                        javafx.geometry.Side.TOP, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 58));
        final ValuePropertyMetadata toggleGroupPropertyMetadata
                = new ToggleGroupPropertyMetadata(
                        toggleGroupName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 36));
        final ComponentPropertyMetadata tooltipPropertyMetadata
                = new ComponentPropertyMetadata(
                        tooltipName,
                        TooltipMetadata,
                        false); /* collection */

        final ComponentPropertyMetadata topPropertyMetadata
                = new ComponentPropertyMetadata(
                        topName,
                        NodeMetadata,
                        false); /* collection */

        final ValuePropertyMetadata translateXPropertyMetadata
                = new DoublePropertyMetadata(
                        translateXName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Transforms", 5));
        final ValuePropertyMetadata translateYPropertyMetadata
                = new DoublePropertyMetadata(
                        translateYName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Transforms", 6));
        final ValuePropertyMetadata translateZPropertyMetadata
                = new DoublePropertyMetadata(
                        translateZName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Transforms", 7));
        final ComponentPropertyMetadata treeColumnPropertyMetadata
                = new ComponentPropertyMetadata(
                        treeColumnName,
                        TreeTableColumnMetadata,
                        false); /* collection */

        final ValuePropertyMetadata typePropertyMetadata
                = new EnumerationPropertyMetadata(
                        typeName,
                        javafx.scene.shape.ArcType.class,
                        true, /* readWrite */
                        javafx.scene.shape.ArcType.OPEN, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 59));
        final ValuePropertyMetadata underlinePropertyMetadata
                = new BooleanPropertyMetadata(
                        underlineName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Text", 12));
        final ValuePropertyMetadata unitIncrementPropertyMetadata
                = new DoublePropertyMetadata(
                        unitIncrementName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 67));
        final ValuePropertyMetadata upperBoundPropertyMetadata
                = new DoublePropertyMetadata(
                        upperBoundName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        100.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 99));
        final ValuePropertyMetadata valignment_NULL_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        valignmentName,
                        javafx.geometry.VPos.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Specific", 5));
        final ValuePropertyMetadata valignment_CENTER_PropertyMetadata
                = new EnumerationPropertyMetadata(
                        valignmentName,
                        javafx.geometry.VPos.class,
                        true, /* readWrite */
                        javafx.geometry.VPos.CENTER, /* defaultValue */
                        new InspectorPath("Layout", "Specific", 5));
        final ValuePropertyMetadata value_Object_PropertyMetadata
                = new ObjectPropertyMetadata(
                        valueName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 68));
        final ValuePropertyMetadata value_Color_PropertyMetadata
                = new ColorPropertyMetadata(
                        valueName,
                        true, /* readWrite */
                        javafx.scene.paint.Color.WHITE, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 68));
        final ValuePropertyMetadata value_Double_PropertyMetadata
                = new DoublePropertyMetadata(
                        valueName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 68));
        final ValuePropertyMetadata vbarPolicyPropertyMetadata
                = new EnumerationPropertyMetadata(
                        vbarPolicyName,
                        javafx.scene.control.ScrollPane.ScrollBarPolicy.class,
                        true, /* readWrite */
                        javafx.scene.control.ScrollPane.ScrollBarPolicy.AS_NEEDED, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 69));
        final ValuePropertyMetadata verticalFieldOfViewPropertyMetadata
                = new BooleanPropertyMetadata(
                        verticalFieldOfViewName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "3D", 5));
        final ValuePropertyMetadata verticalGridLinesVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        verticalGridLinesVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 113));
        final ValuePropertyMetadata verticalZeroLineVisiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        verticalZeroLineVisibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 115));
        final ValuePropertyMetadata vgapPropertyMetadata
                = new DoublePropertyMetadata(
                        vgapName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Internal", 1));
        final ValuePropertyMetadata vgrowPropertyMetadata
                = new EnumerationPropertyMetadata(
                        vgrowName,
                        javafx.scene.layout.Priority.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Specific", 3));
        final ValuePropertyMetadata viewportPropertyMetadata
                = new Rectangle2DPropertyMetadata(
                        viewportName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Specific", 0));
        final ValuePropertyMetadata viewportBoundsPropertyMetadata
                = new BoundsPropertyMetadata(
                        viewportBoundsName,
                        true, /* readWrite */
                        new javafx.geometry.BoundingBox(0.0, 0.0, 0.0, 0.0), /* defaultValue */
                        new InspectorPath("Layout", "Bounds", 1));
        final ValuePropertyMetadata visiblePropertyMetadata
                = new BooleanPropertyMetadata(
                        visibleName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Properties", "Node", 5));
        final ValuePropertyMetadata visibleAmountPropertyMetadata
                = new DoublePropertyMetadata(
                        visibleAmountName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        15.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 87));
        final ValuePropertyMetadata visibleRowCountPropertyMetadata
                = new IntegerPropertyMetadata(
                        visibleRowCountName,
                        true, /* readWrite */
                        10, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 39));
        final ValuePropertyMetadata visitedPropertyMetadata
                = new BooleanPropertyMetadata(
                        visitedName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 40));
        final ValuePropertyMetadata vmaxPropertyMetadata
                = new DoublePropertyMetadata(
                        vmaxName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 110));
        final ValuePropertyMetadata vminPropertyMetadata
                = new DoublePropertyMetadata(
                        vminName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 106));
        final ValuePropertyMetadata vvaluePropertyMetadata
                = new DoublePropertyMetadata(
                        vvalueName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 100));
        final ValuePropertyMetadata width_Double_200_PropertyMetadata
                = new DoublePropertyMetadata(
                        widthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        2.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 6));
        final ValuePropertyMetadata width_Double_0_PropertyMetadata
                = new DoublePropertyMetadata(
                        widthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Size", 6));
        final ValuePropertyMetadata width_Double_ro_PropertyMetadata
                = new DoublePropertyMetadata(
                        widthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Layout", "Size", 6));
        final ValuePropertyMetadata wrappingWidthPropertyMetadata
                = new DoublePropertyMetadata(
                        wrappingWidthName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Text", 8));
        final ValuePropertyMetadata wrapTextPropertyMetadata
                = new BooleanPropertyMetadata(
                        wrapTextName,
                        true, /* readWrite */
                        false, /* defaultValue */
                        new InspectorPath("Properties", "Text", 6));
        final ValuePropertyMetadata x_0_PropertyMetadata
                = new DoublePropertyMetadata(
                        xName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 12));
        final ValuePropertyMetadata x_NaN_PropertyMetadata
                = new DoublePropertyMetadata(
                        xName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        Double.NaN, /* defaultValue */
                        new InspectorPath("Layout", "Position", 12));
        final ComponentPropertyMetadata XAxisPropertyMetadata
                = new ComponentPropertyMetadata(
                        XAxisName,
                        AxisMetadata,
                        false); /* collection */

        final ValuePropertyMetadata XAxisRotationPropertyMetadata
                = new DoublePropertyMetadata(
                        XAxisRotationName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.ANGLE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 124));
        final ValuePropertyMetadata y_0_PropertyMetadata
                = new DoublePropertyMetadata(
                        yName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        0.0, /* defaultValue */
                        new InspectorPath("Layout", "Position", 13));
        final ValuePropertyMetadata y_NaN_PropertyMetadata
                = new DoublePropertyMetadata(
                        yName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        true, /* readWrite */
                        Double.NaN, /* defaultValue */
                        new InspectorPath("Layout", "Position", 13));
        final ComponentPropertyMetadata YAxisPropertyMetadata
                = new ComponentPropertyMetadata(
                        YAxisName,
                        AxisMetadata,
                        false); /* collection */

        final ValuePropertyMetadata zeroPositionPropertyMetadata
                = new DoublePropertyMetadata(
                        zeroPositionName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.COORDINATE,
                        false, /* readWrite */
                        null, /* No defaultValue for R/O property */
                        new InspectorPath("Properties", "Specific", 116));
        final ValuePropertyMetadata zoomPropertyMetadata
                = new DoublePropertyMetadata(
                        zoomName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.SIZE,
                        true, /* readWrite */
                        1.0, /* defaultValue */
                        new InspectorPath("Properties", "Specific", 121));
        final ValuePropertyMetadata SplitPane_resizableWithParentPropertyMetadata
                = new BooleanPropertyMetadata(
                        SplitPane_resizableWithParentName,
                        true, /* readWrite */
                        true, /* defaultValue */
                        new InspectorPath("Layout", "Split Pane Constraints", 0));
        final ValuePropertyMetadata AnchorPane_bottomAnchorPropertyMetadata
                = new DoublePropertyMetadata(
                        AnchorPane_bottomAnchorName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.NULLABLE_COORDINATE,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Anchor Pane Constraints", 0));
        final ValuePropertyMetadata AnchorPane_leftAnchorPropertyMetadata
                = new DoublePropertyMetadata(
                        AnchorPane_leftAnchorName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.NULLABLE_COORDINATE,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Anchor Pane Constraints", 1));
        final ValuePropertyMetadata AnchorPane_rightAnchorPropertyMetadata
                = new DoublePropertyMetadata(
                        AnchorPane_rightAnchorName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.NULLABLE_COORDINATE,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Anchor Pane Constraints", 2));
        final ValuePropertyMetadata AnchorPane_topAnchorPropertyMetadata
                = new DoublePropertyMetadata(
                        AnchorPane_topAnchorName,
                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.NULLABLE_COORDINATE,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Anchor Pane Constraints", 3));
        final ValuePropertyMetadata BorderPane_alignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        BorderPane_alignmentName,
                        javafx.geometry.Pos.class,
                        "AUTOMATIC", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Border Pane Constraints", 0));
        final ValuePropertyMetadata BorderPane_marginPropertyMetadata
                = new InsetsPropertyMetadata(
                        BorderPane_marginName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Border Pane Constraints", 1));
        final ValuePropertyMetadata FlowPane_marginPropertyMetadata
                = new InsetsPropertyMetadata(
                        FlowPane_marginName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Flow Pane Constraints", 0));
        final ValuePropertyMetadata GridPane_columnIndexPropertyMetadata
                = new IntegerPropertyMetadata(
                        GridPane_columnIndexName,
                        true, /* readWrite */
                        0, /* defaultValue */
                        new InspectorPath("Layout", "Grid Pane Constraints", 1));
        final ValuePropertyMetadata GridPane_columnSpanPropertyMetadata
                = new IntegerPropertyMetadata(
                        GridPane_columnSpanName,
                        true, /* readWrite */
                        1, /* defaultValue */
                        new InspectorPath("Layout", "Grid Pane Constraints", 3));
        final ValuePropertyMetadata GridPane_halignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        GridPane_halignmentName,
                        javafx.geometry.HPos.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Grid Pane Constraints", 7));
        final ValuePropertyMetadata GridPane_hgrowPropertyMetadata
                = new EnumerationPropertyMetadata(
                        GridPane_hgrowName,
                        javafx.scene.layout.Priority.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Grid Pane Constraints", 4));
        final ValuePropertyMetadata GridPane_marginPropertyMetadata
                = new InsetsPropertyMetadata(
                        GridPane_marginName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Grid Pane Constraints", 8));
        final ValuePropertyMetadata GridPane_rowIndexPropertyMetadata
                = new IntegerPropertyMetadata(
                        GridPane_rowIndexName,
                        true, /* readWrite */
                        0, /* defaultValue */
                        new InspectorPath("Layout", "Grid Pane Constraints", 0));
        final ValuePropertyMetadata GridPane_rowSpanPropertyMetadata
                = new IntegerPropertyMetadata(
                        GridPane_rowSpanName,
                        true, /* readWrite */
                        1, /* defaultValue */
                        new InspectorPath("Layout", "Grid Pane Constraints", 2));
        final ValuePropertyMetadata GridPane_valignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        GridPane_valignmentName,
                        javafx.geometry.VPos.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Grid Pane Constraints", 6));
        final ValuePropertyMetadata GridPane_vgrowPropertyMetadata
                = new EnumerationPropertyMetadata(
                        GridPane_vgrowName,
                        javafx.scene.layout.Priority.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Grid Pane Constraints", 5));
        final ValuePropertyMetadata HBox_hgrowPropertyMetadata
                = new EnumerationPropertyMetadata(
                        HBox_hgrowName,
                        javafx.scene.layout.Priority.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "HBox Constraints", 0));
        final ValuePropertyMetadata HBox_marginPropertyMetadata
                = new InsetsPropertyMetadata(
                        HBox_marginName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "HBox Constraints", 1));
        final ValuePropertyMetadata StackPane_alignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        StackPane_alignmentName,
                        javafx.geometry.Pos.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Stack Pane Constraints", 0));
        final ValuePropertyMetadata StackPane_marginPropertyMetadata
                = new InsetsPropertyMetadata(
                        StackPane_marginName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Stack Pane Constraints", 1));
        final ValuePropertyMetadata TilePane_alignmentPropertyMetadata
                = new EnumerationPropertyMetadata(
                        TilePane_alignmentName,
                        javafx.geometry.Pos.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "Tile Pane Constraints", 0));
        final ValuePropertyMetadata TilePane_marginPropertyMetadata
                = new InsetsPropertyMetadata(
                        TilePane_marginName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "Tile Pane Constraints", 1));
        final ValuePropertyMetadata VBox_marginPropertyMetadata
                = new InsetsPropertyMetadata(
                        VBox_marginName,
                        true, /* readWrite */
                        null, /* defaultValue */
                        new InspectorPath("Layout", "VBox Constraints", 1));
        final ValuePropertyMetadata VBox_vgrowPropertyMetadata
                = new EnumerationPropertyMetadata(
                        VBox_vgrowName,
                        javafx.scene.layout.Priority.class,
                        "INHERIT", /* null equivalent */
                        true, /* readWrite */
                        new InspectorPath("Layout", "VBox Constraints", 0));

        // Populate componentClassMap
        componentClassMap.put(AccordionMetadata.getKlass(), AccordionMetadata);
        componentClassMap.put(AmbientLightMetadata.getKlass(), AmbientLightMetadata);
        componentClassMap.put(AnchorPaneMetadata.getKlass(), AnchorPaneMetadata);
        componentClassMap.put(ArcMetadata.getKlass(), ArcMetadata);
        componentClassMap.put(ArcToMetadata.getKlass(), ArcToMetadata);
        componentClassMap.put(AreaChartMetadata.getKlass(), AreaChartMetadata);
        componentClassMap.put(AxisMetadata.getKlass(), AxisMetadata);
        componentClassMap.put(BarChartMetadata.getKlass(), BarChartMetadata);
        componentClassMap.put(BorderPaneMetadata.getKlass(), BorderPaneMetadata);
        componentClassMap.put(BoxMetadata.getKlass(), BoxMetadata);
        componentClassMap.put(BubbleChartMetadata.getKlass(), BubbleChartMetadata);
        componentClassMap.put(ButtonMetadata.getKlass(), ButtonMetadata);
        componentClassMap.put(ButtonBaseMetadata.getKlass(), ButtonBaseMetadata);
        componentClassMap.put(CameraMetadata.getKlass(), CameraMetadata);
        componentClassMap.put(CanvasMetadata.getKlass(), CanvasMetadata);
        componentClassMap.put(CategoryAxisMetadata.getKlass(), CategoryAxisMetadata);
        componentClassMap.put(ChartMetadata.getKlass(), ChartMetadata);
        componentClassMap.put(CheckBoxMetadata.getKlass(), CheckBoxMetadata);
        componentClassMap.put(CheckMenuItemMetadata.getKlass(), CheckMenuItemMetadata);
        componentClassMap.put(ChoiceBoxMetadata.getKlass(), ChoiceBoxMetadata);
        componentClassMap.put(CircleMetadata.getKlass(), CircleMetadata);
        componentClassMap.put(ClosePathMetadata.getKlass(), ClosePathMetadata);
        componentClassMap.put(ColorPickerMetadata.getKlass(), ColorPickerMetadata);
        componentClassMap.put(ColumnConstraintsMetadata.getKlass(), ColumnConstraintsMetadata);
        componentClassMap.put(ComboBoxMetadata.getKlass(), ComboBoxMetadata);
        componentClassMap.put(ComboBoxBaseMetadata.getKlass(), ComboBoxBaseMetadata);
        componentClassMap.put(ContextMenuMetadata.getKlass(), ContextMenuMetadata);
        componentClassMap.put(ControlMetadata.getKlass(), ControlMetadata);
        componentClassMap.put(CubicCurveMetadata.getKlass(), CubicCurveMetadata);
        componentClassMap.put(CubicCurveToMetadata.getKlass(), CubicCurveToMetadata);
        componentClassMap.put(CustomMenuItemMetadata.getKlass(), CustomMenuItemMetadata);
        componentClassMap.put(CylinderMetadata.getKlass(), CylinderMetadata);
        componentClassMap.put(DatePickerMetadata.getKlass(), DatePickerMetadata);
        componentClassMap.put(EllipseMetadata.getKlass(), EllipseMetadata);
        componentClassMap.put(FlowPaneMetadata.getKlass(), FlowPaneMetadata);
        componentClassMap.put(GridPaneMetadata.getKlass(), GridPaneMetadata);
        componentClassMap.put(GroupMetadata.getKlass(), GroupMetadata);
        componentClassMap.put(HBoxMetadata.getKlass(), HBoxMetadata);
        componentClassMap.put(HLineToMetadata.getKlass(), HLineToMetadata);
        componentClassMap.put(HTMLEditorMetadata.getKlass(), HTMLEditorMetadata);
        componentClassMap.put(HyperlinkMetadata.getKlass(), HyperlinkMetadata);
        componentClassMap.put(ImageViewMetadata.getKlass(), ImageViewMetadata);
        componentClassMap.put(LabelMetadata.getKlass(), LabelMetadata);
        componentClassMap.put(LabeledMetadata.getKlass(), LabeledMetadata);
        componentClassMap.put(LightBaseMetadata.getKlass(), LightBaseMetadata);
        componentClassMap.put(LineMetadata.getKlass(), LineMetadata);
        componentClassMap.put(LineChartMetadata.getKlass(), LineChartMetadata);
        componentClassMap.put(LineToMetadata.getKlass(), LineToMetadata);
        componentClassMap.put(ListViewMetadata.getKlass(), ListViewMetadata);
        componentClassMap.put(MediaViewMetadata.getKlass(), MediaViewMetadata);
        componentClassMap.put(MenuMetadata.getKlass(), MenuMetadata);
        componentClassMap.put(MenuBarMetadata.getKlass(), MenuBarMetadata);
        componentClassMap.put(MenuButtonMetadata.getKlass(), MenuButtonMetadata);
        componentClassMap.put(MenuItemMetadata.getKlass(), MenuItemMetadata);
        componentClassMap.put(MeshViewMetadata.getKlass(), MeshViewMetadata);
        componentClassMap.put(MoveToMetadata.getKlass(), MoveToMetadata);
        componentClassMap.put(NodeMetadata.getKlass(), NodeMetadata);
        componentClassMap.put(NumberAxisMetadata.getKlass(), NumberAxisMetadata);
        componentClassMap.put(PaginationMetadata.getKlass(), PaginationMetadata);
        componentClassMap.put(PaneMetadata.getKlass(), PaneMetadata);

        componentClassMap.put(ParallelCameraMetadata.getKlass(), ParallelCameraMetadata);
        componentClassMap.put(ParentMetadata.getKlass(), ParentMetadata);
        componentClassMap.put(PasswordFieldMetadata.getKlass(), PasswordFieldMetadata);
        componentClassMap.put(PathMetadata.getKlass(), PathMetadata);
        componentClassMap.put(PathElementMetadata.getKlass(), PathElementMetadata);
        componentClassMap.put(PerspectiveCameraMetadata.getKlass(), PerspectiveCameraMetadata);
        componentClassMap.put(PieChartMetadata.getKlass(), PieChartMetadata);
        componentClassMap.put(PointLightMetadata.getKlass(), PointLightMetadata);
        componentClassMap.put(PolygonMetadata.getKlass(), PolygonMetadata);
        componentClassMap.put(PolylineMetadata.getKlass(), PolylineMetadata);
        componentClassMap.put(PopupControlMetadata.getKlass(), PopupControlMetadata);
        componentClassMap.put(PopupWindowMetadata.getKlass(), PopupWindowMetadata);
        componentClassMap.put(ProgressBarMetadata.getKlass(), ProgressBarMetadata);
        componentClassMap.put(ProgressIndicatorMetadata.getKlass(), ProgressIndicatorMetadata);
        componentClassMap.put(QuadCurveMetadata.getKlass(), QuadCurveMetadata);
        componentClassMap.put(QuadCurveToMetadata.getKlass(), QuadCurveToMetadata);
        componentClassMap.put(RadioButtonMetadata.getKlass(), RadioButtonMetadata);
        componentClassMap.put(RadioMenuItemMetadata.getKlass(), RadioMenuItemMetadata);
        componentClassMap.put(RectangleMetadata.getKlass(), RectangleMetadata);
        componentClassMap.put(RegionMetadata.getKlass(), RegionMetadata);
        componentClassMap.put(RowConstraintsMetadata.getKlass(), RowConstraintsMetadata);
        componentClassMap.put(SVGPathMetadata.getKlass(), SVGPathMetadata);
        componentClassMap.put(ScatterChartMetadata.getKlass(), ScatterChartMetadata);
        componentClassMap.put(ScrollBarMetadata.getKlass(), ScrollBarMetadata);
        componentClassMap.put(ScrollPaneMetadata.getKlass(), ScrollPaneMetadata);
        componentClassMap.put(SeparatorMetadata.getKlass(), SeparatorMetadata);
        componentClassMap.put(SeparatorMenuItemMetadata.getKlass(), SeparatorMenuItemMetadata);
        componentClassMap.put(ShapeMetadata.getKlass(), ShapeMetadata);
        componentClassMap.put(Shape3DMetadata.getKlass(), Shape3DMetadata);
        componentClassMap.put(SliderMetadata.getKlass(), SliderMetadata);
        componentClassMap.put(SphereMetadata.getKlass(), SphereMetadata);
        componentClassMap.put(SplitMenuButtonMetadata.getKlass(), SplitMenuButtonMetadata);
        componentClassMap.put(SplitPaneMetadata.getKlass(), SplitPaneMetadata);
        componentClassMap.put(StackPaneMetadata.getKlass(), StackPaneMetadata);
        componentClassMap.put(StackedAreaChartMetadata.getKlass(), StackedAreaChartMetadata);
        componentClassMap.put(StackedBarChartMetadata.getKlass(), StackedBarChartMetadata);
        componentClassMap.put(SwingNodeMetadata.getKlass(), SwingNodeMetadata);
        componentClassMap.put(TabMetadata.getKlass(), TabMetadata);
        componentClassMap.put(TabPaneMetadata.getKlass(), TabPaneMetadata);
        componentClassMap.put(TableColumnMetadata.getKlass(), TableColumnMetadata);
        componentClassMap.put(TableColumnBaseMetadata.getKlass(), TableColumnBaseMetadata);
        componentClassMap.put(TableViewMetadata.getKlass(), TableViewMetadata);
        componentClassMap.put(TextMetadata.getKlass(), TextMetadata);
        componentClassMap.put(TextAreaMetadata.getKlass(), TextAreaMetadata);
        componentClassMap.put(TextFieldMetadata.getKlass(), TextFieldMetadata);
        componentClassMap.put(TextFlowMetadata.getKlass(), TextFlowMetadata);
        componentClassMap.put(TextInputControlMetadata.getKlass(), TextInputControlMetadata);
        componentClassMap.put(TilePaneMetadata.getKlass(), TilePaneMetadata);
        componentClassMap.put(TitledPaneMetadata.getKlass(), TitledPaneMetadata);
        componentClassMap.put(ToggleButtonMetadata.getKlass(), ToggleButtonMetadata);
        componentClassMap.put(ToolBarMetadata.getKlass(), ToolBarMetadata);
        componentClassMap.put(TooltipMetadata.getKlass(), TooltipMetadata);
        componentClassMap.put(TreeTableColumnMetadata.getKlass(), TreeTableColumnMetadata);
        componentClassMap.put(TreeTableViewMetadata.getKlass(), TreeTableViewMetadata);
        componentClassMap.put(TreeViewMetadata.getKlass(), TreeViewMetadata);
        componentClassMap.put(VBoxMetadata.getKlass(), VBoxMetadata);
        componentClassMap.put(VLineToMetadata.getKlass(), VLineToMetadata);
        componentClassMap.put(ValueAxisMetadata.getKlass(), ValueAxisMetadata);
        componentClassMap.put(WebViewMetadata.getKlass(), WebViewMetadata);
        componentClassMap.put(XYChartMetadata.getKlass(), XYChartMetadata);

        // ComponentMetadata -> PropertyMetadata
//        AccordionMetadata.getProperties().add(panesPropertyMetadata);
//        AccordionMetadata.getProperties().add(styleClass_c4_PropertyMetadata);
//
//        AmbientLightMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//
//        ArcMetadata.getProperties().add(centerXPropertyMetadata);
//        ArcMetadata.getProperties().add(centerYPropertyMetadata);
//        ArcMetadata.getProperties().add(length_Double_PropertyMetadata);
//        ArcMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        ArcMetadata.getProperties().add(radiusXPropertyMetadata);
//        ArcMetadata.getProperties().add(radiusYPropertyMetadata);
//        ArcMetadata.getProperties().add(startAnglePropertyMetadata);
//        ArcMetadata.getProperties().add(typePropertyMetadata);
//
//        ArcToMetadata.getProperties().add(largeArcFlagPropertyMetadata);
//        ArcToMetadata.getProperties().add(radiusXPropertyMetadata);
//        ArcToMetadata.getProperties().add(radiusYPropertyMetadata);
//        ArcToMetadata.getProperties().add(sweepFlagPropertyMetadata);
//        ArcToMetadata.getProperties().add(x_0_PropertyMetadata);
//        ArcToMetadata.getProperties().add(XAxisRotationPropertyMetadata);
//        ArcToMetadata.getProperties().add(y_0_PropertyMetadata);
//
//        AreaChartMetadata.getProperties().add(createSymbolsPropertyMetadata);
//        AreaChartMetadata.getProperties().add(styleClass_c33_PropertyMetadata);
//
//        AxisMetadata.getProperties().add(animatedPropertyMetadata);
//        AxisMetadata.getProperties().add(autoRangingPropertyMetadata);
//        AxisMetadata.getProperties().add(labelPropertyMetadata);
//        AxisMetadata.getProperties().add(side_NULL_PropertyMetadata);
//        AxisMetadata.getProperties().add(styleClass_c41_PropertyMetadata);
//        AxisMetadata.getProperties().add(tickLabelFillPropertyMetadata);
//        AxisMetadata.getProperties().add(tickLabelFontPropertyMetadata);
//        AxisMetadata.getProperties().add(tickLabelGapPropertyMetadata);
//        AxisMetadata.getProperties().add(tickLabelRotationPropertyMetadata);
//        AxisMetadata.getProperties().add(tickLabelsVisiblePropertyMetadata);
//        AxisMetadata.getProperties().add(tickLengthPropertyMetadata);
//        AxisMetadata.getProperties().add(tickMarksPropertyMetadata);
//        AxisMetadata.getProperties().add(tickMarkVisiblePropertyMetadata);
//        AxisMetadata.getProperties().add(zeroPositionPropertyMetadata);
//
//        BarChartMetadata.getProperties().add(barGapPropertyMetadata);
//        BarChartMetadata.getProperties().add(categoryGapPropertyMetadata);
//        BarChartMetadata.getProperties().add(styleClass_c1_PropertyMetadata);
//
//        BorderPaneMetadata.getProperties().add(bottomPropertyMetadata);
//        BorderPaneMetadata.getProperties().add(centerPropertyMetadata);
//        BorderPaneMetadata.getProperties().add(contentBiasPropertyMetadata);
//        BorderPaneMetadata.getProperties().add(leftPropertyMetadata);
//        BorderPaneMetadata.getProperties().add(rightPropertyMetadata);
//        BorderPaneMetadata.getProperties().add(topPropertyMetadata);
//
//        BoxMetadata.getProperties().add(depthPropertyMetadata);
//        BoxMetadata.getProperties().add(height_Double_200_PropertyMetadata);
//        BoxMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        BoxMetadata.getProperties().add(width_Double_200_PropertyMetadata);
//
//        BubbleChartMetadata.getProperties().add(styleClass_c33_PropertyMetadata);
//        ButtonMetadata.getProperties().add(cancelButtonPropertyMetadata);
//        ButtonMetadata.getProperties().add(defaultButtonPropertyMetadata);
//        ButtonMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        ButtonMetadata.getProperties().add(styleClass_c17_PropertyMetadata);
//
//        ButtonBaseMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        ButtonBaseMetadata.getProperties().add(onActionPropertyMetadata);
//        ButtonBaseMetadata.getProperties().add(styleClass_c37_PropertyMetadata);
//        CameraMetadata.getProperties().add(farClipPropertyMetadata);
//        CameraMetadata.getProperties().add(nearClipPropertyMetadata);
//        CameraMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//
//        CanvasMetadata.getProperties().add(height_Double_0_PropertyMetadata);
//        CanvasMetadata.getProperties().add(nodeOrientation_LEFT_TO_RIGHT_PropertyMetadata);
//        CanvasMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        CanvasMetadata.getProperties().add(width_Double_0_PropertyMetadata);
//
//        CategoryAxisMetadata.getProperties().add(categoriesPropertyMetadata);
//        CategoryAxisMetadata.getProperties().add(categorySpacingPropertyMetadata);
//        CategoryAxisMetadata.getProperties().add(endMarginPropertyMetadata);
//        CategoryAxisMetadata.getProperties().add(gapStartAndEndPropertyMetadata);
//        CategoryAxisMetadata.getProperties().add(startMarginPropertyMetadata);
//        CategoryAxisMetadata.getProperties().add(styleClass_c41_PropertyMetadata);
//        CategoryAxisMetadata.getProperties().add(zeroPositionPropertyMetadata);
//
//        ChartMetadata.getProperties().add(animatedPropertyMetadata);
//        ChartMetadata.getProperties().add(legendSidePropertyMetadata);
//        ChartMetadata.getProperties().add(legendVisiblePropertyMetadata);
//        ChartMetadata.getProperties().add(styleClass_c33_PropertyMetadata);
//        ChartMetadata.getProperties().add(titlePropertyMetadata);
//        ChartMetadata.getProperties().add(titleSidePropertyMetadata);
//
//        CheckBoxMetadata.getProperties().add(allowIndeterminatePropertyMetadata);
//        CheckBoxMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        CheckBoxMetadata.getProperties().add(indeterminate_Boolean_PropertyMetadata);
//        CheckBoxMetadata.getProperties().add(selected_Boolean_PropertyMetadata);
//        CheckBoxMetadata.getProperties().add(styleClass_c10_PropertyMetadata);
//
//        CheckMenuItemMetadata.getProperties().add(selected_Boolean_PropertyMetadata);
//        CheckMenuItemMetadata.getProperties().add(styleClass_c26_PropertyMetadata);
//
//        ChoiceBoxMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        ChoiceBoxMetadata.getProperties().add(styleClass_c39_PropertyMetadata);
//        ChoiceBoxMetadata.getProperties().add(value_Object_PropertyMetadata);
//
//        CircleMetadata.getProperties().add(centerXPropertyMetadata);
//        CircleMetadata.getProperties().add(centerYPropertyMetadata);
//        CircleMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        CircleMetadata.getProperties().add(radius_0_PropertyMetadata);
//
//        ColorPickerMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        ColorPickerMetadata.getProperties().add(styleClass_c5_PropertyMetadata);
//        ColorPickerMetadata.getProperties().add(value_Color_PropertyMetadata);
//
//        ColumnConstraintsMetadata.getProperties().add(fillWidthPropertyMetadata);
//        ColumnConstraintsMetadata.getProperties().add(halignment_NULL_PropertyMetadata);
//        ColumnConstraintsMetadata.getProperties().add(hgrowPropertyMetadata);
//        ColumnConstraintsMetadata.getProperties().add(maxWidth_COMPUTED_PropertyMetadata);
//        ColumnConstraintsMetadata.getProperties().add(minWidth_COMPUTED_PropertyMetadata);
//        ColumnConstraintsMetadata.getProperties().add(percentWidthPropertyMetadata);
//        ColumnConstraintsMetadata.getProperties().add(prefWidth_COMPUTED_PropertyMetadata);
//        ComboBoxMetadata.getProperties().add(buttonCellPropertyMetadata);
//        ComboBoxMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        ComboBoxMetadata.getProperties().add(placeholderPropertyMetadata);
//        ComboBoxMetadata.getProperties().add(styleClass_c11_PropertyMetadata);
//        ComboBoxMetadata.getProperties().add(visibleRowCountPropertyMetadata);
//
//        ComboBoxBaseMetadata.getProperties().add(editable_false_PropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(onActionPropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(onHiddenPropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(onHidingPropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(onShowingPropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(onShownPropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(promptTextPropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(styleClass_c5_PropertyMetadata);
//        ComboBoxBaseMetadata.getProperties().add(value_Object_PropertyMetadata);
        ContextMenuMetadata.getProperties().add(autoHide_true_PropertyMetadata);
        ContextMenuMetadata.getProperties().add(height_Double_0_PropertyMetadata);
        ContextMenuMetadata.getProperties().add(items_MenuItem_PropertyMetadata);
        ContextMenuMetadata.getProperties().add(onActionPropertyMetadata);
        ContextMenuMetadata.getProperties().add(onCloseRequestPropertyMetadata);
        ContextMenuMetadata.getProperties().add(onHiddenPropertyMetadata);
        ContextMenuMetadata.getProperties().add(onHidingPropertyMetadata);
        ContextMenuMetadata.getProperties().add(onShowingPropertyMetadata);
        ContextMenuMetadata.getProperties().add(onShownPropertyMetadata);
        ContextMenuMetadata.getProperties().add(opacityPropertyMetadata);
        ContextMenuMetadata.getProperties().add(styleClass_c8_PropertyMetadata);
        ContextMenuMetadata.getProperties().add(width_Double_0_PropertyMetadata);
        ContextMenuMetadata.getProperties().add(x_NaN_PropertyMetadata);
        ContextMenuMetadata.getProperties().add(y_NaN_PropertyMetadata);

        ControlMetadata.getProperties().add(baselineOffsetPropertyMetadata);
        ControlMetadata.getProperties().add(contextMenuPropertyMetadata);
        ControlMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
        ControlMetadata.getProperties().add(resizable_Boolean_ro_PropertyMetadata);
        ControlMetadata.getProperties().add(styleClass_c23_PropertyMetadata);
        ControlMetadata.getProperties().add(tooltipPropertyMetadata);
//        CubicCurveMetadata.getProperties().add(controlX1PropertyMetadata);
//        CubicCurveMetadata.getProperties().add(controlX2PropertyMetadata);
//        CubicCurveMetadata.getProperties().add(controlY1PropertyMetadata);
//        CubicCurveMetadata.getProperties().add(controlY2PropertyMetadata);
//        CubicCurveMetadata.getProperties().add(endXPropertyMetadata);
//        CubicCurveMetadata.getProperties().add(endYPropertyMetadata);
//        CubicCurveMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        CubicCurveMetadata.getProperties().add(startXPropertyMetadata);
//        CubicCurveMetadata.getProperties().add(startYPropertyMetadata);
//
//        CubicCurveToMetadata.getProperties().add(controlX1PropertyMetadata);
//        CubicCurveToMetadata.getProperties().add(controlX2PropertyMetadata);
//        CubicCurveToMetadata.getProperties().add(controlY1PropertyMetadata);
//        CubicCurveToMetadata.getProperties().add(controlY2PropertyMetadata);
//        CubicCurveToMetadata.getProperties().add(x_0_PropertyMetadata);
//        CubicCurveToMetadata.getProperties().add(y_0_PropertyMetadata);
//
//        CustomMenuItemMetadata.getProperties().add(content_Node_NULL_PropertyMetadata);
//        CustomMenuItemMetadata.getProperties().add(hideOnClick_true_PropertyMetadata);
//        CustomMenuItemMetadata.getProperties().add(styleClass_c25_PropertyMetadata);
//
//        CylinderMetadata.getProperties().add(divisionsPropertyMetadata);
//        CylinderMetadata.getProperties().add(height_Double_200_PropertyMetadata);
//        CylinderMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        CylinderMetadata.getProperties().add(radius_100_PropertyMetadata);
//
//        DatePickerMetadata.getProperties().add(editable_true_PropertyMetadata);
//        DatePickerMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        DatePickerMetadata.getProperties().add(showWeekNumbersPropertyMetadata);
//        DatePickerMetadata.getProperties().add(styleClass_c9_PropertyMetadata);
//
//        EllipseMetadata.getProperties().add(centerXPropertyMetadata);
//        EllipseMetadata.getProperties().add(centerYPropertyMetadata);
//        EllipseMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        EllipseMetadata.getProperties().add(radiusXPropertyMetadata);
//        EllipseMetadata.getProperties().add(radiusYPropertyMetadata);
//
//        FlowPaneMetadata.getProperties().add(alignment_TOP_LEFT_PropertyMetadata);
//        FlowPaneMetadata.getProperties().add(columnHalignmentPropertyMetadata);
//        FlowPaneMetadata.getProperties().add(contentBiasPropertyMetadata);
//        FlowPaneMetadata.getProperties().add(hgapPropertyMetadata);
//        FlowPaneMetadata.getProperties().add(orientation_HORIZONTAL_PropertyMetadata);
//        FlowPaneMetadata.getProperties().add(prefWrapLengthPropertyMetadata);
//        FlowPaneMetadata.getProperties().add(rowValignmentPropertyMetadata);
//        FlowPaneMetadata.getProperties().add(vgapPropertyMetadata);
//
//        GridPaneMetadata.getProperties().add(alignment_TOP_LEFT_PropertyMetadata);
//        GridPaneMetadata.getProperties().add(columnConstraintsPropertyMetadata);
//        GridPaneMetadata.getProperties().add(contentBiasPropertyMetadata);
//        GridPaneMetadata.getProperties().add(gridLinesVisiblePropertyMetadata);
//        GridPaneMetadata.getProperties().add(hgapPropertyMetadata);
//        GridPaneMetadata.getProperties().add(rowConstraintsPropertyMetadata);
//        GridPaneMetadata.getProperties().add(vgapPropertyMetadata);
//        GroupMetadata.getProperties().add(autoSizeChildrenPropertyMetadata);
//        GroupMetadata.getProperties().add(childrenPropertyMetadata);
//        GroupMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);

        HBoxMetadata.getProperties().add(alignment_TOP_LEFT_PropertyMetadata);
        HBoxMetadata.getProperties().add(baselineOffsetPropertyMetadata);
        HBoxMetadata.getProperties().add(contentBiasPropertyMetadata);
        HBoxMetadata.getProperties().add(fillHeightPropertyMetadata);
        HBoxMetadata.getProperties().add(spacingPropertyMetadata);

        VBoxMetadata.getProperties().add(alignment_TOP_LEFT_PropertyMetadata);
        VBoxMetadata.getProperties().add(contentBiasPropertyMetadata);
        VBoxMetadata.getProperties().add(fillWidthPropertyMetadata);
        VBoxMetadata.getProperties().add(spacingPropertyMetadata);

//        HLineToMetadata.getProperties().add(x_0_PropertyMetadata);
//
//        HTMLEditorMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        HTMLEditorMetadata.getProperties().add(htmlTextPropertyMetadata);
//        HTMLEditorMetadata.getProperties().add(styleClass_c20_PropertyMetadata);
//        HyperlinkMetadata.getProperties().add(cursor_HAND_PropertyMetadata);
//        HyperlinkMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        HyperlinkMetadata.getProperties().add(mnemonicParsing_false_PropertyMetadata);
//        HyperlinkMetadata.getProperties().add(styleClass_c23_PropertyMetadata);
//        HyperlinkMetadata.getProperties().add(visitedPropertyMetadata);
//
//        ImageViewMetadata.getProperties().add(fitHeightPropertyMetadata);
//        ImageViewMetadata.getProperties().add(fitWidthPropertyMetadata);
//        ImageViewMetadata.getProperties().add(imagePropertyMetadata);
//        ImageViewMetadata.getProperties().add(nodeOrientation_LEFT_TO_RIGHT_PropertyMetadata);
//        ImageViewMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        ImageViewMetadata.getProperties().add(preserveRatio_false_PropertyMetadata);
//        ImageViewMetadata.getProperties().add(smoothPropertyMetadata);
//        ImageViewMetadata.getProperties().add(viewportPropertyMetadata);
//        ImageViewMetadata.getProperties().add(x_0_PropertyMetadata);
//        ImageViewMetadata.getProperties().add(y_0_PropertyMetadata);
//
//        LabelMetadata.getProperties().add(labelForPropertyMetadata);
//        LabelMetadata.getProperties().add(mnemonicParsing_false_PropertyMetadata);
//        LabelMetadata.getProperties().add(styleClass_c3_PropertyMetadata);
//
        LabeledMetadata.getProperties().add(alignment_CENTER_LEFT_PropertyMetadata);
        LabeledMetadata.getProperties().add(contentBiasPropertyMetadata);
        LabeledMetadata.getProperties().add(contentDisplayPropertyMetadata);
        LabeledMetadata.getProperties().add(ellipsisStringPropertyMetadata);
        LabeledMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
        LabeledMetadata.getProperties().add(fontPropertyMetadata);
        LabeledMetadata.getProperties().add(graphicPropertyMetadata);
        LabeledMetadata.getProperties().add(graphicTextGapPropertyMetadata);
        LabeledMetadata.getProperties().add(labelPaddingPropertyMetadata);
        LabeledMetadata.getProperties().add(lineSpacingPropertyMetadata);
        LabeledMetadata.getProperties().add(mnemonicParsing_true_PropertyMetadata);
        LabeledMetadata.getProperties().add(styleClass_c37_PropertyMetadata);
        LabeledMetadata.getProperties().add(textPropertyMetadata);
        LabeledMetadata.getProperties().add(textAlignmentPropertyMetadata);
        LabeledMetadata.getProperties().add(textFillPropertyMetadata);
        LabeledMetadata.getProperties().add(textOverrunPropertyMetadata);
        LabeledMetadata.getProperties().add(underlinePropertyMetadata);
        LabeledMetadata.getProperties().add(wrapTextPropertyMetadata);
//        LightBaseMetadata.getProperties().add(colorPropertyMetadata);
//        LightBaseMetadata.getProperties().add(lightOnPropertyMetadata);
//        LightBaseMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        LightBaseMetadata.getProperties().add(scopePropertyMetadata);

//        LineMetadata.getProperties().add(endXPropertyMetadata);
//        LineMetadata.getProperties().add(endYPropertyMetadata);
//        LineMetadata.getProperties().add(fill_NULL_PropertyMetadata);
//        LineMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        LineMetadata.getProperties().add(startXPropertyMetadata);
//        LineMetadata.getProperties().add(startYPropertyMetadata);
//        LineMetadata.getProperties().add(stroke_BLACK_PropertyMetadata);
//
//        LineChartMetadata.getProperties().add(createSymbolsPropertyMetadata);
//        LineChartMetadata.getProperties().add(styleClass_c33_PropertyMetadata);
//
//        LineToMetadata.getProperties().add(x_0_PropertyMetadata);
//        LineToMetadata.getProperties().add(y_0_PropertyMetadata);
//        ListViewMetadata.getProperties().add(editable_false_PropertyMetadata);
//        ListViewMetadata.getProperties().add(fixedCellSizePropertyMetadata);
//        ListViewMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        ListViewMetadata.getProperties().add(onEditCancelPropertyMetadata);
//        ListViewMetadata.getProperties().add(onEditCommitPropertyMetadata);
//        ListViewMetadata.getProperties().add(onEditStartPropertyMetadata);
//        ListViewMetadata.getProperties().add(onScrollToPropertyMetadata);
//        ListViewMetadata.getProperties().add(orientation_VERTICAL_PropertyMetadata);
//        ListViewMetadata.getProperties().add(placeholderPropertyMetadata);
//        ListViewMetadata.getProperties().add(styleClass_c31_PropertyMetadata);
//
//        MediaViewMetadata.getProperties().add(fitHeightPropertyMetadata);
//        MediaViewMetadata.getProperties().add(fitWidthPropertyMetadata);
//        MediaViewMetadata.getProperties().add(nodeOrientation_LEFT_TO_RIGHT_PropertyMetadata);
//        MediaViewMetadata.getProperties().add(onErrorPropertyMetadata);
//        MediaViewMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        MediaViewMetadata.getProperties().add(preserveRatio_true_PropertyMetadata);
//        MediaViewMetadata.getProperties().add(smoothPropertyMetadata);
//        MediaViewMetadata.getProperties().add(viewportPropertyMetadata);
//        MediaViewMetadata.getProperties().add(x_0_PropertyMetadata);
//        MediaViewMetadata.getProperties().add(y_0_PropertyMetadata);
//
//        MenuMetadata.getProperties().add(items_MenuItem_PropertyMetadata);
//        MenuMetadata.getProperties().add(onHiddenPropertyMetadata);
//        MenuMetadata.getProperties().add(onHidingPropertyMetadata);
//        MenuMetadata.getProperties().add(onShowingPropertyMetadata);
//        MenuMetadata.getProperties().add(onShownPropertyMetadata);
//        MenuMetadata.getProperties().add(styleClass_c27_PropertyMetadata);
//
//        MenuBarMetadata.getProperties().add(menusPropertyMetadata);
//        MenuBarMetadata.getProperties().add(styleClass_c18_PropertyMetadata);
//
//        MenuButtonMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        MenuButtonMetadata.getProperties().add(items_MenuItem_PropertyMetadata);
//        MenuButtonMetadata.getProperties().add(popupSidePropertyMetadata);
//        MenuButtonMetadata.getProperties().add(styleClass_c47_PropertyMetadata);
//
//        MenuItemMetadata.getProperties().add(acceleratorPropertyMetadata);
//        MenuItemMetadata.getProperties().add(disablePropertyMetadata);
//        MenuItemMetadata.getProperties().add(graphicPropertyMetadata);
//        MenuItemMetadata.getProperties().add(idPropertyMetadata);
//        MenuItemMetadata.getProperties().add(mnemonicParsing_true_PropertyMetadata);
//        MenuItemMetadata.getProperties().add(onActionPropertyMetadata);
//        MenuItemMetadata.getProperties().add(onMenuValidationPropertyMetadata);
//        MenuItemMetadata.getProperties().add(stylePropertyMetadata);
//        MenuItemMetadata.getProperties().add(styleClass_c32_PropertyMetadata);
//        MenuItemMetadata.getProperties().add(textPropertyMetadata);
//        MenuItemMetadata.getProperties().add(visiblePropertyMetadata);
//
//        MeshViewMetadata.getProperties().add(meshPropertyMetadata);
//        MeshViewMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        MoveToMetadata.getProperties().add(x_0_PropertyMetadata);
//        MoveToMetadata.getProperties().add(y_0_PropertyMetadata);
        NodeMetadata.getProperties().add(layoutXPropertyMetadata);
        NodeMetadata.getProperties().add(layoutYPropertyMetadata);
        NodeMetadata.getProperties().add(baselineOffsetPropertyMetadata);
        NodeMetadata.getProperties().add(blendModePropertyMetadata);
        NodeMetadata.getProperties().add(boundsInLocalPropertyMetadata);
        NodeMetadata.getProperties().add(boundsInParentPropertyMetadata);
        NodeMetadata.getProperties().add(cachePropertyMetadata);
        NodeMetadata.getProperties().add(cacheHintPropertyMetadata);
        NodeMetadata.getProperties().add(clipPropertyMetadata);
        NodeMetadata.getProperties().add(contentBiasPropertyMetadata);
        NodeMetadata.getProperties().add(cursor_NULL_PropertyMetadata);
        NodeMetadata.getProperties().add(depthTestPropertyMetadata);
        NodeMetadata.getProperties().add(disablePropertyMetadata);
        NodeMetadata.getProperties().add(effectPropertyMetadata);
        NodeMetadata.getProperties().add(effectiveNodeOrientationPropertyMetadata);
        NodeMetadata.getProperties().add(focusTraversable_false_PropertyMetadata);
        NodeMetadata.getProperties().add(idPropertyMetadata);
        NodeMetadata.getProperties().add(layoutBoundsPropertyMetadata);
        NodeMetadata.getProperties().add(mouseTransparentPropertyMetadata);
        NodeMetadata.getProperties().add(nodeOrientation_INHERIT_PropertyMetadata);
//        NodeMetadata.getProperties().add(onContextMenuRequestedPropertyMetadata);
//        NodeMetadata.getProperties().add(onDragDetectedPropertyMetadata);
//        NodeMetadata.getProperties().add(onDragDonePropertyMetadata);
//        NodeMetadata.getProperties().add(onDragDroppedPropertyMetadata);
//        NodeMetadata.getProperties().add(onDragEnteredPropertyMetadata);
//        NodeMetadata.getProperties().add(onDragExitedPropertyMetadata);
//        NodeMetadata.getProperties().add(onDragOverPropertyMetadata);
//        NodeMetadata.getProperties().add(onInputMethodTextChangedPropertyMetadata);
//        NodeMetadata.getProperties().add(onKeyPressedPropertyMetadata);
//        NodeMetadata.getProperties().add(onKeyReleasedPropertyMetadata);
//        NodeMetadata.getProperties().add(onKeyTypedPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseClickedPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseDragEnteredPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseDragExitedPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseDraggedPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseDragOverPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseDragReleasedPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseEnteredPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseExitedPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseMovedPropertyMetadata);
//        NodeMetadata.getProperties().add(onMousePressedPropertyMetadata);
//        NodeMetadata.getProperties().add(onMouseReleasedPropertyMetadata);
//        NodeMetadata.getProperties().add(onRotatePropertyMetadata);
//        NodeMetadata.getProperties().add(onRotationFinishedPropertyMetadata);
//        NodeMetadata.getProperties().add(onRotationStartedPropertyMetadata);
//        NodeMetadata.getProperties().add(onScrollPropertyMetadata);
//        NodeMetadata.getProperties().add(onScrollFinishedPropertyMetadata);
//        NodeMetadata.getProperties().add(onScrollStartedPropertyMetadata);
//        NodeMetadata.getProperties().add(onSwipeDownPropertyMetadata);
//        NodeMetadata.getProperties().add(onSwipeLeftPropertyMetadata);
//        NodeMetadata.getProperties().add(onSwipeRightPropertyMetadata);
//        NodeMetadata.getProperties().add(onSwipeUpPropertyMetadata);
//        NodeMetadata.getProperties().add(onTouchMovedPropertyMetadata);
//        NodeMetadata.getProperties().add(onTouchPressedPropertyMetadata);
//        NodeMetadata.getProperties().add(onTouchReleasedPropertyMetadata);
//        NodeMetadata.getProperties().add(onTouchStationaryPropertyMetadata);
//        NodeMetadata.getProperties().add(onZoomPropertyMetadata);
//        NodeMetadata.getProperties().add(onZoomFinishedPropertyMetadata);
//        NodeMetadata.getProperties().add(onZoomStartedPropertyMetadata);
        NodeMetadata.getProperties().add(opacityPropertyMetadata);
        NodeMetadata.getProperties().add(pickOnBounds_true_PropertyMetadata);
        NodeMetadata.getProperties().add(resizable_Boolean_ro_PropertyMetadata);
        NodeMetadata.getProperties().add(rotatePropertyMetadata);
        NodeMetadata.getProperties().add(rotationAxisPropertyMetadata);
        NodeMetadata.getProperties().add(scaleXPropertyMetadata);
        NodeMetadata.getProperties().add(scaleYPropertyMetadata);
        NodeMetadata.getProperties().add(scaleZPropertyMetadata);
        NodeMetadata.getProperties().add(stylePropertyMetadata);
        NodeMetadata.getProperties().add(styleClass_empty_PropertyMetadata);
        NodeMetadata.getProperties().add(translateXPropertyMetadata);
        NodeMetadata.getProperties().add(translateYPropertyMetadata);
        NodeMetadata.getProperties().add(translateZPropertyMetadata);
        NodeMetadata.getProperties().add(visiblePropertyMetadata);
        NodeMetadata.getProperties().add(SplitPane_resizableWithParentPropertyMetadata);
//        NodeMetadata.getProperties().add(AnchorPane_bottomAnchorPropertyMetadata);
//        NodeMetadata.getProperties().add(AnchorPane_leftAnchorPropertyMetadata);
//        NodeMetadata.getProperties().add(AnchorPane_rightAnchorPropertyMetadata);
//        NodeMetadata.getProperties().add(AnchorPane_topAnchorPropertyMetadata);
//        NodeMetadata.getProperties().add(BorderPane_alignmentPropertyMetadata);
//        NodeMetadata.getProperties().add(BorderPane_marginPropertyMetadata);
//        NodeMetadata.getProperties().add(FlowPane_marginPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_columnIndexPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_columnSpanPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_halignmentPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_hgrowPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_marginPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_rowIndexPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_rowSpanPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_valignmentPropertyMetadata);
//        NodeMetadata.getProperties().add(GridPane_vgrowPropertyMetadata);
//        NodeMetadata.getProperties().add(HBox_hgrowPropertyMetadata);
//        NodeMetadata.getProperties().add(HBox_marginPropertyMetadata);
//        NodeMetadata.getProperties().add(StackPane_alignmentPropertyMetadata);
//        NodeMetadata.getProperties().add(StackPane_marginPropertyMetadata);
//        NodeMetadata.getProperties().add(TilePane_alignmentPropertyMetadata);
//        NodeMetadata.getProperties().add(TilePane_marginPropertyMetadata);
//        NodeMetadata.getProperties().add(VBox_marginPropertyMetadata);
//        NodeMetadata.getProperties().add(VBox_vgrowPropertyMetadata);
//
//        NumberAxisMetadata.getProperties().add(forceZeroInRangePropertyMetadata);
//        NumberAxisMetadata.getProperties().add(styleClass_c41_PropertyMetadata);
//        NumberAxisMetadata.getProperties().add(tickUnitPropertyMetadata);
//
//        PaginationMetadata.getProperties().add(currentPageIndexPropertyMetadata);
//        PaginationMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        PaginationMetadata.getProperties().add(maxPageIndicatorCountPropertyMetadata);
//        PaginationMetadata.getProperties().add(pageCountPropertyMetadata);
//        PaginationMetadata.getProperties().add(styleClass_c35_PropertyMetadata);
//
        PaneMetadata.getProperties().add(childrenPropertyMetadata);
//
//        ParallelCameraMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
        ParentMetadata.getProperties().add(baselineOffsetPropertyMetadata);
        ParentMetadata.getProperties().add(stylesheetsPropertyMetadata);
//        PasswordFieldMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        PasswordFieldMetadata.getProperties().add(styleClass_c48_PropertyMetadata);
//        PathMetadata.getProperties().add(elementsPropertyMetadata);
//        PathMetadata.getProperties().add(fill_NULL_PropertyMetadata);
//        PathMetadata.getProperties().add(fillRulePropertyMetadata);
//        PathMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        PathMetadata.getProperties().add(stroke_BLACK_PropertyMetadata);
//
//        PathElementMetadata.getProperties().add(absolutePropertyMetadata);

//        PerspectiveCameraMetadata.getProperties().add(fieldOfViewPropertyMetadata);
//        PerspectiveCameraMetadata.getProperties().add(fixedEyeAtCameraZeroPropertyMetadata);
//        PerspectiveCameraMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        PerspectiveCameraMetadata.getProperties().add(verticalFieldOfViewPropertyMetadata);
//
//        PieChartMetadata.getProperties().add(clockwisePropertyMetadata);
//        PieChartMetadata.getProperties().add(labelLineLengthPropertyMetadata);
//        PieChartMetadata.getProperties().add(labelsVisiblePropertyMetadata);
//        PieChartMetadata.getProperties().add(startAnglePropertyMetadata);
//        PieChartMetadata.getProperties().add(styleClass_c33_PropertyMetadata);
//
//        PointLightMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//
//        PolygonMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        PolygonMetadata.getProperties().add(pointsPropertyMetadata);
//
//        PolylineMetadata.getProperties().add(fill_NULL_PropertyMetadata);
//        PolylineMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        PolylineMetadata.getProperties().add(pointsPropertyMetadata);
//        PolylineMetadata.getProperties().add(stroke_BLACK_PropertyMetadata);
//
//        PopupControlMetadata.getProperties().add(height_Double_0_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(idPropertyMetadata);
//        PopupControlMetadata.getProperties().add(maxHeight_COMPUTED_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(maxWidth_COMPUTED_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(minHeight_COMPUTED_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(minWidth_COMPUTED_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(onCloseRequestPropertyMetadata);
//        PopupControlMetadata.getProperties().add(onHiddenPropertyMetadata);
//        PopupControlMetadata.getProperties().add(onHidingPropertyMetadata);
//        PopupControlMetadata.getProperties().add(onShowingPropertyMetadata);
//        PopupControlMetadata.getProperties().add(onShownPropertyMetadata);
//        PopupControlMetadata.getProperties().add(opacityPropertyMetadata);
//        PopupControlMetadata.getProperties().add(prefHeight_COMPUTED_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(prefWidth_COMPUTED_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(stylePropertyMetadata);
//        PopupControlMetadata.getProperties().add(styleClass_empty_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(width_Double_0_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(x_NaN_PropertyMetadata);
//        PopupControlMetadata.getProperties().add(y_NaN_PropertyMetadata);
//
//        PopupWindowMetadata.getProperties().add(anchorLocationPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(anchorXPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(anchorYPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(autoFixPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(autoHide_false_PropertyMetadata);
//        PopupWindowMetadata.getProperties().add(consumeAutoHidingEventsPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(height_Double_0_PropertyMetadata);
//        PopupWindowMetadata.getProperties().add(hideOnEscapePropertyMetadata);
//        PopupWindowMetadata.getProperties().add(onAutoHidePropertyMetadata);
//        PopupWindowMetadata.getProperties().add(onCloseRequestPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(onHiddenPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(onHidingPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(onShowingPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(onShownPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(opacityPropertyMetadata);
//        PopupWindowMetadata.getProperties().add(width_Double_0_PropertyMetadata);
//        PopupWindowMetadata.getProperties().add(x_NaN_PropertyMetadata);
//        PopupWindowMetadata.getProperties().add(y_NaN_PropertyMetadata);
//
//        ProgressBarMetadata.getProperties().add(styleClass_c13_PropertyMetadata);
//
//        ProgressIndicatorMetadata.getProperties().add(indeterminate_Boolean_ro_PropertyMetadata);
//        ProgressIndicatorMetadata.getProperties().add(progressPropertyMetadata);
//        ProgressIndicatorMetadata.getProperties().add(styleClass_c45_PropertyMetadata);
//
//        QuadCurveMetadata.getProperties().add(controlXPropertyMetadata);
//        QuadCurveMetadata.getProperties().add(controlYPropertyMetadata);
//        QuadCurveMetadata.getProperties().add(endXPropertyMetadata);
//        QuadCurveMetadata.getProperties().add(endYPropertyMetadata);
//        QuadCurveMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        QuadCurveMetadata.getProperties().add(startXPropertyMetadata);
//        QuadCurveMetadata.getProperties().add(startYPropertyMetadata);
//
//        QuadCurveToMetadata.getProperties().add(controlXPropertyMetadata);
//        QuadCurveToMetadata.getProperties().add(controlYPropertyMetadata);
//        QuadCurveToMetadata.getProperties().add(x_0_PropertyMetadata);
//        QuadCurveToMetadata.getProperties().add(y_0_PropertyMetadata);
//
//        RadioButtonMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        RadioButtonMetadata.getProperties().add(styleClass_c37_PropertyMetadata);
//
//        RadioMenuItemMetadata.getProperties().add(selected_Boolean_PropertyMetadata);
//        RadioMenuItemMetadata.getProperties().add(styleClass_c7_PropertyMetadata);
//        RadioMenuItemMetadata.getProperties().add(toggleGroupPropertyMetadata);
//        RectangleMetadata.getProperties().add(arcHeightPropertyMetadata);
//        RectangleMetadata.getProperties().add(arcWidthPropertyMetadata);
//        RectangleMetadata.getProperties().add(height_Double_0_PropertyMetadata);
//        RectangleMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        RectangleMetadata.getProperties().add(width_Double_0_PropertyMetadata);
//        RectangleMetadata.getProperties().add(x_0_PropertyMetadata);
//        RectangleMetadata.getProperties().add(y_0_PropertyMetadata);
//
        RegionMetadata.getProperties().add(maxHeight_COMPUTED_PropertyMetadata);
        RegionMetadata.getProperties().add(maxWidth_COMPUTED_PropertyMetadata);
        RegionMetadata.getProperties().add(minHeight_COMPUTED_PropertyMetadata);
        RegionMetadata.getProperties().add(minWidth_COMPUTED_PropertyMetadata);
        RegionMetadata.getProperties().add(prefWidth_COMPUTED_PropertyMetadata);
        RegionMetadata.getProperties().add(prefHeight_COMPUTED_PropertyMetadata);
// Hide start
        RegionMetadata.getProperties().add(cacheShapePropertyMetadata);
        RegionMetadata.getProperties().add(centerShapePropertyMetadata);
        RegionMetadata.getProperties().add(height_Double_ro_PropertyMetadata);
        RegionMetadata.getProperties().add(insetsPropertyMetadata);
        RegionMetadata.getProperties().add(opaqueInsetsPropertyMetadata);
//        RegionMetadata.getProperties().add(paddingPropertyMetadata);
        RegionMetadata.getProperties().add(resizable_Boolean_ro_PropertyMetadata);
        RegionMetadata.getProperties().add(scaleShapePropertyMetadata);
        RegionMetadata.getProperties().add(shapePropertyMetadata);
        RegionMetadata.getProperties().add(snapToPixelPropertyMetadata);
        RegionMetadata.getProperties().add(width_Double_ro_PropertyMetadata);
        //Hide end
//
//        RowConstraintsMetadata.getProperties().add(fillHeightPropertyMetadata);
//        RowConstraintsMetadata.getProperties().add(maxHeight_COMPUTED_PropertyMetadata);
//        RowConstraintsMetadata.getProperties().add(minHeight_COMPUTED_PropertyMetadata);
//        RowConstraintsMetadata.getProperties().add(percentHeightPropertyMetadata);
//        RowConstraintsMetadata.getProperties().add(prefHeight_COMPUTED_PropertyMetadata);
//        RowConstraintsMetadata.getProperties().add(valignment_NULL_PropertyMetadata);
//        RowConstraintsMetadata.getProperties().add(vgrowPropertyMetadata);
//
//        SVGPathMetadata.getProperties().add(content_String_PropertyMetadata);
//        SVGPathMetadata.getProperties().add(fillRulePropertyMetadata);
//        SVGPathMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//
//        ScatterChartMetadata.getProperties().add(styleClass_c33_PropertyMetadata);

//        ScrollBarMetadata.getProperties().add(blockIncrementPropertyMetadata);
//        ScrollBarMetadata.getProperties().add(maxPropertyMetadata);
//        ScrollBarMetadata.getProperties().add(minPropertyMetadata);
//        ScrollBarMetadata.getProperties().add(orientation_HORIZONTAL_PropertyMetadata);
//        ScrollBarMetadata.getProperties().add(styleClass_c30_PropertyMetadata);
//        ScrollBarMetadata.getProperties().add(unitIncrementPropertyMetadata);
//        ScrollBarMetadata.getProperties().add(value_Double_PropertyMetadata);
//        ScrollBarMetadata.getProperties().add(visibleAmountPropertyMetadata);
//
//        ScrollPaneMetadata.getProperties().add(content_Node_NULL_PropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(fitToHeightPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(fitToWidthPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(hbarPolicyPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(hmaxPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(hminPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(hvaluePropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(pannablePropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(prefViewportHeightPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(prefViewportWidthPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(styleClass_c34_PropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(vbarPolicyPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(viewportBoundsPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(vmaxPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(vminPropertyMetadata);
//        ScrollPaneMetadata.getProperties().add(vvaluePropertyMetadata);
//
//        SeparatorMetadata.getProperties().add(halignment_CENTER_PropertyMetadata);
//        SeparatorMetadata.getProperties().add(orientation_HORIZONTAL_PropertyMetadata);
//        SeparatorMetadata.getProperties().add(styleClass_c28_PropertyMetadata);
//        SeparatorMetadata.getProperties().add(valignment_CENTER_PropertyMetadata);
//
//        SeparatorMenuItemMetadata.getProperties().add(content_Node_SEPARATOR_PropertyMetadata);
//        SeparatorMenuItemMetadata.getProperties().add(hideOnClick_false_PropertyMetadata);
//        SeparatorMenuItemMetadata.getProperties().add(styleClass_c22_PropertyMetadata);
//
//        ShapeMetadata.getProperties().add(fill_BLACK_PropertyMetadata);
//        ShapeMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        ShapeMetadata.getProperties().add(smoothPropertyMetadata);
//        ShapeMetadata.getProperties().add(stroke_NULL_PropertyMetadata);
//        ShapeMetadata.getProperties().add(strokeDashArrayPropertyMetadata);
//        ShapeMetadata.getProperties().add(strokeDashOffsetPropertyMetadata);
//        ShapeMetadata.getProperties().add(strokeLineCapPropertyMetadata);
//        ShapeMetadata.getProperties().add(strokeLineJoinPropertyMetadata);
//        ShapeMetadata.getProperties().add(strokeMiterLimitPropertyMetadata);
//        ShapeMetadata.getProperties().add(strokeTypePropertyMetadata);
//        ShapeMetadata.getProperties().add(strokeWidthPropertyMetadata);
//
//        Shape3DMetadata.getProperties().add(cullFacePropertyMetadata);
//        Shape3DMetadata.getProperties().add(drawModePropertyMetadata);
//        Shape3DMetadata.getProperties().add(materialPropertyMetadata);
//        Shape3DMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//
//        SliderMetadata.getProperties().add(blockIncrementPropertyMetadata);
//        SliderMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        SliderMetadata.getProperties().add(labelFormatterPropertyMetadata);
//        SliderMetadata.getProperties().add(majorTickUnitPropertyMetadata);
//        SliderMetadata.getProperties().add(maxPropertyMetadata);
//        SliderMetadata.getProperties().add(minPropertyMetadata);
//        SliderMetadata.getProperties().add(minorTickCount_3_PropertyMetadata);
//        SliderMetadata.getProperties().add(orientation_HORIZONTAL_PropertyMetadata);
//        SliderMetadata.getProperties().add(showTickLabelsPropertyMetadata);
//        SliderMetadata.getProperties().add(showTickMarksPropertyMetadata);
//        SliderMetadata.getProperties().add(snapToTicksPropertyMetadata);
//        SliderMetadata.getProperties().add(styleClass_c36_PropertyMetadata);
//        SliderMetadata.getProperties().add(value_Double_PropertyMetadata);
//
//        SphereMetadata.getProperties().add(divisionsPropertyMetadata);
//        SphereMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        SphereMetadata.getProperties().add(radius_100_PropertyMetadata);
//
//        SplitMenuButtonMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        SplitMenuButtonMetadata.getProperties().add(styleClass_c2_PropertyMetadata);
//
//        SplitPaneMetadata.getProperties().add(dividerPositionsPropertyMetadata);
//        SplitPaneMetadata.getProperties().add(items_Node_PropertyMetadata);
//        SplitPaneMetadata.getProperties().add(orientation_HORIZONTAL_PropertyMetadata);
//        SplitPaneMetadata.getProperties().add(styleClass_c14_PropertyMetadata);
//
//        StackPaneMetadata.getProperties().add(alignment_CENTER_PropertyMetadata);
//        StackPaneMetadata.getProperties().add(contentBiasPropertyMetadata);
//
//        StackedAreaChartMetadata.getProperties().add(createSymbolsPropertyMetadata);
//        StackedAreaChartMetadata.getProperties().add(styleClass_c33_PropertyMetadata);
//
//        StackedBarChartMetadata.getProperties().add(categoryGapPropertyMetadata);
//        StackedBarChartMetadata.getProperties().add(styleClass_c12_PropertyMetadata);
//
//        SwingNodeMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        SwingNodeMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        SwingNodeMetadata.getProperties().add(resizable_Boolean_ro_PropertyMetadata);
//
//        TabMetadata.getProperties().add(closablePropertyMetadata);
//        TabMetadata.getProperties().add(content_Node_NULL_PropertyMetadata);
//        TabMetadata.getProperties().add(contextMenuPropertyMetadata);
//        TabMetadata.getProperties().add(disablePropertyMetadata);
//        TabMetadata.getProperties().add(graphicPropertyMetadata);
//        TabMetadata.getProperties().add(idPropertyMetadata);
//        TabMetadata.getProperties().add(onClosedPropertyMetadata);
//        TabMetadata.getProperties().add(onCloseRequestPropertyMetadata);
//        TabMetadata.getProperties().add(onSelectionChangedPropertyMetadata);
//        TabMetadata.getProperties().add(selected_Boolean_ro_PropertyMetadata);
//        TabMetadata.getProperties().add(stylePropertyMetadata);
//        TabMetadata.getProperties().add(styleClass_c19_PropertyMetadata);
//        TabMetadata.getProperties().add(textPropertyMetadata);
//        TabMetadata.getProperties().add(tooltipPropertyMetadata);
//
//        TabPaneMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        TabPaneMetadata.getProperties().add(rotateGraphicPropertyMetadata);
//        TabPaneMetadata.getProperties().add(side_TOP_PropertyMetadata);
//        TabPaneMetadata.getProperties().add(styleClass_c6_PropertyMetadata);
//        TabPaneMetadata.getProperties().add(tabClosingPolicyPropertyMetadata);
//        TabPaneMetadata.getProperties().add(tabMaxHeightPropertyMetadata);
//        TabPaneMetadata.getProperties().add(tabMaxWidthPropertyMetadata);
//        TabPaneMetadata.getProperties().add(tabMinHeightPropertyMetadata);
//        TabPaneMetadata.getProperties().add(tabMinWidthPropertyMetadata);
//        TabPaneMetadata.getProperties().add(tabsPropertyMetadata);
//        TableColumnMetadata.getProperties().add(columns_TableColumn_PropertyMetadata);
//        TableColumnMetadata.getProperties().add(onEditCancelPropertyMetadata);
//        TableColumnMetadata.getProperties().add(onEditCommitPropertyMetadata);
//        TableColumnMetadata.getProperties().add(onEditStartPropertyMetadata);
//        TableColumnMetadata.getProperties().add(sortType_SortType_PropertyMetadata);
//
//        TableColumnBaseMetadata.getProperties().add(contextMenuPropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(editable_true_PropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(graphicPropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(idPropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(maxWidth_500000_PropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(minWidth_1000_PropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(prefWidth_8000_PropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(resizable_Boolean_PropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(sortablePropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(sortNodePropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(stylePropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(styleClass_c38_PropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(textPropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(visiblePropertyMetadata);
//        TableColumnBaseMetadata.getProperties().add(width_Double_ro_PropertyMetadata);
//
//        TableViewMetadata.getProperties().add(columnResizePolicy_TABLEVIEW_UNCONSTRAINED_PropertyMetadata);
//        TableViewMetadata.getProperties().add(columns_TableColumn_PropertyMetadata);
//        TableViewMetadata.getProperties().add(editable_false_PropertyMetadata);
//        TableViewMetadata.getProperties().add(fixedCellSizePropertyMetadata);
//        TableViewMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        TableViewMetadata.getProperties().add(onScrollToPropertyMetadata);
//        TableViewMetadata.getProperties().add(onScrollToColumnPropertyMetadata);
//        TableViewMetadata.getProperties().add(onSortPropertyMetadata);
//        TableViewMetadata.getProperties().add(placeholderPropertyMetadata);
//        TableViewMetadata.getProperties().add(sortOrderPropertyMetadata);
//        TableViewMetadata.getProperties().add(styleClass_c44_PropertyMetadata);
//        TableViewMetadata.getProperties().add(tableMenuButtonVisiblePropertyMetadata);
        TextMetadata.getProperties().add(baselineOffsetPropertyMetadata);
        TextMetadata.getProperties().add(boundsTypePropertyMetadata);
        TextMetadata.getProperties().add(fontPropertyMetadata);
        TextMetadata.getProperties().add(fontSmoothingType_GRAY_PropertyMetadata);
        TextMetadata.getProperties().add(lineSpacingPropertyMetadata);
        TextMetadata.getProperties().add(strikethroughPropertyMetadata);
        TextMetadata.getProperties().add(textPropertyMetadata);
        TextMetadata.getProperties().add(textAlignmentPropertyMetadata);
        TextMetadata.getProperties().add(textOriginPropertyMetadata);
        TextMetadata.getProperties().add(underlinePropertyMetadata);
        TextMetadata.getProperties().add(wrappingWidthPropertyMetadata);
        TextMetadata.getProperties().add(x_0_PropertyMetadata);
        TextMetadata.getProperties().add(y_0_PropertyMetadata);

        TextAreaMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
        TextAreaMetadata.getProperties().add(prefColumnCount_40_PropertyMetadata);
        TextAreaMetadata.getProperties().add(prefRowCountPropertyMetadata);
        TextAreaMetadata.getProperties().add(scrollLeftPropertyMetadata);
        TextAreaMetadata.getProperties().add(scrollTopPropertyMetadata);
        TextAreaMetadata.getProperties().add(styleClass_c46_PropertyMetadata);
        TextAreaMetadata.getProperties().add(wrapTextPropertyMetadata);

        TextFieldMetadata.getProperties().add(alignment_CENTER_LEFT_PropertyMetadata);
        TextFieldMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
        TextFieldMetadata.getProperties().add(onActionPropertyMetadata);
        TextFieldMetadata.getProperties().add(prefColumnCount_12_PropertyMetadata);
        TextFieldMetadata.getProperties().add(styleClass_c42_PropertyMetadata);
        TextFlowMetadata.getProperties().add(baselineOffsetPropertyMetadata);
        TextFlowMetadata.getProperties().add(contentBiasPropertyMetadata);
        TextFlowMetadata.getProperties().add(lineSpacingPropertyMetadata);
        TextFlowMetadata.getProperties().add(textAlignmentPropertyMetadata);

        TextInputControlMetadata.getProperties().add(editable_true_PropertyMetadata);
        TextInputControlMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
        TextInputControlMetadata.getProperties().add(fontPropertyMetadata);
        TextInputControlMetadata.getProperties().add(length_Integer_ro_PropertyMetadata);
        TextInputControlMetadata.getProperties().add(promptTextPropertyMetadata);
        TextInputControlMetadata.getProperties().add(styleClass_c46_PropertyMetadata);
        TextInputControlMetadata.getProperties().add(textPropertyMetadata);

//        TilePaneMetadata.getProperties().add(alignment_TOP_LEFT_PropertyMetadata);
//        TilePaneMetadata.getProperties().add(contentBiasPropertyMetadata);
//        TilePaneMetadata.getProperties().add(hgapPropertyMetadata);
//        TilePaneMetadata.getProperties().add(orientation_HORIZONTAL_PropertyMetadata);
//        TilePaneMetadata.getProperties().add(prefColumnsPropertyMetadata);
//        TilePaneMetadata.getProperties().add(prefRowsPropertyMetadata);
//        TilePaneMetadata.getProperties().add(prefTileHeightPropertyMetadata);
//        TilePaneMetadata.getProperties().add(prefTileWidthPropertyMetadata);
//        TilePaneMetadata.getProperties().add(tileAlignmentPropertyMetadata);
//        TilePaneMetadata.getProperties().add(tileHeightPropertyMetadata);
//        TilePaneMetadata.getProperties().add(tileWidthPropertyMetadata);
//        TilePaneMetadata.getProperties().add(vgapPropertyMetadata);
//
//        TitledPaneMetadata.getProperties().add(animatedPropertyMetadata);
//        TitledPaneMetadata.getProperties().add(collapsiblePropertyMetadata);
//        TitledPaneMetadata.getProperties().add(content_Node_NULL_PropertyMetadata);
//        TitledPaneMetadata.getProperties().add(expandedPropertyMetadata);
//        TitledPaneMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        TitledPaneMetadata.getProperties().add(mnemonicParsing_false_PropertyMetadata);
//        TitledPaneMetadata.getProperties().add(styleClass_c24_PropertyMetadata);
//
//        ToggleButtonMetadata.getProperties().add(alignment_CENTER_PropertyMetadata);
//        ToggleButtonMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        ToggleButtonMetadata.getProperties().add(selected_Boolean_PropertyMetadata);
//        ToggleButtonMetadata.getProperties().add(styleClass_c40_PropertyMetadata);
//        ToggleButtonMetadata.getProperties().add(toggleGroupPropertyMetadata);
//
//        ToolBarMetadata.getProperties().add(items_Node_PropertyMetadata);
//        ToolBarMetadata.getProperties().add(orientation_HORIZONTAL_PropertyMetadata);
//        ToolBarMetadata.getProperties().add(styleClass_c16_PropertyMetadata);
//
//        TooltipMetadata.getProperties().add(contentDisplayPropertyMetadata);
//        TooltipMetadata.getProperties().add(fontPropertyMetadata);
//        TooltipMetadata.getProperties().add(graphicPropertyMetadata);
//        TooltipMetadata.getProperties().add(graphicTextGapPropertyMetadata);
//        TooltipMetadata.getProperties().add(height_Double_0_PropertyMetadata);
//        TooltipMetadata.getProperties().add(onCloseRequestPropertyMetadata);
//        TooltipMetadata.getProperties().add(onHiddenPropertyMetadata);
//        TooltipMetadata.getProperties().add(onHidingPropertyMetadata);
//        TooltipMetadata.getProperties().add(onShowingPropertyMetadata);
//        TooltipMetadata.getProperties().add(onShownPropertyMetadata);
//        TooltipMetadata.getProperties().add(opacityPropertyMetadata);
//        TooltipMetadata.getProperties().add(styleClass_c15_PropertyMetadata);
//        TooltipMetadata.getProperties().add(textPropertyMetadata);
//        TooltipMetadata.getProperties().add(textAlignmentPropertyMetadata);
//        TooltipMetadata.getProperties().add(textOverrunPropertyMetadata);
//        TooltipMetadata.getProperties().add(width_Double_0_PropertyMetadata);
//        TooltipMetadata.getProperties().add(wrapTextPropertyMetadata);
//        TooltipMetadata.getProperties().add(x_NaN_PropertyMetadata);
//        TooltipMetadata.getProperties().add(y_NaN_PropertyMetadata);
//
//        TreeTableColumnMetadata.getProperties().add(columns_TreeTableColumn_PropertyMetadata);
//        TreeTableColumnMetadata.getProperties().add(onEditCancelPropertyMetadata);
//        TreeTableColumnMetadata.getProperties().add(onEditCommitPropertyMetadata);
//        TreeTableColumnMetadata.getProperties().add(onEditStartPropertyMetadata);
//        TreeTableColumnMetadata.getProperties().add(sortType_SortType_PropertyMetadata);
//
//        TreeTableViewMetadata.getProperties().add(columnResizePolicy_TREETABLEVIEW_UNCONSTRAINED_PropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(columns_TreeTableColumn_PropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(editable_false_PropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(expandedItemCountPropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(fixedCellSizePropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(onScrollToPropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(onScrollToColumnPropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(onSortPropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(placeholderPropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(showRootPropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(sortModePropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(sortOrderPropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(styleClass_c29_PropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(tableMenuButtonVisiblePropertyMetadata);
//        TreeTableViewMetadata.getProperties().add(treeColumnPropertyMetadata);
//
//        TreeViewMetadata.getProperties().add(editable_false_PropertyMetadata);
//        TreeViewMetadata.getProperties().add(expandedItemCountPropertyMetadata);
//        TreeViewMetadata.getProperties().add(fixedCellSizePropertyMetadata);
//        TreeViewMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        TreeViewMetadata.getProperties().add(onEditCancelPropertyMetadata);
//        TreeViewMetadata.getProperties().add(onEditCommitPropertyMetadata);
//        TreeViewMetadata.getProperties().add(onEditStartPropertyMetadata);
//        TreeViewMetadata.getProperties().add(onScrollToPropertyMetadata);
//        TreeViewMetadata.getProperties().add(showRootPropertyMetadata);
//        TreeViewMetadata.getProperties().add(styleClass_c21_PropertyMetadata);
//        VLineToMetadata.getProperties().add(y_0_PropertyMetadata);
//
//        ValueAxisMetadata.getProperties().add(lowerBoundPropertyMetadata);
//        ValueAxisMetadata.getProperties().add(minorTickCount_5_PropertyMetadata);
//        ValueAxisMetadata.getProperties().add(minorTickLengthPropertyMetadata);
//        ValueAxisMetadata.getProperties().add(minorTickVisiblePropertyMetadata);
//        ValueAxisMetadata.getProperties().add(scalePropertyMetadata);
//        ValueAxisMetadata.getProperties().add(styleClass_c41_PropertyMetadata);
//        ValueAxisMetadata.getProperties().add(tickLabelFormatterPropertyMetadata);
//        ValueAxisMetadata.getProperties().add(upperBoundPropertyMetadata);
//        ValueAxisMetadata.getProperties().add(zeroPositionPropertyMetadata);
//
//        WebViewMetadata.getProperties().add(contextMenuEnabledPropertyMetadata);
//        WebViewMetadata.getProperties().add(focusTraversable_true_PropertyMetadata);
//        WebViewMetadata.getProperties().add(fontScalePropertyMetadata);
//        WebViewMetadata.getProperties().add(fontSmoothingType_LCD_PropertyMetadata);
//        WebViewMetadata.getProperties().add(height_Double_ro_PropertyMetadata);
//        WebViewMetadata.getProperties().add(maxHeight_MAX_PropertyMetadata);
//        WebViewMetadata.getProperties().add(maxWidth_MAX_PropertyMetadata);
//        WebViewMetadata.getProperties().add(minHeight_0_PropertyMetadata);
//        WebViewMetadata.getProperties().add(minWidth_0_PropertyMetadata);
//        WebViewMetadata.getProperties().add(nodeOrientation_LEFT_TO_RIGHT_PropertyMetadata);
//        WebViewMetadata.getProperties().add(pickOnBounds_false_PropertyMetadata);
//        WebViewMetadata.getProperties().add(prefHeight_60000_PropertyMetadata);
//        WebViewMetadata.getProperties().add(prefWidth_80000_PropertyMetadata);
//        WebViewMetadata.getProperties().add(resizable_Boolean_ro_PropertyMetadata);
//        WebViewMetadata.getProperties().add(styleClass_c43_PropertyMetadata);
//        WebViewMetadata.getProperties().add(width_Double_ro_PropertyMetadata);
//        WebViewMetadata.getProperties().add(zoomPropertyMetadata);
//
//        XYChartMetadata.getProperties().add(alternativeColumnFillVisiblePropertyMetadata);
//        XYChartMetadata.getProperties().add(alternativeRowFillVisiblePropertyMetadata);
//        XYChartMetadata.getProperties().add(horizontalGridLinesVisiblePropertyMetadata);
//        XYChartMetadata.getProperties().add(horizontalZeroLineVisiblePropertyMetadata);
//        XYChartMetadata.getProperties().add(styleClass_c33_PropertyMetadata);
//        XYChartMetadata.getProperties().add(verticalGridLinesVisiblePropertyMetadata);
//        XYChartMetadata.getProperties().add(verticalZeroLineVisiblePropertyMetadata);
//        XYChartMetadata.getProperties().add(XAxisPropertyMetadata);
//        XYChartMetadata.getProperties().add(YAxisPropertyMetadata);
        // Populates hiddenProperties
        hiddenProperties.add(new PropertyName("activated"));
        hiddenProperties.add(new PropertyName("alignWithContentOrigin"));
        hiddenProperties.add(new PropertyName("armed"));
        hiddenProperties.add(new PropertyName("anchor"));
        hiddenProperties.add(new PropertyName("border"));
        hiddenProperties.add(new PropertyName("background"));
        hiddenProperties.add(new PropertyName("caretPosition"));
        hiddenProperties.add(new PropertyName("cellFactory"));
        hiddenProperties.add(new PropertyName("cellValueFactory"));
        hiddenProperties.add(new PropertyName("characters"));
        hiddenProperties.add(new PropertyName("childrenUnmodifiable"));
        hiddenProperties.add(new PropertyName("chronology"));
        hiddenProperties.add(new PropertyName("class"));
        hiddenProperties.add(new PropertyName("comparator"));
        hiddenProperties.add(new PropertyName("converter"));
        hiddenProperties.add(new PropertyName("controlCssMetaData"));
        hiddenProperties.add(new PropertyName("cssMetaData"));
        hiddenProperties.add(new PropertyName("customColors"));
        hiddenProperties.add(new PropertyName("data"));
        hiddenProperties.add(new PropertyName("dayCellFactory"));
        hiddenProperties.add(new PropertyName("disabled"));
        hiddenProperties.add(new PropertyName("dividers"));
        hiddenProperties.add(new PropertyName("editingCell"));
        hiddenProperties.add(new PropertyName("editingIndex"));
        hiddenProperties.add(new PropertyName("editingItem"));
        hiddenProperties.add(new PropertyName("editor"));
        hiddenProperties.add(new PropertyName("engine"));
        hiddenProperties.add(new PropertyName("eventDispatcher"));
        hiddenProperties.add(new PropertyName("expandedPane"));
        hiddenProperties.add(new PropertyName("focused"));
        hiddenProperties.add(new PropertyName("focusModel"));
        hiddenProperties.add(new PropertyName("graphicsContext2D"));
        hiddenProperties.add(new PropertyName("hover"));
        hiddenProperties.add(new PropertyName("impl_caretBias"));
        hiddenProperties.add(new PropertyName("impl_caretPosition"));
        hiddenProperties.add(new PropertyName("impl_caretShape"));
        hiddenProperties.add(new PropertyName("impl_selectionEnd"));
        hiddenProperties.add(new PropertyName("impl_selectionShape"));
        hiddenProperties.add(new PropertyName("impl_selectionStart"));
        hiddenProperties.add(new PropertyName("impl_showRelativeToWindow"));
        hiddenProperties.add(new PropertyName("impl_traversalEngine"));
        hiddenProperties.add(new PropertyName("inputMethodRequests"));
        hiddenProperties.add(new PropertyName("localToParentTransform"));
        hiddenProperties.add(new PropertyName("localToSceneTransform"));
        hiddenProperties.add(new PropertyName("managed"));
        hiddenProperties.add(new PropertyName("mediaPlayer"));
        hiddenProperties.add(new PropertyName("needsLayout"));
        hiddenProperties.add(new PropertyName("nodeColumnEnd", javafx.scene.layout.GridPane.class));
        hiddenProperties.add(new PropertyName("nodeColumnIndex", javafx.scene.layout.GridPane.class));
        hiddenProperties.add(new PropertyName("nodeColumnSpan", javafx.scene.layout.GridPane.class));
        hiddenProperties.add(new PropertyName("nodeHgrow", javafx.scene.layout.GridPane.class));
        hiddenProperties.add(new PropertyName("nodeMargin", javafx.scene.layout.BorderPane.class));
        hiddenProperties.add(new PropertyName("nodeRowEnd", javafx.scene.layout.GridPane.class));
        hiddenProperties.add(new PropertyName("nodeRowIndex", javafx.scene.layout.GridPane.class));
        hiddenProperties.add(new PropertyName("nodeRowSpan", javafx.scene.layout.GridPane.class));
        hiddenProperties.add(new PropertyName("nodeVgrow", javafx.scene.layout.GridPane.class));
        hiddenProperties.add(new PropertyName("ownerWindow"));
        hiddenProperties.add(new PropertyName("ownerNode"));
        hiddenProperties.add(new PropertyName("pageFactory"));
        hiddenProperties.add(new PropertyName("paragraphs"));
        hiddenProperties.add(new PropertyName("parent"));
        hiddenProperties.add(new PropertyName("parentColumn"));
        hiddenProperties.add(new PropertyName("parentMenu"));
        hiddenProperties.add(new PropertyName("parentPopup"));
        hiddenProperties.add(new PropertyName("pressed"));
        hiddenProperties.add(new PropertyName("properties"));
        hiddenProperties.add(new PropertyName("pseudoClassStates"));
        hiddenProperties.add(new PropertyName("root"));
        hiddenProperties.add(new PropertyName("rowFactory"));
        hiddenProperties.add(new PropertyName("scene"));
        hiddenProperties.add(new PropertyName("selection"));
        hiddenProperties.add(new PropertyName("selectionModel"));
        hiddenProperties.add(new PropertyName("selectedText"));
        hiddenProperties.add(new PropertyName("showing"));
        hiddenProperties.add(new PropertyName("sortPolicy"));
        hiddenProperties.add(new PropertyName("skin"));
        hiddenProperties.add(new PropertyName("styleableParent"));
        hiddenProperties.add(new PropertyName("tableView"));
        hiddenProperties.add(new PropertyName("tabPane"));
        hiddenProperties.add(new PropertyName("transforms"));
        hiddenProperties.add(new PropertyName("treeTableView"));
        hiddenProperties.add(new PropertyName("typeInternal"));
        hiddenProperties.add(new PropertyName("typeSelector"));
        hiddenProperties.add(new PropertyName("userData"));
        hiddenProperties.add(new PropertyName("useSystemMenuBar"));
        hiddenProperties.add(new PropertyName("valueChanging"));
        hiddenProperties.add(new PropertyName("visibleLeafColumns"));

        // Populates parentRelatedProperties
        parentRelatedProperties.add(layoutXName);
        parentRelatedProperties.add(layoutYName);
        parentRelatedProperties.add(translateXName);
        parentRelatedProperties.add(translateYName);
        parentRelatedProperties.add(translateZName);
        parentRelatedProperties.add(scaleXName);
        parentRelatedProperties.add(scaleYName);
        parentRelatedProperties.add(scaleZName);
        parentRelatedProperties.add(rotationAxisName);
        parentRelatedProperties.add(rotateName);

        // Populates sectionNames
        sectionNames.add("Properties");
        sectionNames.add("Layout");
        sectionNames.add("Code");

        // Populates subSectionMap
        final List<String> ss0 = new ArrayList<>();
        ss0.add("Custom");
        ss0.add("Text");
        ss0.add("Specific");
        ss0.add("Graphic");
        ss0.add("3D");
        ss0.add("Pagination");
        ss0.add("Stroke");
        ss0.add("Node");
        ss0.add("JavaFX CSS");
        ss0.add("Extras");
        subSectionMap.put("Properties", ss0);
        final List<String> ss1 = new ArrayList<>();
        ss1.add("Anchor Pane Constraints");
        ss1.add("Border Pane Constraints");
        ss1.add("Flow Pane Constraints");
        ss1.add("Grid Pane Constraints");
        ss1.add("HBox Constraints");
        ss1.add("Split Pane Constraints");
        ss1.add("Stack Pane Constraints");
        ss1.add("Tile Pane Constraints");
        ss1.add("VBox Constraints");
        ss1.add("Internal");
        ss1.add("Specific");
        ss1.add("Size");
        ss1.add("Position");
        ss1.add("Transforms");
        ss1.add("Bounds");
        ss1.add("Extras");
        ss1.add("Specific");
        subSectionMap.put("Layout", ss1);
        final List<String> ss2 = new ArrayList<>();
        ss2.add("Main");
        ss2.add("Edit");
        ss2.add("DragDrop");
        ss2.add("Closing");
        ss2.add("HideShow");
        ss2.add("Keyboard");
        ss2.add("Mouse");
        ss2.add("Rotation");
        ss2.add("Swipe");
        ss2.add("Touch");
        ss2.add("Zoom");
        subSectionMap.put("Code", ss2);

        //Custom Loading
        ClassLoader classLoader = Lookup.getDefault().lookup(ClassLoader.class);
        for (Category category : this.getLibraryConfig().getCategory()) {
            for (LibraryWidget widget : category.getWidget()) {
                try {
                    Class componentClass = classLoader.loadClass(widget.getClazz());
                    Class componentParentClass = componentClass.getSuperclass();
                    final ComponentClassMetadata componentClassMetadata = new ComponentClassMetadata(componentClass, componentClassMap.get(componentParentClass));
                    componentClassMap.put(componentClassMetadata.getKlass(), componentClassMetadata);
                } catch (ClassNotFoundException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        }

        for (Component component : this.getPropertyConfig().getComponent()) {
            try {
                Class componentClass = classLoader.loadClass(component.getKlass());
                final IComponentClassMetadata componentClassMetadata = componentClassMap.get(componentClass);

                for (Property property : component.getProperty()) {
                    if (property instanceof BaseProperty) {
                        IPropertyMetadata propertyMetadata = queryProperty(componentClassMetadata, property);
                        if (propertyMetadata != null) {
                            propertyMetadata.setVisible(property.isVisible());
                        }
                    } else if (property instanceof CustomProperty) {
                        managePropertyInvocation((CustomProperty) property, componentClassMetadata);
                    }

                }
            } catch (ClassNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }

        }
    }

    // The following properties have been rejected:
    //     javafx.embed.swing.SwingNode -> content : Property type (JComponent) is not certified
    //     javafx.scene.control.ChoiceBox -> items : Property items has no section/subsection assigned
    //     javafx.scene.control.ComboBox -> items : Property items has no section/subsection assigned
    //     javafx.scene.control.ListView -> items : Property items has no section/subsection assigned
    //     javafx.scene.control.TableColumnBase -> columns : Property is a collection but type of its items is unknown
    //     javafx.scene.control.TableView -> items : Property items has no section/subsection assigned
    // No uncertified properties have been found
    /**
     * @return the propertyConfig
     */
    @Override
    public IPropertyConfig getPropertyConfig() {
        return propertyConfig;
    }

    /**
     * @param propertyConfig the propertyConfig to set
     */
    @Override
    public void setPropertyConfig(IPropertyConfig propertyConfig) {
        this.propertyConfig = propertyConfig;
    }

    /**
     * @return the INSPECTOR_PATH_COMPARATOR
     */
    public Comparator<IInspectorPath> getInspectorPathComparator() {
        return INSPECTOR_PATH_COMPARATOR;
    }

    /**
     * @return the libraryConfig
     */
    public ILibraryConfig getLibraryConfig() {
        return libraryConfig;
    }

    /**
     * @param libraryConfig the libraryConfig to set
     */
    public void setLibraryConfig(ILibraryConfig libraryConfig) {
        this.libraryConfig = libraryConfig;
    }

    private void managePropertyInvocation(CustomProperty property, IComponentClassMetadata componentClassMetadata) {
//                          Class<IPropertyMetadata> propertyClass ;
////                        try {
////                            propertyClass = classLoader.loadClass(property.getKlass());
////                        } catch (ClassNotFoundException ex) {
////                            propertyClass = Class.forName("com.oracle.javafx.scenebuilder.kit.metadata.property.value." + property.getKlass() + "PropertyMetadata");
////                        }
//                         propertyClass = (Class<IPropertyMetadata>) Class.forName("com.oracle.javafx.scenebuilder.kit.metadata.property.value." + property.getKlass() + "PropertyMetadata");
        ValuePropertyMetadata propertyMetadata = null;
        Class residenceClass = null;
        if (property.getResidenceClass() != null) {
            try {
                residenceClass = Class.forName(property.getResidenceClass());
            } catch (ClassNotFoundException ex) {
//            Exceptions.printStackTrace(ex);
                //skip
            }
        }

        if (property.getKlass().equals("Image")) {
            propertyMetadata = new ImagePropertyMetadata(
                    new PropertyName(property.getId(), property.getName(), residenceClass),
                    !property.isReadOnly(), /* readWrite */
                    null, /* defaultValue */
                    new InspectorPath(property.getPath().getSection(), property.getPath().getSubSection(), property.getPath().getSubSectionIndex()));
            propertyMetadata.setVisible(property.isVisible());
        } else if (property.getKlass().equals("String")) {
            propertyMetadata = new StringPropertyMetadata(
                    new PropertyName(property.getId(), property.getName(), residenceClass),
                    !property.isReadOnly(), /* readWrite */
                    "", /* defaultValue */
                    new InspectorPath(property.getPath().getSection(), property.getPath().getSubSection(), property.getPath().getSubSectionIndex()));
            propertyMetadata.setVisible(property.isVisible());
        } else if (property.getKlass().equals("Insets")) {
            propertyMetadata = new InsetsPropertyMetadata(
                    new PropertyName(property.getId(), property.getName(), residenceClass),
                    !property.isReadOnly(), /* readWrite */
                    null, /* defaultValue */
                    new InspectorPath(property.getPath().getSection(), property.getPath().getSubSection(), property.getPath().getSubSectionIndex()));
            propertyMetadata.setVisible(property.isVisible());
        } else if (property.getKlass().equals("List")) {
//            propertyMetadata = new EnumerationPropertyMetadata(
//                        new PropertyName(property.getId()),
//                        javafx.scene.effect.BlendMode.class,
//                        "SRC_OVER", /* null equivalent */
//                        true, /* readWrite */
//                        new InspectorPath(property.getPath().getSection(), property.getPath().getSubSection(), property.getPath().getSubSectionIndex()));
//            propertyMetadata.setVisible(property.isVisible());
        }

        List<String> subSectionList = subSectionMap.get(property.getPath().getSection());
        if (subSectionList == null) {
            subSectionList = new ArrayList<>();
            subSectionMap.put(property.getPath().getSection(), subSectionList);
        }

        int subSectionIndex = subSectionList.indexOf(property.getPath().getSubSection());
        if (subSectionIndex == -1) {
            subSectionList.add(property.getPath().getSubSection());
        }

        componentClassMetadata.getProperties().add(propertyMetadata);

//
//
//                 final ValuePropertyMetadata valuePropertyMetadata = new DoublePropertyMetadata(
//                        XAxisRotationName,
//                        com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata.DoubleKind.ANGLE,
//                        true, /* readWrite */
//                        0.0, /* defaultValue */
//                        inspectorPath);
//                    componentClassMetadata.getProperties().add(valuePropertyMetadata);
    }

}
