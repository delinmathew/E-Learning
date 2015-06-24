package com.example.maliheh.plan;

import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;




public class MainActivity extends ActionBarActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;


    int score = 80;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        switch(score){
            case (100):

                button2.getBackground().setColorFilter(0xFFFF0000,PorterDuff.Mode.MULTIPLY);

                break;
            case  (200):
                break;}
    }
    public void addListenerOnButton() {

        button1 = (Button) findViewById(R.id.id1);
        button2 = (Button) findViewById(R.id.id2);
        button3 = (Button) findViewById(R.id.id3);
        button4 = (Button) findViewById(R.id.id4);
        button5 = (Button) findViewById(R.id.id5);
        button6 = (Button) findViewById(R.id.id6);
        button7 = (Button) findViewById(R.id.id7);
        button8 = (Button) findViewById(R.id.id8);
        button9 = (Button) findViewById(R.id.id9);
        button10 = (Button) findViewById(R.id.id10);
        button11= (Button) findViewById(R.id.id11);
        button12 = (Button) findViewById(R.id.id12);
        button13 = (Button) findViewById(R.id.id13);
        button14 = (Button) findViewById(R.id.id14);
        button15 = (Button) findViewById(R.id.id15);
        button16 = (Button) findViewById(R.id.id16);
        button17 = (Button) findViewById(R.id.id17);
        button18 = (Button) findViewById(R.id.id18);
        button19 = (Button) findViewById(R.id.id19);
        button20 = (Button) findViewById(R.id.id20);
        button21 = (Button) findViewById(R.id.id21);
        button22 = (Button) findViewById(R.id.id22);
        button23 = (Button) findViewById(R.id.id23);
        button24 = (Button) findViewById(R.id.id24);
        button25 = (Button) findViewById(R.id.id25);
        button26 = (Button) findViewById(R.id.id26);
        button27 = (Button) findViewById(R.id.id27);


        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent in = new Intent("com.example.maliheh.plan.MainActivity1");
                startActivity(in);
            }

        });

        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 100 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 200 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 300 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 400 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 500 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 600 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button8.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 700 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button9.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 800 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button10.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 900 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button11.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1000 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button12.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1100 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button13.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1200 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });

        button14.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1300 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button15.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1400 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button16.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1500 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });

        button17.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1600 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });

        button18.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1700 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button19.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1800 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button20.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 1900 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button21.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 2000 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });

        button22.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 2100 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button23.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score <= 2200 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });

        button24.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score >= 2300 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button25.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score >= 2400 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button26.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score >= 2500 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });
        button27.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if( score >= 2600 )
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                    startActivity(browserIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Not permission", Toast.LENGTH_LONG).show();

            }

        });





    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private class SqlliteDatabase {

    }
}