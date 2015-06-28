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


public class QuestionsInDeutsch extends ActionBarActivity {

    private static Button button1;
    public static int questionCount=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_in_deutsch);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_questions_in_deutsch, menu);
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
    public void changeQuestion(View v) {


        if (questionCount == 1) {
            TextView textView1 = (TextView) findViewById(R.id.textView2);
            textView1.setText("Wie heissen Sie?");
            TextView textView2 = (TextView) findViewById(R.id.textView4);
            textView2.setText("What is your name?");
            questionCount++;
        }
        else if (questionCount == 2) {
            TextView textView1 = (TextView) findViewById(R.id.textView2);
            textView1.setText("Woher kommen Sie?");
            TextView textView2 = (TextView) findViewById(R.id.textView4);
            textView2.setText("Where do you come from?");
            questionCount++;
        }
        else if (questionCount == 3) {
            TextView textView1 = (TextView) findViewById(R.id.textView2);
            textView1.setText("Wie alt sind Sie?");
            TextView textView2 = (TextView) findViewById(R.id.textView4);
            textView2.setText("How old are you?");
            questionCount++;
        }
        else if (questionCount == 4) {
            TextView textView1 = (TextView) findViewById(R.id.textView2);
            textView1.setText("Wo wohnen Sie?");
            TextView textView2 = (TextView) findViewById(R.id.textView4);
            textView2.setText("Where do you stay?");
            questionCount++;
        }
        else if (questionCount == 5) {
            TextView textView1 = (TextView) findViewById(R.id.textView2);
            textView1.setText("Was sind Sie von Beruf?");
            TextView textView2 = (TextView) findViewById(R.id.textView4);
            textView2.setText("What is your occupation?");
            questionCount++;
        }
        else if (questionCount == 6) {
            TextView textView1 = (TextView) findViewById(R.id.textView2);
            textView1.setText("Welche sprachen sprechen Sie?");
            TextView textView2 = (TextView) findViewById(R.id.textView4);
            textView2.setText("Which languages do you speak?");
            questionCount++;
        }
        else if (questionCount == 7) {
            TextView textView1 = (TextView) findViewById(R.id.textView2);
            textView1.setText("Beispiel");
            TextView textView2 = (TextView) findViewById(R.id.textView4);
            textView2.setText("Ich heisse Franzika Binder. " +
                    "Ich bn 37 Jahre alt." +
                    " Ich komme aus Oesterreich." +
                    " Ich wohne in Wien. " +
                    "Ich bin Lehrerin." +
                    " Meine Muttersprache ist Deutsch. Ich spreche auch Spanisch und Englisch");
            questionCount++;
        }

        else if(questionCount==8){

            Intent in = new Intent("com.example.maliheh.plan.startquiz3");
            startActivity(in);
        }
    }
}
