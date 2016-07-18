package com.kkchan.fuckwechat;

import android.util.Log;

/**
 * Created by Chenwei on 2016/6/12.
 */
public class Utils {

    public static boolean runCommand(String command) {

        Process process = null;
        try {
            process = Runtime.getRuntime().exec(command);
            Log.i("command","The Command is : "+command);
            process.waitFor();
        } catch (Exception e) {
            Log.w("Exception ", "Unexpected error - "+e.getMessage());
            return false;
        } finally {
            try {
                process.destroy();
            } catch (Exception e) {
                Log.w("Exception ", "Unexpected error - "+e.getMessage());
            }
        }
        return true;
    }

}