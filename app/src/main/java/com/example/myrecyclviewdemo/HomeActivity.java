package com.example.myrecyclviewdemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.myrecyclviewdemo.utils.UIHelp;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by sfr on 2017/10/24.
 */

public class HomeActivity extends AppCompatActivity {

    @Bind(R.id.recyclerView)
    TextView recyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.recyclerView)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.recyclerView:
                UIHelp.showRecyclerViewPage(this);
                break;
        }
    }
}
