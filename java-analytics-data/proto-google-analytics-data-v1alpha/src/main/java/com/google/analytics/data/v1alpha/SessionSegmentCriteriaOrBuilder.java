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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface SessionSegmentCriteriaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.SessionSegmentCriteria)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A session matches this criteria if the session matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.SessionSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  java.util.List<com.google.analytics.data.v1alpha.SessionSegmentConditionGroup>
      getAndConditionGroupsList();
  /**
   *
   *
   * <pre>
   * A session matches this criteria if the session matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.SessionSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  com.google.analytics.data.v1alpha.SessionSegmentConditionGroup getAndConditionGroups(int index);
  /**
   *
   *
   * <pre>
   * A session matches this criteria if the session matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.SessionSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  int getAndConditionGroupsCount();
  /**
   *
   *
   * <pre>
   * A session matches this criteria if the session matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.SessionSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.SessionSegmentConditionGroupOrBuilder>
      getAndConditionGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A session matches this criteria if the session matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.SessionSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  com.google.analytics.data.v1alpha.SessionSegmentConditionGroupOrBuilder
      getAndConditionGroupsOrBuilder(int index);
}