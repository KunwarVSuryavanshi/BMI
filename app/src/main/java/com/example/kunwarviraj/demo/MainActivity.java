package com.example.kunwarviraj.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View v) {
        EditText editH = (EditText)findViewById(R.id.height);
        EditText editW = (EditText)findViewById(R.id.weight);
        TextView result = (TextView)findViewById(R.id.userBMI);

        double heights = Double.parseDouble(editH.getText().toString());
        double weights = Double.parseDouble(editW.getText().toString());

        double BMI= weights/(heights * heights);

        result.setText(Double.toString(BMI));
    }
}
