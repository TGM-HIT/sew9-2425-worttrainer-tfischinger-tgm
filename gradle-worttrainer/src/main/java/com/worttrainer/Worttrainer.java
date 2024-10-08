package com.worttrainer;

//Worttrainer wird hier implementiert
public class Worttrainer(Wortliste liste) {
    this.liste = liste;
    int anzahl = 0;
    int erraten = 0;
    //TrainerView view = new Trainerview(url);
    String[] aufteilen;
    String[] wortliste;
    String url;
    String wort;
    boolean erraten = false;
    boolean gewonnen = false;
    public void start() {
        while (gewonnen == false) {
  //          view = new TrainerView()
                try {
                    anzahl = view.getEingabe();
                    break;
                } catch {
                    // throw exception
            }
        }
        wortliste = liste.generieren(anzahl);
    for (int i = 0; i<liste.length; i++) {
            aufteilen = wortliste[i].split(" ");
            wort = aufteilen[0];
            url = aufteilen[1];

            //view = new TrainerView(url);

            while (richtig == false) {
                /* switch (view.getEingabe()) {
                case "stop":
                    super.break;
                case "eingabe":
                    if(view.getEingabe().equals(wort)) {
                    richtig == true;
                    erraten++;
                    if (erraten == anzahl) {
                    gewonnen = true;
                    } else {
                    richtig = false;
                    }
                    break;
                    }

                 */
            }
        }
    }
}