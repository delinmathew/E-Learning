package com.example.maliheh.plan;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartPage extends ActionBarActivity implements View.OnClickListener{

    Button bLogout;
    EditText etName, etUserName;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etUserName = (EditText) findViewById(R.id.etUserName);
        bLogout = (Button) findViewById(R.id.bLogout);

        bLogout.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bLogout:
                userLocalStore.clearUserData();
                userLocalStore.setUserLoggedIn(false);

                startActivity(new Intent(this,Login.class));
                break;
        }
    }
}