package com.dipl.helloreverse;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {

    public int hardcodedInt = 2013;
    protected double hardcodedDouble = 7.29;
    private String hardcodedString = "reverz";

    Button button;
    ImageView image;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void addListenerOnButton() {
        editText = (EditText) findViewById(R.id.editText);
        image = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (hardcodedString.equals(editText.getText().toString())) {
                    image.setImageResource(R.drawable.android_firewall);
                }
            }

        });

    }

}
