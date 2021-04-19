package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.Flauta;
import uaslp.ingenieria.exams.instruments.Guitarra;
import uaslp.ingenieria.exams.instruments.Piano;
import uaslp.ingenieria.exams.instruments.Violin;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String fileName = "archivo.music"; //args[0]

        Instrument instrument1 = new Flauta();
        Instrument instrument2 = new Guitarra();
        Instrument instrument3 = new Piano();
        Instrument instrument4 = new Violin();

        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));


        songPlayer.play(song, instrument1);
        songPlayer.play(song, instrument2);
        songPlayer.play(song, instrument3);
        songPlayer.play(song, instrument4);

        }
}
