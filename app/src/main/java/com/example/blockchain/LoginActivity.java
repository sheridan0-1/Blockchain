package com.example.blockchain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity{
    EditText identification;
    EditText password;
    Button login;
    TextView changePassword;
    TextView forgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        identification = (EditText)findViewById(R.id.identification);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        changePassword = (TextView) findViewById(R.id.changePassword);
        forgetPassword = (TextView) findViewById(R.id.forgetPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
            }
        });

    }



}
