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
// source: google/cloud/talent/v4/common.proto

package com.google.cloud.talent.v4;

/**
 *
 *
 * <pre>
 * Spell check result.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4.SpellingCorrection}
 */
public final class SpellingCorrection extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4.SpellingCorrection)
    SpellingCorrectionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpellingCorrection.newBuilder() to construct.
  private SpellingCorrection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpellingCorrection() {
    correctedText_ = "";
    correctedHtml_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SpellingCorrection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SpellingCorrection(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8:
            {
              corrected_ = input.readBool();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              correctedText_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              correctedHtml_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4.CommonProto
        .internal_static_google_cloud_talent_v4_SpellingCorrection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4.CommonProto
        .internal_static_google_cloud_talent_v4_SpellingCorrection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4.SpellingCorrection.class,
            com.google.cloud.talent.v4.SpellingCorrection.Builder.class);
  }

  public static final int CORRECTED_FIELD_NUMBER = 1;
  private boolean corrected_;
  /**
   *
   *
   * <pre>
   * Indicates if the query was corrected by the spell checker.
   * </pre>
   *
   * <code>bool corrected = 1;</code>
   *
   * @return The corrected.
   */
  @java.lang.Override
  public boolean getCorrected() {
    return corrected_;
  }

  public static final int CORRECTED_TEXT_FIELD_NUMBER = 2;
  private volatile java.lang.Object correctedText_;
  /**
   *
   *
   * <pre>
   * Correction output consisting of the corrected keyword string.
   * </pre>
   *
   * <code>string corrected_text = 2;</code>
   *
   * @return The correctedText.
   */
  @java.lang.Override
  public java.lang.String getCorrectedText() {
    java.lang.Object ref = correctedText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      correctedText_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Correction output consisting of the corrected keyword string.
   * </pre>
   *
   * <code>string corrected_text = 2;</code>
   *
   * @return The bytes for correctedText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCorrectedTextBytes() {
    java.lang.Object ref = correctedText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      correctedText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CORRECTED_HTML_FIELD_NUMBER = 3;
  private volatile java.lang.Object correctedHtml_;
  /**
   *
   *
   * <pre>
   * Corrected output with html tags to highlight the corrected words.
   * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
   * For example, the user input query is "software enginear", where the second
   * word, "enginear," is incorrect. It should be "engineer". When spelling
   * correction is enabled, this value is
   * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
   * </pre>
   *
   * <code>string corrected_html = 3;</code>
   *
   * @return The correctedHtml.
   */
  @java.lang.Override
  public java.lang.String getCorrectedHtml() {
    java.lang.Object ref = correctedHtml_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      correctedHtml_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Corrected output with html tags to highlight the corrected words.
   * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
   * For example, the user input query is "software enginear", where the second
   * word, "enginear," is incorrect. It should be "engineer". When spelling
   * correction is enabled, this value is
   * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
   * </pre>
   *
   * <code>string corrected_html = 3;</code>
   *
   * @return The bytes for correctedHtml.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCorrectedHtmlBytes() {
    java.lang.Object ref = correctedHtml_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      correctedHtml_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (corrected_ != false) {
      output.writeBool(1, corrected_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(correctedText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, correctedText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(correctedHtml_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, correctedHtml_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (corrected_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, corrected_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(correctedText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, correctedText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(correctedHtml_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, correctedHtml_);
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
    if (!(obj instanceof com.google.cloud.talent.v4.SpellingCorrection)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4.SpellingCorrection other =
        (com.google.cloud.talent.v4.SpellingCorrection) obj;

    if (getCorrected() != other.getCorrected()) return false;
    if (!getCorrectedText().equals(other.getCorrectedText())) return false;
    if (!getCorrectedHtml().equals(other.getCorrectedHtml())) return false;
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
    hash = (37 * hash) + CORRECTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCorrected());
    hash = (37 * hash) + CORRECTED_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getCorrectedText().hashCode();
    hash = (37 * hash) + CORRECTED_HTML_FIELD_NUMBER;
    hash = (53 * hash) + getCorrectedHtml().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.SpellingCorrection parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4.SpellingCorrection prototype) {
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
   * Spell check result.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4.SpellingCorrection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4.SpellingCorrection)
      com.google.cloud.talent.v4.SpellingCorrectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4.CommonProto
          .internal_static_google_cloud_talent_v4_SpellingCorrection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4.CommonProto
          .internal_static_google_cloud_talent_v4_SpellingCorrection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4.SpellingCorrection.class,
              com.google.cloud.talent.v4.SpellingCorrection.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4.SpellingCorrection.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      corrected_ = false;

      correctedText_ = "";

      correctedHtml_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4.CommonProto
          .internal_static_google_cloud_talent_v4_SpellingCorrection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.SpellingCorrection getDefaultInstanceForType() {
      return com.google.cloud.talent.v4.SpellingCorrection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.SpellingCorrection build() {
      com.google.cloud.talent.v4.SpellingCorrection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.SpellingCorrection buildPartial() {
      com.google.cloud.talent.v4.SpellingCorrection result =
          new com.google.cloud.talent.v4.SpellingCorrection(this);
      result.corrected_ = corrected_;
      result.correctedText_ = correctedText_;
      result.correctedHtml_ = correctedHtml_;
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
      if (other instanceof com.google.cloud.talent.v4.SpellingCorrection) {
        return mergeFrom((com.google.cloud.talent.v4.SpellingCorrection) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4.SpellingCorrection other) {
      if (other == com.google.cloud.talent.v4.SpellingCorrection.getDefaultInstance()) return this;
      if (other.getCorrected() != false) {
        setCorrected(other.getCorrected());
      }
      if (!other.getCorrectedText().isEmpty()) {
        correctedText_ = other.correctedText_;
        onChanged();
      }
      if (!other.getCorrectedHtml().isEmpty()) {
        correctedHtml_ = other.correctedHtml_;
        onChanged();
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
      com.google.cloud.talent.v4.SpellingCorrection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4.SpellingCorrection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean corrected_;
    /**
     *
     *
     * <pre>
     * Indicates if the query was corrected by the spell checker.
     * </pre>
     *
     * <code>bool corrected = 1;</code>
     *
     * @return The corrected.
     */
    @java.lang.Override
    public boolean getCorrected() {
      return corrected_;
    }
    /**
     *
     *
     * <pre>
     * Indicates if the query was corrected by the spell checker.
     * </pre>
     *
     * <code>bool corrected = 1;</code>
     *
     * @param value The corrected to set.
     * @return This builder for chaining.
     */
    public Builder setCorrected(boolean value) {

      corrected_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates if the query was corrected by the spell checker.
     * </pre>
     *
     * <code>bool corrected = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCorrected() {

      corrected_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object correctedText_ = "";
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @return The correctedText.
     */
    public java.lang.String getCorrectedText() {
      java.lang.Object ref = correctedText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        correctedText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @return The bytes for correctedText.
     */
    public com.google.protobuf.ByteString getCorrectedTextBytes() {
      java.lang.Object ref = correctedText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        correctedText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @param value The correctedText to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectedText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      correctedText_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCorrectedText() {

      correctedText_ = getDefaultInstance().getCorrectedText();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Correction output consisting of the corrected keyword string.
     * </pre>
     *
     * <code>string corrected_text = 2;</code>
     *
     * @param value The bytes for correctedText to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectedTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      correctedText_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object correctedHtml_ = "";
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @return The correctedHtml.
     */
    public java.lang.String getCorrectedHtml() {
      java.lang.Object ref = correctedHtml_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        correctedHtml_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @return The bytes for correctedHtml.
     */
    public com.google.protobuf.ByteString getCorrectedHtmlBytes() {
      java.lang.Object ref = correctedHtml_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        correctedHtml_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @param value The correctedHtml to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectedHtml(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      correctedHtml_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCorrectedHtml() {

      correctedHtml_ = getDefaultInstance().getCorrectedHtml();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Corrected output with html tags to highlight the corrected words.
     * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
     * For example, the user input query is "software enginear", where the second
     * word, "enginear," is incorrect. It should be "engineer". When spelling
     * correction is enabled, this value is
     * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
     * </pre>
     *
     * <code>string corrected_html = 3;</code>
     *
     * @param value The bytes for correctedHtml to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectedHtmlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      correctedHtml_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4.SpellingCorrection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4.SpellingCorrection)
  private static final com.google.cloud.talent.v4.SpellingCorrection DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4.SpellingCorrection();
  }

  public static com.google.cloud.talent.v4.SpellingCorrection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpellingCorrection> PARSER =
      new com.google.protobuf.AbstractParser<SpellingCorrection>() {
        @java.lang.Override
        public SpellingCorrection parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SpellingCorrection(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SpellingCorrection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpellingCorrection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4.SpellingCorrection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}