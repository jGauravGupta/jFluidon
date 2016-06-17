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
package org.netbeans.jfluidon.library.factory;

import com.oracle.javafx.scenebuilder.kit.library.BuiltinLibrary;
import org.netbeans.jfluidon.specification.library.ILibrary;
import org.netbeans.jfluidon.specification.library.factory.ILibraryFactory;

/**
 *
 * @author Gaurav Gupta
 */
@org.openide.util.lookup.ServiceProvider(service = ILibraryFactory.class)
public class LibraryFactoryImpl implements ILibraryFactory {

    @Override
    public ILibrary getLibrary() {
        return new BuiltinLibrary();
    }
}
