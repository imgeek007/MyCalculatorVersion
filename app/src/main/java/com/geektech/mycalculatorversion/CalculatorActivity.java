package com.geektech.mycalculatorversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        textView = findViewById(R.id.result);
        button = findViewById(R.id.return_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = textView.getText().toString();
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                intent.putExtra("key", result);
                finish();
            }
        });
    }

    public void onButtonClick(View v) {
        EditText numText1 = (EditText) findViewById(R.id.num1);
        EditText numText2 = (EditText) findViewById(R.id.num2);
        TextView resultText = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(numText1.getText().toString());
        int num2 = Integer.parseInt(numText2.getText().toString());
        int resSum = num1 + num2;
        resultText.setText(Integer.toString(resSum));
        int resMinus = num1 - num2;
        resultText.setText(Integer.toString(resMinus));
        int resUmnojenie = num1 * num2;
        resultText.setText(Integer.toString(resUmnojenie));
        int resDelenie = num1 / num2;
        resultText.setText(Integer.toString(resDelenie));
    }

}
