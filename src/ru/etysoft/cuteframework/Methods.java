package ru.etysoft.cuteframework;


import ru.etysoft.cuteframework.methods.Login.LoginRequest;
import ru.etysoft.cuteframework.methods.GetAccount.GetAccountRequest;
import ru.etysoft.cuteframework.methods.Registration.RegistrationRequest;
import ru.etysoft.cuteframework.methods.Login.LoginResponse;
import ru.etysoft.cuteframework.methods.GetAccount.GetAccountResponse;
import ru.etysoft.cuteframework.methods.Registration.RegistrationResponse;
import ru.etysoft.cuteframework.exceptions.ResponseException;

public class Methods {

    public static String domain = "https://api.mcute.ru/";
    public static String mainDomain = "https://mcute.ru/";
    public static String options = "&v=b001";

    public static LoginResponse authorize(String login, String password) throws ResponseException {
        return (new LoginRequest(login, password)).execute();
    }

    public static RegistrationResponse register(String login, String email, String password, String display_name) throws ResponseException {
        return (new RegistrationRequest(login, email, password, display_name)).execute();
    }

    public static GetAccountResponse getInfo(String sessionKey) throws ResponseException {
        return (new GetAccountRequest(sessionKey).execute());
    }


    public static void setApiVersion(String apiVersion) {

        options = "&v=" + apiVersion;
    }


}
