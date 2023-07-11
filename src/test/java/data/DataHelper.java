package data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }


    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        String code;
    }


    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class CardsInfo {
        String cardNumber;
    }


    public static CardsInfo getFirstCardNumber() {
        return new CardsInfo("5559 0000 0000 0001");
    }

    public static CardsInfo getSecondCardNumber() {
        return new CardsInfo("5559 0000 0000 0002");
    }
}