package com.example.maliheh.plan;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class readingquestion41 extends ActionBarActivity {

    private static Button option1_text;
    private static Button option2_text;
    private static Button nav1;
    public static int y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readingquestion41);

        option1_text=(Button)findViewById(R.id.reado11);
        option1_text.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(readingquestion41.this,"Falsch",Toast.LENGTH_SHORT).show();
            }


        });


        option2_text=(Button)findViewById(R.id.reado12);
        option2_text.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(readingquestion41.this, "Richtig",Toast.LENGTH_SHORT).show();
                ++y;
            }

        });

        nav1=(Button)findViewById(R.id.readnav2);
        nav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent("com.example.maliheh.plan.readingquestion42");
                startActivity(in);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_readingquestion41, menu);
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
