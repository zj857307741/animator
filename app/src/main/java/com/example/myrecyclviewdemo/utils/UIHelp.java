package com.example.myrecyclviewdemo.utils;

import android.content.Context;
import android.content.Intent;

import com.example.myrecyclviewdemo.module.recycyclerview.activity.MainActivity;

/**
 * Created by sfr on 2017/10/24.
 */

public class UIHelp {

    public static void showRecyclerViewPage(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}
