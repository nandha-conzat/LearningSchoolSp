package learningschool.rukina.learningschoolsp.activity.bottle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import learningschool.rukina.learningschoolsp.R;
import learningschool.rukina.learningschoolsp.activity.Tray.MatchTrayOne;
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
 * Created by Nandha on 23-12-2015.
 */
public class MatchBottleOne extends AppCompatActivity {
    private MediaPlayer mp;
    LinearLayout bottle1, bottle2, bottle3, bottle4;
    ImageView back, home, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_bottle_one_hi);
        mp = new MediaPlayer();
        back = (ImageView) findViewById(R.id.imageback_bottle_v1);
        home = (ImageView) findViewById(R.id.imagehome_bottle_v1);
        next = (ImageView) findViewById(R.id.imageNext_bottle_v1);
        playTitle();

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

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                Intent i = new Intent(getApplicationContext(),
                        MatchBottle2.class);
                startActivity(i);
            }
        });
    }

    // Initiating Menu XML file (menu_hi_hi.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_hi, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem item3  = menu.findItem(R.id.menu_bottle);
        item3.setVisible(false);
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
        mp = MediaPlayer.create(getApplicationContext(), R.raw.bottle_v1);// create's
        mp.start(); // starting mediaplayer
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.release();
    }
}
