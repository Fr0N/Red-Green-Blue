package com.rgb.redgreenbule.gson;

import com.google.gson.*;
import com.rgb.redgreenbule.entity.Color;
import com.rgb.redgreenbule.entity.RGBEnum;

import java.lang.reflect.Type;

public class ColorDeserializer implements JsonDeserializer<Color> {
    @Override
    public Color deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        RGBEnum color = RGBEnum.valueOf(jsonObject.get("color").getAsString().toUpperCase());
        String hexValue = String.format("%02x", jsonObject.get("value").getAsInt());

        return new Color(null, color, hexValue);
    }
}
