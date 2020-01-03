package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v)
    {
        TextView result=(TextView)findViewById(R.id.result);
        EditText et1=(EditText)findViewById(R.id.editText1);

        double a=Double.parseDouble(String.valueOf(et1.getText()));
        RadioButton cb=(RadioButton)findViewById(R.id.cb);
        RadioButton fb=(RadioButton)findViewById(R.id.fb);

        if(cb.isChecked())
        {


            result.setText(((a-32)*5/9)+"D");

        }
        else
        {
            result.setText(((a*9)/5+32)+"D");


        }
    }

}
