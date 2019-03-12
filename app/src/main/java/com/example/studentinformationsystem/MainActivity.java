package com.example.studentinformationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText UserName, Password;
    private Button LoginButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName = (EditText) findViewById(R.id.UserName);
        Password = (EditText) findViewById(R.id.Password);
        LoginButton = (Button) findViewById(R.id.LoginButton);

    }

    public  void ShowMessage(View v)
    {
        Check(UserName.getText().toString(),Password.getText().toString());
    }

    private void Check(String Username,String Password)
    {
        if(Username.isEmpty()&&Password.isEmpty())
            Toast.makeText(MainActivity.this,"PLease Enter User Name & Password",Toast.LENGTH_SHORT).show();
        else if(Password.isEmpty())
            Toast.makeText(MainActivity.this,"PLease Enter Password",Toast.LENGTH_SHORT).show();
        else if(Username.isEmpty())
            Toast.makeText(MainActivity.this,"PLease Enter User Name",Toast.LENGTH_SHORT).show();
    }





}