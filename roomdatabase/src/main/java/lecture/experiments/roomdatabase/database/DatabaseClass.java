package lecture.experiments.roomdatabase.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import lecture.experiments.roomdatabase.ScreenTime;
import lecture.experiments.roomdatabase.dao.DaoAccess;
import lecture.experiments.roomdatabase.dao.locationDao;
import lecture.experiments.roomdatabase.dao.placesDao;
import lecture.experiments.roomdatabase.location_tracking;
import lecture.experiments.roomdatabase.places_visits;

@Database(entities = {ScreenTime.class, places_visits.class, location_tracking.class}, version = 1, exportSchema = false)
public abstract class DatabaseClass extends RoomDatabase {

    public abstract DaoAccess daoAccess();
    public abstract placesDao placesDao();
    public abstract locationDao locationDao();

}