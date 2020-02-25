package com.example.chemplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView register = findViewById(R.id.register);
        register.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void sign_in(View view) {
        Intent signed = new Intent(this,EventsActivity.class);
        startActivity(signed);
    }
}
