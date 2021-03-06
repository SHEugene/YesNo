package com.example.ancloosee.yesno;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button perssBnt;
    TextView answerBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perssBnt=(Button)findViewById(R.id.pressBnt);
        answerBox=(TextView) findViewById(R.id.answerBox);
        SetFonstForElemets();
    }


    public void pressBntclick(View view) {
        String answer= new Random(System.currentTimeMillis()).nextBoolean()== true? "YES": "NO";
        answerBox.setText(answer);
    }


    private  void  SetFonstForElemets() {
        perssBnt.setTypeface(Typeface.DEFAULT.createFromAsset(getAssets(),"AlfaSlabOne-Regular.ttf"));
        answerBox.setTypeface(Typeface.DEFAULT.createFromAsset(getAssets(),"AlfaSlabOne-Regular.ttf"));
        perssBnt.setTextSize(40);
    }
}
