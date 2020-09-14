package com.internshala.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void opengit(View view) {
        Uri uri = Uri.parse("https://github.com/manish-2307"); // missing 'http://' will cause crashed
        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent1);
    }

    public void gotoinsta(View view) {
        Uri uri1 = Uri.parse("https://www.instagram.com/manishperiwal_47/"); // missing 'http://' will cause crashed
        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
        startActivity(intent1);
    }

    public void gotolink(View view) {
        Uri uri2 = Uri.parse("https://www.linkedin.com/in/manish-periwal-25754a173/"); // missing 'http://' will cause crashed
        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
        startActivity(intent2);
    }

    public void gotoface(View view) {
        Uri uri3 = Uri.parse("https://www.facebook.com/profile.php?id=100005146909396"); // missing 'http://' will cause crashed
        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
        startActivity(intent3);
    }
}