package com.noela.basicpharsesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void buttonTapped (View view) {

        int id = view.getId(); // view.getId() give us a id created by android and it's integer

        String ourId = ""; // we create string to our id (whitch is string)

        ourId = view.getResources().getResourceEntryName(id); //this give is a object whitch we want to set our id.


        int resoruceId = getResources().getIdentifier(ourId, "raw","com.noela.basicpharsesapp");// this integer  we create for use to refer to one of the sounds files


        MediaPlayer mediaPlayer = MediaPlayer.create(this, resoruceId);

        mediaPlayer.start();

        Log.i("button tapped",ourId);
    }
}
