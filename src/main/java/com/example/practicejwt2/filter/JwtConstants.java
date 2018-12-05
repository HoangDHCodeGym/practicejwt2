package com.example.practicejwt2.filter;

public class JwtConstants {
    public static final long EXPIRATION_TIME = 60*60*24*1000;
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER = "Authorization";
    public static final String SECRET = "ThisIsASecret";
}
