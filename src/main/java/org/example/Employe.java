package org.example;

public class Employe {
    String nom;
    int age;
    double brute;
    int enfant;

    public Employe(String nom, int age, double brute, int enfant) {
        this.nom = nom;
        this.age = age;
        this.brute = brute;
        this.enfant = enfant;
    }

    @Override
    public String toString() {
        return nom + " - " +
                age +
                " - " +
                brute +
                " - " +
                enfant;
    }
}
