// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products_service.proto

package com.example.products;

public interface ErrorDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.ErrorDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string code = 1;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <code>string code = 1;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string source = 3;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>string source = 3;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
   * @return Whether the tpaExtensions field is set.
   */
  boolean hasTpaExtensions();
  /**
   * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
   * @return The tpaExtensions.
   */
  com.example.products.TPAExtensionsDTO getTpaExtensions();
  /**
   * <code>.com.example.TPAExtensionsDTO tpaExtensions = 1000;</code>
   */
  com.example.products.TPAExtensionsDTOOrBuilder getTpaExtensionsOrBuilder();
}
