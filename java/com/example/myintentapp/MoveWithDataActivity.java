package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
public static String EXTRA_NIM = "extra_nim";
public static String EXTRA_NAME = "extra_name";
public static String EXTRA_ADDRESS = "extra_address";
public static String EXTRA_HOBBIES = "extra_hobbies";
public static String EXTRA_DREAM = "extra_dream";
private TextView tvDataReceived;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataReceived= (TextView)findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int nim = getIntent().getIntExtra(EXTRA_NIM,0);
        String address = getIntent().getStringExtra(EXTRA_ADDRESS);
        String hobbies = getIntent().getStringExtra(EXTRA_HOBBIES);
        String dream = getIntent().getStringExtra(EXTRA_DREAM);
        String text = "Name : "+name+"\nNIM : "+nim+"\nAddress : "+address+"\nHobbies : "+hobbies+"\nDream : "+dream;
        tvDataReceived.setText(text);
        }
}
