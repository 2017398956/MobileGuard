package com.ittianyu.mobileguard.activity.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by yu and modified by nfl.
 * Base template activity
 * if extend this activity, it will call {@link #initView} {@link #initData} {@link #initEvent} in order
 * when {@link #onCreate(Bundle)}.
 * And the child activity no need to override {@link #onCreate(Bundle)} .
 * Just call {@link #setContentView(int)} at {@link #initView}.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    /**
     * Will call {@link #initView} {@link #initData} {@link #initEvent} in order
     * If you want to change the order, you can override it in your class.
     */
    protected void init() {
        initView();
        initData();
        initEvent();
    }

    /**
     * You can use {@link #findViewById(int)} there .
     * This method called before {@link #initData()}
     */
    protected abstract void initView();

    /**
     * This method called {after {@link #initView()} and before @link #initEvent()}  .
     */
    protected abstract void initData();

    /**
     * This method called after {@link #initData()}
     */
    protected abstract void initEvent();

}
