package main.java.com.worttrainer.persistenz;

import main.java.com.worttrainer.model.Worttrainer;
import java.io.*;

import netscape.javascript.JSObject;

/**
 * Die Klasse Persistenz speichert den Spielstand eines Worttrainers.
 */
public class Persistenz {

    File file = new File("persistenz.txt");

    public void speichern(int anzahl, int erraten) {
      /*  int anzahl = trainer.getAnzahl();
        int erraten = trainer.getErraten();
        */

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(anzahl + " " + erraten);
        } catch(Exception e) {
            //file not found
        }
    }
        public void laden() {

            int anzahl;
            int erraten;
            String line="";
            String[] split;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    line = br.readLine();

                } catch(IOException ioe) {
                //file not found
            }
            split = line.split(" ");
            anzahl = Integer.parseInt(split[0]);
            erraten  = Integer.parseInt(split[1]);
            /*
            trainer.setAnzahl(anzahl);
            trainer.setErraten(erraten);
             */
        }
    }
