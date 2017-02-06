package com.example.anil.callbreakscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.anil.callbreakscore.R.id.radioButton;
import static com.example.anil.callbreakscore.R.id.radioButton4;

public class mainactivity2 extends AppCompatActivity {

     private RadioGroup radioPlayer;
    private Button button;
    private RadioButton pradio;
    public static int pid=0;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);
        addListenerOnButton();

    }

    public void addListenerOnButton(){

        radioPlayer=(RadioGroup)findViewById(R.id.radioPlayer);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p=radioPlayer.getCheckedRadioButtonId();
              //  System.out.println(p);
                pradio=(RadioButton)findViewById(p);

                if(pradio==null){
                    Toast.makeText(mainactivity2.this, "Please select... :-(", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (pradio.getId() == R.id.radioButton) {
                        pid = 3;
                        intent = new Intent(getApplicationContext(), playername.class);
                        startActivity(intent);

                    } else {
                        pid = 4;
                        intent = new Intent(getApplicationContext(), playername.class);
                        startActivity(intent);

                    }
                }

//            Toast.makeText(mainactivity2.this, pradio.getId()+"--"+pid+"", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
