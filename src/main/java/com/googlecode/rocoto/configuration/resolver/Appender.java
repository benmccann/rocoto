/*
 *    Copyright 2009-2010 The Rocoto Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.googlecode.rocoto.configuration.resolver;

import com.google.inject.Injector;

/**
 * Appender implementations have the task to resolve variables
 * and append text to the given buffer.
 *
 * @author Simone Tripodi
 * @since 4.0
 * @version $Id$
 */
interface Appender {

    /**
     * Resolve variables from the injector, if needed,
     * and append the result to the given buffer.
     *
     * @param buffer the buffer to append text
     * @param injector the injector used to resolve variables.
     */
    void append(StringBuilder buffer, Injector injector);

}
