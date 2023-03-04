package com.example.rapidquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class WonActivity extends Activity {

    EditText res;
    LinearLayout restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        res = (EditText) findViewById(R.id.result);
        restart = (LinearLayout) findViewById(R.id.btn_tryAgain);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        String score = b.getString("result");

        res.setText("Your score is"+score);

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DashBoard.class);
                startActivity(i);
            }

        });
    }
}
