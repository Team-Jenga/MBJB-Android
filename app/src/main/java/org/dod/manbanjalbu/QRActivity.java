package org.dod.manbanjalbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QRActivity extends AppCompatActivity {
    private Button createQRBtn;
    private Button scanQRBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qractivity);

        createQRBtn = findViewById(R.id.QRcreate);
        scanQRBtn = findViewById(R.id.QRscan);

        createQRBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(QRActivity.this, QRCreate.class);
                startActivity(intent);
            }
        });

        scanQRBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(QRActivity.this, QRScan.class);
                startActivity(intent);
            }
        });
    }
}