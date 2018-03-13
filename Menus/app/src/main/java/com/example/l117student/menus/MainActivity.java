package com.example.l117student.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    protected int[] images = {R.drawable.game1, R.drawable.game2, R.drawable.game3};
    protected ImageView theImage;
    protected int picNum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theImage = findViewById(R.id.picture);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle item selection
        switch (item.getItemId()) {
            case R.id.bye:
                return true;
            case R.id.leftclicked:
                return true;
            case R.id.rightclicked:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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

    public void bye(View v) {
        Intent intent = new Intent(this, Scotland.class);
        startActivity(intent);
    }
}
