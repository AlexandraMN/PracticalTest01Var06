package ro.pub.cs.systems.eim.practicaltest01var06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PracticalTest01Var06SecondaryActivity extends AppCompatActivity {

    TextView score;
    Button okBtn;
    String valueStar;
    String valueOne;
    String valueZero;
    int checked;
    int gained = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var06_secondary);

        score.findViewById(R.id.score);
        okBtn.findViewById(R.id.ok_btn);

        Intent intent = getIntent();
        int numberStars;

        if (intent != null) {
            if (intent.getExtras().containsKey("valueStar")) {
                valueStar = intent.getStringExtra("valueStar");
            }
            if (intent.getExtras().containsKey("valueOne")) {
                valueOne = intent.getStringExtra("valueOne");
            }
            if (intent.getExtras().containsKey("valueZero")) {
                valueZero = intent.getStringExtra("valueZero");
            }

            if (intent.getExtras().containsKey("checked")) {
                checked = intent.getIntExtra("checked", 0);
            }

            if (checked == 0) {
                gained = 100;
            }

            if (checked == 1) {
                gained = 50;
            }

            if (checked == 2) {
                gained = 10;
            }

            if (valueStar.equals("*")) {
                if (valueOne.equals("*")) {
                    if (valueZero.equals("*")) {
                        score.setText("Gained " + String.valueOf(gained));
                    }
                } else {
                    if (valueZero.equals("*")) {
                        score.setText("Gained " + String.valueOf(gained));
                    } else {
                        if (valueZero.equals(valueOne)) {
                            score.setText("Gained " + String.valueOf(gained));
                        }
                    }

                }
            } else {
                if (valueOne.equals("*")) {
                    if (valueZero.equals("*")) {
                        score.setText("Gained " + String.valueOf(gained));
                    }
                } else {
                    if (valueZero.equals("*")) {
                        if (valueStar.equals(valueOne)) {
                            score.setText("Gained " + String.valueOf(gained));
                        }
                    }
                }

            }

        }
    }
}