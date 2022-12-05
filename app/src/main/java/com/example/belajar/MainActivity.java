package com.example.belajar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_toast(View view)
    {
        EditText edit_fname = (EditText) findViewById(R.id.firstname);
        EditText edit_lname = (EditText) findViewById(R.id.lastname);
        String fullname = edit_fname.getText().toString() + " " + edit_lname.getText().toString();

        if(fullname.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Please Fill Firstname and Lastname"
                    , Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Your Fullname is "+fullname
                    , Toast.LENGTH_SHORT).show();
        }
    }

    public void show_passingdata(View view)
    {
        EditText edit_fname = (EditText) findViewById(R.id.firstname);
        EditText edit_lname = (EditText) findViewById(R.id.lastname);
        String fname = edit_fname.getText().toString();
        String lname = edit_lname.getText().toString();

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);

        intent.putExtra("fn data", fname);
        intent.putExtra("ls data", lname);

        startActivity(intent);
    }

    public void open_webview (View view)
    {
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }
    public void materialDesignPage(View view)
    {
        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);
    }

    public void openSQLite (View view)
    {
        Intent intent = new Intent(MainActivity.this, MainActivity6.class);
        startActivity(intent);
    }
}
