/*
* @(#)ModelUtil.java
*
* Copyright (c) 2014, Patch Software.
* All rights reserved.
*
* Use is subject to license terms. This software is protected by
* copyright law and international treaties. Unauthorized reproduction or
* distribution of this program, or any portion of it, may result in severe
* civil and criminal penalties, and will be prosecuted to the maximum extent.
*/
package in.parsel.pvr.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.Date;

public class ModelUtil {

	final public static String Content_Type = "application/json";

	public static Object deserialize(String json, Class<?> type) {
		GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new Date(json.getAsJsonPrimitive().getAsLong());
            }
        });
        return gsonBuilder.create().fromJson(json, type);
	}

	public static String serialize(Object obj) {
		GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new JsonSerializer<Date>() {

            @Override
            public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive(src.getTime());
            }
        });
		return gsonBuilder.create().toJson(obj);
	}

	public static Object deserializeArray(String jsonArray, Type type) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		return gson.fromJson(jsonArray, type);
	}
}