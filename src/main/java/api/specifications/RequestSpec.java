package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    public RequestSpecification defaultRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri("http://users.bugred.ru")
                .setAccept(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }
}