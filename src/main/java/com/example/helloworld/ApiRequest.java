package com.example.helloworld;

public class ApiRequest {
  private String baseUrl;
  private String token;
  private long appId;
  private long timestamp;

  public ApiRequest(String baseUrl, String token, String appId, long timestamp) {
  }

  public static ApiRequest createFromFullUrl(String url);

  public String getBaseUrl();

  public String getToken();

  public String getAppId();

  public long getTiimestamp();
}
