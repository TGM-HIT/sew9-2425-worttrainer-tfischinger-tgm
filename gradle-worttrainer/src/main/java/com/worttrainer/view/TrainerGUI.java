package com.worttrainer;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TrainerGUI {
    private WortListe wortliste;
    private Worttrainer worttrainer;
    String antwort;

    public TrainerGUI(WortListe wortliste, Worttrainer worttrainer) {
        this.wortliste = wortliste;
        this.worttrainer = worttrainer;
    }
    public int spiellaenge {
        while (true) {
            String antwort = JOptionPane.showInputDialog(null, "Wieviele Worte sollen erraten werden?", JOptionPane.QUESTION_MESSAGE);
            try {
                int laenge = Integer.parseInt(antwort);
                break;
            } catch {
                //erneute eingabe
            }
        }
        return laenge;
    }
    public void gratuliere() {
        JOptionPane.showMessageDialog(null, "Glückwunsch! Sie haben alle Worte erraten");
    }

    public String TrainerGUI(String url) {
        boolean schleife = true;
        while (schleife) {
            URL url = new URL(url);
            ImageIcon icon = new ImageIcon(url);

            JLabel bildLabel = new JLabel();
            label.setSize(new Dimension(20,10));
            label.setIcon(icon);

            antwort = JOptionPane.showInputDialog(null, bildLabel,"Welches Wort wird dargestellt?", JOptionPane.QUESTION_MESSAGE);

            return antwort;
        }
    }
}