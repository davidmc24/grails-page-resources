/*
 * Copyright 2012 David M. Carr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.grails.plugin.resources.page

import org.springframework.webflow.definition.FlowDefinition
import org.springframework.webflow.execution.FlowExecutionListener
import org.springframework.webflow.execution.factory.FlowExecutionListenerLoader

class ListFlowExecutionListenerLoader implements FlowExecutionListenerLoader {
    List<FlowExecutionListener> listeners = []

    @Override
    FlowExecutionListener[] getListeners(FlowDefinition flowDefinition) {
        return listeners as FlowExecutionListener[]
    }
}
