package com.trainning.framgia.mvp.screen.login;

import android.text.TextUtils;
import com.trainning.framgia.mvp.data.User;

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View mView;

    @Override
    public void setView(LoginContract.View view) {
        mView = view;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void validateInput(User user) {
        if (TextUtils.isEmpty(user.getEmail()) || TextUtils.isEmpty(user.getPass())) {
            mView.showLoginSuccess();
        }else {
            mView.showLoginInvalidError();
        }
    }
}
