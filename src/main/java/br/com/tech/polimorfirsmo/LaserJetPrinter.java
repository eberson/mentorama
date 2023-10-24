package br.com.tech.polimorfirsmo;

import java.util.logging.Logger;

public class LaserJetPrinter implements Printer {
    @Override
    public void print() {
        Logger.getLogger(LaserJetPrinter.class.getName()).info("printing through laser...");
    }
}
