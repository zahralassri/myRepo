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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enginner)) return false;
        if (!super.equals(o)) return false;
        Enginner enginner = (Enginner) o;
        return Objects.equals(getDomaine(), enginner.getDomaine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDomaine());
    }
}






