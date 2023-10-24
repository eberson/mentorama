package br.com.tech.polimorfirsmo;

import java.util.logging.Logger;

public class DeskJetPrinter implements Printer {
    @Override
    public void print() {
        Logger.getLogger(DeskJetPrinter.class.getName()).info("printing through colors...");
    }
}
