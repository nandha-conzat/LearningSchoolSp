package learningschool.rukina.learningschoolsp.activity.plate;

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
import learningschool.rukina.learningschoolsp.activity.lock.key.MatchKey1;
import learningschool.rukina.learningschoolsp.activity.plate.PlateActivityOne;
import learningschool.rukina.learningschoolsp.activity.shampoo.MatchShampooOne;
import learningschool.rukina.learningschoolsp.activity.shirt.MatchShirtOne;
import learningschool.rukina.learningschoolsp.activity.soap.MatchSoapOne;
import learningschool.rukina.learningschoolsp.activity.spoon.MatchSpoonOne;
import learningschool.rukina.learningschoolsp.utils.CustomDialogClass_hi;
import learningschool.rukina.learningschoolsp.utils.DashBoard_hi;


/**
 * Created by Nandha on 25-12-2015.
 */
public class WordPlateGame extends AppCompatActivity {
    private TextView option1, option2, option3, option4, option5, option6, option7, choice1, choice2, choice3, choice4, choice5;
    public CharSequence dragData;
    ImageView next, back, home;
    private MediaPlayer mp;
    private static int SPLASH_TIME_OUT = 1000;
    CustomDialogClass_hi cdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_game_plate_hi);
        mp = new MediaPlayer();
        next = (ImageView) findViewById(R.id.imageNext_pa2_v16);
        back = (ImageView) findViewById(R.id.imageback_pa2_v16);
        home = (ImageView) findViewById(R.id.imagehome_pa2_v16);
        //get both sets of text views

        //views to drag
        option1 = (TextView) findViewById(R.id.option_1);
        option2 = (TextView) findViewById(R.id.option_2);
        option3 = (TextView) findViewById(R.id.option_3);
        option4 = (TextView) findViewById(R.id.option_4);
        option5 = (TextView) findViewById(R.id.option_5);
        option6 = (TextView) findViewById(R.id.option_6);
        option7 = (TextView) findViewById(R.id.option_7);

        //views to drop onto
        choice1 = (TextView) findViewById(R.id.choice_1);
        choice2 = (TextView) findViewById(R.id.choice_2);
        choice3 = (TextView) findViewById(R.id.choice_3);
        choice4 = (TextView) findViewById(R.id.choice_4);
        choice5 = (TextView) findViewById(R.id.choice_5);

        //set touch listeners
        option1.setOnTouchListener(new ChoiceTouchListener());
        option2.setOnTouchListener(new ChoiceTouchListener());
        option3.setOnTouchListener(new ChoiceTouchListener());
        option4.setOnTouchListener(new ChoiceTouchListener());
        option5.setOnTouchListener(new ChoiceTouchListener());
        option6.setOnTouchListener(new ChoiceTouchListener());
        option7.setOnTouchListener(new ChoiceTouchListener());

        //set drag listeners
        choice1.setOnDragListener(new ChoiceDragListener());
        choice2.setOnDragListener(new ChoiceDragListener());
        choice3.setOnDragListener(new ChoiceDragListener());
        choice4.setOnDragListener(new ChoiceDragListener());
        choice5.setOnDragListener(new ChoiceDragListener());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(WordPlateGame.this,
                        SeePlateInShop.class);
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

                Intent i = new Intent(WordPlateGame.this,
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
                        view.setVisibility(View.INVISIBLE);

                        //update the text in the target view to reflect the data being dropped
                        //dropTarget.setText(dropTarget.getText().toString() + dropped.getText().toString());
                        dropTarget.setText(dropTarget.getText().toString() + ".");

                        dropTarget.setTextColor(Color.BLACK);
                        //make it bold to highlight the fact that an item has been dropped
                        dropTarget.setTypeface(Typeface.DEFAULT_BOLD);

                        String p = choice1.getText().toString().trim();
                        String l = choice2.getText().toString().trim();
                        String a = choice3.getText().toString().trim();
                        String t = choice4.getText().toString().trim();
                        String e = choice5.getText().toString().trim();

                        userEntered = "" + p + l + a + t + e;
                        if (userEntered.equals("p .l .a .t .e .")) {
                            playPerfect();

                            cdd = new CustomDialogClass_hi(WordPlateGame.this);
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
                                                SeePlateInShop.class);
                                        startActivity(i);
                                        cdd.dismiss();
                                    }
                                }, SPLASH_TIME_OUT);
                            } catch (OutOfMemoryError e1) {
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Your phone memory is too low, free your cache memory and start the application",
                                        Toast.LENGTH_LONG).show();
                            }

                        }
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
                    //Toast.makeText(WordPlateGame.this, "Wrong", Toast.LENGTH_LONG).show();
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

    public void reset(View view) {
        option1.setVisibility(TextView.VISIBLE);
        option2.setVisibility(TextView.VISIBLE);
        option3.setVisibility(TextView.VISIBLE);
        option4.setVisibility(TextView.VISIBLE);
        option5.setVisibility(TextView.VISIBLE);
        option6.setVisibility(TextView.VISIBLE);
        option7.setVisibility(TextView.VISIBLE);

        choice1.setText("p");
        choice2.setText("l");
        choice3.setText("a");
        choice4.setText("t");
        choice5.setText("e");

        choice1.setTextColor(Color.TRANSPARENT);
        choice2.setTextColor(Color.TRANSPARENT);
        choice3.setTextColor(Color.TRANSPARENT);
        choice4.setTextColor(Color.TRANSPARENT);
        choice5.setTextColor(Color.TRANSPARENT);

        choice1.setTag(null);
        choice2.setTag(null);
        choice3.setTag(null);
        choice4.setTag(null);
        choice5.setTag(null);

        choice1.setTypeface(Typeface.DEFAULT);
        choice2.setTypeface(Typeface.DEFAULT);
        choice3.setTypeface(Typeface.DEFAULT);
        choice4.setTypeface(Typeface.DEFAULT);
        choice5.setTypeface(Typeface.DEFAULT);

        choice1.setOnDragListener(new ChoiceDragListener());
        choice2.setOnDragListener(new ChoiceDragListener());
        choice3.setOnDragListener(new ChoiceDragListener());
        choice4.setOnDragListener(new ChoiceDragListener());
        choice5.setOnDragListener(new ChoiceDragListener());
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
                Toast.makeText(WordPlateGame.this, "Plate", Toast.LENGTH_SHORT).show();
                Intent Plate = new Intent(WordPlateGame.this,
                        PlateActivityOne.class);
                Plate.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Plate);
                return true;

            case R.id.menu_spoon:
                Toast.makeText(WordPlateGame.this, "Spoon", Toast.LENGTH_SHORT).show();
                Intent Spoon = new Intent(WordPlateGame.this,
                        MatchSpoonOne.class);
                Spoon.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Spoon);
                return true;

            case R.id.menu_soap:
                Toast.makeText(WordPlateGame.this, "Soap", Toast.LENGTH_SHORT).show();
                Intent Soap = new Intent(WordPlateGame.this,
                        MatchSoapOne.class);
                Soap.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Soap);
                return true;

            case R.id.menu_shirt:
                Toast.makeText(WordPlateGame.this, "Shirt", Toast.LENGTH_SHORT).show();
                Intent Shirt = new Intent(WordPlateGame.this,
                        MatchShirtOne.class);
                Shirt.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Shirt);
                return true;

            case R.id.menu_knife:
                Toast.makeText(WordPlateGame.this, "Knife", Toast.LENGTH_SHORT).show();
                Intent Knife = new Intent(WordPlateGame.this,
                        MatchKnifeOne.class);
                Knife.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Knife);
                return true;

            case R.id.menu_bottle:
                Toast.makeText(WordPlateGame.this, "Bottle", Toast.LENGTH_SHORT).show();
                Intent Bottle = new Intent(WordPlateGame.this,
                        MatchBottleOne.class);
                Bottle.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Bottle);
                return true;
            case R.id.menu_shampoo:
                Toast.makeText(WordPlateGame.this, "Shampoo", Toast.LENGTH_SHORT).show();
                Intent Shampoo = new Intent(WordPlateGame.this,
                        MatchShampooOne.class);
                Shampoo.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Shampoo);
                return true;

            case R.id.menu_tray:
                Toast.makeText(WordPlateGame.this, "Tray", Toast.LENGTH_SHORT).show();
                Intent Tray = new Intent(WordPlateGame.this,
                        MatchTrayOne.class);
                Tray.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(Tray);
                return true;

            case R.id.menu_lock:
                Toast.makeText(WordPlateGame.this, "Lock", Toast.LENGTH_SHORT).show();
                Intent Lock = new Intent(WordPlateGame.this,
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