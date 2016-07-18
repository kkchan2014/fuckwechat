package com.kkchan.fuckwechat;

/**
 * Created by Chenwei on 2016/6/12.
 */
public class WeChatCode {

    public static String ClassName;
    public static String MethodName;

    public static void distinguish(String version) {
        switch (version) {
            case "6.3.5":
                ClassName = "com.tencent.mm.sdk.platformtools.ba";
                MethodName = "or";
                break;
            case "6.3.7":
                ClassName = "com.tencent.mm.sdk.platformtools.bc";
                MethodName = "oK";
                break;
            case "6.3.8":
                ClassName = "com.tencent.mm.sdk.platformtools.bc";
                MethodName = "oZ";
                break;
            case "6.3.9":
                ClassName = "com.tencent.mm.sdk.platformtools.bb";
                MethodName = "pu";
                break;
            case "6.3.11":
                ClassName = "com.tencent.mm.sdk.platformtools.ay";
                MethodName = "pu";
                break;
            case "6.3.13":
                ClassName = "com.tencent.mm.sdk.platformtools.ay";
                MethodName = "pu";
                break;
            case "6.3.15":
                ClassName = "com.tencent.mm.sdk.platformtools.ba";
                MethodName = "pu";
                break;
            case "6.3.16":
                ClassName = "com.tencent.mm.sdk.platformtools.ba";
                MethodName = "pT";
                break;
        }
    }

}