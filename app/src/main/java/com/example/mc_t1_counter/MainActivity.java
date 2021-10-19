package com.example.mc_t1_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=(TextView) findViewById(R.id.textView);
    }

    public void incrementCounter(View view) {
        int cnt = Integer.parseInt(counter.getText().toString());
        cnt=cnt+1;
        counter.setText(Integer.toString(cnt));
    }
}