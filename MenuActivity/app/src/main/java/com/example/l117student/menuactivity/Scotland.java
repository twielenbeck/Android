package com.example.l117student.menuactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class Scotland extends AppCompatActivity {
    protected int[] images = {R.drawable.scotland1, R.drawable.scotland2, R.drawable.scotland3};
    protected ImageView theImage;
    protected int picNum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scotland);
        theImage = findViewById(R.id.scotland_picture);
    }

    public void leftClick(View v) {
        picNum--;
        if (picNum < 0) {
            picNum = images.length - 1;
        }
        theImage.setImageResource(images[picNum]);
    }
    public void rightClick(View v) {
        picNum++;
        if (picNum >= images.length) {
            picNum = 0;
        }
        theImage.setImageResource(images[picNum]);
    }
    public void backToMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}



