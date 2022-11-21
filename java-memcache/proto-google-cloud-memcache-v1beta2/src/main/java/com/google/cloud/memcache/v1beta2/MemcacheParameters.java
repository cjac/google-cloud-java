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

/** Protobuf type {@code google.cloud.memcache.v1beta2.MemcacheParameters} */
public final class MemcacheParameters extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.memcache.v1beta2.MemcacheParameters)
    MemcacheParametersOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MemcacheParameters.newBuilder() to construct.
  private MemcacheParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MemcacheParameters() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MemcacheParameters();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
        .internal_static_google_cloud_memcache_v1beta2_MemcacheParameters_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 3:
        return internalGetParams();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
        .internal_static_google_cloud_memcache_v1beta2_MemcacheParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.memcache.v1beta2.MemcacheParameters.class,
            com.google.cloud.memcache.v1beta2.MemcacheParameters.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   *
   *
   * <pre>
   * Output only. The unique ID associated with this set of parameters. Users
   * can use this id to determine if the parameters associated with the instance
   * differ from the parameters associated with the nodes. A discrepancy between
   * parameter ids can inform users that they may need to take action to apply
   * parameters on nodes.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The unique ID associated with this set of parameters. Users
   * can use this id to determine if the parameters associated with the instance
   * differ from the parameters associated with the nodes. A discrepancy between
   * parameter ids can inform users that they may need to take action to apply
   * parameters on nodes.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMS_FIELD_NUMBER = 3;

  private static final class ParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.memcache.v1beta2.CloudMemcacheProto
                .internal_static_google_cloud_memcache_v1beta2_MemcacheParameters_ParamsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> params_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetParams() {
    if (params_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ParamsDefaultEntryHolder.defaultEntry);
    }
    return params_;
  }

  public int getParamsCount() {
    return internalGetParams().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  @java.lang.Override
  public boolean containsParams(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetParams().getMap().containsKey(key);
  }
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getParams() {
    return getParamsMap();
  }
  /**
   *
   *
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
    return internalGetParams().getMap();
  }
  /**
   *
   *
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  @java.lang.Override
  public java.lang.String getParamsOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  @java.lang.Override
  public java.lang.String getParamsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetParams().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetParams(), ParamsDefaultEntryHolder.defaultEntry, 3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> params__ =
          ParamsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, params__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.memcache.v1beta2.MemcacheParameters)) {
      return super.equals(obj);
    }
    com.google.cloud.memcache.v1beta2.MemcacheParameters other =
        (com.google.cloud.memcache.v1beta2.MemcacheParameters) obj;

    if (!getId().equals(other.getId())) return false;
    if (!internalGetParams().equals(other.internalGetParams())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (!internalGetParams().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters parseFrom(
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

  public static Builder newBuilder(com.google.cloud.memcache.v1beta2.MemcacheParameters prototype) {
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
  /** Protobuf type {@code google.cloud.memcache.v1beta2.MemcacheParameters} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.memcache.v1beta2.MemcacheParameters)
      com.google.cloud.memcache.v1beta2.MemcacheParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1beta2_MemcacheParameters_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetParams();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 3:
          return internalGetMutableParams();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1beta2_MemcacheParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.memcache.v1beta2.MemcacheParameters.class,
              com.google.cloud.memcache.v1beta2.MemcacheParameters.Builder.class);
    }

    // Construct using com.google.cloud.memcache.v1beta2.MemcacheParameters.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      internalGetMutableParams().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1beta2_MemcacheParameters_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.MemcacheParameters getDefaultInstanceForType() {
      return com.google.cloud.memcache.v1beta2.MemcacheParameters.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.MemcacheParameters build() {
      com.google.cloud.memcache.v1beta2.MemcacheParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.MemcacheParameters buildPartial() {
      com.google.cloud.memcache.v1beta2.MemcacheParameters result =
          new com.google.cloud.memcache.v1beta2.MemcacheParameters(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.params_ = internalGetParams();
      result.params_.makeImmutable();
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
      if (other instanceof com.google.cloud.memcache.v1beta2.MemcacheParameters) {
        return mergeFrom((com.google.cloud.memcache.v1beta2.MemcacheParameters) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.memcache.v1beta2.MemcacheParameters other) {
      if (other == com.google.cloud.memcache.v1beta2.MemcacheParameters.getDefaultInstance())
        return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      internalGetMutableParams().mergeFrom(other.internalGetParams());
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                id_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 26:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> params__ =
                    input.readMessage(
                        ParamsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableParams()
                    .getMutableMap()
                    .put(params__.getKey(), params__.getValue());
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The unique ID associated with this set of parameters. Users
     * can use this id to determine if the parameters associated with the instance
     * differ from the parameters associated with the nodes. A discrepancy between
     * parameter ids can inform users that they may need to take action to apply
     * parameters on nodes.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique ID associated with this set of parameters. Users
     * can use this id to determine if the parameters associated with the instance
     * differ from the parameters associated with the nodes. A discrepancy between
     * parameter ids can inform users that they may need to take action to apply
     * parameters on nodes.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique ID associated with this set of parameters. Users
     * can use this id to determine if the parameters associated with the instance
     * differ from the parameters associated with the nodes. A discrepancy between
     * parameter ids can inform users that they may need to take action to apply
     * parameters on nodes.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      id_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique ID associated with this set of parameters. Users
     * can use this id to determine if the parameters associated with the instance
     * differ from the parameters associated with the nodes. A discrepancy between
     * parameter ids can inform users that they may need to take action to apply
     * parameters on nodes.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {

      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique ID associated with this set of parameters. Users
     * can use this id to determine if the parameters associated with the instance
     * differ from the parameters associated with the nodes. A discrepancy between
     * parameter ids can inform users that they may need to take action to apply
     * parameters on nodes.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> params_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetParams() {
      if (params_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ParamsDefaultEntryHolder.defaultEntry);
      }
      return params_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableParams() {
      onChanged();
      ;
      if (params_ == null) {
        params_ = com.google.protobuf.MapField.newMapField(ParamsDefaultEntryHolder.defaultEntry);
      }
      if (!params_.isMutable()) {
        params_ = params_.copy();
      }
      return params_;
    }

    public int getParamsCount() {
      return internalGetParams().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * User defined set of parameters to use in the memcached process.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    @java.lang.Override
    public boolean containsParams(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetParams().getMap().containsKey(key);
    }
    /** Use {@link #getParamsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
      return getParamsMap();
    }
    /**
     *
     *
     * <pre>
     * User defined set of parameters to use in the memcached process.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
      return internalGetParams().getMap();
    }
    /**
     *
     *
     * <pre>
     * User defined set of parameters to use in the memcached process.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getParamsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * User defined set of parameters to use in the memcached process.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getParamsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParams().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParams() {
      internalGetMutableParams().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * User defined set of parameters to use in the memcached process.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public Builder removeParams(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableParams().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableParams() {
      return internalGetMutableParams().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * User defined set of parameters to use in the memcached process.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public Builder putParams(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableParams().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * User defined set of parameters to use in the memcached process.
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 3;</code>
     */
    public Builder putAllParams(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableParams().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.memcache.v1beta2.MemcacheParameters)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.memcache.v1beta2.MemcacheParameters)
  private static final com.google.cloud.memcache.v1beta2.MemcacheParameters DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.memcache.v1beta2.MemcacheParameters();
  }

  public static com.google.cloud.memcache.v1beta2.MemcacheParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemcacheParameters> PARSER =
      new com.google.protobuf.AbstractParser<MemcacheParameters>() {
        @java.lang.Override
        public MemcacheParameters parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<MemcacheParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemcacheParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.memcache.v1beta2.MemcacheParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
