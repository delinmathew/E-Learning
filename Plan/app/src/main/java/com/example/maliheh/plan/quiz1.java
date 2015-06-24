package com.example.maliheh.plan;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class quiz1 extends ActionBarActivity {
    private static Button option21_text;
    private static Button option22_text;
    private static Button option23_text;
    private static Button score1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        option21_text = (Button) findViewById(R.id.option21);
        option21_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(quiz1.this, "Correct", Toast.LENGTH_SHORT).show();
                ++Quiz.i;
            }


        });


        option22_text = (Button) findViewById(R.id.option22);
        option22_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(quiz1.this, "Incorrect", Toast.LENGTH_SHORT).show();
            }

        });

        option23_text = (Button) findViewById(R.id.option23);
        option23_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(quiz1.this, "Incorrect", Toast.LENGTH_SHORT).show();
            }

        });

        score1 = (Button) findViewById(R.id.score1);
        score1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent("com.example.maliheh.plan.quiz2");
                startActivity(in);
            }

        });
    }

            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_quiz1, menu);
                return true;
            }

            @Override
            public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                    return true;
                }

                return super.onOptionsItemSelected(item);
            }
        }
