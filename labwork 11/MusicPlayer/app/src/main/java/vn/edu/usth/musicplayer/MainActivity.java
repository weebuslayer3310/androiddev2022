package vn.edu.usth.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySong = MediaPlayer.create(MainActivity.this, R.raw.plasticlove);
    }
    public void play(View view){
        mySong.start();
        Toast.makeText(MainActivity.this, "song start", Toast.LENGTH_SHORT).show();
    }
    public void stop(View view){
        mySong.stop();
        Toast.makeText(MainActivity.this, "song stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
    }
}