package lecture.experiments.modularization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import lecture.experiments.screentime.ScreenTimeFunctionality;
import lecture.experiments.locationmodule.LocationActivity;

public class MainActivity extends AppCompatActivity {
    ScreenTimeFunctionality screenTimeFunctionality;
    LocationActivity loc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenTimeFunctionality = new ScreenTimeFunctionality();

      //  loc = new LocationActivity(getApplicationContext()); //location module

    }

    public void startButton(View view) {
        screenTimeFunctionality.registerEvents(this);
        loc = new LocationActivity(getApplicationContext()); //location module
    }

    public void stopButton(View view) {
        screenTimeFunctionality.unregisterEvents(this);
    }
}
