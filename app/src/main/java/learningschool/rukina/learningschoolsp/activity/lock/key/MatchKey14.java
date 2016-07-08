package learningschool.rukina.learningschoolsp.activity.lock.key;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import learningschool.rukina.learningschoolsp.R;
import learningschool.rukina.learningschoolsp.activity.Tray.MatchTrayOne;
import learningschool.rukina.learningschoolsp.activity.bottle.MatchBottleOne;
import learningschool.rukina.learningschoolsp.activity.knife.MatchKnifeOne;
import learningschool.rukina.learningschoolsp.activity.lock.MatchLockOne;
import learningschool.rukina.learningschoolsp.activity.plate.PlateActivityOne;
import learningschool.rukina.learningschoolsp.activity.shampoo.MatchShampooOne;
import learningschool.rukina.learningschoolsp.activity.shirt.MatchShirtOne;
import learningschool.rukina.learningschoolsp.activity.soap.MatchSoapOne;
import learningschool.rukina.learningschoolsp.activity.spoon.MatchSpoonOne;
import learningschool.rukina.learningschoolsp.utils.CustomDialogClass_hi;
import learningschool.rukina.learningschoolsp.utils.DashBoard_hi;

/**
 * Created by Nandha on 30-12-2015.
 */
public class MatchKey14 extends AppCompatActivity {
    ImageView next, door, back, home;
    private MediaPlayer mp;
    TextView text1, text2, text3, text4, text5;
    TextView knife, bottle, shampoo, tray, key;
    private static int SPLASH_TIME_OUT = 1000;
    CustomDialogClass_hi cdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_key_14_hi);
        mp = new MediaPlayer();
        playTitle();

        next = (ImageView) findViewById(R.id.imageNext_pa2_v11);
        back = (ImageView) findViewById(R.id.imageback_pa2_v11);
        home = (ImageView) findViewById(R.id.imagehome_pa2_v11);
        text1 = (TextView) findViewById(R.id.txt1);
        text2 = (TextView) findViewById(R.id.txt2);
        text3 = (TextView) findViewById(R.id.txt3);
        text4 = (TextView) findViewById(R.id.txt4);
        text5 = (TextView) findViewById(R.id.txt5);
        knife = (TextView) findViewById(R.id.img_knife);
        bottle = (TextView) findViewById(R.id.img_bottle);
        shampoo = (TextView) findViewById(R.id.img_shampoo);
        tray = (TextView) findViewById(R.id.img_tray);
        key = (TextView) findViewById(R.id.img_key);

        text1.setVisibility(View.VISIBLE);
        Text1();


        bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                if (bottle.getText().toString().charAt(0) == text1.getText().toString().charAt(0)) {
                    //playPerfect();
                    text1.setText("1. bottle is used for filling water, oil, pickle, juice, jam, squash");
                    bottle.setVisibility(View.GONE);
                    text2.setVisibility(View.VISIBLE);
                    Text2();
                }
            }
        });
        shampoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                if (shampoo.getText().toString().charAt(0) == text2.getText().toString().charAt(0)) {
                    //playPerfect();
                    text2.setText("2.We use shampoo to clean and wash our hair");
                    shampoo.setVisibility(View.GONE);
                    text3.setVisibility(View.VISIBLE);
                    Text3();
                }
            }
        });
        tray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                if (tray.getText().toString().charAt(0) == text3.getText().toString().charAt(0)) {
                    //playPerfect();
                    text3.setText("3.We can use tray to   serve snacks and tea to guest at home");
                    tray.setVisibility(View.GONE);
                    text4.setVisibility(View.VISIBLE);
                    Text4();
                }
            }
        });
        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                if (key.getText().toString().charAt(0) == text4.getText().toString().charAt(0)) {
                    //playPerfect();
                    text4.setText("4.We can use tray to lock locks,  door and others");
                    key.setVisibility(View.GONE);
                    text5.setVisibility(View.VISIBLE);
                    Text5();
                }
            }
        });
        knife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                if (knife.getText().toString().charAt(0) == text5.getText().toString().charAt(0)) {
                    //playPerfect();
                    text5.setText("5.knife is used for  cutting vegetable and fruits");
                    knife.setVisibility(View.GONE);
                    playPerfect();
                    cdd = new CustomDialogClass_hi(MatchKey14.this);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();

                    try {
                        new Handler().postDelayed(new Runnable() {

				/*
                 * Showing splash screen with a timer. This will be useful when
				 * you want to show case your app logo / company
				 */

                            @Override
                            public void run() {
                                // This method will be executed once the timer is over
                                // Start your app main_hi activity
                                try {
                                    synchronized (this) {
                                        // Wait given period of time or exit on touch
                                        new Thread(new Runnable() {

                                            @Override
                                            public void run() {
                                                // TODO Auto-generated method stub
                                                try {

                                                    Thread.sleep(0);

                                                } catch (InterruptedException e) {
                                                    // TODO Auto-generated catch block
                                                    e.printStackTrace();
                                                }

                                            }
                                        }).start();
                                        wait(13000);
                                    }
                                } catch (InterruptedException ex) {
                                }

                                //finish();
                                if (mp.isPlaying()) {
                                    mp.stop();
                                }
                                Intent i = new Intent(getApplicationContext(),
                                        MatchKey15.class);
                                startActivity(i);
                                cdd.dismiss();
                            }
                        }, SPLASH_TIME_OUT);
                    } catch (OutOfMemoryError e) {
                        Toast.makeText(
                                getApplicationContext(),
                                "Your phone memory is too low, free your cache memory and start the application",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent i = new Intent(getApplicationContext(),
                        MatchKey15.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent i = new Intent(getApplicationContext(),
                        DashBoard_hi.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }

    // Initiating Menu XML file (menu_hi.xmlxml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_hi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_plate:
                // Single menu_hi item is selected do something
                // Ex: launching new activity/screen or show alert message
                Toast.makeText(getApplicationContext(), "Plate", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Plate = new Intent(getApplicationContext(),
                        PlateActivityOne.class);
                Plate.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Plate);
                return true;

            case R.id.menu_spoon:
                Toast.makeText(getApplicationContext(), "Spoon", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Spoon = new Intent(getApplicationContext(),
                        MatchSpoonOne.class);
                Spoon.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Spoon);
                return true;

            case R.id.menu_soap:
                Toast.makeText(getApplicationContext(), "Soap", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Soap = new Intent(getApplicationContext(),
                        MatchSoapOne.class);
                Soap.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Soap);
                return true;

            case R.id.menu_shirt:
                Toast.makeText(getApplicationContext(), "Shirt", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Shirt = new Intent(getApplicationContext(),
                        MatchShirtOne.class);
                Shirt.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Shirt);
                return true;

            case R.id.menu_knife:
                Toast.makeText(getApplicationContext(), "Knife", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Knife = new Intent(getApplicationContext(),
                        MatchKnifeOne.class);
                Knife.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Knife);
                return true;

            case R.id.menu_bottle:
                Toast.makeText(getApplicationContext(), "Bottle", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Bottle = new Intent(getApplicationContext(),
                        MatchBottleOne.class);
                Bottle.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Bottle);
                return true;
            case R.id.menu_shampoo:
                Toast.makeText(getApplicationContext(), "Shampoo", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Shampoo = new Intent(getApplicationContext(),
                        MatchShampooOne.class);
                Shampoo.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Shampoo);
                return true;

            case R.id.menu_tray:
                Toast.makeText(getApplicationContext(), "Tray", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Tray = new Intent(getApplicationContext(),
                        MatchTrayOne.class);
                Tray.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Tray);
                return true;

            case R.id.menu_lock:
                Toast.makeText(getApplicationContext(), "Lock", Toast.LENGTH_SHORT).show();
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent Lock = new Intent(getApplicationContext(),
                        MatchLockOne.class);
                Lock.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Lock);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void playTitle() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.s171_hi);// create's
        mp.start(); // starting mediaplayer
    }

    public void Text1() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.s171_1_hi);// create's
        mp.start(); // starting mediaplayer
    }

    public void Text2() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.s171_2_hi);// create's
        mp.start(); // starting mediaplayer
    }

    public void Text3() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.s171_3_hi);// create's
        mp.start(); // starting mediaplayer
    }

    public void Text4() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.s171_4_hi);// create's
        mp.start(); // starting mediaplayer
    }

    public void Text5() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.s171_5_hi);// create's
        mp.start(); // starting mediaplayer
    }

    public void playPerfect() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.star);// create's
        mp.start(); // starting mediaplayer
    }

    public void playWrong() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.ouch);// create's
        mp.start(); // starting mediaplayer
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.release();
    }
}
