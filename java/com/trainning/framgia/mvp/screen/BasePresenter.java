package com.trainning.framgia.mvp.screen;



public interface BasePresenter<T> {

    void setView(T view);

    void onStart();

    void onStop();
}

