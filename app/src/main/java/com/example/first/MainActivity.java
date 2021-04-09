package com.example.first;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";
    TextView show;
    EditText inp;
    int a = 3;
    int b = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.show);
        show.setText("Hello abcd");

        System.out.println("out from activity");

        inp = findViewById(R.id.inp);
        String str = inp.getText().toString();
        //inp.setText("Your Name AAA");
        Log.i("abc","message from Logi str=" + str);
        Log.i(TAG, "onCreate: ");

//        Button btn = findViewById(R.id.btn);
        //btn.setOnClickListener(this);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "onClick: 22222222222222");
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "onClick: 11111111111111111111");

        //获取用户输入
        String str = inp.getText().toString();
        //显示提示内容
        TextView show = findViewById(R.id.show);
        show.setText("Hi ~ " + str);

    }
    
    public void myclick(View v){
        Log.i(TAG, "myclick: 33333333333333");
    }

}