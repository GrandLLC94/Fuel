package bmwfuel.bmwfuel.bmwfuel.bmwfuel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    ProgressBar progressBar;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(100);
        progressBar.setProgress(0);

        final Thread thread = new Thread() {

            @Override
            public void run() {
                try {
                    for (int i = 0;i < 100;i++){
                        progressBar.setProgress(i);
                        sleep(30);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(getApplicationContext(),PayActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
           thread.start();


    }
}