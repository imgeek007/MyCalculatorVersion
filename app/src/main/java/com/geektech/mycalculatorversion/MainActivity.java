package com.geektech.mycalculatorversion;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
textView=findViewById(R.id.our_result);

    }

    public void onClickOpenApp(View v) {
        Intent intent1 = new Intent(MainActivity.this, CalculatorActivity.class);
        startActivityForResult(intent1, 1);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            String s = data.getStringExtra("key");
            textView.setText(s);
        }
    }
}