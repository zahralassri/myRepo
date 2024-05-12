package org.udemy.junit;

import java.util.Objects;

public class Enginner extends Person{

    private String Domaine;

    public Enginner(String domaine) {
        Domaine = domaine;
    }

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String domaine) {
        Domaine = domaine;
    }

    @Override
    public String toString() {
        return "Enginner{" +
                "Domaine='" + Domaine + '\'' +
                '}';
    }
}






