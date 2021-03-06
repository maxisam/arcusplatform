/*
 * Copyright 2019 Arcus Project
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
/**
 * 
 */
package com.iris.client.model;

import java.util.Map;


/**
 *
 */
public class ModelChangedEvent extends ModelEvent {
   private Map<String, Object> changes;
   
   public ModelChangedEvent(Model model, Map<String, Object> attributes) {
      super(model);
      this.changes = attributes;
   }

   public Map<String, Object> getChangedAttributes() {
      return changes;
   }
}

