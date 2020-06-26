package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button Butt;
    EditText saymername;
    EditText pesswerd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton musk = (ImageButton) this.findViewById(R.id.melon);
        final MediaPlayer nutter = MediaPlayer.create(this, R.raw.nut);
        musk.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                nutter.start();
            }
        });

        Butt = findViewById(R.id.login);
        saymername = findViewById(R.id.nameuser);
        pesswerd = findViewById(R.id.passuser);
        Butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = saymername.getText().toString();
                String password = pesswerd.getText().toString();

                if (username.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Username should not be empty",Toast.LENGTH_LONG).show();
                }else if(username.length()<6){
                    Toast.makeText(getApplicationContext(),"Username should be 6 characters long",Toast.LENGTH_LONG).show();
                }else if(password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Password should not be empty",Toast.LENGTH_LONG).show();
                }else if (password.length()<6){
                    Toast.makeText(getApplicationContext(),"Password should be 6 characters long",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Form Validated",Toast.LENGTH_LONG).show();

                    Intent newActivity = new Intent(MainActivity.this,ZeStuff.class);
                    newActivity.putExtra("UNAME",username);
                    newActivity.putExtra("PWORD",password);
                    startActivity(newActivity);
                }

            }
        });
    }

}
