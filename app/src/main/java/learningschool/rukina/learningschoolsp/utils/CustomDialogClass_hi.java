package learningschool.rukina.learningschoolsp.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import learningschool.rukina.learningschoolsp.R;
import learningschool.rukina.learningschoolsp.activity.plate.MatchPlateTwo;

/**
 * Created by COBURG DESIGN on 19-01-2016.
 */
public class CustomDialogClass_hi extends Dialog implements
        View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes;
    public ImageView no;

    public CustomDialogClass_hi(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_hi);
        yes = (Button) findViewById(R.id.btn_dialog);
        no = (ImageView) findViewById(R.id.a1);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);

        WebView webView = (WebView) findViewById(R.id.new_set);
        webView.loadUrl("file:///android_asset/banner_hi.gif");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dialog:
                c.startActivity(new Intent(c, MatchPlateTwo.class));
                dismiss();
                c.finish();
                break;
            case R.id.a1:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}
