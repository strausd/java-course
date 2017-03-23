package com.dannystraus;

import java.util.ArrayList;

/**
 * Created by dstraus on 3/23/17.
 */
public class Album {
    private ArrayList<Song> songs;
    private String name;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(String name, double duration) {
        if(findSong(name) < 0) {
            songs.add(new Song(name, duration));
            System.out.println("New song created");
        } else {
            System.out.println("Song already exists. Cannot add song");
        }
    }

    public Song getSong(String name) {
        int i = findSong(name);
        if(i < 0) {
            System.out.println("Song does not exist");
            return null;
        } else {
            return songs.get(i);
        }
    }

    private int findSong(String name){
        for(int i = 0; i < songs.size(); i++){
            if(songs.get(i).getTitle().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
