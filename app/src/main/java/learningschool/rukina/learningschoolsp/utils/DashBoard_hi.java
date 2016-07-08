package learningschool.rukina.learningschoolsp.utils;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
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

/**
 * Created by Nandha on 17-12-2015.
 */
public class DashBoard_hi extends Activity {
    ImageView plate, spoon, soap, shirt, knife, bottle, shampoo, Tray, lock;
    private MediaPlayer mp;
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_board_hi);
        plate = (ImageView) findViewById(R.id.dash_plate);
        spoon = (ImageView) findViewById(R.id.dash_spoon);
        soap = (ImageView) findViewById(R.id.dash_soap);
        shirt = (ImageView) findViewById(R.id.dash_shirt);
        knife = (ImageView) findViewById(R.id.dash_knife);
        bottle = (ImageView) findViewById(R.id.dash_bottle);
        shampoo = (ImageView) findViewById(R.id.dash_shampoo);
        Tray = (ImageView) findViewById(R.id.dash_plate2);
        lock = (ImageView) findViewById(R.id.dash_lock);
        mp = new MediaPlayer();

        plate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        PlateActivityOne.class);
                startActivity(i);
            }
        });

        spoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        MatchSpoonOne.class);
                startActivity(i);
            }
        });

        soap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        MatchSoapOne.class);
                startActivity(i);
            }
        });

        shirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        MatchShirtOne.class);
                startActivity(i);
            }
        });

        knife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        MatchKnifeOne.class);
                startActivity(i);
            }
        });

        bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        MatchBottleOne.class);
                startActivity(i);
            }
        });

        shampoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        MatchShampooOne.class);
                startActivity(i);
            }
        });

        Tray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        MatchTrayOne.class);
                startActivity(i);
            }
        });

        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                playYeah();

                Intent i = new Intent(getApplicationContext(),
                        MatchLockOne.class);
                startActivity(i);
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
                Intent Plate = new Intent(DashBoard_hi.this,
                        PlateActivityOne.class);
                startActivity(Plate);
                return true;

            case R.id.menu_spoon:
                Toast.makeText(getApplicationContext(), "Spoon", Toast.LENGTH_SHORT).show();
                Intent Spoon = new Intent(DashBoard_hi.this,
                        MatchSpoonOne.class);
                startActivity(Spoon);
                return true;

            case R.id.menu_soap:
                Toast.makeText(getApplicationContext(), "Soap", Toast.LENGTH_SHORT).show();
                Intent Soap = new Intent(DashBoard_hi.this,
                        MatchSoapOne.class);
                startActivity(Soap);
                return true;

            case R.id.menu_shirt:
                Toast.makeText(getApplicationContext(), "Shirt", Toast.LENGTH_SHORT).show();
                Intent Shirt = new Intent(DashBoard_hi.this,
                        MatchShirtOne.class);
                startActivity(Shirt);
                return true;

            case R.id.menu_knife:
                Toast.makeText(getApplicationContext(), "Knife", Toast.LENGTH_SHORT).show();
                Intent Knife = new Intent(DashBoard_hi.this,
                        MatchKnifeOne.class);
                startActivity(Knife);
                return true;

            case R.id.menu_bottle:
                Toast.makeText(getApplicationContext(), "Bottle", Toast.LENGTH_SHORT).show();
                Intent Bottle = new Intent(DashBoard_hi.this,
                        MatchBottleOne.class);
                startActivity(Bottle);
                return true;
            case R.id.menu_shampoo:
                Toast.makeText(getApplicationContext(), "Shampoo", Toast.LENGTH_SHORT).show();
                Intent Shampoo = new Intent(DashBoard_hi.this,
                        MatchShampooOne.class);
                startActivity(Shampoo);
                return true;

            case R.id.menu_tray:
                Toast.makeText(getApplicationContext(), "Tray", Toast.LENGTH_SHORT).show();
                Intent Tray = new Intent(DashBoard_hi.this,
                        MatchTrayOne.class);
                startActivity(Tray);
                return true;

            case R.id.menu_lock:
                Toast.makeText(getApplicationContext(), "Lock", Toast.LENGTH_SHORT).show();
                Intent Lock = new Intent(DashBoard_hi.this,
                        MatchLockOne.class);
                startActivity(Lock);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

//    @Override
//    public void onBackPressed() {
//        if (doubleBackToExitPressedOnce) {
//            super.onBackPressed();
//            return;
//        }
//
//        this.doubleBackToExitPressedOnce = true;
//        Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();
//
//        new Handler().postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//                doubleBackToExitPressedOnce = false;
//            }
//        }, 2000);
//    }

    public void playYeah() {

        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), R.raw.yeah);// create's
        mp.start(); // starting mediaplayer
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.release();
    }

}
