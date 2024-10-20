package main.java.com.worttrainer.model;

import main.java.com.worttrainer.model.Wortliste;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class WortlisteTest {

    @Test
    public void generieren() {
        Wortliste w = new Wortliste(); // Instanziiere die Wortliste
        try {
            String[] generieren = w.generieren(3);
        } catch (IOException e) {
            //
        }
        int eintraegeErwartet = 10; // Erwartete Anzahl der Einträge

        // Falls 'einträge' eine öffentliche Variable ist, greife direkt darauf zu:
        int eintraege = w.einträge; // Alternativ: Verwende einen Getter (z.B. w.getEintraege())

        // Überprüfe, ob der tatsächliche Wert den Erwartungen entspricht
        assertEquals(eintraegeErwartet, eintraege);
    }
}