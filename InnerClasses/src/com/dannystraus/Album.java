package com.dannystraus;

import java.util.ArrayList;

/**
 * Created by dstraus on 3/23/17.
 */
public class Album {
    private String name;
    private SongList songs;

    public Album(String name) {
        this.name = name;
        this.songs = new SongList();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addSong(String name, double duration) {
        return this.songs.add(new Song(name, duration));
    }

    public Song getSong(String name) {
        int i = songs.findSong(name);
        if(i < 0) {
            System.out.println("Song does not exist");
            return null;
        } else {
            return songs.retrieveSong(i);
        }
    }



    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private int findSong(String name){
            for(int i = 0; i < songs.size(); i++){
                if(songs.get(i).getTitle().equals(name)) {
                    return i;
                }
            }
            return -1;
        }

        private Song retrieveSong(int i) {
            return songs.get(i);
        }
    }
}
