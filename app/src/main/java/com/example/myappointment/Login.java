package com.example.myappointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText edt_email2;
    EditText edt_pass2;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_email2=(EditText)findViewById(R.id.et_mail);
        edt_pass2=(EditText)findViewById(R.id.et_passw);
        btn_login=(Button)findViewById(R.id.btn_log);
    }

    public void log_in(View view) {
        if(TextUtils.isEmpty(edt_email2.getText())&&TextUtils.isEmpty(edt_pass2.getText())){
            edt_email2.setError("This Feild is required");
            edt_email2.requestFocus();
            edt_pass2.setError("This Feild is required");
            edt_pass2.requestFocus();



        }
        else  {
            String a=edt_email2.getText().toString();

            String e=edt_pass2.getText().toString();

            Intent tap= new Intent(Login.this,home.class);
            startActivity(tap);
        }

    }

    public void create(View view) {
        Intent tap= new Intent(Login.this,Signup.class);
        startActivity(tap);
    }


    public void forget(View view) {
        Intent tap= new Intent(Login.this,home.class);
        startActivity(tap);
    }
}

