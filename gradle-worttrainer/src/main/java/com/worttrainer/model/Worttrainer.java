package main.java.com.worttrainer.model;
import main.java.com.worttrainer.persistenz.Persistenz;
import main.java.com.worttrainer.view.TrainerGUI;

import java.io.IOException;

//Worttrainer wird hier implementiert
public class Worttrainer {
    Wortliste liste;
    int anzahl = 0;
    int erraten = 0;
    TrainerGUI view;
    String[] aufteilen;
    String[] wortliste;
    String url;
    String wort;
    boolean richtig = false;
    Persistenz persistenz = new Persistenz();
    public boolean gewonnen() {
        if (this.erraten == this.anzahl) return true;
        return false;
    }
    public void start(Wortliste liste, TrainerGUI view) throws IOException {
        this.view = view;
        this.liste = liste;
        while (true) {
                try {
                    anzahl = view.spiellaenge();
                    break;
                } catch(Exception e) {
                    // throw exception
            }
        }
        try {

            wortliste = liste.generieren(anzahl);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    xxx: while (true) {
    for (int i = 0; i<wortliste.length; i++) {
            richtig = false;
            aufteilen = wortliste[i].split(" ");
            wort = aufteilen[0];
            url = aufteilen[1];

            String antwort;

            while (richtig == false) {
                antwort = view.wortAbfrage(url);
/*
                switch(antwort) {
                    case "speichern": {
                        Persistenz.speichern(this.anzahl, this.erraten);
                        break xxx;
                    }

                    case "laden":
                        Persistenz.laden();
                        break;
                    default:
                        //nicht speichern oder laden.
                }

 */
                        if (antwort.equals("speichern")) {
                            persistenz.speichern(this.anzahl, this.erraten);
                            break xxx;
                }
                        if (antwort.equals(wort)) {
                            richtig = true;
                            erraten++;
                            if (gewonnen()) {
                                view.gratuliere();
                                break xxx;
                            }
                        } else {

                            richtig = false;

                        }
                       // break;
                 }
               }
            }
         }
         public int getAnzahl() {
        return anzahl;
         }
         public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
         }
         public int getErraten() {
        return erraten;
         }

    public void setErraten(int erraten) {
        this.erraten = erraten;
    }
}