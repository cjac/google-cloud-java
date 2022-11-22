/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/kms/v1/ekm_service.proto

package com.google.cloud.kms.v1;

public interface EkmConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.EkmConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;ekmConnections/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name for the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;ekmConnections/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of
   * [ServiceResolvers][google.cloud.kms.v1.EkmConnection.ServiceResolver] where
   * the EKM can be reached. There should be one ServiceResolver per EKM
   * replica. Currently, only a single
   * [ServiceResolver][google.cloud.kms.v1.EkmConnection.ServiceResolver] is
   * supported.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection.ServiceResolver service_resolvers = 3;</code>
   */
  java.util.List<com.google.cloud.kms.v1.EkmConnection.ServiceResolver> getServiceResolversList();
  /**
   *
   *
   * <pre>
   * A list of
   * [ServiceResolvers][google.cloud.kms.v1.EkmConnection.ServiceResolver] where
   * the EKM can be reached. There should be one ServiceResolver per EKM
   * replica. Currently, only a single
   * [ServiceResolver][google.cloud.kms.v1.EkmConnection.ServiceResolver] is
   * supported.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection.ServiceResolver service_resolvers = 3;</code>
   */
  com.google.cloud.kms.v1.EkmConnection.ServiceResolver getServiceResolvers(int index);
  /**
   *
   *
   * <pre>
   * A list of
   * [ServiceResolvers][google.cloud.kms.v1.EkmConnection.ServiceResolver] where
   * the EKM can be reached. There should be one ServiceResolver per EKM
   * replica. Currently, only a single
   * [ServiceResolver][google.cloud.kms.v1.EkmConnection.ServiceResolver] is
   * supported.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection.ServiceResolver service_resolvers = 3;</code>
   */
  int getServiceResolversCount();
  /**
   *
   *
   * <pre>
   * A list of
   * [ServiceResolvers][google.cloud.kms.v1.EkmConnection.ServiceResolver] where
   * the EKM can be reached. There should be one ServiceResolver per EKM
   * replica. Currently, only a single
   * [ServiceResolver][google.cloud.kms.v1.EkmConnection.ServiceResolver] is
   * supported.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection.ServiceResolver service_resolvers = 3;</code>
   */
  java.util.List<? extends com.google.cloud.kms.v1.EkmConnection.ServiceResolverOrBuilder>
      getServiceResolversOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of
   * [ServiceResolvers][google.cloud.kms.v1.EkmConnection.ServiceResolver] where
   * the EKM can be reached. There should be one ServiceResolver per EKM
   * replica. Currently, only a single
   * [ServiceResolver][google.cloud.kms.v1.EkmConnection.ServiceResolver] is
   * supported.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection.ServiceResolver service_resolvers = 3;</code>
   */
  com.google.cloud.kms.v1.EkmConnection.ServiceResolverOrBuilder getServiceResolversOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Etag of the currently stored
   * [EkmConnection][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. Etag of the currently stored
   * [EkmConnection][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
