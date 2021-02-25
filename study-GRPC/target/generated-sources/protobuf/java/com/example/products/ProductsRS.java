// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products_service.proto

package com.example.products;

/**
 * Protobuf type {@code com.example.ProductsRS}
 */
public  final class ProductsRS extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.ProductsRS)
    ProductsRSOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductsRS.newBuilder() to construct.
  private ProductsRS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductsRS() {
    products_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductsRS();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductsRS(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              products_ = new java.util.ArrayList<com.example.products.ProductDTO>();
              mutable_bitField0_ |= 0x00000001;
            }
            products_.add(
                input.readMessage(com.example.products.ProductDTO.parser(), extensionRegistry));
            break;
          }
          case 8002: {
            com.example.products.TPAExtensionsDTO.Builder subBuilder = null;
            if (tpaExtensions_ != null) {
              subBuilder = tpaExtensions_.toBuilder();
            }
            tpaExtensions_ = input.readMessage(com.example.products.TPAExtensionsDTO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tpaExtensions_);
              tpaExtensions_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        products_ = java.util.Collections.unmodifiableList(products_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.products.ConnectivityProductsPB.internal_static_com_example_ProductsRS_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.products.ConnectivityProductsPB.internal_static_com_example_ProductsRS_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.products.ProductsRS.class, com.example.products.ProductsRS.Builder.class);
  }

  public static final int PRODUCTS_FIELD_NUMBER = 1;
  private java.util.List<com.example.products.ProductDTO> products_;
  /**
   * <code>repeated .com.example.ProductDTO products = 1;</code>
   */
  public java.util.List<com.example.products.ProductDTO> getProductsList() {
    return products_;
  }
  /**
   * <code>repeated .com.example.ProductDTO products = 1;</code>
   */
  public java.util.List<? extends com.example.products.ProductDTOOrBuilder> 
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   * <code>repeated .com.example.ProductDTO products = 1;</code>
   */
  public int getProductsCount() {
    return products_.size();
  }
  /**
   * <code>repeated .com.example.ProductDTO products = 1;</code>
   */
  public com.example.products.ProductDTO getProducts(int index) {
    return products_.get(index);
  }
  /**
   * <code>repeated .com.example.ProductDTO products = 1;</code>
   */
  public com.example.products.ProductDTOOrBuilder getProductsOrBuilder(
      int index) {
    return products_.get(index);
  }

  public static final int TPAEXTENSIONS_FIELD_NUMBER = 1000;
  private com.example.products.TPAExtensionsDTO tpaExtensions_;
  /**
   * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
   * @return Whether the tpaExtensions field is set.
   */
  public boolean hasTpaExtensions() {
    return tpaExtensions_ != null;
  }
  /**
   * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
   * @return The tpaExtensions.
   */
  public com.example.products.TPAExtensionsDTO getTpaExtensions() {
    return tpaExtensions_ == null ? com.example.products.TPAExtensionsDTO.getDefaultInstance() : tpaExtensions_;
  }
  /**
   * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
   */
  public com.example.products.TPAExtensionsDTOOrBuilder getTpaExtensionsOrBuilder() {
    return getTpaExtensions();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(1, products_.get(i));
    }
    if (tpaExtensions_ != null) {
      output.writeMessage(1000, getTpaExtensions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, products_.get(i));
    }
    if (tpaExtensions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1000, getTpaExtensions());
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
    if (!(obj instanceof com.example.products.ProductsRS)) {
      return super.equals(obj);
    }
    com.example.products.ProductsRS other = (com.example.products.ProductsRS) obj;

    if (!getProductsList()
        .equals(other.getProductsList())) return false;
    if (hasTpaExtensions() != other.hasTpaExtensions()) return false;
    if (hasTpaExtensions()) {
      if (!getTpaExtensions()
          .equals(other.getTpaExtensions())) return false;
    }
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
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    if (hasTpaExtensions()) {
      hash = (37 * hash) + TPAEXTENSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTpaExtensions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.products.ProductsRS parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.products.ProductsRS parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.products.ProductsRS parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.products.ProductsRS parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.products.ProductsRS parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.products.ProductsRS parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.products.ProductsRS parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.products.ProductsRS parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.products.ProductsRS parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.products.ProductsRS parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.products.ProductsRS parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.products.ProductsRS parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.products.ProductsRS prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.ProductsRS}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.ProductsRS)
      com.example.products.ProductsRSOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.products.ConnectivityProductsPB.internal_static_com_example_ProductsRS_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.products.ConnectivityProductsPB.internal_static_com_example_ProductsRS_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.products.ProductsRS.class, com.example.products.ProductsRS.Builder.class);
    }

    // Construct using com.example.products.ProductsRS.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProductsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productsBuilder_.clear();
      }
      if (tpaExtensionsBuilder_ == null) {
        tpaExtensions_ = null;
      } else {
        tpaExtensions_ = null;
        tpaExtensionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.products.ConnectivityProductsPB.internal_static_com_example_ProductsRS_descriptor;
    }

    @java.lang.Override
    public com.example.products.ProductsRS getDefaultInstanceForType() {
      return com.example.products.ProductsRS.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.products.ProductsRS build() {
      com.example.products.ProductsRS result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.products.ProductsRS buildPartial() {
      com.example.products.ProductsRS result = new com.example.products.ProductsRS(this);
      int from_bitField0_ = bitField0_;
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
      }
      if (tpaExtensionsBuilder_ == null) {
        result.tpaExtensions_ = tpaExtensions_;
      } else {
        result.tpaExtensions_ = tpaExtensionsBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.products.ProductsRS) {
        return mergeFrom((com.example.products.ProductsRS)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.products.ProductsRS other) {
      if (other == com.example.products.ProductsRS.getDefaultInstance()) return this;
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductsFieldBuilder() : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
          }
        }
      }
      if (other.hasTpaExtensions()) {
        mergeTpaExtensions(other.getTpaExtensions());
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
      com.example.products.ProductsRS parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.products.ProductsRS) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.products.ProductDTO> products_ =
      java.util.Collections.emptyList();
    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        products_ = new java.util.ArrayList<com.example.products.ProductDTO>(products_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.products.ProductDTO, com.example.products.ProductDTO.Builder, com.example.products.ProductDTOOrBuilder> productsBuilder_;

    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public java.util.List<com.example.products.ProductDTO> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public com.example.products.ProductDTO getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder setProducts(
        int index, com.example.products.ProductDTO value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder setProducts(
        int index, com.example.products.ProductDTO.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder addProducts(com.example.products.ProductDTO value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder addProducts(
        int index, com.example.products.ProductDTO value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder addProducts(
        com.example.products.ProductDTO.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder addProducts(
        int index, com.example.products.ProductDTO.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder addAllProducts(
        java.lang.Iterable<? extends com.example.products.ProductDTO> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public com.example.products.ProductDTO.Builder getProductsBuilder(
        int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public com.example.products.ProductDTOOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);  } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public java.util.List<? extends com.example.products.ProductDTOOrBuilder> 
         getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public com.example.products.ProductDTO.Builder addProductsBuilder() {
      return getProductsFieldBuilder().addBuilder(
          com.example.products.ProductDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public com.example.products.ProductDTO.Builder addProductsBuilder(
        int index) {
      return getProductsFieldBuilder().addBuilder(
          index, com.example.products.ProductDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.ProductDTO products = 1;</code>
     */
    public java.util.List<com.example.products.ProductDTO.Builder> 
         getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.products.ProductDTO, com.example.products.ProductDTO.Builder, com.example.products.ProductDTOOrBuilder> 
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.products.ProductDTO, com.example.products.ProductDTO.Builder, com.example.products.ProductDTOOrBuilder>(
                products_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        products_ = null;
      }
      return productsBuilder_;
    }

    private com.example.products.TPAExtensionsDTO tpaExtensions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.products.TPAExtensionsDTO, com.example.products.TPAExtensionsDTO.Builder, com.example.products.TPAExtensionsDTOOrBuilder> tpaExtensionsBuilder_;
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     * @return Whether the tpaExtensions field is set.
     */
    public boolean hasTpaExtensions() {
      return tpaExtensionsBuilder_ != null || tpaExtensions_ != null;
    }
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     * @return The tpaExtensions.
     */
    public com.example.products.TPAExtensionsDTO getTpaExtensions() {
      if (tpaExtensionsBuilder_ == null) {
        return tpaExtensions_ == null ? com.example.products.TPAExtensionsDTO.getDefaultInstance() : tpaExtensions_;
      } else {
        return tpaExtensionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     */
    public Builder setTpaExtensions(com.example.products.TPAExtensionsDTO value) {
      if (tpaExtensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tpaExtensions_ = value;
        onChanged();
      } else {
        tpaExtensionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     */
    public Builder setTpaExtensions(
        com.example.products.TPAExtensionsDTO.Builder builderForValue) {
      if (tpaExtensionsBuilder_ == null) {
        tpaExtensions_ = builderForValue.build();
        onChanged();
      } else {
        tpaExtensionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     */
    public Builder mergeTpaExtensions(com.example.products.TPAExtensionsDTO value) {
      if (tpaExtensionsBuilder_ == null) {
        if (tpaExtensions_ != null) {
          tpaExtensions_ =
            com.example.products.TPAExtensionsDTO.newBuilder(tpaExtensions_).mergeFrom(value).buildPartial();
        } else {
          tpaExtensions_ = value;
        }
        onChanged();
      } else {
        tpaExtensionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     */
    public Builder clearTpaExtensions() {
      if (tpaExtensionsBuilder_ == null) {
        tpaExtensions_ = null;
        onChanged();
      } else {
        tpaExtensions_ = null;
        tpaExtensionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     */
    public com.example.products.TPAExtensionsDTO.Builder getTpaExtensionsBuilder() {
      
      onChanged();
      return getTpaExtensionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     */
    public com.example.products.TPAExtensionsDTOOrBuilder getTpaExtensionsOrBuilder() {
      if (tpaExtensionsBuilder_ != null) {
        return tpaExtensionsBuilder_.getMessageOrBuilder();
      } else {
        return tpaExtensions_ == null ?
            com.example.products.TPAExtensionsDTO.getDefaultInstance() : tpaExtensions_;
      }
    }
    /**
     * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.products.TPAExtensionsDTO, com.example.products.TPAExtensionsDTO.Builder, com.example.products.TPAExtensionsDTOOrBuilder> 
        getTpaExtensionsFieldBuilder() {
      if (tpaExtensionsBuilder_ == null) {
        tpaExtensionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.products.TPAExtensionsDTO, com.example.products.TPAExtensionsDTO.Builder, com.example.products.TPAExtensionsDTOOrBuilder>(
                getTpaExtensions(),
                getParentForChildren(),
                isClean());
        tpaExtensions_ = null;
      }
      return tpaExtensionsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.ProductsRS)
  }

  // @@protoc_insertion_point(class_scope:com.example.ProductsRS)
  private static final com.example.products.ProductsRS DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.products.ProductsRS();
  }

  public static com.example.products.ProductsRS getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductsRS>
      PARSER = new com.google.protobuf.AbstractParser<ProductsRS>() {
    @java.lang.Override
    public ProductsRS parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductsRS(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductsRS> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductsRS> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.products.ProductsRS getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

