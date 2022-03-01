package com.burda.hw18;

import lombok.Data;

@Data
public class StringReg {
    protected static String xmlFrom = ".*from=\"(.*?)\".*";
    protected static String xmlMaterial = ".*material=\"(.*?)\".*";
    protected static String xmlColor = "<color>(.*)<.color>*";
    protected static String xmlUnit = ".*unit=\"(.*?)\".*";
    protected static String xmlMax = "<max-lifting-capacity.*>(\\d*?)<.max-lifting-capacity>*";
    protected static String xmlName = "<name>(.*)<.name>*";
    protected static String xmlClass = "<class>(.*)<.class>*";
    protected static String xmlDelivery = "<delivery-date>(.*)<.delivery-date>*";

    protected static String jsonFrom = "\"from\":.\"(.*?)\"";
    protected static String jsonMaterial = "\"material\":.\"(.*?)\"";
    protected static String jsonColor = "\"color\":.\"(.*?)\"";
    protected static String jsonUnit = "\"unit\":.\"(.*?)\"";
    protected static String jsonMax = "\"value\":.(\\d*)";
    protected static String jsonName = "\"name\":.\"(.*)\"";
    protected static String jsonClass = "\"class\":.\"(.*)\"";
    protected static String jsonDelivery = "\"delivery-date\":.\"(.*)\"";
}
