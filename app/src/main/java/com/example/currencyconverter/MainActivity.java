package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int flag1;

    public void convertCurrency (View view){
    Log.i("Info", "Button Pressed");
    final TextView textView = findViewById(R.id.textView);
    final EditText editText=(EditText) findViewById(R.id.editText);
    final Switch reverse = findViewById(R.id.switch1);
    final String userInput=editText.getText().toString();
    
    reverse.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            if (isChecked) {
                textView.setText("Dollars to INR");
                flag1 = 1;

            } else {
                textView.setText("INR to Dollars");
                flag1 = 2;
            }
        }
    });
    double userInputDouble= Double.parseDouble(userInput);
    double amountinDollarsDouble= userInputDouble * 0.014;
    double amountinRupeeDouble = userInputDouble / 0.014;
    if(flag1 == 1){
        String amountInRupeeString = String.format("%.2f", amountinRupeeDouble);

        Toast.makeText(this, " $ " + userInputDouble + " is Rs." + amountInRupeeString, Toast.LENGTH_LONG).show();

    }
    else{
        String amountinDollarsString=String.format("%.2f", amountinDollarsDouble);
        Toast.makeText(this," Rs " + userInputDouble + " is $ " +amountinDollarsString,Toast.LENGTH_LONG).show();

    }
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}