package org.example;

public class Tax {

    Employe emp;

    public Tax(Employe emp) {
        this.emp = emp;
    }

    public double calculNet(){
        return emp.brute  - calculTax();
    }

    public double calculTax(){
        return emp.brute * getTaux();
    }

    private double getTaux(){
        double taux;

        if (emp.brute >= 60000.0){
            taux = .15;
        } else if (emp.brute >= 45000.0) {
            taux = .1;
        } else if (emp.brute >= 3500){
            taux = .075;
        } else {
            taux = 0.0;
        }

        double reduction;

        if ((taux > 0.0) &&( emp.enfant > 0)){
            reduction = 0.025;
        } else {
            reduction = 0.0;
        }

        return taux - reduction;
    }

}
