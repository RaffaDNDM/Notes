package com.example.photodndm;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MusicActivity extends AppCompatActivity {

    private MediaPlayer mp = null;
    private Handler handler = new Handler();
    private double startTime = 0;
    private SeekBar sk = null;
    private int song_num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        String song_name_id = getResources().getString(R.string.song) + song_num;
        int song_resource = this.getResources().getIdentifier(song_name_id, "raw", this.getPackageName());
        int song_name = this.getResources().getIdentifier(song_name_id, "string", this.getPackageName());

        TextView title = findViewById(R.id.song_title);
        title.setText(song_name);
        mp = MediaPlayer.create(getApplicationContext(), song_resource);
        sk = findViewById(R.id.bar);
    }

    private Runnable updateBar = new Runnable() {

        /**
            Every 100ms, the thread update bar and control state of the execution
         */
        @Override
        public void run() {
            startTime = mp.getCurrentPosition();
            sk.setProgress((int) startTime);
            handler.postDelayed(this, 100);
        }
    };

    /**
     * Organize the  seek bar w.r.t. duration of audio
     * So I can set easily the progression of the bar UI
     * @param view play button
     */
    public void play(View view) {
        mp.start();
        sk.setMax(mp.getDuration());
        //After 100ms the handler will manage the bar progression
        handler.postDelayed(updateBar, 100);
    }

    public void pause(View view) {
        mp.pause();
    }

    public void stop(View view) {
        mp.stop();

        String song_name_id = getResources().getString(R.string.song) + song_num;
        int song_resource = this.getResources().getIdentifier(song_name_id, "raw", this.getPackageName());
        mp = MediaPlayer.create(getApplicationContext(), song_resource);
    }

    public void whichSong(View view) {

        switch(view.getId())
        {
            case R.id.next:
                song_num = (song_num+1)%4;
                break;

            case R.id.prev:
                song_num = (song_num+3)%4;
                break;
        }

        mp.stop();
        String song_name_id = getResources().getString(R.string.song) + song_num;

        int song_resource = this.getResources().getIdentifier(song_name_id, "raw", this.getPackageName());
        int song_name = this.getResources().getIdentifier(song_name_id, "string", this.getPackageName());
        mp = MediaPlayer.create(getApplicationContext(),song_resource);

        TextView title = findViewById(R.id.song_title);
        title.setText(song_name);
    }
}
