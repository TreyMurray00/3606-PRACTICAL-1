/*
GROUP:
Trey Murray: 816019360
Shivan Maharaj: 816016248
Rehannah Baptiste: 816023880
Alyssa Rahim: 816024905
*/
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
    public void onCheck(View view) {
        int id;
        RadioButton selected;
        if(shirt.isChecked()) {
            id =  shirtButtons.getChildAt(1).getId();
            shirtButtons.check(id);
        }
        if(pants.isChecked()){
            id =  pantsButtons.getChildAt(1).getId();
            pantsButtons.check(id);

        }
        if(socks.isChecked()){
            id =  socksButtons.getChildAt(1).getId();
            socksButtons.check(id);

        }
    }
    public void calculateTotal(View view) {
        summary = "";
        String sockSize = "None";
        String pantsSize = "None";
        String shirtSize = "None";
        int shirtId = shirtButtons.getCheckedRadioButtonId();
        RadioButton shirtSizeRadio = findViewById(shirtId);
        shirtSize = (String) shirtSizeRadio.getText();
        int pantsId = pantsButtons.getCheckedRadioButtonId();
        RadioButton pantsSizeRadio = findViewById(pantsId);
        pantsSize = (String) pantsSizeRadio.getText();
        int sockId = socksButtons.getCheckedRadioButtonId();
        RadioButton sockSizeRadio = findViewById(sockId);
        sockSize = (String) sockSizeRadio.getText();
        if (shirt.isChecked()) {
            summary += "Shirt (" + shirtSize + "): $200.00 \n";
            sum += 200;
        }
        if (pants.isChecked()) {
            summary += "Pants (" + pantsSize + "): $300.00 \n";
            sum += 300;
        }
        if (socks.isChecked()){
            summary += "Socks (" + sockSize + "): $50 \n";
            sum += 50;
        }
       total.setText(summary+"\nYour total is $" + String.valueOf(sum) + ".00");
        sum = 0;


    }
}
