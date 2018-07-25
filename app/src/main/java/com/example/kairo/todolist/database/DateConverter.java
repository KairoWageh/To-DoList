package com.example.kairo.todolist.database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

public class DateConverter {

    // This method is used to convert Date to timestamp
    // It is used when inserting data into database
    @TypeConverter
    public static Long toTimeStamp(Date date){
        return date == null ? null : date.getTime();
    }

    // This method is used to convert timestamp to Date
    // It is used when getting data from database
    @TypeConverter
    public static Date toDate(Long timestamp){
        return timestamp == null ? null : new Date(timestamp);
    }
}
