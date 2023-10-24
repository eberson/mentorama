package br.com.tech.polimorfirsmo;

public class Application {
    public static void main(String[] args) {
        /*
        SOLID
        S => Single Responsibility
        O => Open Closed
        L => Liskov's Substitution Principle
        I => Interface Segregation
        D => Dependency Inversion
         */

        var laserJet = new LaserJetPrinter();
        var deskJet = new DeskJetPrinter();

        var office = new PrintOffice();

        office.doPrint(laserJet);
        office.doPrint(deskJet);
        office.doPrintInColor(deskJet);
        office.doPrintInLaser(laserJet);
    }
}
