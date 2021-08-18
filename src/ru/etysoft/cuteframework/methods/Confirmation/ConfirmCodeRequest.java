package ru.etysoft.cuteframework.methods.Confirmation;

import org.json.JSONException;
import ru.etysoft.cuteframework.data.APIKeys;
import ru.etysoft.cuteframework.data.APIMethods;
import ru.etysoft.cuteframework.exceptions.ResponseException;
import ru.etysoft.cuteframework.requests.Pair;
import ru.etysoft.cuteframework.requests.Request;
import ru.etysoft.cuteframework.requests.RequestHolder;

public class ConfirmCodeRequest extends RequestHolder {
    private String token;
    public ConfirmCodeRequest(String token){
        super(APIMethods.CONFIRMATION_CODE);
        this.token = token;
        setParams(Pair.make(APIKeys.TOKEN, token));
    }


    public ConfirmCodeResponse execute() throws ResponseException {
        Request request = makeRequest();
        return new ConfirmCodeResponse(request.processAPI(), request.getFormattedURL());
    }
}
