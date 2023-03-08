package com.enesgunumdogdu.wanttogo.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.enesgunumdogdu.wanttogo.model.Place;

@Database(entities = {Place.class},version = 1)
public abstract class PlaceDatabase extends RoomDatabase {
    public abstract PlaceDao placeDao();

}
