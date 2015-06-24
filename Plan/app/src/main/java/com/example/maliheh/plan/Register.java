package com.example.maliheh.plan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends ActionBarActivity implements View.OnClickListener{

    Button bRegister;
    EditText etName, etUserName, etPassword;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName);
        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bRegister = (Button) findViewById(R.id.bRegister);
        tvLogin = (TextView) findViewById(R.id.tvLoginLink);

        bRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bRegister:

                String name = etName.getText().toString();
                String username = etUserName.getText().toString();
                String password = etPassword.getText().toString();

                User regiseredData = new User(name, username, password);

                break;

            case R.id.tvLoginLink:

                startActivity(new Intent(this,Login.class));

                break;
        }
    }
}
