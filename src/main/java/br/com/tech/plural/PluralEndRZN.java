package br.com.tech.plural;

public class PluralEndRZN implements Plural{
    @Override
    public boolean accept(String word) {
        return word.endsWith("r") || word.endsWith("z") || word.endsWith("n");
    }

    @Override
    public String makePlural(String word) {
        return word + "es";
    }
}
