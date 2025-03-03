package com.beta.spaceInvaders;

public class ObjetoVolador {
    private int x;
    private int y;
    private int velocidadX;
    private int velocidadY;
    private boolean activo;

    public ObjetoVolador(int x, int y, int velocidadX, int velocidadY, boolean activo) {
        this.x = x;
        this.y = y;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
        this.activo = activo;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVelocidadX() {
        return velocidadX;
    }

    public int getVelocidadY() {
        return velocidadY;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean mover(int direccion, int limiteX, int limiteY) {
        switch (direccion) {
            case 1:
                if(this.x < limiteX) {
                    this.x++; //Derecha
                    return true;
                }
                break;
            case 2:
                if(this.x > 0) {
                    this.x--; //Izquierda
                    return true;
                }
                break;
            case 3:
                if(this.y < limiteY) {
                    this.y++; //Arriba
                    return true;
                }
                break;
            case 4:
                if(this.y > 0) {
                    this.y--; //Abajo
                    return true;
                }
                break;
        }
        return false;
    }

    public boolean esActivo() {
        return this.activo;
    }

    public boolean desaparecer() {
        if (this.activo) {
            this.activo = false;
            return true;
        }
        return false;
    }
}