package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void convertCurrency (View view){
    Log.i("Info", "Button Pressed");
    EditText editText=(EditText) findViewById(R.id.editText);
    String amountInIndianRupee=editText.getText().toString();

    double amountInIndianRupeeDouble= Double.parseDouble(amountInIndianRupee);
    double amountinDollarsDouble= amountInIndianRupeeDouble * 0.014;

    String amountinDollarsString=String.format("%.2f", amountinDollarsDouble);
    Toast.makeText(this," Rs " + amountInIndianRupeeDouble + " is $ " +amountinDollarsString,Toast.LENGTH_LONG).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
