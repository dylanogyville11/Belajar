package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void login(View view){
        EditText edt_username = (EditText) findViewById(R.id.username);
        EditText edt_password = (EditText) findViewById(R.id.password);
        String username_val = edt_username.getText().toString();
        String password_val = edt_password.getText().toString();

        if (username_val.equals("dylanogyville")&& password_val.equals("1234567890")) {
            Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
            startActivity(intent);
        } else {
            Toast.makeText(this,"Password atau Username salah", Toast.LENGTH_SHORT).show();
        }
    }
}