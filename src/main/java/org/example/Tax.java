package org.example;

public class Tax {

    Employe emp;

    public Tax(Employe emp) {
        this.emp = emp;
    }

    public double calculNet(){
        return emp.getBrute()  - calculTax();
    }

    public double calculTax(){
        return emp.getBrute() * getTaux();
    }

    private double getTaux(){
        double taux;

        if (emp.getBrute() >= 60000.0){
            taux = .15;
        } else if (emp.getBrute() >= 45000.0) {
            taux = .1;
        } else if (emp.getBrute() >= 3500){
            taux = .075;
        } else {
            taux = 0.0;
        }

        double reduction;

        if ((taux > 0.0) &&( emp.getEnfant() > 0)){
            reduction = 0.025;
        } else {
            reduction = 0.0;
        }

        return taux - reduction;
    }

}
