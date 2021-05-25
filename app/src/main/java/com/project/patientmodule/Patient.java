package com.project.patientmodule;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Patient extends Activity {
    ImageView img3;
    TextView tv4;
    TextInputEditText et,et1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img3=(ImageView) findViewById(R.id.img3);
        tv4=(TextView) findViewById(R.id.tv4);
        et=(TextInputEditText) findViewById(R.id.et);
        et1=(TextInputEditText) findViewById(R.id.et1);
    }
}
