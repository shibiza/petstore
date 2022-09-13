package org.example.service.uritemplate;

public class UserServiceUri {
    public static final UriTemplate USER = new UriTemplate("user");
    public static final UriTemplate USER_LOGIN = new UriTemplate("user/login?username=%s&password=%s");

    public static final UriTemplate USER_BY_USERNAME = new UriTemplate("user/%s");

    public static final UriTemplate DELETE_USER_BY_USER_NAME = new UriTemplate("user/%s");
}
