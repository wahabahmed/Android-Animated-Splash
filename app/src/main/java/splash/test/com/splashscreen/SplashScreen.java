package splash.test.com.splashscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

    LinearLayout layout1, layout2;
    Animation uptodown, downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        layout1 = (LinearLayout) findViewById(R.id.layout_1);
        layout2 = (LinearLayout) findViewById(R.id.layout_2);

        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);

        layout1.setAnimation(uptodown);
        layout2.setAnimation(downtoup);
    }
}
