package com.retailsbs.example5;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends RootActivity {

    private String mText;

    private EditText mEditText;
    private Button  mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.etx_data_input);
        mButton = (Button) findViewById(R.id.btn_saveData);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JSONObject mJSONObject = new JSONObject();

                try {
                    mText = "{\"data\":{\"text\":\"" + mEditText.getText().toString() + "\"}}";
                    Log.d("TAG",mText);
                    mJSONObject = new JSONObject(mText);
                }catch (JSONException e){
                    e.printStackTrace();
                }

                SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("JSONText", mJSONObject.toString());
                editor.apply();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
