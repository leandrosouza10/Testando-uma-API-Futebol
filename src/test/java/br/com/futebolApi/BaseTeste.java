package br.com.futebolApi;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;


import org.junit.BeforeClass;


public class BaseTeste extends Constantes {

    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = END_POINT_BASE;
        RestAssured.basePath = BASE_URL;

        RequestSpecBuilder requisicaoBuilder = new RequestSpecBuilder();
        requisicaoBuilder.setContentType(CONTENT_TYPE);
        RestAssured.requestSpecification = requisicaoBuilder.build();


     // Habilita o log da requisção e da resposta, caso apareça um problema no teste
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

    }

}
