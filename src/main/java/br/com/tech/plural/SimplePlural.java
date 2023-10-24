package br.com.tech.plural;

public class SimplePlural implements Plural{

    @Override
    public boolean accept(String word) {
        return true;
    }

    @Override
    public String makePlural(String word) {
        return word + "s";
    }
}
