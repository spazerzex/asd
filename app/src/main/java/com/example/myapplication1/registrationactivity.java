package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class registrationactivity extends AppCompatActivity {
    private EditText username,userpassword,useremail;
    private Button regButton;
    private TextView userlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationactivity);
    private void setupuiviews(){
        username =(EditText)findViewById(R.id.etusername);
        userpassword = (EditText)findViewById(R.id.etpassword);
        useremail = (EditText)findViewById(R.id.etuseremail);
        regButton = (Button) findViewById(R.id.btnregister);
        userlogin=(TextView)findViewById(R.id.tvuserlogin);








        }}
}
