package com.example.android.duythanhcsthuchanhveintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int c;
    EditText edta;
    EditText edtb;
    Button btnopen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnopen = (Button) findViewById(R.id.btn_opentchild);
        edta = (EditText) findViewById(R.id.edt_nhasoa);
        edtb = (EditText) findViewById(R.id.edt_nhapsob);


        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent(MainActivity.this,Childactivity.class);
                Bundle bundle = new Bundle();
                int a=Integer.parseInt(edta.getText().toString());
                int b=Integer.parseInt(edtb.getText().toString());

                bundle.putInt("so1",a);
                bundle.putInt("so2",b);
                myintent.putExtra("Mypackage",bundle);
                startActivity(myintent);


//                Intent myintent = new Intent(MainActivity.this, Childactivity.class);
//                Bundle bundle = new Bundle();
//                int a = Integer.parseInt(edta.getText().toString());
//                int b = Integer.parseInt(edtb.getText().toString());
//
//                bundle.putInt("soa", a);
//                bundle.putInt("sob", b);
//                myintent.putExtra("Mypackage", bundle);
//                startActivity(myintent);
            }
        });
    }

}
