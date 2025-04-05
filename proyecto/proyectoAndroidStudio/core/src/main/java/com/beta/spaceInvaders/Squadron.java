package com.beta.spaceInvaders;

import java.util.List;

public class Squadron {
    private List<Enemigo> enemigos;

    public Squadron(List<Enemigo> enemigos) {
        this.enemigos = enemigos;
    }

    public void moverSquadron() {
        for (Enemigo enemigo : enemigos) {
            enemigo.moverEnemigo();  // Llama al método individual
        }
    }

    public List<Enemigo> getEnemigos() {
        return enemigos;
    }
}

