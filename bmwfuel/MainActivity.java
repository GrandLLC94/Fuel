package bmwfuel.bmwfuel.bmwfuel.bmwfuel;


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


public class MainActivity extends AppCompatActivity {
    String zero;
    Spinner spinner;
    Button ok;
    String model;
    String skm, skm1, pri;
    double km, rkm, p, endprice;
    double litr, rlitr;
    EditText kmtext, run, pricetext;
    double endlitr, finlitr;
    TextView litrview, priceview;
    Toolbar toolbar;
    TextView exit, reset;
    VideoView video2;
    int pos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        video2 = (VideoView)findViewById(R.id.video2);
        video2.setVisibility(View.INVISIBLE);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        litrview = (TextView) findViewById(R.id.litrview);
        run = (EditText) findViewById(R.id.run);
        pricetext = (EditText) findViewById(R.id.pricetext);
        priceview = (TextView) findViewById(R.id.priceview);
        kmtext = (EditText) findViewById(R.id.kmtext);
        ok = (Button) findViewById(R.id.ok);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner, getResources().getStringArray((R.array.bmw)));
        myadapter.setDropDownViewResource(R.layout.dropdown);
        spinner.setAdapter(myadapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                model = parent.getItemAtPosition(position).toString();
                zero = spinner.getItemAtPosition(0).toString();
                pos2 = position;


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "Not", Toast.LENGTH_SHORT).show();
            }
        });


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch ((model)) {
                    case "1-series":
                        setVideo();
                        break;
                    case "116i(E87)":
                        litr = 7.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "116i(E81)":
                        litr = 7.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "116i(F20)":
                        litr = 5.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "116i(F21)":
                        litr = 5.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "118i(E87)":
                        litr = 7.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "118i(E81)":
                        litr = 7.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "118i(F20)":
                        litr = 5.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "118i(F21)":
                        litr = 5.7;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "120i(E87)":
                        litr = 7.9;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "120i(E81)":
                        litr = 7.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "120d(F20)":
                        litr = 4.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "120d(F21)":
                        litr = 4.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "123d(E87)":
                        litr = 5.9;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "123d(E81)":
                        litr = 5.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "130i(E87)":
                        litr = 9.2;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "130i(E81)":
                        litr = 8.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M135i xdrive(F20)":
                        litr = 8.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M135i(F21)":
                        litr = 7.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M140i(F20)":
                        litr = 7.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M140i xdrive(F20)":
                        litr = 7.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "3-series":
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
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "320i(E46)":
                        litr = 9.1;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "320d(E46)":
                        litr = 5.8;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "323i(E46)":
                        litr = 8.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "325i(E46)":
                        litr = 9.2;
                        code();
                        setVideo();
                        empty();
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
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "330i(E46)":
                        litr = 9.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "330i xdrive(E46)":
                        litr = 10.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "330d(E46)":
                        litr = 6.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "318i(E90)":
                        litr = 7.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "320i(E90)":
                        litr = 8.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "320d(E90)":
                        litr = 4.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "325i(E90)":
                        litr = 8.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "325i xdrive(E90)":
                        litr = 9.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "330i(E90)":
                        litr = 9.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "330i xdrive(E90)":
                        litr = 9.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "330d xdrive(E90)":
                        litr = 7.3;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "335i(E90)":
                        litr = 9.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "335i xdrive(E90)":
                        litr = 10.0;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "335d xdrive(E90)":
                        litr = 7.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "320i(E92)":
                        litr = 8.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "320d(E92)":
                        litr = 4.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "325i(E92)":
                        litr = 8.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "325i xdrive(E92)":
                        litr = 9.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "328i(E92)":
                        litr = 9.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "330i(E92)":
                        litr = 8.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "330d(E92)":
                        litr = 6.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "335i(E92)":
                        litr = 9.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "335d(E92)":
                        litr = 6.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "335i xdrive(E92)":
                        litr = 11.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "316i(F30)":
                        litr = 5.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "318i(F30)":
                        litr = 6.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "320i(F30)":
                        litr = 6.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "320d(F30)":
                        litr = 4.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "328i(F30)":
                        litr = 6.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "328i xdrive(F30)":
                        litr = 6.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "335i(F30)":
                        litr = 7.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "335i xdrive(F30)":
                        litr = 7.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "340i xdrive(F30)":
                        litr = 7.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "4-series":
                        setVideo();
                        break;
                    case "420d(F32)":
                        litr = 4.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "420d xdrive(F32)":
                        litr = 4.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "420i(F32)":
                        litr = 5.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "420i xdrive(F32)":
                        litr = 6.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "430i(F32)":
                        litr = 6.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "430i xdrive(F32)":
                        litr = 7.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "440i xdrive(F32)":
                        litr = 8.2;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "5-series":
                        setVideo();
                        break;
                    case "520d(E39)":
                        litr = 6.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "520i(E39)":
                        litr = 10.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "523i(E39)":
                        litr = 9.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "525d(E39)":
                        litr = 7.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "525i(E39)":
                        litr = 9.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "528i(E39)":
                        litr = 10.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530d(E39)":
                        litr = 7.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530i(E39)":
                        litr = 9.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "535i(E39)":
                        litr = 11.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "540i(E39)":
                        litr = 12.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "520d(E60)":
                        litr = 5.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "520i(E60)":
                        litr = 6.7;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "523i(E60)":
                        litr = 7.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "525d(E60)":
                        litr = 6.2;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "525i(E60)":
                        litr = 7.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "528i(E60)":
                        litr = 8.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530d(E60)":
                        litr = 6.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530i(E60)":
                        litr = 8.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530i xdrive(E60)":
                        litr = 9.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "535d(E60)":
                        litr = 6.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "535i xdrive(E60)":
                        litr = 10.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "540i(E60)":
                        litr = 11.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "550i(E60)":
                        litr = 12.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "520d(F10)":
                        litr = 5.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "520i(F10)":
                        litr = 6.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "523i(F10)":
                        litr = 6.5;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "528i(F10)":
                        litr = 6.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "528i xdrive(F10)":
                        litr = 7.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530d(F10)":
                        litr = 6.4;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530d xdrive(F10)":
                        litr = 6.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "535d(F10)":
                        litr = 6.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "535d xdrive(F10)":
                        litr = 6.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "535i(F10)":
                        litr = 8.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "535i xdrive(F10)":
                        litr = 8.8;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "550i(F10)":
                        litr = 10.5;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "550i xdrive(F10)":
                        litr = 11.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "520d(G30)":
                        litr = 4.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "520d xdrive(G30)":
                        litr = 5.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "520i(G30)":
                        litr = 5.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530d xdrive(G30)":
                        litr = 5.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530i(G30)":
                        litr = 6.2;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "530i xdrive(G30)":
                        litr = 6.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "540i xdrive(G30)":
                        litr = 7.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M550d xdrive(G30)":
                        litr = 6.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M550i xdrive(G30)":
                        litr = 9.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "6-series":
                        setVideo();
                        break;
                    case "630i(E63)":
                        litr = 10.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "645i(E63)":
                        litr = 12.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "650i(E63)":
                        litr = 13.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "640d(F13)":
                        litr = 5.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "640d xdrive(F13)":
                        litr = 5.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "640i(F13)":
                        litr = 7.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "640i xdrive(F13)":
                        litr = 8.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "650i(F13)":
                        litr = 10.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "650i xdrive(F13)":
                        litr = 11.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "640d(F06)":
                        litr = 5.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "640d xdrive(F06)":
                        litr = 5.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "640i(F06)":
                        litr = 7.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "640i xdrive(F06)":
                        litr = 8.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "650i(F06)":
                        litr = 8.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "650i xdrive(F06)":
                        litr = 9.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case  "7-series":
                        setVideo();
                        break;
                    case "730i(E65)":
                        litr = 10.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "735i(E65)":
                        litr = 10.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "740i(E65)":
                        litr = 11.4;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "745i(E65)":
                        litr = 11.7;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "750i(E65)":
                        litr = 12;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "760i(E65)":
                        litr = 13.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "730d(F01)":
                        litr = 7.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "730i(F01)":
                        litr = 9.8;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "740d xdrive(F01)":
                        litr = 7.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "740i(F01)":
                        litr = 10.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "750i(F01)":
                        litr = 11.4;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "750i xdrive(F01)":
                        litr = 12.1;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "760i(F01)":
                        litr = 13.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "725d xdrive(G11)":
                        litr = 5.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "730d xdrive(G11)":
                        litr = 5.4;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "730i(G11)":
                        litr = 6.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "740d xdrive(G11)":
                        litr = 5.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "740i xdrive(G11)":
                        litr = 7.0;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "750d xdrive(G11)":
                        litr = 6.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "750i xdrive(G11)":
                        litr = 8.3;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M760i xdrive(G11)":
                        litr = 12.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X-series":
                        setVideo();
                        break;
                    case "X-1":
                        setVideo();
                        break;
                    //bmw x1
                    case "20d xdrive(E84)":
                        litr = 5.4;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "25d xdrive(E84)":
                        litr = 5.6;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i xdrive(E84)":
                        litr = 7.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "28i xdrive(E84)":
                        litr = 7.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "18i sdrive(E84)":
                        litr = 7.9;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "18d sdrive(E48)":
                        litr = 4.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "18d xdrive(E48)":
                        litr = 4.9;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20d xdrive(E48)":
                        litr = 4.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "25d xdrive(E48)":
                        litr = 5.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "18i sdrive(E48)":
                        litr = 5.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i sdrive(E48)":
                        litr = 5.9;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i xdrive(E48)":
                        litr = 6.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "25i xdrive(E48)":
                        litr = 6.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X-2":
                        setVideo();
                        break;
                    //bmw x2
                    case "20d xdrive(F39)":
                        litr = 4.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i xdrive(F39)":
                        litr = 5.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i sdrive(F39)":
                        litr = 5.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "18i sdrive(F39)":
                        litr = 6.3;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20d xdrive(E83)":
                        litr = 6.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X-3":
                        setVideo();
                        break;
                    //bmw x3
                    case "30d xdrive(E83)":
                        litr = 8.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35d xdrive(E83)":
                        litr = 7.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i xdrive(E83)":
                        litr = 9.3;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "25i xdrive(E83)":
                        litr = 9.9;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30i xdrive(E83)":
                        litr = 10.3;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20d xdrive(F25)":
                        litr = 5.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30d xdrive(F25)":
                        litr = 6.0;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35d xdrive(F25)":
                        litr = 6.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i xdrive(F25)":
                        litr = 7.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "28i xdrive(F25)":
                        litr = 7.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35i xdrive(F25)":
                        litr = 8.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20d xdrive(G01)":
                        litr = 5.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30d xdrive(G01)":
                        litr = 6.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M40d xdrive(G01)":
                        litr = 6.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i xdrive(G01)":
                        litr = 7.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30i xdrive(G01)":
                        litr = 7.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M40i xdrive(G01)":
                        litr = 8.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X-4":
                        setVideo();
                        break;

                    //bmw x4
                    case "20d xdrive(F26)":
                        litr = 5.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30d xdrive(F26)":
                        litr = 5.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35d xdrive(F26)":
                        litr = 6.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i xdrive(F26)":
                        litr = 6.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "28i xdrive(F26)":
                        litr = 7.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35i xdrive(F26)":
                        litr = 8.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M40i xdrive(F26)":
                        litr = 8.7;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20d xdrive(G02)":
                        litr = 5.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30d xdrive(G02)":
                        litr = 6.2;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M40d xdrive(G02)":
                        litr = 6.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i xdrive(G02)":
                        litr = 7.7;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30i xdrive(G02)":
                        litr = 7.9;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M40i xdrive(G02)":
                        litr = 9.1;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X-5":
                        setVideo();
                        break;
                    //bmw x5
                    case "3.0d xdrive(E53)":
                        litr = 8.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "3.0i xdrive(E53)":
                        litr = 12.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "4.4i xdrive(E53)":
                        litr = 13.3;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "4.6is xdrive(E53)":
                        litr = 14.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "4.8is xdrive(E53)":
                        litr = 15.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30d xdrive(E70)":
                        litr = 7.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35d xdrive(E70)":
                        litr = 8.2;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "40d xdrive(E70)":
                        litr = 7.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M50d xdrive(E70)":
                        litr = 8.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30i xdrive(E70)":
                        litr = 11.7;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35i xdrive(E70)":
                        litr = 10.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "48i xdrive(E70)":
                        litr = 12.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "50i xdrive(E70)":
                        litr = 12.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "25d xdrive(F15)":
                        litr = 6.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30d xdrive(F15)":
                        litr = 6.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "40d xdrive(F15)":
                        litr = 6.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M50d xdrive(F15)":
                        litr = 6.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35i xdrive(F15)":
                        litr = 8.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "50i xdrive(F15)":
                        litr = 10.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30d xdrive(G05)":
                        litr = 7.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M50d xdrive(G05)":
                        litr = 7.5;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "40i xdrive(G05)":
                        litr = 9.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "50i xdrive(G05)":
                        litr = 11.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case  "X-6":
                        setVideo();
                        break;
                    //bmw x6
                    case "30d xdrive(E71)":
                        litr = 7.4;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35d xdrive(E71)":
                        litr = 9.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "40d xdrive(E71)":
                        litr = 7.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M50d xdrive(E71)":
                        litr = 7.8;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35i xdrive(E71)":
                        litr = 11.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "50i xdrive(E71)":
                        litr = 13.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30d xdrive(F16)":
                        litr = 6.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "40d xdrive(F16)":
                        litr = 6.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M50d xdrive(F16)":
                        litr = 6.6;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35i xdrive(F16)":
                        litr = 8.6;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "50i xdrive(F16)":
                        litr = 9.7;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "Z-series":
                        setVideo();
                        break;
                    //bmw z4
                    case "2.0i(E85)":
                        litr = 7.5;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "2.5si(E85)":
                        litr = 8.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "3.0si(E85)":
                        litr = 8.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "3.2si(E85)":
                        litr = 12.1;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i sdrive(E89)":
                        litr = 6.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "23i sdrive(E89)":
                        litr = 8.5;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "28i sdrive(E89)":
                        litr = 7.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30i sdrive(E89)":
                        litr = 9.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "35i sdrive(E89)":
                        litr = 9.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "20i sdrive(G29)":
                        litr = 6.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "30i sdrive(G29)":
                        litr = 6.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M40i(G29)":
                        litr = 7.7;
                        setVideo();
                        code();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M-series":
                        setVideo();
                        break;
                    case "M-2":
                        setVideo();
                        break;
                    case "M2(F87)":
                        litr = 9.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M-3":
                        setVideo();
                        break;
                    case "M3(E46)":
                        litr = 11.7;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M3(E90)":
                        litr = 11.9;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M3(E92)":
                        litr = 12.3;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M3(F80)":
                        litr = 8.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M-4":
                        setVideo();
                        break;
                    case "M4(F82)":
                        litr = 8.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M-5":
                        setVideo();
                        break;
                    case "M5(E39)":
                        litr = 14.5;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M5(E60)":
                        litr = 14.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M5(F10)":
                        litr = 10.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M5(F90)":
                        litr = 10.6;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M-6":
                        setVideo();
                        break;
                    case "M6(E64)":
                        litr = 14.8;
                        code();
                        empty();
                        setVideo();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M6(F06)":
                        litr = 10.0;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "M6(F13)":
                        litr = 10.1;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X-M series":
                        setVideo();
                        break;
                    case "X5M(E70)":
                        litr = 14.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X5M(F15)":
                        litr = 11.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X6M(E71)":
                        litr = 14.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "X6M(F16)":
                        litr = 11.2;
                        code();
                        setVideo();
                        empty();
                        priceview.setText("price = " + endprice);
                        litrview.setText("litr = " + endlitr + "L");
                        break;
                    case "choose model":
                        setVideo();
                        Toast.makeText(MainActivity.this, "Choose model", Toast.LENGTH_SHORT).show();
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
                finish();
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
                pos2=0;
                setVideo();


            }
        });


    }
    void setVideo(){
        if(pos2>=23 && pos2<=63){
            String videouri = "android.resource://"+getPackageName()+"/" + R.raw.bmw3;
            Uri uri = Uri.parse(videouri);
            video2.setVideoURI(uri);
            video2.setVisibility(View.VISIBLE);
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    video2.start();
                }

            };
            timer.schedule(timerTask,1500,25000);
        }else if(pos2>=73 && pos2<=117){
            String videouri = "android.resource://"+getPackageName()+"/" + R.raw.bmw5;
            Uri uri = Uri.parse(videouri);
            video2.setVideoURI(uri);
            video2.setVisibility(View.VISIBLE);
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    video2.start();
                }

            };
            timer.schedule(timerTask,1500,25000);

        }else if(pos2>=135 && pos2<=155){
            String videouri = "android.resource://"+getPackageName()+"/" + R.raw.bmw7;
            Uri uri = Uri.parse(videouri);
            video2.setVideoURI(uri);
            video2.setVisibility(View.VISIBLE);
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    video2.start();
                }

            };
            timer.schedule(timerTask,1500,25000);

        } else {
            video2.setVisibility(View.INVISIBLE);
            video2.stopPlayback();
        }


    }

    @Override
    protected void onPostResume() {
        video2.start();
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
            Toast.makeText(MainActivity.this, "Empty:mileage or distance", Toast.LENGTH_SHORT).show();
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
