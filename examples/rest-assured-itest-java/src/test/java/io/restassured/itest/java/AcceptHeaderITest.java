/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.restassured.itest.java;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.*;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.http.Header;
import io.restassured.itest.java.support.WithJetty;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.commons.lang3.mutable.MutableObject;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.security.*;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.head;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class AcceptHeaderITest extends WithJetty {

    RestAssured restAssured = new RestAssured();

    @Test
    public void
    accept_method_with_string_parameter_is_just_an_alias_for_header_accept() {
        RestAssured.given().
                accept("application/json").
                body("{ \"message\" : \"hello world\"}").
                when().
                post("/jsonBodyAcceptHeader").
                then().
                body(equalTo("hello world"));
    }

    @Test
    public void
    accept_method_with_content_type_parameter_is_just_an_alias_for_header_accept() {
        RestAssured.given().
                accept(ContentType.JSON).
                body("{ \"message\" : \"hello world\"}").
                when().
                post("/jsonBodyAcceptHeader").
                then().
                body(equalTo("hello world"));
    }

    @Test
    public void
    accept_method_from_spec_is_set_to_request_when_specified_as_content_type() {
        RequestSpecification spec = new RequestSpecBuilder().setAccept(ContentType.JSON).build();

        RestAssured.given().
                spec(spec).
                body("{ \"message\" : \"hello world\"}").
                when().
                post("/jsonBodyAcceptHeader").
                then().
                body(equalTo("hello world"));
    }

    @Test
    public void
    accept_method_from_spec_is_set_to_request_when_specified_as_string() {
        RequestSpecification spec = new RequestSpecBuilder().setAccept("application/json").build();

        RestAssured.given().
                spec(spec).
                body("{ \"message\" : \"hello world\"}").
                when().
                post("/jsonBodyAcceptHeader").
                then().
                body(equalTo("hello world"));
    }

    @Test
    public void
    accept_headers_are_overwritten_from_request_spec_by_default() {
        RequestSpecification spec = new RequestSpecBuilder().setAccept(ContentType.JSON).build();

        final MutableObject<List<String>> headers = new MutableObject<List<String>>();

        RestAssured.given().
                accept("text/jux").
                spec(spec).
                body("{ \"message\" : \"hello world\"}").
                filter(new Filter() {
                    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
                        headers.setValue(requestSpec.getHeaders().getValues("Accept"));
                        return ctx.next(requestSpec, responseSpec);
                    }
                }).
                header("header_01_Name", "header_01_Value").
                header("header_02_Name", "header_02_Value").
                header("header_03_Name", "header_03_Value").
                header("header_04_Name", "header_04_Value").
                when().
                post("/jsonBodyAcceptHeader").
                then().
                body(equalTo("hello world"));

        assertThat(headers.getValue(), contains("application/json, application/javascript, text/javascript, text/json"));
    }

    @Test
    public void
    accept_headers_are_merged_from_request_spec_and_request_when_configured_to() throws IOException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        RequestSpecification spec = new RequestSpecBuilder().setAccept("text/jux").build();

        final MutableObject<List<String>> headers = new MutableObject<List<String>>();

        ConnectionConfig aa = new ConnectionConfig();
        aa.dontCloseIdleConnectionsAfterEachResponse();
        aa.isUserConfigured();
        RestAssuredConfig aa_02 = RestAssuredConfig.config().connectionConfig(aa);
        MatcherConfig ma_01 = new MatcherConfig();

        HeaderConfig header_01 = new HeaderConfig();
        header_01.mergeHeadersWithName("Accept");
        header_01.overwriteHeadersWithName("Header_01", "aaa", "aaaa");
        RestAssuredConfig aa_03 = RestAssuredConfig.config().headerConfig(header_01);
        restAssured.given().config(aa_02).config(RestAssuredConfig.config());
        restAssured.given().accept("Something Json or XMl");
        restAssured.given().accept(ContentType.ANY);
        restAssured.given().accept(ContentType.JSON);
        restAssured.given().and().auth().basic("id", "Pwd");
        restAssured.given().and().auth().certificate("a", "a");
        restAssured.given().and().auth().digest("aa", "a");
        restAssured.given().and().auth().form("fprm_01", "form_02");
        restAssured.given().and().auth().oauth("fprm_01", "form_02", "fprm_01", "form_02");
        restAssured.given().and().auth().oauth2("");
        restAssured.given().and().auth().ntlm("", "", "", "");
        restAssured.given().and().auth().none();
        restAssured.given().and().auth().notify();
        restAssured.given().and().auth().notifyAll();

        restAssured.when().get().equals(new Object()/*Example Object*/);
        restAssured.when().get().toString();
        restAssured.when().get().andReturn();
        restAssured.when().post();
        restAssured.when().delete();
        restAssured.when().put();
        Response akjaa = restAssured.when().head();
        int res = akjaa.asInputStream().read();
        restAssured.when().head();
        spec.accept(ContentType.ANY);
        spec.accept(ContentType.TEXT);
        spec.accept(ContentType.JSON);
        spec.basePath("https://www.google.com/");
        spec.basePath("https://www.google.com/").baseUri("something");
        spec.basePath("https://www.google.com/").expect();

        KeyStore keyStore = null;
        SSLConfig config = null;
        String password = "SOMEVALUE";

        try {
            keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(
                    new FileInputStream("certs/client_cert_and_private.p12"),
                    password.toCharArray());

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }

        if (keyStore != null) {

            org.apache.http.conn.ssl.SSLSocketFactory clientAuthFactory = new org.apache.http.conn.ssl.SSLSocketFactory(keyStore, password);

            // set the config in rest assured
            config = new SSLConfig().with().sslSocketFactory(clientAuthFactory).and().allowAllHostnames();

            RestAssured.config = RestAssured.config().sslConfig(config);
            RestAssured.given().when().get("/path").then();
        }

        try {
            RestAssured.port = 1121;
            //RestAssured.;
            RestAssured.useRelaxedHTTPSValidation();
            RestAssured.config().getSSLConfig().with().keyStore("classpath:keystore.p12", "password");
        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }

        RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
        requestBuilder.setBaseUri("http://www.example.com");
        requestBuilder.setBasePath("/path");
        requestBuilder.addHeader("Authorization", "Bearer" + token);
        RequestSpecification request = RestAssured.given().spec(requestBuilder.build()).when();
        Response response = request.post().andReturn();

        restAssured.given().and().auth().certificate("a", "a");
        restAssured.given().and().auth().digest("aa", "a");
        restAssured.given().and().auth().form("fprm_01", "form_02");
        restAssured.given().and().auth().oauth("fprm_01", "form_02", "fprm_01", "form_02");
        restAssured.given().and().auth().oauth2("");
        restAssured.given().and().auth().ntlm("", "", "", "");
        restAssured.given().and().auth().none();
        restAssured.given().and().auth().notify();
        restAssured.given().and().auth().notifyAll();

        RestAssured.given().
                config(RestAssuredConfig.config().headerConfig(HeaderConfig.headerConfig().mergeHeadersWithName("Accept"))).
                accept(ContentType.JSON).
                spec(spec).
                body("{ \"message\" : \"hello world\"}").
                filter(new Filter() {
                    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
                        headers.setValue(requestSpec.getHeaders().getValues("Accept"));
                        return ctx.next(requestSpec, responseSpec);
                    }
                }).
                when().
                post("/jsonBodyAcceptHeader").
                then().
                body(equalTo("hello world"));

        assertThat(headers.getValue(), contains("application/json, application/javascript, text/javascript, text/json", "text/jux"));
    }
}
