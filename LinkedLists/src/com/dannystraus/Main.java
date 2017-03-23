package com.dannystraus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    private static LinkedList<Song> playlist = new LinkedList<Song>();

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();

        boolean isPlaying = true;

        Album albumA = new Album("Album A");
        albums.add(albumA);
        albumA.addSong("Oh Snap", 3.12);
        albumA.addSong("What what", 4.00);
        albumA.addSong("Lyrics and stuff", 3.54);

        Album albumB = new Album("Album B");
        albums.add(albumB);
        albumB.addSong("Theres a thing over there", 3.12);
        albumB.addSong("Guns and freedom", 4.00);
        albumB.addSong("Need more ammo", 3.54);

        playlist.add(albumA.getSong("Oh Snap"));
        playlist.add(albumA.getSong("What what"));
        playlist.add(albumB.getSong("Theres a thing over there"));
        playlist.add(albumB.getSong("Guns and freedom"));

        displayOptions();

        ListIterator<Song> songListIterator = playlist.listIterator();

        while(isPlaying && songListIterator.hasNext()) {
            System.out.println("Currently playing: " + playlist.get(songListIterator.nextIndex()).getTitle());
            int selected = scan.nextInt();
            switch(selected){
                case 0:
                    isPlaying = false;
                    break;
                case 1:
                    if(songListIterator.nextIndex() + 2 > playlist.size()) {
                        songListIterator = playlist.listIterator();
                        break;
                    }
                    songListIterator.next();
                    break;
                case 2:
                    if(songListIterator.previousIndex() < 0) {
                        for(int i = 1; i < playlist.size(); i++) {
                            songListIterator.next();
                        }
                        break;
                    }
                    songListIterator.previous();
                    break;
                case 3:
                    break;
                case 4:
                    removeSong(songListIterator.nextIndex());
                    break;
                case 5:
                    for(int i = 0; i < playlist.size(); i++) {
                        System.out.println(playlist.get(i).getTitle() + ": " + playlist.get(i).getDuration());
                    }
                    break;

                default:
                    displayOptions();
                    break;

            }
        }

    }

    private static void displayOptions() {
        System.out.println("0 - Quit");
        System.out.println("1 - Go forward 1 song");
        System.out.println("2 - Go backward 1 song");
        System.out.println("3 - Replay current song");
        System.out.println("4 - Remove current song");
        System.out.println("5 - List all songs in playlist");
        System.out.println("6 - Display all options");
    }

    private static void removeSong(int i) {
        playlist.remove(i);
    }

}
