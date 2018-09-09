package ml.deltahacksinstitute.introductiontoandroidworkshop_deltahacksinstitute;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonOne = (Button) findViewById(R.id.HelloWorldButton);
        buttonOne.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (buttonOne.getText().equals("Click Me!")){
                    buttonOne.setText("Hello World!");
                } else {
                    buttonOne.setText("Click Me!");
                }
            }
        });
    }
}