package main.java.com.worttrainer.controller;

import main.java.com.worttrainer.model.Wortliste;
import main.java.com.worttrainer.model.Worttrainer;
import main.java.com.worttrainer.view.TrainerGUI;

public class TrainerController {

    public static void main(String[] args) {
        Worttrainer wt = new Worttrainer();
        Wortliste wl = new Wortliste();
        TrainerGUI view = new TrainerGUI(wl, wt);

        try {
            wt.start(wl, view);
        } catch (Exception e) {
            // abfangen
        }
    }
}
