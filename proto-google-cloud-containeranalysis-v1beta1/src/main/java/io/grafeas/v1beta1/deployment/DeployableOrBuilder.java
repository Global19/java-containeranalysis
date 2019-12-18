/*
 * Copyright 2019 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto

package io.grafeas.v1beta1.deployment;

public interface DeployableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.deployment.Deployable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   *
   * @return A list containing the resourceUri.
   */
  java.util.List<java.lang.String> getResourceUriList();
  /**
   *
   *
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   *
   * @return The count of resourceUri.
   */
  int getResourceUriCount();
  /**
   *
   *
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The resourceUri at the given index.
   */
  java.lang.String getResourceUri(int index);
  /**
   *
   *
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceUri at the given index.
   */
  com.google.protobuf.ByteString getResourceUriBytes(int index);
}
