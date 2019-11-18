package lecture.experiments.roomdatabase.repository;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.room.Room;

import java.util.List;

import lecture.experiments.roomdatabase.places_visits;
import lecture.experiments.roomdatabase.database.DatabaseClass;

public class PlacesRepo {

    private String DB_NAME = "app_core_db";
    private DatabaseClass PlacesDatabase;

    public PlacesRepo(Context context) {
        getInstance(context);
    }

    private DatabaseClass getInstance(Context context) {
        if (PlacesDatabase != null) {
            return PlacesDatabase;
        } else {
            PlacesDatabase = Room.databaseBuilder(context, DatabaseClass.class, DB_NAME).build();
        }
        return PlacesDatabase;
    }

    public void insertTask(int checkin, String description,String date, String time) {
        places_visits places = new places_visits();
        places.setCustom_text(description);
        places.setCheckinCheckout(checkin);
        places.setDate(date);
        places.setTime(time);
        insertTask(places);
    }

    @SuppressLint("StaticFieldLeak")
    public void insertTask(final places_visits places) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                Log.e("PlacesRepo", "Inserting!!!! from Background Thread: " + Thread.currentThread().getId());
                PlacesDatabase.placesDao().insertTask(places);
                return null;
            }
        }.execute();
    }


}