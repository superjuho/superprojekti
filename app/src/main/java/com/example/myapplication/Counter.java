package com.example.myapplication;



public class Counter {

    private int greats, fines, ngreats, bads, awfuls;

    public Counter (){

    }

    public void addGreats() {
        greats++;
    }

    public void addFines() {
        fines++;
    }

    public void addNgreats() {
        ngreats++;
    }

    public void addBads() {
        bads++;
    }

    public void addAwfuls() {
        awfuls++;
    }

    public int getGreats() {
        return greats;
    }

    public int getFines() {
        return fines;
    }

    public int getNgreats() {
        return ngreats;
    }

    public int getBads() {
        return bads;
    }

    public int getAwfuls() {
        return awfuls;
    }

}
