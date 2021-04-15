package ro.pub.cs.systems.eim.practicaltest01var06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class PracticalTest01Var06MainActivity extends AppCompatActivity {

    EditText mStarEt;
    EditText mOneEt;
    EditText mZeroEt;
    CheckBox mStarCb;
    CheckBox mOneCb;
    CheckBox mZeroCb;
    Button mPlayBtn;
    Random random = new Random();
    Intent receive;
    final String[] choices = {"1", "2", "3", "*"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var06_main);

        mStarEt = findViewById(R.id.star);
        mOneEt = findViewById(R.id.one);
        mZeroEt = findViewById(R.id.zero);
        mStarCb = findViewById(R.id.checkbox_star);
        mOneCb = findViewById(R.id.checkbox_one);
        mZeroCb = findViewById(R.id.checkbox_zero);
        mPlayBtn = findViewById(R.id.play_button);

        mStarEt.setText("*");
        mZeroEt.setText("0");
        mOneEt.setText("1");

        mPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOfCheckedCb = 0;
                if (!mStarCb.isChecked()) {
                    mStarEt.setText(choices[random.nextInt(choices.length)]);
                } else {
                    numberOfCheckedCb += 1;
                }

                if (!mOneCb.isChecked()) {
                    mOneEt.setText(choices[random.nextInt(choices.length)]);
                } else {
                    numberOfCheckedCb += 1;
                }

                if (!mZeroCb.isChecked()) {
                    mZeroEt.setText(choices[random.nextInt(choices.length)]);
                } else {
                    numberOfCheckedCb += 1;
                }

                Log.d("Numbers", mStarEt.getText().toString() + "  "
                        + mZeroEt.getText().toString() + "  " + mOneEt.getText().toString());

                Intent intent = new Intent(getApplicationContext(), PracticalTest01Var06SecondaryActivity.class);
                intent.putExtra("valueStar", mStarEt.getText().toString());
                intent.putExtra("valueZero", mZeroEt.getText().toString());
                intent.putExtra("valueOne", mStarEt.getText().toString());
                intent.putExtra("checked", numberOfCheckedCb);

                startActivity(intent);
            }

        });



    }

    @Override
    protected void onResume() {

//        Intent myint = getIntent();
//
//        String score;
////
//        if (myint != null) {
////            if (myint.getExtras().containsKey("final")) {
////                score = myint.getStringExtra("final");
////                Toast.makeText(this, "Score is " + score, Toast.LENGTH_LONG);
////            }
//        }
        super.onResume();
    }
}