package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.CheckBox;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    
    private TextView total;
    private CheckBox shirt, pants, socks;
    private int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void calculateTotal(View v){

        total = (TextView) findViewById(R.id.totalText);
        shirt = (CheckBox) findViewById(R.id.checkBox);
        pants = (CheckBox) findViewById(R.id.checkBox2);
        socks = (CheckBox) findViewById(R.id.checkBox3);
        
        if (shirt.isChecked())
            sum += 200;
        if (pants.isChecked())
            sum += 300;
        if (socks.isChecked())
            sum += 50;
        
        total.setText("Your total is $" + String.valueOf(sum) + ".00");
    }
        
}
