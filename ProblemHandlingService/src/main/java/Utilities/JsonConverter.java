package Utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConverter<T> {
    private T type;
    private GsonBuilder gsonBuilder;

    public JsonConverter(T type) {
        this.type = type;
    }

    @SuppressWarnings("unchecked")
	public T JsonToObject(String s) {
        Gson gson = new Gson();
        return ((T) gson.fromJson(s, type.getClass()));
    }

    public String ObjectToJson() {
        gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeNulls();
        Gson gson = gsonBuilder.create();
        return gson.toJson(type);
    }
}