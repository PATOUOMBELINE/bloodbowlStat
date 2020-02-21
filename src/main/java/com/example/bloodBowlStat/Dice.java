package com.example.bloodBowlStat;

public class Dice {

    private String nameDice;
    private int nbrDe;

    public String getNameDice() {
        return nameDice;
    }

    public void setNameDice(String nameDice) {
        this.nameDice = nameDice;
    }

    public int getNbrDe() {
        return nbrDe;
    }

    public void setNbrDe(int nbrDe) {
        this.nbrDe = nbrDe;
    }

    public Dice(String nameDice, int nbrDe) {
        this.nameDice = nameDice;
        this.nbrDe = nbrDe;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "nameDice='" + nameDice + '\'' +
                ", nbrDe=" + nbrDe +
                '}';
    }
}
