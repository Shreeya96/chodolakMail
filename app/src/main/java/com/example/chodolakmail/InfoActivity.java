package com.example.chodolakmail;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by User on 4/29/2015.
 */
public class InfoActivity extends Activity {

    TextView header;
    TextView body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        header = (TextView)findViewById(R.id.header);
        body = (TextView)findViewById(R.id.body);
        body.setMovementMethod(new ScrollingMovementMethod());
        String s = "";
        String b = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
             b = extras.getString("body");
             s = extras.getString("subject");
        }

        body.setText(b);
        header.setText(s);
    }
}
