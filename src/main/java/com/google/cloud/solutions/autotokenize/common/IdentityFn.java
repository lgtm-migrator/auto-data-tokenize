/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.solutions.autotokenize.common;


import org.apache.beam.sdk.transforms.SerializableFunction;

/** Identity function: Returns the same value as input. */
public class IdentityFn<T> implements SerializableFunction<T, T> {

  public static <T> IdentityFn<T> of() {
    return new IdentityFn<>();
  }

  @Override
  public T apply(T input) {
    return input;
  }
}
