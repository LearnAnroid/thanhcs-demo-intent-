package com.example.android.duythanhcsthuchanhveintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by android on 2/20/2016.
 */
public class Childactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.childactivity);
        Button btn_backtoaactivity=(Button)findViewById(R.id.btn_backtomain);
        TextView tvkq=(TextView)findViewById(R.id.tv_hienthikq);
        //lay intent
        Intent called=getIntent();
        Bundle mybundle=called.getBundleExtra("Mypackage");
        int so1=mybundle.getInt("so1");
        int so2=mybundle.getInt("so2");
        tvkq.setText(so1+so2+"");
        btn_backtoaactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        Intent called=getIntent();
//        //lay package
//        Bundle mypackeganew=called.getBundleExtra("Mypackage");
//        //lay du lieu trong package
//        int sob=mypackeganew.getInt("so1")  ;
//        int soa=mypackeganew.getInt("so2");
//
//        tvkq.setText(soa+sob);
//        btn_backtoaactivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }//       });
    }
}
