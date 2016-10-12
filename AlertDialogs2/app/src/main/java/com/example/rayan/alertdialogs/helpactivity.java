package com.example.rayan.alertdialogs;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;
import android.text.Html;
import android.text.method.LinkMovementMethod;
public class helpactivity extends Activity {
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpactivity);
        tv1 = (TextView)findViewById(R.id.safety);
        tv2 = (TextView)findViewById(R.id.email1);
        tv3 = (TextView)findViewById(R.id.email2);
        tv1.setMovementMethod(new ScrollingMovementMethod());
        tv2.setText(Html.fromHtml("<a href=\"mailto:dasoriyarayan@gmail.com\">dasoriyarayan@gmail.com</a>"));
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        tv2.setMovementMethod(new ScrollingMovementMethod());
        tv3.setText(Html.fromHtml("<a href=\"mailto:rishabh.jamar2000@gmail.com\">rishbah.jamar2000@gmail.com</a>"));
        tv3.setMovementMethod(LinkMovementMethod.getInstance());
        tv3.setMovementMethod(new ScrollingMovementMethod());
    }
}
