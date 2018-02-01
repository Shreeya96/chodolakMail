package com.example.chodolakmail;

import android.app.Activity;
import android.app.Fragment;
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
//    TextView Date;
  TextView From;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        header = (TextView)findViewById(R.id.header);
        body = (TextView)findViewById(R.id.body);
//        Date = (TextView) findViewById(R.id.Date);
    From = (TextView) findViewById(R.id.authorid);

        body.setMovementMethod(new ScrollingMovementMethod());
        String s = "";
        String b = "";
//        String date = "";
        String from = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
             b = extras.getString("body");
             s = extras.getString("subject");
//           date = extras.getString("date");
           from = extras.getString("from");
        }

        body.setText(b);
        header.setText(s);
//        Date.setText(date);
        From.setText(from);
    }
}
