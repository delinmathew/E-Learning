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


public class PictureWordMatch extends ActionBarActivity {

    private static Button button7;
    public static int count=1;
    //     ImageView imageView;
//    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_word_match);

        //  imageView.setImageResource(R.drawable.apple);
        // textView5.setText("Der Apfel");
//        button7 = (Button)findViewById(R.id.button2);
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
        //          public void onClick(View v) {

        //      count = 1;
        //      if(count==0) {
        //imageView.setImageResource(R.drawable.apple);
        //textView5.setText("Der Apfel");
        //count++;
//                }
////                else if(count==1){
//                imageView=(ImageView)findViewById(R.id.imageView);
//                    imageView.setImageResource(R.drawable.beer);
//                textView5=(TextView)findViewById(R.id.textView5);
//                    textView5.setText("Das Bier");
//                    count++;
//                }
//                else if(count==2){
//                    imageView.setImageResource(R.drawable.carpet);
//                    textView5.setText("Der Teppich");
//                    count++;
//                }
//                else if(count==3){
//                    imageView.setImageResource(R.drawable.icecubes);
//                    textView5.setText("Die Eiswuerfel");
//                    count++;
//                }
//                else if(count==4){
//                    imageView.setImageResource(R.drawable.mobile);
//                    textView5.setText("Das Handy");
//                    count++;
//                }
//                else if(count==5){
//                    imageView.setImageResource(R.drawable.computer);
//                    textView5.setText("Der Computer");
//                    count++;
//                }

//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_picture_word_match, menu);
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

    public void changeImage(View v){


        if(count==1){
            ImageView imageView=(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.beer);
            TextView textView5=(TextView)findViewById(R.id.textView5);
            textView5.setText("Das Bier");
            count++;
        }
        else if(count==2){
            ImageView imageView=(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.carpet);
            TextView textView5=(TextView)findViewById(R.id.textView5);
            textView5.setText("Der Teppich");
            count++;
        }
        else if(count==3){
            ImageView imageView=(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.icecubes);
            TextView textView5=(TextView)findViewById(R.id.textView5);
            textView5.setText("Die Eiswuerfel");
            count++;
        }
        else if(count==4){
            ImageView imageView=(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.mobile);
            TextView textView5=(TextView)findViewById(R.id.textView5);
            textView5.setText("Das Handy");
            count++;
        }
        else if(count==5){
            ImageView imageView=(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.computer);
            TextView textView5=(TextView)findViewById(R.id.textView5);
            textView5.setText("Der Computer");
            count++;
        }
        else if(count==6){

            Intent in = new Intent("com.example.maliheh.plan.startquiz1");
            startActivity(in);
        }

    }
}