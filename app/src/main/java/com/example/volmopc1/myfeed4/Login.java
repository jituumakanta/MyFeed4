package com.example.volmopc1.myfeed4;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class Login extends AppCompatActivity implements View.OnClickListener {
    Button buttonRegister;
    Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonRegister=(Button)findViewById(R.id.button_register);
        buttonLogin=(Button)findViewById(R.id.button_login);
        buttonRegister.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);
      /*  b.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent i1=new Intent(getApplicationContext(),Provider_Register.class);
                startActivity(i1);
            }
        });*/

    }


    @Override
    public void onClick(View v) {
        if(v == buttonRegister){
            Intent i1=new Intent(getApplicationContext(),Provider_Register.class);
            startActivity(i1);
        }
        if(v == buttonLogin){
            Intent i2=new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(i2);
        }
    }





}
