package main.java.com.worttrainer.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorttrainerTest {
    @Test
    public void testGewonnen() {
        Worttrainer trainer = new Worttrainer();

        // Beispielwerte für erraten und anzahl setzen
        trainer.erraten = 5;
        trainer.anzahl = 5;

        // Erwartetes Ergebnis: true, weil erraten == anzahl
        assertTrue(trainer.gewonnen());

        // Ändern der Werte für einen weiteren Testfall
        trainer.erraten = 4;
        trainer.anzahl = 5;

        // Erwartetes Ergebnis: false, weil erraten != anzahl
        assertFalse(trainer.gewonnen());
    }

}