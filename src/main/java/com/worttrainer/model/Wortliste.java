package main.java.com.worttrainer.model;

import main.java.com.worttrainer.view.TrainerGUI;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Die Klasse Wortliste generiert die Liste für den Worttreiner
 * @author Fischinger Tobias
 *
 */

public class Wortliste {
    int random;
    boolean doppelt = true;
    int einträge = 0;
    String[] liste;
    String filename = "C:/Users/tobif/IdeaProjects/Worttrainer/gradle-worttrainer/src/Worttrainer.txt";
    Path p;
    Scanner s;

    public String[] generieren(int anzahl) throws IOException {
        this.liste = new String[anzahl];
        p = Paths.get(filename);
        try {
            s = new Scanner(p);
        } catch(IOException e) {
            //abfangen
        }

        //folgender Code ist zum Auslesen wieviele Einträge es insgesamt gibt in Worttrainer.txt.
        while (s.hasNextLine()) {
            einträge++;
        }
        String[] auslesen = new String[einträge];
        for (int i = 0; i < einträge; i++) {
            auslesen[i] = s.nextLine();
        }
        for (int i = 0; i < anzahl; i++) {
            while (doppelt) {
                random = (int) (Math.random() * (einträge - 0) + 0);
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
}