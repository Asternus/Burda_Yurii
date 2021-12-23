package com.burda.hw18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Json {
    private static Box box = new Box();
    private static final ClassLoader loader = Thread.currentThread().getContextClassLoader();

    public static Box readJson(String string) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((Objects.requireNonNull(loader.getResourceAsStream(string)))));
        String temp;
        try {
            while ((temp = bufferedReader.readLine()) != null) {
                Util.read("\"from\":.\"(.*?)\"", temp, "from", box);
                Util.read("\"material\":.\"(.*?)\"", temp, "material", box);
                Util.read("\"color\":.\"(.*?)\"", temp, "color", box);
                Util.read("\"unit\":.\"(.*?)\"", temp, "unit", box);
                Util.read("\"value\":.(\\d*)", temp, "max", box);
                Util.read("\"name\":.\"(.*)\"", temp, "name", box);
                Util.read("\"class\":.\"(.*)\"", temp, "class", box);
                Util.read("\"delivery-date\":.\"(.*)\"", temp, "delivery", box);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return box;
    }
}
