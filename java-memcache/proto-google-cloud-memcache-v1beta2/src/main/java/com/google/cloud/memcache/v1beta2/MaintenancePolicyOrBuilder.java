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
// source: google/cloud/memcache/v1beta2/cloud_memcache.proto

package com.google.cloud.memcache.v1beta2;

public interface MaintenancePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.memcache.v1beta2.MaintenancePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The time when the policy was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the policy was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the policy was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the policy was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the policy was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the policy was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of what this policy is for. Create/Update methods
   * return INVALID_ARGUMENT if the length is greater than 512.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of what this policy is for. Create/Update methods
   * return INVALID_ARGUMENT if the length is greater than 512.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Maintenance window that is applied to resources covered by this
   * policy. Minimum 1. For the current version, the maximum number of
   * weekly_maintenance_windows is expected to be one.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.memcache.v1beta2.WeeklyMaintenanceWindow weekly_maintenance_window = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.memcache.v1beta2.WeeklyMaintenanceWindow>
      getWeeklyMaintenanceWindowList();
  /**
   *
   *
   * <pre>
   * Required. Maintenance window that is applied to resources covered by this
   * policy. Minimum 1. For the current version, the maximum number of
   * weekly_maintenance_windows is expected to be one.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.memcache.v1beta2.WeeklyMaintenanceWindow weekly_maintenance_window = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.memcache.v1beta2.WeeklyMaintenanceWindow getWeeklyMaintenanceWindow(int index);
  /**
   *
   *
   * <pre>
   * Required. Maintenance window that is applied to resources covered by this
   * policy. Minimum 1. For the current version, the maximum number of
   * weekly_maintenance_windows is expected to be one.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.memcache.v1beta2.WeeklyMaintenanceWindow weekly_maintenance_window = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getWeeklyMaintenanceWindowCount();
  /**
   *
   *
   * <pre>
   * Required. Maintenance window that is applied to resources covered by this
   * policy. Minimum 1. For the current version, the maximum number of
   * weekly_maintenance_windows is expected to be one.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.memcache.v1beta2.WeeklyMaintenanceWindow weekly_maintenance_window = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.memcache.v1beta2.WeeklyMaintenanceWindowOrBuilder>
      getWeeklyMaintenanceWindowOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Maintenance window that is applied to resources covered by this
   * policy. Minimum 1. For the current version, the maximum number of
   * weekly_maintenance_windows is expected to be one.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.memcache.v1beta2.WeeklyMaintenanceWindow weekly_maintenance_window = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.memcache.v1beta2.WeeklyMaintenanceWindowOrBuilder
      getWeeklyMaintenanceWindowOrBuilder(int index);
}
