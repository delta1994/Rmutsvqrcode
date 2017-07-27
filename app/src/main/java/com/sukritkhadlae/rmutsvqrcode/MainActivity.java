package com.sukritkhadlae.rmutsvqrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText UsernameEt, PasswordEt;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameEt = (EditText)findViewById(R.id.etUserName);
        PasswordEt = (EditText)findViewById(R.id.etPassword);



    }

    public void OnLogin(View view){
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "Login";
        Background background = new Background(this);
        background.execute(type, username, password);
    }


    public void OpenReg(View view){

        startActivity(new Intent(this, Register.class));

    }

    public void OnGuest(View view){
        Intent intent = new Intent(this, Scanqrcode.class);
        startActivity(intent);


    }

}