package com.example.inlab.activityintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = findViewById(R.id.textView3);
        textView.setText(getIntent().getExtras().getString("textEdit"));

    }
}
