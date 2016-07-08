package learningschool.rukina.learningschoolsp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import learningschool.rukina.learningschoolsp.R;

/**
 * Created by Nandha on 29-01-2016.
 */
public class slide6 extends Activity {
    TextView app1, app2, app3, app4, app5, app6;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.slide6_hi);
        app1 = (TextView) findViewById(R.id.app1);
        app2 = (TextView) findViewById(R.id.app2);
        app3 = (TextView) findViewById(R.id.app3);
        app4 = (TextView) findViewById(R.id.app4);
        app5 = (TextView) findViewById(R.id.app5);
        app6 = (TextView) findViewById(R.id.app6);
        back = (ImageView) findViewById(R.id.back);

        app1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        app2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(slide6.this,
                        Splash_hi.class);
                startActivity(i);
            }
        });

        app3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        app4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        app5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        app6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}
