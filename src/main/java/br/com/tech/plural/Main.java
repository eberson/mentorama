package br.com.tech.plural;

import java.util.List;

public class Main {

    private static final List<Plural> REGRAS = List.of(
            new PluralEndRZN(),
            new PluralXL(),
            new PluralEndIL(),
            new SimplePlural()
    );

    private static final Output OUTPUT = System.out::println;

    public static void main(String[] args) {
        var words = List.of("pastel", "anzol", "pardal", "azul", "frota", "azar", "cartaz", "cânon", "anil");

        words.stream()
                .map(Main::makePlural)
                .forEach(OUTPUT::print);
    }

    public static String makePlural(String word) {
//        for (var i = 0; i < REGRAS.size(); i++) {
//            var regra = REGRAS.get(i);
//
//            if (regra.accept(word)){
//                return regra.makePlural(word);
//            }
//        }

        return REGRAS.stream()
                .filter(r -> r.accept(word))
                .findFirst()
                .map(r -> r.makePlural(word))
                .orElseThrow(() -> new IllegalStateException("Não há regra compatível"));
    }

    //substituido por uma implementacao funcional
//    private static class DefaultOutput implements Output {
//        @Override
//        public void print(String value) {
//            System.out.println(value);
//        }
//    }
}
