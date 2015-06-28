package com.example.maliheh.plan;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maliheh.plan.R;


public class Article extends ActionBarActivity {

    private static Button button8;
    public static int artikleCount=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_article, menu);
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

    public void changeArtikle(View v){

        if(artikleCount==1){

            ImageView imageView=(ImageView)findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.nomdrindr);
            artikleCount++;
        }
        else if(artikleCount==2){

            ImageView imageView=(ImageView)findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.akk);
            artikleCount++;
        }
        else if(artikleCount==3){

            ImageView imageView=(ImageView)findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.dativ);
            artikleCount++;
        }
        else if(artikleCount==4){

            ImageView imageView=(ImageView)findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.derdiedas);
            artikleCount++;
        }
        else if(artikleCount==5){

            ImageView imageView=(ImageView)findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.nominativ);
            artikleCount++;
        }
        else if(artikleCount==6){

            ImageView imageView=(ImageView)findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.akkdativ);
            artikleCount++;
        }
        else if(artikleCount==7){

            ImageView imageView=(ImageView)findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.persprn);
            artikleCount++;
        }
        else if(artikleCount==8){

            ImageView imageView=(ImageView)findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.refpronomen);
            artikleCount++;
        }
        else if(artikleCount==9){

            Intent in = new Intent("com.example.maliheh.plan.startquiz2");
            startActivity(in);
        }

    }

}

