package com.example.shweta.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.Random;

public class MyUtils {
    public static String genPass(){
        String pass = "";
        Random r1 = new Random();
        pass = pass + (char)(r1.nextInt(27)+'A');
        for(int i=0;i<6;i++){
            pass = pass + (char)(r1.nextInt(27)+'a');
        }
        pass = pass + r1.nextInt(10);
        return  pass;
    }
    public static void setPref(Context ctx, String name, String value){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor e = sp.edit();
        e.putString(name, value);
        e.commit();
    }
    public static void removePref(Context ctx, String name){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor e = sp.edit();
        e.remove(name);
        e.commit();
    }

    public static String getPref(Context ctx, String name){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        return  sp.getString(name, "");
    }
}
