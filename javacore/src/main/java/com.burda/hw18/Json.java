package com.burda.hw18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Json {
    private static final Box box = new Box();
    private static final ClassLoader loader = Thread.currentThread().getContextClassLoader();

    public static Box readJson(String string) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((Objects.requireNonNull(loader.getResourceAsStream(string)))));
        String temp;
        try {
            while ((temp = bufferedReader.readLine()) != null) {
                Util.read(StringReg.jsonFrom, temp, "from", box);
                Util.read(StringReg.jsonMaterial, temp, "material", box);
                Util.read(StringReg.jsonColor, temp, "color", box);
                Util.read(StringReg.jsonUnit, temp, "unit", box);
                Util.read(StringReg.jsonMax, temp, "max", box);
                Util.read(StringReg.jsonName, temp, "name", box);
                Util.read(StringReg.jsonClass, temp, "class", box);
                Util.read(StringReg.jsonDelivery, temp, "delivery", box);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return box;
    }
}
