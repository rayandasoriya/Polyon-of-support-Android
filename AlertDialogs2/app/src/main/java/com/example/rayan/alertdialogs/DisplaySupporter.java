package com.example.rayan.alertdialogs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplaySupporter extends AppCompatActivity {
    private Button buttonok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_supporter);
        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.name);
        final TextView no = (TextView) findViewById(R.id.no);
        name.setText(b.getCharSequence("name"));
        no.setText(b.getCharSequence("no"));
        final String no1= (String) b.getCharSequence("no");
       //final StringBuffer m1=new StringBuffer(no1);

        buttonok = (Button)findViewById(R.id.okbutton);
        buttonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                CharSequence text = no1;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
                Intent in = new Intent(DisplaySupporter.this, MainActivity.class);
                b.putString("m1",no1);
                in.putExtras(b);
                startActivity(in);
            }
        });
    }
}
