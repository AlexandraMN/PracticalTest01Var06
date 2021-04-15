package ro.pub.cs.systems.eim.practicaltest01var06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class PracticalTest01Var06MainActivity extends AppCompatActivity {

    EditText mStarEt;
    EditText mOneEt;
    EditText mZeroEt;
    CheckBox mStarCb;
    CheckBox mOneCb;
    CheckBox mZeroCb;
    Button mPlayBtn;

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

    }
}