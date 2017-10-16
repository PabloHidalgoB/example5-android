package com.retailsbs.example5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONObject;

/**
 * Created by Trabajo on 16-10-2017.
 */

public class SecondActivity extends RootActivity {

    private String mText;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        mTextView = (TextView) findViewById(R.id.txt_data);


        try{

            SharedPreferences sharedPref;


            sharedPref = PreferenceManager.getDefaultSharedPreferences(SecondActivity.this);
            mText = sharedPref.getString("JSONText", null);

            JSONObject jsonResult = new JSONObject(mText);
            mTextView.setText(jsonResult.getJSONObject("data").getString("text"));


        }catch ( Exception e){
            e.printStackTrace();
        }

    }

}
