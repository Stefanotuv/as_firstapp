package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void onClickButton(View temp){
//
//        EditText myUsernameEditText = (EditText) findViewById(R.id.usernameEditText);
//        EditText myPasswordEditText = (EditText) findViewById(R.id.passwordEditText);
//
//        Log.i("message","new message, i have been pressed");
//        Log.i("another message:",myUsernameEditText.getText().toString());
//        Log.i("another message:",myPasswordEditText.getText().toString());
//    }

    public void onClickButton(View temp){
        EditText myUsernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText myPasswordEditText = (EditText) findViewById(R.id.passwordEditText);

        Toast.makeText(MainActivity.this,"Ciao " + myUsernameEditText.getText().toString(),Toast.LENGTH_SHORT).show();
    }

}
