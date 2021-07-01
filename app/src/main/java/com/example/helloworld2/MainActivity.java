package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //선
    TextView textView;
    ///int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld_layout);

        textView = findViewById(R.id.count);    //이 ID로 view를 가져와서 변수에 셋팅

    }

    public void onToastClick(View view) {
        //메세지박스 띄우기
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void onCountClick(View view) {
        //

        int count = Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(count+"");

    }
}