package com.example.jopa;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    int[] mas = new int[9];
    int turn = 0;
    int draw = 0;
    int verno = 0;
    int color = Color.argb(255, 255, 69, 0);
    int color1 = Color.argb(255, 124, 252, 0);

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
        for (int i = 0; i < 9; i++) {
            mas[i] = 10 + i;
        }
        btn1.setOnClickListener(view -> {
            TurnChoose(btn1, 0);
        });
        btn2.setOnClickListener(view -> {
            TurnChoose(btn2, 1);
        });
        btn3.setOnClickListener(view -> {
            TurnChoose(btn3, 2);
        });
        btn4.setOnClickListener(view -> {
            TurnChoose(btn4, 3);
        });
        btn5.setOnClickListener(view -> {
            TurnChoose(btn5, 4);
        });
        btn6.setOnClickListener(view -> {
            TurnChoose(btn6, 5);
        });
        btn7.setOnClickListener(view -> {
            TurnChoose(btn7, 6);
        });
        btn8.setOnClickListener(view -> {
            TurnChoose(btn8, 7);
        });
        btn9.setOnClickListener(view -> {
            TurnChoose(btn9, 8);
        });
    }

    private void TurnChoose(Button btn, int index) {
        if (turn % 2 == 0) {
            btn.setText("X");
            mas[index] = 0;
            btn.setBackgroundColor(color);
        } else {
            btn.setText("O");
            mas[index] = 1;
            btn.setBackgroundColor(color1);
        }
        draw++;
        turn++;
        btn.setClickable(false);
        Win();
    }

    public void Win() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            if ((mas[0] == mas[1] && mas[1] == mas[2]) || (mas[0] == mas[3] && mas[3] == mas[6]) || (mas[0] == mas[4] && mas[4] == mas[8]) ||
                    (mas[1] == mas[4] && mas[4] == mas[7]) || (mas[2] == mas[5] && mas[5] == mas[8]) || (mas[2] == mas[4] && mas[4] == mas[6]) ||
                    (mas[3] == mas[4] && mas[4] == mas[5]) || (mas[6] == mas[7] && mas[7] == mas[8])) {
                Dis();
                if(turn % 2 == 1) {
                    verno = 1;
                    intent.putExtra("Value", "Выиграли крестики!");
                    startActivity(intent);
                }
                if (turn % 2 == 0){
                    intent.putExtra("Value", "Выиграли нолики!");
                    startActivity(intent);
                }
            }
        else if (draw == 9 && verno != 1) {
            intent.putExtra("Value", "Ничья!");
            startActivity(intent);
        }
    }
    private  void Dis()
    {
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
        btn5.setClickable(false);
        btn6.setClickable(false);
        btn7.setClickable(false);
        btn8.setClickable(false);
        btn9.setClickable(false);
    }
}