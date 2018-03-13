package com.example.l117student.actionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle presses on the action bar items
        switch (item.getItemId()) {

            case R.id.activityTwo:
                activityTwo();
                return true;
            case R.id.activityThree:
                activityThree();
                return true;
            case R.id.activityFour:
                activityFour();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void activityTwo() {
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }
    public void activityThree() {
        Intent intent = new Intent(this, ActivityThree.class);
        startActivity(intent);
    }
    public void activityFour() {
        Intent intent = new Intent(this, ActivityFour.class);
        startActivity(intent);
    }
}
