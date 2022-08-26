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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * [Output Only] If errors are generated during processing of the operation, this field will be populated.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Error}
 */
public final class Error extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Error)
    ErrorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Error.newBuilder() to construct.
  private Error(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Error() {
    errors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Error();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Error(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case -1767146662:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                errors_ = new java.util.ArrayList<com.google.cloud.compute.v1.Errors>();
                mutable_bitField0_ |= 0x00000001;
              }
              errors_.add(
                  input.readMessage(
                      com.google.cloud.compute.v1.Errors.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        errors_ = java.util.Collections.unmodifiableList(errors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Error_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Error_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Error.class,
            com.google.cloud.compute.v1.Error.Builder.class);
  }

  public static final int ERRORS_FIELD_NUMBER = 315977579;
  private java.util.List<com.google.cloud.compute.v1.Errors> errors_;
  /**
   *
   *
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.Errors> getErrorsList() {
    return errors_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.ErrorsOrBuilder>
      getErrorsOrBuilderList() {
    return errors_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  @java.lang.Override
  public int getErrorsCount() {
    return errors_.size();
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Errors getErrors(int index) {
    return errors_.get(index);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ErrorsOrBuilder getErrorsOrBuilder(int index) {
    return errors_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < errors_.size(); i++) {
      output.writeMessage(315977579, errors_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < errors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(315977579, errors_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.Error)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Error other = (com.google.cloud.compute.v1.Error) obj;

    if (!getErrorsList().equals(other.getErrorsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getErrorsCount() > 0) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Error parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Error parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Error parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Error parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.compute.v1.Error prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] If errors are generated during processing of the operation, this field will be populated.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Error}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Error)
      com.google.cloud.compute.v1.ErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Error_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Error_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Error.class,
              com.google.cloud.compute.v1.Error.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Error.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getErrorsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Error_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Error getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Error.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Error build() {
      com.google.cloud.compute.v1.Error result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Error buildPartial() {
      com.google.cloud.compute.v1.Error result = new com.google.cloud.compute.v1.Error(this);
      int from_bitField0_ = bitField0_;
      if (errorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          errors_ = java.util.Collections.unmodifiableList(errors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.errors_ = errors_;
      } else {
        result.errors_ = errorsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.Error) {
        return mergeFrom((com.google.cloud.compute.v1.Error) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Error other) {
      if (other == com.google.cloud.compute.v1.Error.getDefaultInstance()) return this;
      if (errorsBuilder_ == null) {
        if (!other.errors_.isEmpty()) {
          if (errors_.isEmpty()) {
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureErrorsIsMutable();
            errors_.addAll(other.errors_);
          }
          onChanged();
        }
      } else {
        if (!other.errors_.isEmpty()) {
          if (errorsBuilder_.isEmpty()) {
            errorsBuilder_.dispose();
            errorsBuilder_ = null;
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            errorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getErrorsFieldBuilder()
                    : null;
          } else {
            errorsBuilder_.addAllMessages(other.errors_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.compute.v1.Error parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.Error) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.Errors> errors_ =
        java.util.Collections.emptyList();

    private void ensureErrorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        errors_ = new java.util.ArrayList<com.google.cloud.compute.v1.Errors>(errors_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Errors,
            com.google.cloud.compute.v1.Errors.Builder,
            com.google.cloud.compute.v1.ErrorsOrBuilder>
        errorsBuilder_;

    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Errors> getErrorsList() {
      if (errorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errors_);
      } else {
        return errorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public int getErrorsCount() {
      if (errorsBuilder_ == null) {
        return errors_.size();
      } else {
        return errorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public com.google.cloud.compute.v1.Errors getErrors(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder setErrors(int index, com.google.cloud.compute.v1.Errors value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.set(index, value);
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder setErrors(
        int index, com.google.cloud.compute.v1.Errors.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder addErrors(com.google.cloud.compute.v1.Errors value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder addErrors(int index, com.google.cloud.compute.v1.Errors value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(index, value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder addErrors(com.google.cloud.compute.v1.Errors.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder addErrors(
        int index, com.google.cloud.compute.v1.Errors.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder addAllErrors(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.Errors> values) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, errors_);
        onChanged();
      } else {
        errorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder clearErrors() {
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder removeErrors(int index) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.remove(index);
        onChanged();
      } else {
        errorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public com.google.cloud.compute.v1.Errors.Builder getErrorsBuilder(int index) {
      return getErrorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public com.google.cloud.compute.v1.ErrorsOrBuilder getErrorsOrBuilder(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.ErrorsOrBuilder>
        getErrorsOrBuilderList() {
      if (errorsBuilder_ != null) {
        return errorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errors_);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public com.google.cloud.compute.v1.Errors.Builder addErrorsBuilder() {
      return getErrorsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.Errors.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public com.google.cloud.compute.v1.Errors.Builder addErrorsBuilder(int index) {
      return getErrorsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.Errors.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The array of errors encountered while processing this operation.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Errors.Builder> getErrorsBuilderList() {
      return getErrorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Errors,
            com.google.cloud.compute.v1.Errors.Builder,
            com.google.cloud.compute.v1.ErrorsOrBuilder>
        getErrorsFieldBuilder() {
      if (errorsBuilder_ == null) {
        errorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.Errors,
                com.google.cloud.compute.v1.Errors.Builder,
                com.google.cloud.compute.v1.ErrorsOrBuilder>(
                errors_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        errors_ = null;
      }
      return errorsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Error)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Error)
  private static final com.google.cloud.compute.v1.Error DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Error();
  }

  public static com.google.cloud.compute.v1.Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Error> PARSER =
      new com.google.protobuf.AbstractParser<Error>() {
        @java.lang.Override
        public Error parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Error(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Error> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Error> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Error getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}