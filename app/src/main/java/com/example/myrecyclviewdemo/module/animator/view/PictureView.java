package com.example.myrecyclviewdemo.module.animator.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.myrecyclviewdemo.R;

/**
 * Created by sfr on 2017/10/24.
 */

public class PictureView extends RelativeLayout {
    private Context mContext;
    public PictureView(Context context) {
        this(context,null);
    }

    public PictureView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PictureView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public PictureView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void initView(){
        View root = View.inflate(mContext, R.layout.picture_view,this);
    }
}
