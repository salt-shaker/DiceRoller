package com.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_roll;
    TextView tv_rollNumber;
    ImageView iv_diceRoll, iv_diceRoll2, iv_diceRoll3, iv_diceRoll4;

    int diceRoll_01, diceRoll_02, diceRoll_03, diceRoll_04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_roll = findViewById(R.id.btn_roll);
        tv_rollNumber = findViewById(R.id.tv_rollNumber);
        iv_diceRoll = findViewById(R.id.iv_diceRoll);
        iv_diceRoll2 = findViewById(R.id.iv_diceRoll2);
        iv_diceRoll3 = findViewById(R.id.iv_diceRoll3);
        iv_diceRoll4 = findViewById(R.id.iv_diceRoll4);

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diceRoll_01 = (int) ((Math.random()*5.5)+1);
                diceRoll_02 = (int) ((Math.random()*5.5)+1);
                diceRoll_03 = (int) ((Math.random()*5.5)+1);
                diceRoll_04 = (int) ((Math.random()*5.5)+1);
                switch(diceRoll_01){
                    case 1:
                        iv_diceRoll.setImageResource(R.drawable.tile000);
                        break;
                    case 2:
                        iv_diceRoll.setImageResource(R.drawable.tile001);
                        break;
                    case 3:
                        iv_diceRoll.setImageResource(R.drawable.tile002);
                        break;
                    case 4:
                        iv_diceRoll.setImageResource(R.drawable.tile003);
                        break;
                    case 5:
                        iv_diceRoll.setImageResource(R.drawable.tile004);
                        break;
                    case 6:
                        iv_diceRoll.setImageResource(R.drawable.tile005);
                        break;
                }

                switch(diceRoll_02){
                    case 1:
                        iv_diceRoll2.setImageResource(R.drawable.tile000);
                        break;
                    case 2:
                        iv_diceRoll2.setImageResource(R.drawable.tile001);
                        break;
                    case 3:
                        iv_diceRoll2.setImageResource(R.drawable.tile002);
                        break;
                    case 4:
                        iv_diceRoll2.setImageResource(R.drawable.tile003);
                        break;
                    case 5:
                        iv_diceRoll2.setImageResource(R.drawable.tile004);
                        break;
                    case 6:
                        iv_diceRoll2.setImageResource(R.drawable.tile005);
                        break;
                }

                switch(diceRoll_03){
                    case 1:
                        iv_diceRoll3.setImageResource(R.drawable.tile000);
                        break;
                    case 2:
                        iv_diceRoll3.setImageResource(R.drawable.tile001);
                        break;
                    case 3:
                        iv_diceRoll3.setImageResource(R.drawable.tile002);
                        break;
                    case 4:
                        iv_diceRoll3.setImageResource(R.drawable.tile003);
                        break;
                    case 5:
                        iv_diceRoll3.setImageResource(R.drawable.tile004);
                        break;
                    case 6:
                        iv_diceRoll3.setImageResource(R.drawable.tile005);
                        break;
                }

                switch(diceRoll_04){
                    case 1:
                        iv_diceRoll4.setImageResource(R.drawable.tile000);
                        break;
                    case 2:
                        iv_diceRoll4.setImageResource(R.drawable.tile001);
                        break;
                    case 3:
                        iv_diceRoll4.setImageResource(R.drawable.tile002);
                        break;
                    case 4:
                        iv_diceRoll4.setImageResource(R.drawable.tile003);
                        break;
                    case 5:
                        iv_diceRoll4.setImageResource(R.drawable.tile004);
                        break;
                    case 6:
                        iv_diceRoll4.setImageResource(R.drawable.tile005);
                        break;
                }

                tv_rollNumber.setText("You rolled a " + diceRoll_01 + " and " + diceRoll_02 + " and " + diceRoll_03 + " and " + diceRoll_04);
            }
        });
    }
}
