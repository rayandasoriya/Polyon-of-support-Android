package com.example.rayan.alertdialogs;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;

import com.google.android.gms.common.api.GoogleApiClient;

public class Main22Activity extends AppCompatActivity {
    private Button savebutton;
    private EditText e1, e2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        final EditText e1 = (EditText) findViewById(R.id.supp_name);
        final EditText e2 = (EditText) findViewById(R.id.supp_no);
        Button savebutton = (Button) findViewById(R.id.b1);
        assert savebutton != null;
        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                Context context = getApplicationContext();
                Intent intent = new Intent(Main22Activity.this, DisplaySupporter.class);
                //Inserts a String value into the mapping of this Bundle
                b.putString("name", e1.getText().toString());
                b.putString("no", e2.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
                CharSequence text = "Supporter Added ! ";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }


}


