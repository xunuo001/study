// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products_service.proto

package com.example.products;

public interface RequestMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.RequestMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.example.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.com.example.Header header = 1;</code>
   * @return The header.
   */
  com.example.products.Header getHeader();
  /**
   * <code>.com.example.Header header = 1;</code>
   */
  com.example.products.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>bytes body = 10;</code>
   * @return The body.
   */
  com.google.protobuf.ByteString getBody();

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
