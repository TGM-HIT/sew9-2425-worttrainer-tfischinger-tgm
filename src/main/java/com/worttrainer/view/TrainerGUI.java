package main.java.com.worttrainer.view;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import main.java.com.worttrainer.model.Wortliste;
import main.java.com.worttrainer.model.Worttrainer;

public class TrainerGUI {
    Wortliste wortliste;
    Worttrainer worttrainer;
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
        try {
            url = new URL(link);

        } catch (MalformedURLException e) {

        }
        ImageIcon icon = new ImageIcon(url);
        icon.setImage(icon.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT));
        JLabel bildLabel = new JLabel(icon);
        bildLabel.setSize(new Dimension(10, 10));
        antwort = JOptionPane.showInputDialog(null, bildLabel, "Welches Wort wird dargestellt?", JOptionPane.QUESTION_MESSAGE);
        return antwort;
    }
    }