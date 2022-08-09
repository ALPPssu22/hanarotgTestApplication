package com.example.hanarotgtest;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Alarm {
    @PrimaryKey(autoGenerate = true)
    private int id = 0;

    private long date = 0;

    // getter setter
    public int getId() {
        return id;
    }

    public long getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
