package com.carlson.msu.tapcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Button increaseBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        increaseBTN.setOnClickListener(new View.OnClickListener() { // this runes code
            @Override
            public void onClick(View v) {
                String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) +1);
                textView.setText(newText);

            }
        });
    }

    private void setUI (){
        textView = findViewById(R.id.textView);

        increaseBTN = findViewById(R.id.increase);

    }



}