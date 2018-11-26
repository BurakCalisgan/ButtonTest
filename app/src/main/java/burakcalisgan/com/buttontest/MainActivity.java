package burakcalisgan.com.buttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1, btn2;
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Deneme
        if (v.getId() == R.id.button) {
            Log.e("Button Test", "1. butona tıklandı !");
        } else if (v.getId() == R.id.button2) {
            Log.e("Button Test", "2. butona tıklandı !");
        }
    }





    /*buton onclick metodu
    public void calistir (View view){
        if ( view.getId() == R.id.button)
            Log.e("Button", "1. Butona Tıklandı !");
        else
            Log.e("Button", "2. Butona Tıklandı !");

    }*/
}
