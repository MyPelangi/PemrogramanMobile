package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnMoveWithDataActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveWithDataActivity = (Button) findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Pelangi Dwi Mawarni");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NIM, 2110512028);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_ADDRESS, "Puri NusaAsri Serua, Depok");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_HOBBIES, "Membaca buku dan menonton film kartun");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_DREAM, "System Analyst");
                startActivity(moveWithDataIntent);
                break;
        }
    }
}
