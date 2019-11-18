package lecture.experiments.roomdatabase.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lecture.experiments.roomdatabase.places_visits;

@Dao
public interface placesDao {

    @Insert
    Long insertTask(places_visits pv);


    @Query("SELECT * FROM places_visits")
    List<places_visits> fetchAllTasks();


    @Query("SELECT * FROM places_visits WHERE id =:taskId")
    places_visits getTask(int taskId);


    @Update
    void updateTask(places_visits pv);


    @Delete
    void deleteTask(places_visits pv);
}