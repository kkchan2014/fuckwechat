package com.kkchan.fuckwechat;

import android.util.Log;

import java.io.IOException;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodHook.MethodHookParam;
import de.robv.android.xposed.XSharedPreferences;
import de.robv.android.xposed.XposedBridge;

/**
 * Created by Chenwei on 2016/6/12.
 */
public class MMMethodHook extends XC_MethodHook {

    protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {
        int paramInt = ((Integer)paramMethodHookParam.args[0]).intValue();

        switch (paramInt) {
            case 5:
                paramMethodHookParam.setResult(Data.get("dice_num", 5));
                break;
            case 2:
                //paramMethodHookParam.setResult(RandomGame.DATA.getInt("morra_num", 0));
                break;
        }
    }

}