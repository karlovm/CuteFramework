package ru.etysoft.cuteframework.api.errors;

import org.json.JSONException;
import ru.etysoft.cuteframework.json.JSONArrayList;

/**
 * Simple error handler with error-checks and information about response error
 * @author Mikhail Karlov
 */
public class ErrorHandler {

    String jsonResponse;
    JSONArrayList errorCodes;

    public ErrorHandler(String jsonResponse) throws JSONException {
        this.jsonResponse = jsonResponse;
        errorCodes = new JSONArrayList(jsonResponse);
    }

    public boolean isSessionExpired() {
        return errorCodes.has("Authorization unsuccessful");
    }

    public String getErrorCode() {
        return null;
    }

}
