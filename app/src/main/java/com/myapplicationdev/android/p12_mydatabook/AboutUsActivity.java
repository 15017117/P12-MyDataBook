package com.myapplicationdev.android.p12_mydatabook;

import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class AboutUsActivity extends AppCompatActivity {
    ActionBar ab;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        iv = (ImageView) findViewById(R.id.iv);
        iv.setImageResource(R.drawable.ajax_loader);
        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        String imageURL = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.Builder builder = new Picasso.Builder(this);
        builder.listener(new Picasso.Listener() {
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                iv.setImageResource(R.drawable.error);
            }
        });
        builder.build().load(imageURL).into(iv);
    }
    public boolean onOptionalItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
