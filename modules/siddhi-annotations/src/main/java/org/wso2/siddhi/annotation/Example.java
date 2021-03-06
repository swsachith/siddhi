/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.siddhi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An Optional annotation for storing an examples for a Siddhi Extension.
 * <p>
 * <pre><code>
 * eg:-
 *      {@literal @}Extension(
 *                      ...
 *                      examples = {{@literal @}Example(syntax = "from fooStream#window.time(10 sec)
 *                      select symbol as name, volume insert into barStream;",
 *                      description = "This will processing events that arrived within the last 10 seconds.")
 *      public CustomExtension extends ExtensionSuperClass {
 *          ...
 *      }
 * </code></pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Example {
    String syntax() default "";

    String description() default "";
}
