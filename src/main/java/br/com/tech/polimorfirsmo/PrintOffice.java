package br.com.tech.polimorfirsmo;

public class PrintOffice {

    public void doPrint(Printer printer) {
        printer.print();
    }

    public void doPrintInColor(DeskJetPrinter printer) {
        printer.print();
    }

    public void doPrintInLaser(LaserJetPrinter printer) {
        printer.print();
    }

}
