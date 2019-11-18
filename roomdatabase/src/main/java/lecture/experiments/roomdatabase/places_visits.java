package lecture.experiments.roomdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class places_visits implements Serializable
{



    @PrimaryKey(autoGenerate = true)
    private int id;
    private String date;
    private String time;
    private int checkinCheckout;
    private String custom_text;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setCheckinCheckout(int num){this.checkinCheckout=num;}
    public int getCheckinCheckout() {
        return checkinCheckout;
    }

    public void setCustom_text(String text) {
        this.custom_text = text;
    }
    public String getCustom_text() {
        return custom_text;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setTime(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }



}


