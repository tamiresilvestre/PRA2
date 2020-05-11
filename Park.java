package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "parks")
public class Park {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "parkId")
    private int id;
    @NonNull
    @ColumnInfo(name = "parkCreationDate")
    private String creationDate;
    @NonNull
    @ColumnInfo(name = "parkName")
    private String name;
    @NonNull
    @ColumnInfo(name = "parkLocation")
    private String location;
    @NonNull
    @ColumnInfo(name = "parkScore")
    private int score;

    public Park (String creationDate, String name, String location, int score) {
        this.creationDate = creationDate;
        this.name = name;
        this.location = location;
        this.score = score;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCreationDate() {
        return this.creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }

}
