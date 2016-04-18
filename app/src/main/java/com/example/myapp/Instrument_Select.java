package com.example.myapp;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Context;

/**
 * Created by Home on 05-04-2016.
 */
public class Instrument_Select extends Activity
{
    RadioGroup rg;
    RadioButton flute,guitar,piano;
    TextView tv;
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instrument_select);

        tv=(TextView)findViewById(R.id.tv);

        rg=(RadioGroup)findViewById(R.id.radioGroup);
        flute=(RadioButton)findViewById(R.id.flute);
        guitar=(RadioButton)findViewById(R.id.guitar);
        piano=(RadioButton)findViewById(R.id.piano);

        sharedpreferences = getPreferences(Context.MODE_PRIVATE);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                SharedPreferences.Editor editor = sharedpreferences.edit();

                if(i==R.id.guitar)
                    editor.putInt(Constants.INSTRUMENT, Constants.INST_GUITER_VALUE);
                else if(i==R.id.flute)
                    editor.putInt(Constants.INSTRUMENT, Constants.INST_FLUTE_VALUE);
                else if(i==R.id.piano)
                    editor.putInt(Constants.INSTRUMENT, Constants.INST_PIANO_VALUE);

                editor.commit();


                Toast.makeText(Instrument_Select.this,"Thanks for selecting!!",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),MainActivity_Bluetooth.class);
                startActivity(intent);
            }
        });
    }
}
