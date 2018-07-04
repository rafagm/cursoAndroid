package com.example.inlab.activityintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnNext;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener changeActivity2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_2.class);
                intent.putExtra("textEdit", editText.getText().toString());
                startActivity(intent);
            }
        };
       editText = findViewById(R.id.editText);
       btnNext = findViewById(R.id.button);
       btnNext.setOnClickListener(changeActivity2);
    }
}
