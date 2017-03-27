package com.gigigo.ggglib.network.context.responses;

import com.gigigo.ggglib.network.responses.ApiGenericResponse;
import com.gigigo.ggglib.network.responses.HttpResponse;
import com.google.gson.annotations.SerializedName;

public class ApiResponseMock
    implements ApiGenericResponse<ApiDataTestMock, ApiErrorResponseMock> {

  @SerializedName("status") private String status;
  @SerializedName("data") private ApiDataTestMock data;
  @SerializedName("error") private ApiErrorResponseMock error;

  private HttpResponse httpResponse;

  public static ApiResponseMock newExceptionInstance() {
    return new ApiResponseMock();
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override public HttpResponse getHttpResponse() {
    return httpResponse;
  }

  @Override public void setHttpResponse(HttpResponse httpResponse) {
    this.httpResponse = httpResponse;
  }

  @Override public boolean isException() {
    return false;
  }

  public ApiDataTestMock getData() {
    return data;
  }

  public void setData(ApiDataTestMock data) {
    this.data = data;
  }

  @Override public ApiDataTestMock getResult() {
    return data;
  }

  @Override public void setResult(ApiDataTestMock data) {
    this.data = data;
  }

  @Override public ApiErrorResponseMock getBusinessError() {
    return error;
  }

  @Override public void setBusinessError(ApiErrorResponseMock error) {
    this.error = error;
  }
}