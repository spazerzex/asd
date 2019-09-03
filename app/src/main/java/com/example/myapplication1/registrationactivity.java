package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class registrationactivity extends AppCompatActivity {
    private EditText username,userpassword,useremail;
    private Button regButton;
    private TextView userlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViews(R.layout.activity_registrationactivity);
        setup();
    regButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(validate()){

            }
        }
    });
    userlogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
startActivity(new Intent(registrationactivity.this,MainActivity.class));
        }
    });}

    private void setContentViews(int activity_registrationactivity) {
    }

    private void setup(){
        username =(EditText)findViewById(R.id.etusername);
        userpassword = (EditText)findViewById(R.id.etpassword);
        useremail = (EditText)findViewById(R.id.etuseremail);
        regButton = (Button) findViewById(R.id.btnregister);
        userlogin=(TextView)findViewById(R.id.tvuserlogin);








        }
        private boolean validate(){
        boolean result = false;
        String name = username.getText().toString();
            String password = userpassword.getText().toString();
            String email = useremail.getText().toString();

    if(name.isEmpty() && password.isEmpty() && email.isEmpty()){
        Toast.makeText(this,"Please Enter The Details",Toast.LENGTH_SHORT);
    }else{
        result = true;
    }
    return result;
        }
}
