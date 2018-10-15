package com.example.sofiamarquez.flashcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(((TextView)findViewById(R.id.flashcard_answer)).isShown()) {
                    ((TextView) findViewById(R.id.flashcard_answer)).setVisibility(View.INVISIBLE);
                    ((TextView) findViewById(R.id.flashcard_question)).setVisibility(View.VISIBLE);
                }else{
                    ((TextView) findViewById(R.id.flashcard_answer)).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(R.id.flashcard_question)). setVisibility(View.INVISIBLE);

                }
            }
        });
    }
}
