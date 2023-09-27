package br.com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.modelo.Pessoa;

@RestController
public class Controle {


    @GetMapping("")
    public static String mensagem()
    {
        return "Hello World!";
    }
     @GetMapping("/boasVindas/{nome}")
    public  static String boasVindas(@PathVariable String nome)
    {
        return "Hello World!" +nome;
    }
    
    @PostMapping("/pessoa")
    public   Pessoa pessoa(@RequestBody Pessoa p)
    {
        return p;
    }
    
}
