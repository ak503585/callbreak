package com.example.anil.callbreakscore;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class playername  extends AppCompatActivity {
    mainactivity2 ma2 = new mainactivity2();
    // EditText et=new EditText();
    Button button2;
    Intent intent=null;
//    Player p=new Player();
    String name=null;

    EditText e[] = new EditText[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playername);
        e[3] = (EditText) findViewById(R.id.editText4);



        Toast.makeText(playername.this, ma2.pid + "", Toast.LENGTH_SHORT).show();

        if (ma2.pid == 4) {
            e[3].setVisibility(View.VISIBLE);
         //   p=new Player[4];
        } else {
            e[3].setVisibility(View.INVISIBLE);
         //   p=new Player[3];
        }

        addListenerOnButton();

    }

    public void addListenerOnButton() {
        e[0] = (EditText) findViewById(R.id.editText);
        e[1] = (EditText) findViewById(R.id.editText);
        e[2] = (EditText) findViewById(R.id.editText);


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
            //    Player.p[0].name=e[0].getText().toString();
                intent=new Intent(getApplicationContext(),Player.class);
                Player.getInstance().name=name
              //  name=e[0].getText().toString();
                name=name;
                //else
//                   p=new Player[3];

//        Toast.makeText(playername.this, name, Toast.LENGTH_SHORT).show();

                 startActivity(intent);
            }
        });
    }
}
