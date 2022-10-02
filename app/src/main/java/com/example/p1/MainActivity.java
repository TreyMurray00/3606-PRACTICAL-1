package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    private TextView total;
    private CheckBox shirt, pants, socks;
    private int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shirt = (CheckBox) findViewById(R.id.shirt);
        pants = (CheckBox) findViewById(R.id.pants);
        socks = (CheckBox) findViewById(R.id.socks);
        total = (TextView) findViewById(R.id.totalText);
    }
    
    public void calculateTotal(View view) {

        if (shirt.isChecked())
            sum += 200;
        if (pants.isChecked())
            sum += 300;
        if (socks.isChecked())
            sum += 50;
       Toast.makeText(MainActivity.this, "TOTAL: "+ sum, Toast.LENGTH_LONG).show();
       total.setText("Your total is $" + String.valueOf(sum) + ".00");

    }
}
