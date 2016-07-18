package com.kkchan.fuckwechat;

import android.os.Environment;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import de.robv.android.xposed.XposedBridge;

/**
 * Created by Chenwei on 2016/6/12.
 */
public class Data {

    public static void set(String key, int value) {
        File file = new File(Environment.getDataDirectory(), "data/com.kkchan.fuckwechat/data.ini");

        IniFile data = new IniFile(file);

        data.set("CACHE", key, "" + value);
        data.save();

        Utils.runCommand("chmod 777 " + file.getAbsolutePath());
    }

    public static int get(String key, int defValue) {
        File file = new File(Environment.getDataDirectory(), "data/com.kkchan.fuckwechat/data.ini");
        if(!file.exists()) return defValue;

        IniFile data = new IniFile(file);

        return  Integer.parseInt(data.get("CACHE", key, "" + defValue).toString());
    }

}