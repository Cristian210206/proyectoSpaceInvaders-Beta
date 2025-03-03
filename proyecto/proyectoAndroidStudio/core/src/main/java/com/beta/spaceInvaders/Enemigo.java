package com.beta.spaceInvaders;
public class Enemigo extends Nave {
    private int danio;

    public Enemigo(int danio) {
        this.danio = danio;
    }

    public int getDanio() {
        return danio;
    }

    public boolean perderVida() {
        if(this.vida >0) {
            this.vida--;
            return true;
        }
        return false;
    }
}