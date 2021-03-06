// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products_service.proto

package com.example.products;

public interface HeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.Header)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uri = 1;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <code>string uri = 1;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <code>string taskId = 2;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <code>string taskId = 2;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

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
   * <code>string destination = 4;</code>
   * @return The destination.
   */
  java.lang.String getDestination();
  /**
   * <code>string destination = 4;</code>
   * @return The bytes for destination.
   */
  com.google.protobuf.ByteString
      getDestinationBytes();

  /**
   * <code>repeated .com.example.KeyValue headers = 5;</code>
   */
  java.util.List<com.example.products.KeyValue> 
      getHeadersList();
  /**
   * <code>repeated .com.example.KeyValue headers = 5;</code>
   */
  com.example.products.KeyValue getHeaders(int index);
  /**
   * <code>repeated .com.example.KeyValue headers = 5;</code>
   */
  int getHeadersCount();
  /**
   * <code>repeated .com.example.KeyValue headers = 5;</code>
   */
  java.util.List<? extends com.example.products.KeyValueOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <code>repeated .com.example.KeyValue headers = 5;</code>
   */
  com.example.products.KeyValueOrBuilder getHeadersOrBuilder(
      int index);

  /**
   * <code>int32 timeout = 10;</code>
   * @return The timeout.
   */
  int getTimeout();

  /**
   * <code>.com.example.ServiceInfo invokerInfo = 11;</code>
   * @return Whether the invokerInfo field is set.
   */
  boolean hasInvokerInfo();
  /**
   * <code>.com.example.ServiceInfo invokerInfo = 11;</code>
   * @return The invokerInfo.
   */
  com.example.products.ServiceInfo getInvokerInfo();
  /**
   * <code>.com.example.ServiceInfo invokerInfo = 11;</code>
   */
  com.example.products.ServiceInfoOrBuilder getInvokerInfoOrBuilder();

  /**
   * <code>.com.example.TraceInfo traceInfo = 20;</code>
   * @return Whether the traceInfo field is set.
   */
  boolean hasTraceInfo();
  /**
   * <code>.com.example.TraceInfo traceInfo = 20;</code>
   * @return The traceInfo.
   */
  com.example.products.TraceInfo getTraceInfo();
  /**
   * <code>.com.example.TraceInfo traceInfo = 20;</code>
   */
  com.example.products.TraceInfoOrBuilder getTraceInfoOrBuilder();

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
