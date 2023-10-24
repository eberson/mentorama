package br.com.tech.plural;

public class PluralXL implements Plural{
    @Override
    public boolean accept(String word) {
        return word.endsWith("al") || word.endsWith("el") || word.endsWith("ol") || word.endsWith("ul");
    }

    @Override
    public String makePlural(String word) {
        return word.substring(0, word.length() - 1) + "is";
    }
}
