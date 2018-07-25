package com.example.kairo.todolist;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.persistence.room.Database;

import com.example.kairo.todolist.database.AppDatabase;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final AppDatabase mDb;
    private final int taskId;

    public AddTaskViewModelFactory(AppDatabase mDb, int taskId){
        this.taskId = taskId;
        this.mDb = mDb;
    }

    public <T extends ViewModel> T create(Class<T> modelClass){
        //noinspection unchecked
        return (T) new AddTaskViewModel(mDb, taskId);
    }
}
