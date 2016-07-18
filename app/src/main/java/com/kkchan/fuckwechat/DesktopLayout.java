package com.kkchan.fuckwechat;

/**
 * Created by Chenwei on 2016/6/12.
 */
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DesktopLayout extends LinearLayout implements View.OnClickListener {

    private int diceNum = 6;
    private View CheckedView;

    public DesktopLayout(Context context) {
        super(context);

        setOrientation(LinearLayout.VERTICAL);

        this.setLayoutParams( new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

        View view = LayoutInflater.from(context).inflate(R.layout.desklayout, null);
        this.addView(view);

        ((TextView) findViewById(R.id.textView1)).setOnClickListener(this);
        ((TextView) findViewById(R.id.textView2)).setOnClickListener(this);
        ((TextView) findViewById(R.id.textView3)).setOnClickListener(this);
        ((TextView) findViewById(R.id.textView4)).setOnClickListener(this);
        ((TextView) findViewById(R.id.textView5)).setOnClickListener(this);
        ((TextView) findViewById(R.id.textView6)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView1:
                diceNum = 0;
                break;
            case R.id.textView2:
                diceNum = 1;
                break;
            case R.id.textView3:
                diceNum = 2;
                break;
            case R.id.textView4:
                diceNum = 3;
                break;
            case R.id.textView5:
                diceNum = 4;
                break;
            case R.id.textView6:
                diceNum = 5;
                break;
        }
        Data.set("dice_num", diceNum);
        if(CheckedView != null) CheckedView.setBackgroundColor(Color.TRANSPARENT);
        v.setBackgroundColor(Color.GREEN);
        CheckedView = v;
    }
}