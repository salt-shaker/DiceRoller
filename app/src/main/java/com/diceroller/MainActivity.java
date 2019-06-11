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
    ImageView iv_diceRoll;

    int diceRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_roll = findViewById(R.id.btn_roll);
        tv_rollNumber = findViewById(R.id.tv_rollNumber);
        iv_diceRoll = findViewById(R.id.iv_diceRoll);

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diceRoll = (int) ((Math.random()*5.5)+1);
                switch(diceRoll){
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

                tv_rollNumber.setText("You rolled a " + diceRoll);
            }
        });
    }
}
