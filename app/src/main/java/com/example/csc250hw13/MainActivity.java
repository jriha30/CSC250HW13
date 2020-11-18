package com.example.csc250hw13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setFirstName(View v)
    {
        TextView firstName = this.findViewById(R.id.firstName);
        firstName.setText("Jason");
    }

    public void setLastName(View v)
    {
        TextView lastName = this.findViewById(R.id.lastName);
        lastName.setText("Riha");
    }
}