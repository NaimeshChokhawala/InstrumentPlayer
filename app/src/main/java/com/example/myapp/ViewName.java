package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Home on 05-04-2016.
 */
public class ViewName extends Activity
{
    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewname);
        /*tv=(TextView)findViewById(R.id.tv);*/
        Intent ii=getIntent();
        String s=ii.getStringExtra("Instrument");
       /* tv.setText(s);*/
    }

}

