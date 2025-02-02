package com.terabyte.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {
    public String chamaMeuComponente() {
        return "Chamando o componente";
    }
}
