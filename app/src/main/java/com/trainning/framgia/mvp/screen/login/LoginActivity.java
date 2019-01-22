package com.trainning.framgia.mvp.screen.login;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.trainning.framgia.mvp.R;
import com.trainning.framgia.mvp.data.User;
import com.trainning.framgia.mvp.screen.BaseActivity;

public class LoginActivity extends BaseActivity
        implements View.OnClickListener, LoginContract.View {
    private EditText mEditEmail, mEditPass;
    private LoginPresenter mPresenter;

    @Override
    protected void initData() {
        mPresenter = new LoginPresenter();
        mPresenter.setView(this);
    }

    @Override
    protected void initComponent() {

        findViewById(R.id.btn_signin).setOnClickListener(this);
        mEditEmail = findViewById(R.id.edt_email);
        mEditPass = findViewById(R.id.edt_pass);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_login;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_signin:
                User user=new User(mEditEmail.getText().toString(),
                        mEditPass.getText().toString());
                mPresenter.checkInput(user);
                break;
            default:
                break;
        }
    }

    @Override
    public void showSuccess() {
        Toast.makeText(this, getResources().getString(R.string.success), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError() {
        Toast.makeText(this, getResources().getString(R.string.error), Toast.LENGTH_SHORT).show();
    }
}
