package com.example.helloworld;

import java.util.Map;

public class AuthToken {
  private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1 * 60 * 1000;
  private String token;
  private long createTime;
  private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

  public AuthToken(String token, long createTime) {
  }

  public AuthToken(String token, long createTime, long expiredTimeInterval) {
  }

  public static AuthToken create(String baseUrl, long createTime, Map<String, String> params) {
    return new AuthToken(baseUrl, createTime);
  }

  public String getToken() {
  };

  public boolen isExpired() {
  };

  public boolean match(AuthToken authToken) {
  };
}
