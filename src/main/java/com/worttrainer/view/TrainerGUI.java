package main.java.com.worttrainer.view;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import main.java.com.worttrainer.model.Wortliste;
import main.java.com.worttrainer.model.Worttrainer;

public class TrainerGUI {
    private Wortliste wortliste;
    private Worttrainer worttrainer;
    String antwort;
    URL url;

    public TrainerGUI(Wortliste wortliste, Worttrainer worttrainer) {
        this.wortliste = wortliste;
        this.worttrainer = worttrainer;
    }
    public int spiellaenge() {
        int laenge;
        while (true) {
            String antwort = JOptionPane.showInputDialog(null, "Wieviele Worte sollen erraten werden?", JOptionPane.QUESTION_MESSAGE);
            try {
                laenge = Integer.parseInt(antwort);
                break;
            } catch(NumberFormatException e) {
                //erneute eingabe
            }
        }
        return laenge;
    }
    public void gratuliere() {
        JOptionPane.showMessageDialog(null, "Glückwunsch! Sie haben alle Worte erraten");
    }

    public String wortAbfrage(String link) {
        boolean schleife = true;
        while (schleife) {

            try {
                url = new URL(link);

            } catch (MalformedURLException e) {

            }
            ImageIcon icon = new ImageIcon(url);
            JLabel bildLabel = new JLabel(icon);
            antwort = JOptionPane.showInputDialog(null, bildLabel, "Welches Wort wird dargestellt?", JOptionPane.QUESTION_MESSAGE);
        }
        return antwort;
    }
}