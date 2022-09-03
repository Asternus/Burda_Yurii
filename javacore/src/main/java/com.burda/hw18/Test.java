package com.burda.hw18;

public class Test {
    public static void main(String[] args) {

        Box boxXml = Xml.readXml("xmlhw.xml");
        System.out.println("xml : " + boxXml);
        Box boxJson = Json.readJson("jsonhw.json");
        System.out.println("json : " + boxJson);
    }
}
