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
// source: google/devtools/containeranalysis/v1beta1/build/build.proto

package io.grafeas.v1beta1.build;

/**
 *
 *
 * <pre>
 * Details of a build occurrence.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.build.Details}
 */
public final class Details extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.build.Details)
    DetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Details.newBuilder() to construct.
  private Details(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Details() {
    provenanceBytes_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Details();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Details(
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
          case 10:
            {
              io.grafeas.v1beta1.provenance.BuildProvenance.Builder subBuilder = null;
              if (provenance_ != null) {
                subBuilder = provenance_.toBuilder();
              }
              provenance_ =
                  input.readMessage(
                      io.grafeas.v1beta1.provenance.BuildProvenance.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(provenance_);
                provenance_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              provenanceBytes_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.build.BuildOuterClass
        .internal_static_grafeas_v1beta1_build_Details_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.build.BuildOuterClass
        .internal_static_grafeas_v1beta1_build_Details_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.build.Details.class, io.grafeas.v1beta1.build.Details.Builder.class);
  }

  public static final int PROVENANCE_FIELD_NUMBER = 1;
  private io.grafeas.v1beta1.provenance.BuildProvenance provenance_;
  /**
   *
   *
   * <pre>
   * The actual provenance for the build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
   *
   * @return Whether the provenance field is set.
   */
  public boolean hasProvenance() {
    return provenance_ != null;
  }
  /**
   *
   *
   * <pre>
   * The actual provenance for the build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
   *
   * @return The provenance.
   */
  public io.grafeas.v1beta1.provenance.BuildProvenance getProvenance() {
    return provenance_ == null
        ? io.grafeas.v1beta1.provenance.BuildProvenance.getDefaultInstance()
        : provenance_;
  }
  /**
   *
   *
   * <pre>
   * The actual provenance for the build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
   */
  public io.grafeas.v1beta1.provenance.BuildProvenanceOrBuilder getProvenanceOrBuilder() {
    return getProvenance();
  }

  public static final int PROVENANCE_BYTES_FIELD_NUMBER = 2;
  private volatile java.lang.Object provenanceBytes_;
  /**
   *
   *
   * <pre>
   * Serialized JSON representation of the provenance, used in generating the
   * `BuildSignature` in the corresponding Result. After verifying the
   * signature, `provenance_bytes` can be unmarshalled and compared to the
   * provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order
   * to interoperate with openssl which expects this format for signature
   * verification.
   * The serialized form is captured both to avoid ambiguity in how the
   * provenance is marshalled to json as well to prevent incompatibilities with
   * future changes.
   * </pre>
   *
   * <code>string provenance_bytes = 2;</code>
   *
   * @return The provenanceBytes.
   */
  public java.lang.String getProvenanceBytes() {
    java.lang.Object ref = provenanceBytes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provenanceBytes_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Serialized JSON representation of the provenance, used in generating the
   * `BuildSignature` in the corresponding Result. After verifying the
   * signature, `provenance_bytes` can be unmarshalled and compared to the
   * provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order
   * to interoperate with openssl which expects this format for signature
   * verification.
   * The serialized form is captured both to avoid ambiguity in how the
   * provenance is marshalled to json as well to prevent incompatibilities with
   * future changes.
   * </pre>
   *
   * <code>string provenance_bytes = 2;</code>
   *
   * @return The bytes for provenanceBytes.
   */
  public com.google.protobuf.ByteString getProvenanceBytesBytes() {
    java.lang.Object ref = provenanceBytes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      provenanceBytes_ = b;
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
    if (provenance_ != null) {
      output.writeMessage(1, getProvenance());
    }
    if (!getProvenanceBytesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, provenanceBytes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (provenance_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getProvenance());
    }
    if (!getProvenanceBytesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, provenanceBytes_);
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
    if (!(obj instanceof io.grafeas.v1beta1.build.Details)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.build.Details other = (io.grafeas.v1beta1.build.Details) obj;

    if (hasProvenance() != other.hasProvenance()) return false;
    if (hasProvenance()) {
      if (!getProvenance().equals(other.getProvenance())) return false;
    }
    if (!getProvenanceBytes().equals(other.getProvenanceBytes())) return false;
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
    if (hasProvenance()) {
      hash = (37 * hash) + PROVENANCE_FIELD_NUMBER;
      hash = (53 * hash) + getProvenance().hashCode();
    }
    hash = (37 * hash) + PROVENANCE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getProvenanceBytes().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Details parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.build.Details parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.build.Details parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.build.Details prototype) {
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
   * Details of a build occurrence.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.build.Details}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.build.Details)
      io.grafeas.v1beta1.build.DetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.build.BuildOuterClass
          .internal_static_grafeas_v1beta1_build_Details_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.build.BuildOuterClass
          .internal_static_grafeas_v1beta1_build_Details_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.build.Details.class,
              io.grafeas.v1beta1.build.Details.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.build.Details.newBuilder()
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
      if (provenanceBuilder_ == null) {
        provenance_ = null;
      } else {
        provenance_ = null;
        provenanceBuilder_ = null;
      }
      provenanceBytes_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.build.BuildOuterClass
          .internal_static_grafeas_v1beta1_build_Details_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.build.Details getDefaultInstanceForType() {
      return io.grafeas.v1beta1.build.Details.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.build.Details build() {
      io.grafeas.v1beta1.build.Details result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.build.Details buildPartial() {
      io.grafeas.v1beta1.build.Details result = new io.grafeas.v1beta1.build.Details(this);
      if (provenanceBuilder_ == null) {
        result.provenance_ = provenance_;
      } else {
        result.provenance_ = provenanceBuilder_.build();
      }
      result.provenanceBytes_ = provenanceBytes_;
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
      if (other instanceof io.grafeas.v1beta1.build.Details) {
        return mergeFrom((io.grafeas.v1beta1.build.Details) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.build.Details other) {
      if (other == io.grafeas.v1beta1.build.Details.getDefaultInstance()) return this;
      if (other.hasProvenance()) {
        mergeProvenance(other.getProvenance());
      }
      if (!other.getProvenanceBytes().isEmpty()) {
        provenanceBytes_ = other.provenanceBytes_;
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
      io.grafeas.v1beta1.build.Details parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.build.Details) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grafeas.v1beta1.provenance.BuildProvenance provenance_;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.provenance.BuildProvenance,
            io.grafeas.v1beta1.provenance.BuildProvenance.Builder,
            io.grafeas.v1beta1.provenance.BuildProvenanceOrBuilder>
        provenanceBuilder_;
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     *
     * @return Whether the provenance field is set.
     */
    public boolean hasProvenance() {
      return provenanceBuilder_ != null || provenance_ != null;
    }
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     *
     * @return The provenance.
     */
    public io.grafeas.v1beta1.provenance.BuildProvenance getProvenance() {
      if (provenanceBuilder_ == null) {
        return provenance_ == null
            ? io.grafeas.v1beta1.provenance.BuildProvenance.getDefaultInstance()
            : provenance_;
      } else {
        return provenanceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     */
    public Builder setProvenance(io.grafeas.v1beta1.provenance.BuildProvenance value) {
      if (provenanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        provenance_ = value;
        onChanged();
      } else {
        provenanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     */
    public Builder setProvenance(
        io.grafeas.v1beta1.provenance.BuildProvenance.Builder builderForValue) {
      if (provenanceBuilder_ == null) {
        provenance_ = builderForValue.build();
        onChanged();
      } else {
        provenanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     */
    public Builder mergeProvenance(io.grafeas.v1beta1.provenance.BuildProvenance value) {
      if (provenanceBuilder_ == null) {
        if (provenance_ != null) {
          provenance_ =
              io.grafeas.v1beta1.provenance.BuildProvenance.newBuilder(provenance_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          provenance_ = value;
        }
        onChanged();
      } else {
        provenanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     */
    public Builder clearProvenance() {
      if (provenanceBuilder_ == null) {
        provenance_ = null;
        onChanged();
      } else {
        provenance_ = null;
        provenanceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     */
    public io.grafeas.v1beta1.provenance.BuildProvenance.Builder getProvenanceBuilder() {

      onChanged();
      return getProvenanceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     */
    public io.grafeas.v1beta1.provenance.BuildProvenanceOrBuilder getProvenanceOrBuilder() {
      if (provenanceBuilder_ != null) {
        return provenanceBuilder_.getMessageOrBuilder();
      } else {
        return provenance_ == null
            ? io.grafeas.v1beta1.provenance.BuildProvenance.getDefaultInstance()
            : provenance_;
      }
    }
    /**
     *
     *
     * <pre>
     * The actual provenance for the build.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.BuildProvenance provenance = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.provenance.BuildProvenance,
            io.grafeas.v1beta1.provenance.BuildProvenance.Builder,
            io.grafeas.v1beta1.provenance.BuildProvenanceOrBuilder>
        getProvenanceFieldBuilder() {
      if (provenanceBuilder_ == null) {
        provenanceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1beta1.provenance.BuildProvenance,
                io.grafeas.v1beta1.provenance.BuildProvenance.Builder,
                io.grafeas.v1beta1.provenance.BuildProvenanceOrBuilder>(
                getProvenance(), getParentForChildren(), isClean());
        provenance_ = null;
      }
      return provenanceBuilder_;
    }

    private java.lang.Object provenanceBytes_ = "";
    /**
     *
     *
     * <pre>
     * Serialized JSON representation of the provenance, used in generating the
     * `BuildSignature` in the corresponding Result. After verifying the
     * signature, `provenance_bytes` can be unmarshalled and compared to the
     * provenance to confirm that it is unchanged. A base64-encoded string
     * representation of the provenance bytes is used for the signature in order
     * to interoperate with openssl which expects this format for signature
     * verification.
     * The serialized form is captured both to avoid ambiguity in how the
     * provenance is marshalled to json as well to prevent incompatibilities with
     * future changes.
     * </pre>
     *
     * <code>string provenance_bytes = 2;</code>
     *
     * @return The provenanceBytes.
     */
    public java.lang.String getProvenanceBytes() {
      java.lang.Object ref = provenanceBytes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provenanceBytes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Serialized JSON representation of the provenance, used in generating the
     * `BuildSignature` in the corresponding Result. After verifying the
     * signature, `provenance_bytes` can be unmarshalled and compared to the
     * provenance to confirm that it is unchanged. A base64-encoded string
     * representation of the provenance bytes is used for the signature in order
     * to interoperate with openssl which expects this format for signature
     * verification.
     * The serialized form is captured both to avoid ambiguity in how the
     * provenance is marshalled to json as well to prevent incompatibilities with
     * future changes.
     * </pre>
     *
     * <code>string provenance_bytes = 2;</code>
     *
     * @return The bytes for provenanceBytes.
     */
    public com.google.protobuf.ByteString getProvenanceBytesBytes() {
      java.lang.Object ref = provenanceBytes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        provenanceBytes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Serialized JSON representation of the provenance, used in generating the
     * `BuildSignature` in the corresponding Result. After verifying the
     * signature, `provenance_bytes` can be unmarshalled and compared to the
     * provenance to confirm that it is unchanged. A base64-encoded string
     * representation of the provenance bytes is used for the signature in order
     * to interoperate with openssl which expects this format for signature
     * verification.
     * The serialized form is captured both to avoid ambiguity in how the
     * provenance is marshalled to json as well to prevent incompatibilities with
     * future changes.
     * </pre>
     *
     * <code>string provenance_bytes = 2;</code>
     *
     * @param value The provenanceBytes to set.
     * @return This builder for chaining.
     */
    public Builder setProvenanceBytes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      provenanceBytes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Serialized JSON representation of the provenance, used in generating the
     * `BuildSignature` in the corresponding Result. After verifying the
     * signature, `provenance_bytes` can be unmarshalled and compared to the
     * provenance to confirm that it is unchanged. A base64-encoded string
     * representation of the provenance bytes is used for the signature in order
     * to interoperate with openssl which expects this format for signature
     * verification.
     * The serialized form is captured both to avoid ambiguity in how the
     * provenance is marshalled to json as well to prevent incompatibilities with
     * future changes.
     * </pre>
     *
     * <code>string provenance_bytes = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProvenanceBytes() {

      provenanceBytes_ = getDefaultInstance().getProvenanceBytes();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Serialized JSON representation of the provenance, used in generating the
     * `BuildSignature` in the corresponding Result. After verifying the
     * signature, `provenance_bytes` can be unmarshalled and compared to the
     * provenance to confirm that it is unchanged. A base64-encoded string
     * representation of the provenance bytes is used for the signature in order
     * to interoperate with openssl which expects this format for signature
     * verification.
     * The serialized form is captured both to avoid ambiguity in how the
     * provenance is marshalled to json as well to prevent incompatibilities with
     * future changes.
     * </pre>
     *
     * <code>string provenance_bytes = 2;</code>
     *
     * @param value The bytes for provenanceBytes to set.
     * @return This builder for chaining.
     */
    public Builder setProvenanceBytesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      provenanceBytes_ = value;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.build.Details)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.build.Details)
  private static final io.grafeas.v1beta1.build.Details DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.build.Details();
  }

  public static io.grafeas.v1beta1.build.Details getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Details> PARSER =
      new com.google.protobuf.AbstractParser<Details>() {
        @java.lang.Override
        public Details parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Details(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Details> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Details> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.build.Details getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
