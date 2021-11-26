package bmwfuel.bmwfuel.bmwfuel.bmwfuel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class Main2Activity extends AppCompatActivity {
    Spinner spinner;
    Button ok;
    String model,zero;
    String skm, skm1, pri;
    double km, rkm, p, endprice;
    double litr, rlitr;
    EditText kmtext, run, pricetext;
    double endlitr, finlitr;
    TextView litrview, priceview;
    Toolbar toolbar;
    TextView exit, reset;
    VideoView video;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        video=(VideoView)findViewById(R.id.video);
        video.setVisibility(View.INVISIBLE);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        litrview = (TextView) findViewById(R.id.litrview);
        run = (EditText) findViewById(R.id.run);
        pricetext = (EditText) findViewById(R.id.pricetext);
        priceview = (TextView) findViewById(R.id.priceview);
        kmtext = (EditText) findViewById(R.id.kmtext);
        ok = (Button) findViewById(R.id.ok);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner, getResources().getStringArray((R.array.bmwe46)));
        myadapter.setDropDownViewResource(R.layout.dropdown);
        spinner.setAdapter(myadapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                model = parent.getItemAtPosition(position).toString();
                zero = spinner.getItemAtPosition(0).toString();
                pos = position;
                Toast.makeText(Main2Activity.this, "pos="+position, Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Main2Activity.this, "Not", Toast.LENGTH_SHORT).show();
            }
        });

         ok.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 switch (model) {
                     case  "3-series":
                    setVideo();
                     break;
                     case "316i(E46)":
                         litr = 8.6;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "318i(E46)":
                         litr = 8.8;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "320i(E46)":
                         litr = 9.1;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "320d(E46)":
                         litr = 5.8;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "323i(E46)":
                         litr = 8.5;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "325i(E46)":
                         litr = 9.2;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "325i xdrive(E46)":
                         litr = 10.3;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "328i(E46)":
                         litr = 9.8;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "330i(E46)":
                         litr = 9.8;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "330i xdrive(E46)":
                         litr = 10.8;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                     case "330d(E46)":
                         litr = 6.8;
                         code();
                         empty();
                         setVideo();
                         priceview.setText("price = " + endprice);
                         litrview.setText("litr = " + endlitr + "L");
                         break;
                 }
             }
         });
        exit = (TextView) findViewById(R.id.exit);
        exit.setText("BACK");
        reset = (TextView) findViewById(R.id.reset);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PayActivity.class);
                startActivity(intent);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run.setText("");
                kmtext.setText("");
                litrview.setText("");
                pricetext.setText("");
                priceview.setText("");
                pos=0;
                setVideo();

            }
        });


    }
     void setVideo(){
        if(pos>0){
            String videouri = "android.resource://"+getPackageName()+"/" + R.raw.bmw3;
            Uri uri = Uri.parse(videouri);
            video.setVideoURI(uri);
            video.setVisibility(View.VISIBLE);
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    video.start();
                }

            };
            timer.schedule(timerTask,1500,25000);
        }else {
            video.setVisibility(View.INVISIBLE);
            video.stopPlayback();
        }

    }

    @Override
    protected void onPostResume() {
        video.start();
        super.onPostResume();
    }


    double empty() {
        pri = pricetext.getText().toString();
        if (pri.equals("")) {
            priceview.setVisibility(View.INVISIBLE);

        } else {
            p = new Double(pricetext.getText().toString());
            endprice = p * endlitr;
            endprice = Math.round(endprice * 10.0) / 10.0;
            priceview.setVisibility(View.VISIBLE);
        }
        return endprice;
    }

    double code() {
        skm = kmtext.getText().toString();
        skm1 = run.getText().toString();
        if (skm.equals("") || skm1.equals("")) {
            Toast.makeText(Main2Activity.this, "Empty:mileage or distance", Toast.LENGTH_SHORT).show();
        } else {
            rkm = new Double(run.getText().toString());
            km = new Double(kmtext.getText().toString());
        }
        if (rkm <= 80000) {
            rlitr = litr;
            endlitr = rlitr * km / 100;
            endlitr = Math.round(endlitr * 10.0) / 10.0;

        } else if (rkm > 80000 && rkm<=200000) {
            rlitr = litr + 1;
            endlitr = rlitr * km / 100;
            endlitr = Math.round(endlitr * 10.0) / 10.0;
        }else {
            rlitr = litr + 3;
            endlitr = rlitr * km / 100;
            endlitr = Math.round(endlitr * 10.0) / 10.0;
        }
        return endlitr;
    }


}
