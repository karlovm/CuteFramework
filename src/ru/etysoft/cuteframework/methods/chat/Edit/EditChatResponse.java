package ru.etysoft.cuteframework.methods.chat.Edit;

import org.json.JSONException;
import ru.etysoft.cuteframework.responses.ResponseHandler;

public class EditChatResponse extends ResponseHandler {
  public EditChatResponse(String jsonResponse, String url) throws JSONException {
    super(jsonResponse, url);
  }
  
  public void onSuccess() {}
}
