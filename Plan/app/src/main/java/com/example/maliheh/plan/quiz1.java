package com.example.maliheh.plan;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class quiz1 extends ActionBarActivity {
    private static Button option21_text;
    private static Button option22_text;
    private static Button option23_text;
    private static Button nav1;
    public static int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        option21_text = (Button) findViewById(R.id.ao11);
        option21_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(quiz1.this, "Richtig", Toast.LENGTH_SHORT).show();
                ++j;
            }


        });


        option22_text = (Button) findViewById(R.id.ao12);
        option22_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(quiz1.this, "Falsch", Toast.LENGTH_SHORT).show();
            }

        });

        option23_text = (Button) findViewById(R.id.ao13);
        option23_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(quiz1.this, "Falsch", Toast.LENGTH_SHORT).show();
            }

        });

        nav1=(Button)findViewById(R.id.anav1);
        nav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent("com.example.maliheh.plan.articlequestion22");
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
