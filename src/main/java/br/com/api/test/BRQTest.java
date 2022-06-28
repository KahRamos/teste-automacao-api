package br.com.api.test;

import br.com.api.core.baseTests;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sun.codemodel.JArray;
import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.junit.Test;

import javax.swing.*;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class BRQTest extends baseTests {

    @Test
    public void validarDadosUsuario() {

                given()
                    .when()
                        .get("https://reqres.in/api/users?page=2")
                    .then()
                        .statusCode(200)
                        .body("data[5].id", is(12))
                        .body("data[5].email", is("rachel.howell@reqres.in"))
                        .body("data[5].first_name", is("Rachel"))
                        .body("data[5].last_name", is("Howell"))
                        .body("data[5].avatar", is("https://reqres.in/img/faces/12-image.jpg"));
    }
}