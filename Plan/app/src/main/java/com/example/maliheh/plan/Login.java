package com.example.maliheh.plan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends ActionBarActivity implements View.OnClickListener{

    Button bLogin;
    EditText etUserName, etPassword;
    TextView tvRegisterLink;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);

        bLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.bLogin:

                startActivity(new Intent(this,MainActivity.class));

                User user = new User(null,null);


                userLocalStore.storeUserData(user);
                userLocalStore.setUserLoggedIn(true);

                break;

            case R.id.tvRegisterLink:
                startActivity(new Intent(this,Register.class));
                break;
        }
    }
}
