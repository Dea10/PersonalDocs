package com.dea;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try {
            Object object = jsonParser.parse(JSONString.jsonStr);
            JSONArray jsonArray = (JSONArray)object;

            System.out.println("JSONArray.length: " + jsonArray.size());
            System.out.println("JSONArray(0): " + jsonArray.get(0));

            JSONObject jsonObject = (JSONObject)jsonArray.get(0);
            System.out.println(jsonObject.keySet());
            for (Object keyStr : jsonObject.keySet()) {
                System.out.println(keyStr + ": " + jsonObject.get(keyStr));
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
