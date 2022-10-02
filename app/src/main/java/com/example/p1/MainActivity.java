package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    private TextView total;
    private CheckBox shirt, pants, socks;
    private RadioGroup pantsButtons,shirtButtons, socksButtons;
    private int sum = 0;
    private String summary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shirt = (CheckBox) findViewById(R.id.shirt);
        pants = (CheckBox) findViewById(R.id.pants);
        socks = (CheckBox) findViewById(R.id.socks);
        total = (TextView) findViewById(R.id.totalText);
        shirtButtons = (RadioGroup) findViewById(R.id.radioGroupShirt);
        pantsButtons = (RadioGroup) findViewById(R.id.radioGroupPants);
        socksButtons = (RadioGroup) findViewById(R.id.radioGroupSocks);
    }
    
    public void calculateTotal(View view) {
        sum = 0;
        summary = "";
        int shirtId = shirtButtons.getCheckedRadioButtonId();
        RadioButton shirtSizeRadio = findViewById(shirtId);
        String shirtSize = (String) shirtSizeRadio.getText();
        int pantsId = pantsButtons.getCheckedRadioButtonId();
        RadioButton pantsSizeRadio = findViewById(pantsId);
        String pantsSize = (String) pantsSizeRadio.getText();
        int sockId = socksButtons.getCheckedRadioButtonId();
        RadioButton sockSizeRadio = findViewById(sockId);
        String sockSize = (String) sockSizeRadio.getText();
        if (shirt.isChecked())
            summary += "Shirt (" + shirtSize + "): $200.00 \n";
            sum += 200;
        if (pants.isChecked())
            summary += "Pants ("+ pantsSize +"): $300.00 \n";
            sum += 300;
        if (socks.isChecked())
            summary += "Socks (" + sockSize + "): $50 \n";
            sum += 50;
       //Toast.makeText(MainActivity.this, summary+ "\nTOTAL: "+shirtSize, Toast.LENGTH_LONG).show();
       total.setText(summary+"\nYour total is $" + String.valueOf(sum) + ".00");

    }
}
