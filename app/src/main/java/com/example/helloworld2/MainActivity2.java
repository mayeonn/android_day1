package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView et;
    String count;
    int cnt=0;
    int allprice=0;
    double saleprice=0;
    double totalprice=0;
    EditText et1, et2, et3;
    TextView t1, t2, t3;
    CheckBox sale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1 = findViewById(R.id.americano);
        et2 = findViewById(R.id.latte);
        et3 = findViewById(R.id.mocha);
        t1 = findViewById(R.id.txtCount);
        t2 = findViewById(R.id.txtSale);
        t3 = findViewById(R.id.txtTotal);
        sale = findViewById(R.id.card);
    }

    public void onResult(View view) {
        //개
        count = et1.getText().toString();
        int cnt1 = Integer.parseInt(count);
        count = et2.getText().toString();
        int cnt2 = Integer.parseInt(count);
        count = et3.getText().toString();
        int cnt3 = Integer.parseInt(count);

        cnt=cnt1+cnt2+cnt3;
        t1.setText("주문개수 : " + cnt+" ");
        //Toast.makeText(this, "주문개수 : " + cnt+"", Toast.LENGTH_SHORT).show();
        //총금액개
        allprice = cnt1*1000+cnt2*1500+cnt3*1700;
        //할인금액

        if(sale.isChecked())
            saleprice=allprice*0.1;
        int salepricee=(int)saleprice;
        t2.setText("할인금액: "+salepricee+" 원");
        //Toast.makeText(this, "할인금액 : " + saleprice+"원", Toast.LENGTH_SHORT).show();
        //결제금액
        totalprice = allprice-saleprice;
        int totalpricee = (int)totalprice;
        t3.setText("결제금액: "+totalpricee+" 원");
        //Toast.makeText(this, "결제금 : " + totalprice+"원", Toast.LENGTH_SHORT).show();
    }
}