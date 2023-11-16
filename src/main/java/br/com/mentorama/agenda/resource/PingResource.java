package br.com.mentorama.agenda.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/ping")
public class PingResource {

    @GetMapping
    public String ping() {
        return LocalDateTime.now().toString();
    }

    @GetMapping("/alternative")
    public String pingAlternative() {
        return LocalDate.now().toString();
    }

}
