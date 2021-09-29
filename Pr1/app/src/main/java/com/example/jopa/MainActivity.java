package com.example.jopa;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9/*, btnturn*/;
    int[] mas = new int[9];
    int turn = 0;
    int draw=0;
    int verno = 0;
    int color = Color.argb(255,255, 69, 0);
    int color1 = Color.argb(255,124, 252, 0);
    /*int ran =2;
    final Random random = new Random();*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
     //   btnturn = findViewById(R.id.btnturn);
     //   txt = findViewById(R.id.txthod);
        for (int i = 0; i < 9; i++) {
            mas[i] = 10+i;
        }
        /*btnturn.setOnClickListener(view -> {
            btnturn.setClickable(false);
          turn =  random.nextInt(2);
            if (turn % 2 == 0)
            {
                txt.setText("Ход Х");
            }
            else
                txt.setText("Ход O");
        });*/
        btn1.setOnClickListener(view -> {
           // btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn1.setText("X");
                mas[0] = 0;
                btn1.setBackgroundColor(color);
            } else {
                btn1.setText("O");
                mas[0] = 1;
                btn1.setBackgroundColor(color1);
            }
            draw++;
            turn++;
            btn1.setClickable(false);
            Win();
        });
        btn2.setOnClickListener(view -> {
         //   btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn2.setText("X");
                mas[1] = 0;
                btn2.setBackgroundColor(color);
            } else {
                btn2.setText("O");
                mas[1] = 1;
                btn2.setBackgroundColor(color1);
            }
            draw++;
            turn++;
            btn2.setClickable(false);
            Win();
        });
        btn3.setOnClickListener(view -> {
           // btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn3.setText("X");
                mas[2] = 0;
                btn3.setBackgroundColor(color);
            } else {
                btn3.setText("O");
                mas[2] = 1;
                btn3.setBackgroundColor(color1);
            }
            draw++;
            turn++;
            btn3.setClickable(false);
            Win();
        });
        btn4.setOnClickListener(view -> {
          //  btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn4.setText("X");
                mas[3] = 0;
                btn4.setBackgroundColor(color);
            } else {
                btn4.setText("O");
                mas[3] = 1;
                btn4.setBackgroundColor(color1);
            }
            draw++;
            turn++;
            btn4.setClickable(false);
            Win();

        });
        btn5.setOnClickListener(view -> {
         //   btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn5.setText("X");
                mas[4] = 0;
                btn5.setBackgroundColor(color);
            } else {
                btn5.setText("O");
                mas[4] = 1;
                btn5.setBackgroundColor(color1);
            }
            btn5.setClickable(false);
            draw++;
            turn++;
            Win();

        });
        btn6.setOnClickListener(view -> {
          //  btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn6.setText("X");
                mas[5] = 0;
                btn6.setBackgroundColor(color);
            } else {
                btn6.setText("O");
                mas[5] = 1;
                btn6.setBackgroundColor(color1);
            }
            draw++;
            turn++;
            btn6.setClickable(false);
            Win();


        });
        btn7.setOnClickListener(view -> {
          //  btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn7.setText("X");
                mas[6] = 0;
                btn7.setBackgroundColor(color);
            } else {
                btn7.setText("O");
                mas[6] = 1;
                btn7.setBackgroundColor(color1);
            }
            draw++;
            turn++;
            btn7.setClickable(false);
            Win();

        });
        btn8.setOnClickListener(view -> {
           // btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn8.setText("X");
                mas[7] = 0;
                btn8.setBackgroundColor(color);
            } else {
                btn8.setText("O");
                mas[7] = 1;
                btn8.setBackgroundColor(color1);
            }
            draw++;
            turn++;
            btn8.setClickable(false);
            Win();

        });
        btn9.setOnClickListener(view -> {
           // btnturn.setClickable(false);
            if (turn % 2 == 0) {
                btn9.setText("X");
                mas[8] = 0;
                btn9.setBackgroundColor(color);
            } else {
                btn9.setText("O");
                mas[8] = 1;
                btn9.setBackgroundColor(color1);
            }
            draw++;
            turn++;
            btn9.setClickable(false);
            Win();


        });

    }

    public void Win() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        if (turn % 2 == 1) {
            //if(btn1.getText().toString()==btn2.getText().toString() && btn2.getText().toString()==btn3.getText().toString())
            if ((mas[0] == mas[1] && mas[1] == mas[2]) || (mas[0] == mas[3] && mas[3] == mas[6]) || (mas[0] == mas[4] && mas[4] == mas[8]) ||
                    (mas[1] == mas[4] && mas[4] == mas[7]) || (mas[2] == mas[5] && mas[5] == mas[8]) || (mas[2] == mas[4] && mas[4] == mas[6]) ||
                    (mas[3] == mas[4] && mas[4] == mas[5]) || (mas[6] == mas[7] && mas[7] == mas[8])) {
                verno =1;
                btn1.setClickable(false);
                btn2.setClickable(false);
                btn3.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(false);
                btn8.setClickable(false);
                btn9.setClickable(false);
                intent.putExtra("Value", "Выиграли крестики!");
                startActivity(intent);
            }
        }
        if (turn % 2 == 0) {
            if ((mas[0] == mas[1] && mas[1] == mas[2]) || (mas[0] == mas[3] && mas[3] == mas[6]) || (mas[0] == mas[4] && mas[4] == mas[8]) ||
                    (mas[1] == mas[4] && mas[4] == mas[7]) || (mas[2] == mas[5] && mas[5] == mas[8]) || (mas[2] == mas[4] && mas[4] == mas[6]) ||
                    (mas[3] == mas[4] && mas[4] == mas[5]) || (mas[6] == mas[7] && mas[7] == mas[8])) {
                btn1.setClickable(false);
                btn2.setClickable(false);
                btn3.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(false);
                btn8.setClickable(false);
                btn9.setClickable(false);
                intent.putExtra("Value", "Выиграли нолики!");
                startActivity(intent);
            }
        }
        //(mas[0] <2 && mas[1] <2 && mas[2] <2 && mas[3] <2 && mas[4] <2 && mas[5] <2 && mas[6] <2 && mas[7] <2 && mas[8] <2
       else if(draw==9 && verno!=1){
            intent.putExtra("Value", "Ничья!");
            startActivity(intent);
        }

    }
}