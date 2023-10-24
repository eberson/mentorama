package br.com.tech.plural;

public class PluralEndIL implements Plural {
    @Override
    public boolean accept(String word) {
        return word.endsWith("il");
    }

    @Override
    public String makePlural(String word) {
        return word.substring(0, word.length() - 1) + "s";
    }
}
