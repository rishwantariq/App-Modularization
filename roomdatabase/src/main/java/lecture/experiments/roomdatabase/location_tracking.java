package lecture.experiments.roomdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class location_tracking implements Serializable
{



    @PrimaryKey(autoGenerate = true)
    private int id;
    private double latitude;
    private double longitude;
    private String date;
    private String time;
    private double accuracy;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setLatitude(double num){this.latitude=num;}
    public double getLatitude() {
        return latitude;
    }

    public void setLongitude(double num) {
        this.longitude = num;
    }
    public double getLongitude() {
        return longitude;
    }



    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }

    public void setAccuracy(double num) {
        this.accuracy = num;
    }
    public double getAccuracy() {
        return accuracy;
    }

}


