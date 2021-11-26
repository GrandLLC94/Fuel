package bmwfuel.bmwfuel.bmwfuel.bmwfuel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

public class PayActivity extends AppCompatActivity implements BillingProcessor.IBillingHandler {

    ImageButton logo1,logo2;
    BillingProcessor bp;
    TextView all,only;
    Toolbar toolbar;
    TextView exit,reset;
    String key;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);


        exit = (TextView)findViewById(R.id.exit);
        exit.setVisibility(View.INVISIBLE);
        reset =(TextView)findViewById(R.id.reset);
        reset.setVisibility(View.INVISIBLE);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        all = (TextView)findViewById(R.id.all);
        only=(TextView)findViewById(R.id.only);
        logo1 =(ImageButton) findViewById(R.id.logo1);
        logo2=(ImageButton) findViewById(R.id.logo2);


     key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApbMVdQZrJBfBrpp2KVVQfjm9VTESeSZUrD8TA7Yq6D4tUzwu7ijTuskyokwkcbEbEQsOJ0gOIqUE0yN/riYYGNRjfmB/NXGlhzw/2OVnlE0AvC/pOs0/+afRzSKiXzQMKfHPO3EyJVfCUYK7dR4IRuPfcG4ZQ17YVQF+fLmWGuTVO5dGn8tlwFOTKqo5GswJ5CnMB4HuiaYO9+BH8xuLivqt4RmSLNeGUQsQ1jEozHPSh6m+JQwDRzRZ1NZoJMPEGzeXLClF/XDzmIVMz++8K8/Xc2FxJtjeh9XftDZkRmEJt1bxdI7HXmcIo86V17Ww4tN7cCQpHoaLxAWrnnn+fwIDAQAB";

       bp = new BillingProcessor(this,key,this);




  logo2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        bp.purchase(PayActivity.this,"android.bmw.bmwfuel");
      }
  });
  logo1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
          startActivity(intent);
      }
  });



    }

    @Override
    public void onProductPurchased(@NonNull String productId, @Nullable TransactionDetails details) {
         Intent intent = new Intent(getApplicationContext(),MainActivity.class);
         startActivity(intent);


    }

    @Override
    public void onPurchaseHistoryRestored() {

    }

    @Override
    public void onBillingError(int errorCode, @Nullable Throwable error) {

    }

    @Override
    public void onBillingInitialized() {

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
         if(!bp.handleActivityResult(requestCode,resultCode,data)) {
             super.onActivityResult(requestCode, resultCode, data);
         }
    }

    @Override
    protected void onDestroy() {
        if(bp!=null){
            bp.release();
        }
        super.onDestroy();
    }
}
