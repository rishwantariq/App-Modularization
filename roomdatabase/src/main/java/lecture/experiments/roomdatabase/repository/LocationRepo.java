package lecture.experiments.roomdatabase.repository;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.room.Room;

import java.util.List;

import lecture.experiments.roomdatabase.location_tracking;
import lecture.experiments.roomdatabase.database.DatabaseClass;

public class LocationRepo {

    private String DB_NAME = "app_core_db";
    private DatabaseClass LocationDatabase;

    public LocationRepo(Context context) {
        getInstance(context);
    }

    private DatabaseClass getInstance(Context context) {
        if (LocationDatabase != null) {
            return LocationDatabase;
        } else {
            LocationDatabase = Room.databaseBuilder(context, DatabaseClass.class, DB_NAME).build();
        }
        return LocationDatabase;
    }

    public void insertTask(double latitude, double longitude,String date, String time, double accuracy) {
        location_tracking loc = new location_tracking();

        loc.setLatitude(latitude);
        loc.setLongitude(longitude);
        loc.setDate(date);
        loc.setTime(time);
        loc.setAccuracy(accuracy);
        insertTask(loc);
    }

    @SuppressLint("StaticFieldLeak")
    public void insertTask(final location_tracking loc) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                Log.e("LocationRepo", "Inserting!!!! from Background Thread: " + Thread.currentThread().getId());
                LocationDatabase.locationDao().insertTask(loc);
                return null;
            }
        }.execute();
    }




}