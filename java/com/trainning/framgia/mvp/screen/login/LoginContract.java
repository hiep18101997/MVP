package com.trainning.framgia.mvp.screen.login;

import com.trainning.framgia.mvp.data.User;
import com.trainning.framgia.mvp.screen.BasePresenter;

public interface LoginContract {
    /**
     * View.
     */
    interface View {
        // Response from Presenter
        void showLoginSuccess();
        void showLoginInvalidError();
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter<View> {
        void validateInput(User user);
    }
}
