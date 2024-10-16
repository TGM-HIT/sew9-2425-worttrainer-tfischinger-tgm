package com.worttrainer;

import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Wortliste generiert die Liste für den Worttreiner
 * @author Fischinger Tobias
 * @param Wieviele Wörter der Wortliste hinzugefügt werden.
 */

public class Wortliste (int anzahl) {
    String wort;
    String url;
    Double random;
    boolean doppelt=true;
    int einträge = 0;
    String[] liste = new String[anzahl];
    String filename = "C:\Users\tobif\IdeaProjects\Worttrainer\gradle-worttrainer\src\Worttrainer.txt";
    Path p = new Path(filename);
    Scanner s = new Scanner(p);

    public String[] generieren(int anzahl) {
        //folgender Code ist zum Auslesen wieviele Einträge es insgesamt gibt in Worttrainer.txt.
        while (s.hasnextLine()) {
            einträge++;
        }
        String[] auslesen = new String[einträge];
        for (int i = 0; i < einträge; i++) {
            auslesen[i] = s.nextLine();
        }
        for (int i = 0; i < anzahl; i++) {
            while (doppelt) {
                random = (int) Math.random() * (einträge - 0) + 0;

                for (int k = 0; k < liste.length; k++) {
                    if (liste[k].equals(auslesen[random])) {
                        doppelt = true;

                    } else {
                        doppelt = false;
                    }
                }
            }
            liste[i] = auslesen[random];
        }
        return liste;
    }