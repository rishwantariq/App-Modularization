package lecture.experiments.roomdatabase.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lecture.experiments.roomdatabase.location_tracking;

@Dao
public interface locationDao {

    @Insert
    Long insertTask(location_tracking loc);


    @Query("SELECT * FROM location_tracking")
    List<location_tracking> fetchAllTasks();


    @Query("SELECT * FROM location_tracking WHERE id =:taskId")
    location_tracking getTask(int taskId);


    @Update
    void updateTask(location_tracking loc);


    @Delete
    void deleteTask(location_tracking loc);
}