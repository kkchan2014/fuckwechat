package com.kkchan.fuckwechat;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.kkchan.fuckwechat.R;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.IXposedHookZygoteInit.StartupParam;
import de.robv.android.xposed.XSharedPreferences;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

/**
 * Created by Chenwei on 2016/6/12.
 */
public class RandomGame implements IXposedHookLoadPackage, IXposedHookZygoteInit
{
    @Override
    public void initZygote(IXposedHookZygoteInit.StartupParam paramStartupParam)
    {
    }

    @Override
    public void handleLoadPackage(final LoadPackageParam lpparam) throws Throwable
    {
        if (lpparam.packageName.equals("com.tencent.mm")) {
            String[] arrayOfString = ((Context)XposedHelpers.callMethod(XposedHelpers.callStaticMethod(XposedHelpers.findClass("android.app.ActivityThread", null), "currentActivityThread", new Object[0]), "getSystemContext", new Object[0])).getPackageManager().getPackageInfo(lpparam.packageName, 0).versionName.split("\\.");

            WeChatCode.distinguish(arrayOfString[0] + "." + arrayOfString[1] + "." + arrayOfString[2]);

            XposedHelpers.findAndHookMethod(WeChatCode.ClassName, lpparam.classLoader, WeChatCode.MethodName, new Object[] { Integer.TYPE, new MMMethodHook() });
        }
    }

}
