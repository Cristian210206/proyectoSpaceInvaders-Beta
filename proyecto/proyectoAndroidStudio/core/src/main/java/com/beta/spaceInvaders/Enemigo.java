package com.beta.spaceInvaders;

public class Enemigo {
    private int x, y;
    private int velocidad = 5;

    public Enemigo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverEnemigo() {
        x += velocidad;
        // O cualquier otra lógica de movimiento
    }
}

