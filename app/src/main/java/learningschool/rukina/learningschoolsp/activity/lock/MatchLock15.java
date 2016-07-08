package learningschool.rukina.learningschoolsp.activity.lock;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
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
public class MatchLock15 extends AppCompatActivity {
    TextView option_a1, option_a2, option_a3, option_a4, option_a5,
            option_b1, option_b2, option_b3, option_b4, option_b5, option_b6, option_b7,
            option_c1, option_c2, option_c3, option_c4, option_c5,
            choice_d1, choice_d2, choice_d3, choice_d4, choice_d5, choice_d6,
            choice_e1, choice_e2, choice_e3, choice_e4, choice_e5, choice_e6;

    public CharSequence dragData;
    ImageView next, back, home;
    private MediaPlayer mp;
    private static int SPLASH_TIME_OUT = 1000;
    CustomDialogClass_hi cdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_lock_15_hi);
        mp = new MediaPlayer();
        next = (ImageView) findViewById(R.id.imageNext_pa2_v16);
        back = (ImageView) findViewById(R.id.imageback_pa2_v16);
        home = (ImageView) findViewById(R.id.imagehome_pa2_v16);

        //views to drag
        option_a1 = (TextView) findViewById(R.id.option_a1);
        option_a2 = (TextView) findViewById(R.id.option_a2);
        option_a3 = (TextView) findViewById(R.id.option_a3);
        option_a4 = (TextView) findViewById(R.id.option_a4);
        option_b2 = (TextView) findViewById(R.id.option_b2);
        option_b3 = (TextView) findViewById(R.id.option_b3);
        option_b4 = (TextView) findViewById(R.id.option_b4);
        option_b5 = (TextView) findViewById(R.id.option_b5);
        option_b6 = (TextView) findViewById(R.id.option_b6);
        option_b7 = (TextView) findViewById(R.id.option_b7);
        option_c1 = (TextView) findViewById(R.id.option_c1);
        option_c2 = (TextView) findViewById(R.id.option_c2);
        option_c3 = (TextView) findViewById(R.id.option_c3);
        option_c4 = (TextView) findViewById(R.id.option_c4);

        //views to drop onto
        choice_d1 = (TextView) findViewById(R.id.option_d1);
        choice_d2 = (TextView) findViewById(R.id.option_d2);
        choice_d3 = (TextView) findViewById(R.id.option_d3);
        choice_d4 = (TextView) findViewById(R.id.option_d4);
        choice_d5 = (TextView) findViewById(R.id.option_d5);
        choice_d6 = (TextView) findViewById(R.id.option_d6);
        choice_e1 = (TextView) findViewById(R.id.option_e1);
        choice_e2 = (TextView) findViewById(R.id.option_e2);
        choice_e3 = (TextView) findViewById(R.id.option_e3);
        choice_e4 = (TextView) findViewById(R.id.option_e4);
        choice_e5 = (TextView) findViewById(R.id.option_e5);
        choice_e6 = (TextView) findViewById(R.id.option_e6);

        //set touch listeners
        option_a1.setOnDragListener(new ChoiceDragListener());
        option_a2.setOnDragListener(new ChoiceDragListener());
        option_a3.setOnDragListener(new ChoiceDragListener());
        option_a4.setOnDragListener(new ChoiceDragListener());
        option_b2.setOnDragListener(new ChoiceDragListener());
        option_b3.setOnDragListener(new ChoiceDragListener());
        option_b4.setOnDragListener(new ChoiceDragListener());
        option_b5.setOnDragListener(new ChoiceDragListener());
        option_b6.setOnDragListener(new ChoiceDragListener());
        option_b7.setOnDragListener(new ChoiceDragListener());
        option_c1.setOnDragListener(new ChoiceDragListener());
        option_c2.setOnDragListener(new ChoiceDragListener());
        option_c3.setOnDragListener(new ChoiceDragListener());
        option_c4.setOnDragListener(new ChoiceDragListener());

        //set drag listeners
        choice_d1.setOnTouchListener(new ChoiceTouchListener());
        choice_d2.setOnTouchListener(new ChoiceTouchListener());
        choice_d3.setOnTouchListener(new ChoiceTouchListener());
        choice_d4.setOnTouchListener(new ChoiceTouchListener());
        choice_d5.setOnTouchListener(new ChoiceTouchListener());
        choice_d6.setOnTouchListener(new ChoiceTouchListener());
        choice_e1.setOnTouchListener(new ChoiceTouchListener());
        choice_e2.setOnTouchListener(new ChoiceTouchListener());
        choice_e3.setOnTouchListener(new ChoiceTouchListener());
        choice_e4.setOnTouchListener(new ChoiceTouchListener());
        choice_e5.setOnTouchListener(new ChoiceTouchListener());
        choice_e6.setOnTouchListener(new ChoiceTouchListener());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),
                        MatchLock16.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),
                        DashBoard_hi.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }

    /**
     * ChoiceTouchListener will handle touch events on draggable views
     */
    private final class ChoiceTouchListener implements View.OnTouchListener {
        @SuppressLint("NewApi")
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            /*
             * Drag details: we only need default behavior
             * - clip data could be set to pass data as part of drag
             * - shadow can be tailored
             */
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                //start dragging the item touched
                view.startDrag(data, shadowBuilder, view, 0);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * DragListener will handle dragged views being dropped on the drop area
     * - only the drop action will have processing added to it as we are not
     * - amending the default behavior for other parts of the drag process
     */
    @SuppressLint("NewApi")
    private class ChoiceDragListener implements View.OnDragListener {

        String userEntered = "";

        @Override
        public boolean onDrag(View v, DragEvent event) {
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    //no action necessary
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    //no action necessary
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    //no action necessary
                    break;
                case DragEvent.ACTION_DROP:

                    //handle the dragged view being dropped over a drop view
                    View view = (View) event.getLocalState();
                    //view dragged item is being dropped on
                    TextView dropTarget = (TextView) v;
                    //view being dragged and dropped
                    TextView dropped = (TextView) view;
                    //checking whether first character of dropTarget equals first character of dropped
                    if (dropTarget.getText().toString().charAt(0) == dropped.getText().toString().charAt(0)) {
                        //stop displaying the view where it was before it was dragged
                        //view.setVisibility(View.INVISIBLE);
                        //update the text in the target view to reflect the data being dropped
                        //dropTarget.setText(dropTarget.getText().toString() + dropped.getText().toString());
                        dropTarget.setText(dropTarget.getText().toString() + ".");


                        String a = option_a1.getText().toString().trim();
                        String b = option_a2.getText().toString().trim();
                        String c = option_a3.getText().toString().trim();
                        String d = option_a4.getText().toString().trim();
                        String a1 = option_b2.getText().toString().trim();
                        String b1 = option_b3.getText().toString().trim();
                        String c1 = option_b4.getText().toString().trim();
                        String d1 = option_b5.getText().toString().trim();
                        String e1 = option_b6.getText().toString().trim();
                        String f1 = option_b7.getText().toString().trim();
                        String a2 = option_c1.getText().toString().trim();
                        String b2 = option_c2.getText().toString().trim();
                        String c2 = option_c3.getText().toString().trim();
                        String d2 = option_c4.getText().toString().trim();

                        userEntered = "" + a + b + c + d + a1 + b1 + c1 + d1 + e1 + f1 + a2 + b2 + c2 + d2;
                        if (userEntered.equals("l.oc.k.b.ot.t.le.t.r.a.y")) {
                            playPerfect();
                            cdd = new CustomDialogClass_hi(MatchLock15.this);
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
                                                wait(1000);
                                            }
                                        } catch (InterruptedException ex) {
                                        }

                                        //finish();
                                        if (mp.isPlaying()) {
                                            mp.stop();
                                        }
                                        Intent i = new Intent(getApplicationContext(),
                                                MatchLock16.class);
                                        startActivity(i);
                                        cdd.dismiss();
                                    }
                                }, SPLASH_TIME_OUT);
                            } catch (OutOfMemoryError g) {
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Your phone memory is too low, free your cache memory and start the application",
                                        Toast.LENGTH_LONG).show();
                            }

                        }

                        dropTarget.setTextColor(Color.BLACK);
                        //make it bold to highlight the fact that an item has been dropped
                        dropTarget.setTypeface(Typeface.DEFAULT_BOLD);
                        //if an item has already been dropped here, there will be a tag


                        Object tag = dropTarget.getTag();
                        //if there is already an item here, set it back visible in its original place
                        if (tag != null) {
                            //the tag is the view id already dropped here
                            int existingID = (Integer) tag;
                            //set the original view visible again
                            findViewById(existingID).setVisibility(View.VISIBLE);
                        }
                        //set the tag in the target view being dropped on - to the ID of the view being dropped
                        dropTarget.setTag(dropped.getId());
                        //remove setOnDragListener by setting OnDragListener to null, so that no further drag & dropping on this TextView can be done
                        dropTarget.setOnDragListener(null);
                    } else
                        playWrong();
                    //displays message if first character of dropTarget is not equal to first character of dropped
                    //Toast.makeText(MainActivity_hi.this, dropTarget.getText().toString() + "is not " + dropped.getText().toString(), Toast.LENGTH_LONG).show();
                    //Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_LONG).show();
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    //no action necessary
                    break;
                default:
                    break;
            }
            return true;
        }
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
