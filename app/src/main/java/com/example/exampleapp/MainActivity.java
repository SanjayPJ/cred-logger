package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void do_something(View view){
        EditText user_name = (EditText) findViewById(R.id.userName);
        EditText password = (EditText) findViewById(R.id.password);
        Toast.makeText(this, "User name :: " + user_name.getText().toString() + "\n" + "Password :: " + password.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
}
