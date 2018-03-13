package com.example.l117student.imageview;

import android.content.Intent;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    protected int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    protected ImageView theImage;
    protected int picNum = 0;
    protected double xaxis = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theImage = (ImageView)findViewById(R.id.picture);
    }

    public void leftClicked(View v) {
        picNum--;
        if (picNum < 0) {
            picNum = images.length - 1;
        }
        theImage.setImageResource(images[picNum]);
    }
    public void rightClicked(View v) {
        picNum++;
        if (picNum >= images.length) {
            picNum = 0;
        }
        theImage.setImageResource(images[picNum]);
    }

    private void leftSwipe() {
        picNum--;
        if (picNum < 0) {
            picNum = images.length - 1;
        }
        theImage.setImageResource(images[picNum]);
    }

    private void rightSwipe() {
        picNum++;
        if (picNum >= images.length) {
            picNum = 0;
        }
        theImage.setImageResource(images[picNum]);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        int action = MotionEventCompat.getActionMasked(event);
        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                xaxis = event.getRawX();
                return true;
            case (MotionEvent.ACTION_UP) :
                if (xaxis > event.getRawX()) leftSwipe();
                else rightSwipe();
                return true;
            default :
                return super.onTouchEvent(event);
        }
    }
    public void bye(View v) {
        Intent intent = new Intent(this, MoreFun.class);
        startActivity(intent);
    }
}
