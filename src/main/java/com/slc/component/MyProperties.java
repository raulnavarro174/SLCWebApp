package com.slc.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class MyProperties {

    private String name;

    private String usuari;

    private String contrassenya;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getContrassenya() {
        return contrassenya;
    }

    public void setContrassenya(String contrassenya) {
        this.contrassenya = contrassenya;
    }
}
