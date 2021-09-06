package api.etalons;

import api.bodies.ResponseUserBody;
import io.qameta.allure.Step;

public class UserResponseData {

    @Step("Reference response for check user body")
    public ResponseUserBody defaultResponse() {

        return ResponseUserBody.builder()
                .type("error")
                .message("компании не найдены")
                .build();
    }
}