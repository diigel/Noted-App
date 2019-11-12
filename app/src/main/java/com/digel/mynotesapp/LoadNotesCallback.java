package com.digel.mynotesapp;

import com.digel.mynotesapp.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {

    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
