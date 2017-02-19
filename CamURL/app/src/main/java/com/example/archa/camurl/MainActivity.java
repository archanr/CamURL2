package com.example.archa.camurl;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void launchCamera(View view) {
        Intent launchCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(launchCamera);
    }

}
