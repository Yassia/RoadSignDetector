package com.example.jjurga.roadsigndetector;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void UruchomKamere(View v) {
        // Perform action on click

        //Intent intent = new Intent(this,FullscreenActivityDetectSignRoad.class );
        Intent intent = new Intent(this, camera.class);
               //EditText editText = (EditText) findViewById(R.id.edit_message);
                //String message = editText.getText().toString();
                //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}
