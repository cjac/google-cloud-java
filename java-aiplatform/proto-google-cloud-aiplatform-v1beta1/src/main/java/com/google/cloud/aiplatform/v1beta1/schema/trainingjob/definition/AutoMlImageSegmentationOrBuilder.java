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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_segmentation.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public interface AutoMlImageSegmentationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;
   * </code>
   *
   * @return Whether the inputs field is set.
   */
  boolean hasInputs();
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;
   * </code>
   *
   * @return The inputs.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationInputs
      getInputs();
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlImageSegmentationInputsOrBuilder
      getInputsOrBuilder();

  /**
   *
   *
   * <pre>
   * The metadata information.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;
   * </code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * The metadata information.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;
   * </code>
   *
   * @return The metadata.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata
      getMetadata();
  /**
   *
   *
   * <pre>
   * The metadata information.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlImageSegmentationMetadataOrBuilder
      getMetadataOrBuilder();
}