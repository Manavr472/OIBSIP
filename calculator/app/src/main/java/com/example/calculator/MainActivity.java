package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,dot,b4,b5,b6,equal,b7,b8,b9,badd,bmul,b0,bdiv,bmin,back,clr;
    private TextView ans;
    Double v1,v2;
    Boolean add = false, min = false, mul= false ,div = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        equal = (Button) findViewById(R.id.bequal);
        badd = (Button) findViewById(R.id.badd);
        bmul = (Button) findViewById(R.id.bmul);
        bdiv = (Button) findViewById(R.id.bdiv);
        bmin = (Button) findViewById(R.id.bmin);
        dot = (Button) findViewById(R.id.bdot);
        back = (Button) findViewById(R.id.back);
        clr = (Button) findViewById(R.id.clr);
        ans = findViewById(R.id.ans);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + ".");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!ans.getText().toString().equals("")) {
                    String val = ans.getText().toString();
                    if (val.length() > 0) {
                        val = val.substring(0, val.length() - 1);
                        ans.setText(val);
                    }
                }

            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
            }
        });


        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ans.getText() + "");
                add = true;
                ans.setText(null);


            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ans.getText() + "");
                mul = true;
                ans.setText(null);
            }
        });


        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ans.getText() + "");
                div = true;
                ans.setText(null);


            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v1 = Double.parseDouble(ans.getText() + "");
                min = true;
                ans.setText(null);


            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Double.parseDouble(ans.getText() + "");
                if (add == true) {
                    ans.setText(v1 + v2 + "");
                    add = false;
                } else if (min == true) {
                    ans.setText(v1 - v2 + "");
                    min = false;
                } else if (mul == true) {
                    ans.setText(v1 * v2 + "");
                    mul = false;
                } else if (div == true) {
                    ans.setText(v1 / v2 + "");
                    div = false;
                } else {
                    Toast.makeText(getApplicationContext(), "operation failed", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}