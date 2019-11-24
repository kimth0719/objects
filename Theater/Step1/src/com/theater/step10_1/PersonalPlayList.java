package com.theater.step10_1;

public class PersonalPlayList extends Playlist{
    public void remove(Song song) {
        getTracks().remove(song);
        getSingers().remove(song.getSinger());
    }
}
