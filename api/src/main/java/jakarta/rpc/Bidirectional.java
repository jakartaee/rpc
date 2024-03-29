/*
 *  Copyright (c) 2023 Oracle and/or its affiliates.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  SPDX-License-Identifier: Apache-2.0
 */

package jakarta.rpc;

import io.grpc.MethodDescriptor.MethodType;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to mark a class as representing a
 * bidirectional streaming gRPC method.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@GrpcMethod(type = MethodType.BIDI_STREAMING)
@Documented
@Inherited
public @interface Bidirectional {
    /**
     * The name of the method.
     * <p>
     * If not set the name of the actual annotated method is used.
     *
     * @return the name of the method
     */
    String name() default "";
}
