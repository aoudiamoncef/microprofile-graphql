/*
 * Copyright (c) 2019 Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.microprofile.graphql.tck.apps.basic.api;

import org.eclipse.microprofile.graphql.Interface;
import org.eclipse.microprofile.graphql.Name;

/**
 * To Test the generation of a Types/Inputs/Enums even if it's not used (directly) as a return type or argument.
 * This is the interface that is used directly.
 */
@Interface
public interface BasicInterface {
    String getMessage();

    void setMessage(@Name("message") String message);
}