package com.burda.hw18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Xml {
    private static Box box = new Box();
    private static final ClassLoader loader = Thread.currentThread().getContextClassLoader();

    public static Box readXml(String string) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((Objects.requireNonNull(loader.getResourceAsStream(string)))));
        String temp;
        try {
            while ((temp = bufferedReader.readLine()) != null) {
                Util.read(StringReg.xmlFrom, temp, "from", box);
                Util.read(StringReg.xmlMaterial, temp, "material", box);
                Util.read(StringReg.xmlColor, temp, "color", box);
                Util.read(StringReg.xmlUnit, temp, "unit", box);
                Util.read(StringReg.xmlMax, temp, "max", box);
                Util.read(StringReg.xmlName, temp, "name", box);
                Util.read(StringReg.xmlClass, temp, "class", box);
                Util.read(StringReg.xmlDelivery, temp, "delivery", box);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return box;
    }
}
