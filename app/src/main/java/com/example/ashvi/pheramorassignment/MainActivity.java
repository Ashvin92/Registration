package com.example.ashvi.pheramorassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import static com.example.ashvi.pheramorassignment.R.id.txt_password;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmail,editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = (EditText)findViewById(R.id.txt_email);
        editTextPassword = (EditText)findViewById(R.id.txt_password);





    }
}
