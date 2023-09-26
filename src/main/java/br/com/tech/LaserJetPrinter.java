package br.com.tech;

import java.util.logging.Logger;

public class LaserJetPrinter implements Printer {
    @Override
    public void print() {
        Logger.getLogger(LaserJetPrinter.class.getName()).info("printing through laser...");
    }
}
