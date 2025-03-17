package com.beta.spaceInvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ObjetoVolador {
    private int posicionX;
    private int posicionY;
    private int tamanioX;
    private int tamanioY;
    private int velocidadX;
    private int velocidadY;
    private boolean activo;
    private Texture imagen;

    public ObjetoVolador(int posicionX, int posicionY, int tamanioX, int tamanioY, int velocidadX, int velocidadY, boolean activo, Texture imagen) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tamanioX = tamanioX;
        this.tamanioY = tamanioY;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
        this.activo = activo;
        this.imagen = imagen;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public int getTamanioX() {
        return tamanioX;
    }

    public int getTamanioY() {
        return tamanioY;
    }

    public int getVelocidadX() {
        return velocidadX;
    }

    public int getVelocidadY() {
        return velocidadY;
    }

    public Texture getImagen() {
        return imagen;
    }

    public boolean getActivo() {
        return activo;
    }

    public void pintarse(SpriteBatch batch) {
        batch.draw(imagen,posicionX,posicionY,tamanioX,tamanioY);
    }
}