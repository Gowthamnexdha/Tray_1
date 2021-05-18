package com.example.libonly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Acti_vity123 extends AppCompatActivity {
public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti_vity123);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),
                        "This a toast message",
                        Toast.LENGTH_LONG);            }
        });
    }

}