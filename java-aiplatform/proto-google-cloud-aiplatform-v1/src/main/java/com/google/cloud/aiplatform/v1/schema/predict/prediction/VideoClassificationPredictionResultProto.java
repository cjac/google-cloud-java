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
// source: google/cloud/aiplatform/v1/schema/predict/prediction/video_classification.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public final class VideoClassificationPredictionResultProto {
  private VideoClassificationPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoClassificationPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nOgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/prediction/video_classification.prot"
          + "o\0224google.cloud.aiplatform.v1.schema.pre"
          + "dict.prediction\032\036google/protobuf/duratio"
          + "n.proto\032\036google/protobuf/wrappers.proto\""
          + "\362\001\n#VideoClassificationPredictionResult\022"
          + "\n\n\002id\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\014\n\004typ"
          + "e\030\003 \001(\t\0225\n\022time_segment_start\030\004 \001(\0132\031.go"
          + "ogle.protobuf.Duration\0223\n\020time_segment_e"
          + "nd\030\005 \001(\0132\031.google.protobuf.Duration\022/\n\nc"
          + "onfidence\030\006 \001(\0132\033.google.protobuf.FloatV"
          + "alueB\361\002\n8com.google.cloud.aiplatform.v1."
          + "schema.predict.predictionB(VideoClassifi"
          + "cationPredictionResultProtoP\001Z^google.go"
          + "lang.org/genproto/googleapis/cloud/aipla"
          + "tform/v1/schema/predict/prediction;predi"
          + "ction\252\0024Google.Cloud.AIPlatform.V1.Schem"
          + "a.Predict.Prediction\312\0024Google\\Cloud\\AIPl"
          + "atform\\V1\\Schema\\Predict\\Prediction\352\002:Go"
          + "ogle::Cloud::AIPlatform::V1::Schema::Pre"
          + "dict::Predictionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoClassificationPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoClassificationPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoClassificationPredictionResult_descriptor,
            new java.lang.String[] {
              "Id", "DisplayName", "Type", "TimeSegmentStart", "TimeSegmentEnd", "Confidence",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}