package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private TextView info;
    private Button login;
    private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.etname);
        password = (EditText)findViewById(R.id.etpassword);
        info = (TextView)findViewById(R.id.tvinfo);
        login = (Button)findViewById(R.id.btnlogin);
        info.setText("No. of attempts remaining:5");
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                validate(name.getText().toString(),password.getText().toString());
            }
        });
    }
    private void validate(String username,String password){
        if ((username.equals("antriksh")) && (password.equals("12345"))){
            Intent intent = new Intent(MainActivity.this,secondactivity.class);
            startActivity(intent);
        }else{
            counter--;
            info.setText("No. of attempts remaining:"+String.valueOf(counter));
            if(counter==0)
                login.setEnabled(false);

        }

        }


}



