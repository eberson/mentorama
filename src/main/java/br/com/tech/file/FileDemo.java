package br.com.tech.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        var path = "/Users/eberson/Downloads/_select_s_status_s_state_sp_from_settlement_payment_sp_inner_joi_202305161704.csv";

        var list = List.of("a", "b", "c");

        for (var content : list){
            System.out.println(content);
        }

        //try with resources
        try (var lines = Files.lines(Path.of(path))) {
            lines.forEach(System.out::println);
        }
    }
}
