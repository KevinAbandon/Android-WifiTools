package com.kevinabandon.wifitoolstester;

import androidx.appcompat.app.AppCompatActivity;
import com.kevinabandon.wifitools.WifiTools;

import android.os.Bundle;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MultiAutoCompleteTextView mainText = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        mainText.setText(WifiTools.getDescription());
    }
}