package com.worttrainer;

//Worttrainer wird hier implementiert
public class Worttrainer(Wortliste liste) {
    this.liste = liste;
    int anzahl = 0;
    int erraten = 0;
    TrainerGUI view;
    String[] aufteilen;
    String[] wortliste;
    String url;
    String wort;
    boolean erraten = false;
    boolean gewonnen = false;

    public boolean gewonnen {
        if (this.erraten == this.anzahl) return true;
        return false;
    }
    public void start() {
        while (true) {
                try {
                    anzahl = view.spiellaenge();
                    break;
                } catch {
                    // throw exception
            }
        }
        wortliste = liste.generieren(anzahl);
    xxx: while (true) {
    for (int i = 0; i<liste.length; i++) {
            aufteilen = wortliste[i].split(" ");
            wort = aufteilen[0];
            url = aufteilen[1];

            String antwort;

            while (richtig == false) {
                antwort = TrainerView(url);

                switch (antwort) {
                    case "stop":
                        super. break;
                    case "eingabe":
                        if (view.getEingabe().equals(wort)) {
                            richtig == true;
                            erraten++;
                            if (gewonnen) {
                                view.gratuliere();
                                break xxx;
                            }
                        } else {

                            richtig = false;

                        }
                        break;
                 }
               }
            }
         }
     }
 }