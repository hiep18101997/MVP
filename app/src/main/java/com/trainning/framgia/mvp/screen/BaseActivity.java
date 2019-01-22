package com.trainning.framgia.mvp.screen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        initComponent();
        initData();
    }

    protected abstract void initData();

    protected abstract void initComponent();

    protected abstract int getLayoutResource();
}