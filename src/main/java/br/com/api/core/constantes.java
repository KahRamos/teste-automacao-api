package br.com.api.core;

import io.restassured.http.ContentType;

public interface constantes {

    String API_URL_BASE = "https://reqres.in";
    String API_PATH = "/api/users?page=2";

    ContentType APP_CONTENT_TYPE = ContentType.JSON;

    Long MAX_TIMEOUT = Long.valueOf(3000);
}
