/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.MultiMap;


public class ApiException extends Exception {
    private int code = 0;
    private MultiMap responseHeaders = null;
    private String responseBody = null;


    public static <T> AsyncResult<T> fail(int failureCode, String message) {
        return Future.failedFuture(new ApiException(failureCode, message));
    }

    public static <T> AsyncResult<T> fail(Throwable throwable) {
        return Future.failedFuture(new ApiException(throwable));
    }

    public static <T> AsyncResult<T> fail(String message) {
        return Future.failedFuture(new ApiException(message));
    }

    public static <T> AsyncResult<T> fail(String message, Throwable throwable, int code, MultiMap responseHeaders) {
        return Future.failedFuture(new ApiException(message, throwable, code, responseHeaders, null));
    }

    public static <T> AsyncResult<T> fail(String message, Throwable throwable, int code, MultiMap responseHeaders, String responseBody) {
        return Future.failedFuture(new ApiException(message, throwable, code, responseHeaders, responseBody));
    }

    public static <T> AsyncResult<T> fail(String message, int code, MultiMap responseHeaders, String responseBody) {
        return Future.failedFuture(new ApiException(message, (Throwable) null, code, responseHeaders, responseBody));
    }

    public static <T> AsyncResult<T> fail(int code, MultiMap responseHeaders, String responseBody) {
        return Future.failedFuture(new ApiException((String) null, (Throwable) null, code, responseHeaders, responseBody));
    }

    public ApiException() {}

    public ApiException(Throwable throwable) {
        super(throwable);
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable throwable, int code, MultiMap responseHeaders, String responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    public ApiException(String message, int code, MultiMap responseHeaders, String responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    public ApiException(String message, Throwable throwable, int code, MultiMap responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    public ApiException(int code, MultiMap responseHeaders, String responseBody) {
        this((String) null, (Throwable) null, code, responseHeaders, responseBody);
    }

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(int code, String message, MultiMap responseHeaders, String responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public MultiMap getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }
}
