package com.example.l400.alert_dialogue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertdialogbuildeer = new AlertDialog.Builder(MainActivity.this);
                alertdialogbuildeer.setTitle("just for testing");
                alertdialogbuildeer.setMessage("select one of the below button");
                alertdialogbuildeer.setIcon(R.drawable.ic_action_name);

                alertdialogbuildeer.setPositiveButton("+IVE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this , "you just clicked +ive button",Toast.LENGTH_SHORT).show();
                    }
                });
                alertdialogbuildeer.setNegativeButton("_IVE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "you just clicked _ive button", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog al = alertdialogbuildeer.create();
                al.show();
            }
        });


    }
}
