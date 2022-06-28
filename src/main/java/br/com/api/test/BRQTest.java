package br.com.api.test;

import br.com.api.core.baseTests;
import com.google.gson.JsonArray;
import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;

public class BRQTest extends baseTests {

    @Test
    public void validarStatusCode(){
        RestAssured
                .given()
                .when()
                    .get(baseTests.API_PATH)
                .then()
                    .statusCode(200);
    }

    @Test
    public void validarDadosUsuario(){

        RestAssured
                .given()
                .when()
                    .get(baseTests.API_PATH)
                .then()
                    .log().all()
                    .statusCode(200)
                .extract().body();
    }
}
