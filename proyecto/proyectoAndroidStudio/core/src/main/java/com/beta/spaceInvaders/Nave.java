package com.beta.spaceInvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Nave extends ObjetoVolador{

    //los getters & setters deberían ir en ObjetoVolador
    //click derecho > generate > getters & setters

    public enum direccion {Derecha, Izquierda} //Es público para que MoverseX no se queje
    public Nave(int posicionX, int posicionY, int tamanioX, int tamanioY, int velocidadX, int velocidadY, boolean activo, Texture imagen) {
        super(posicionX, posicionY, tamanioX, tamanioY, velocidadX, velocidadY, activo, imagen);
    }

    public void moverseX(direccion direccion) {
        switch(direccion) {
            case Derecha:
                if (getPosicionX() > 1) posicionX++;
                break;
            case Izquierda:
                if (getPosicionX() < Gdx.graphics.getWidth()) posicionY++;
                break;
        }
    }

    //public void disparar() {} Disparar debería ir en enemigo y player, o al menos, que se implemente aquí, pero el UML dice que no debería ser el caso
    //habría que hacer un array de enemigos, y que llamar a esto compruebe con los datos de dicho array, si hay algo en la coordenada Y activo
    //todo esto dentro del main



    //voy a suponer que a esto se le va a pasar un array de enemigos, Y que es para comprobar colisiones del jugador con estos
    //Yo implementaría esto en jugador, no aquí, y lo llamaría desde main
    //Ojo, esto es casi pseudo código
    //TODO; Arreglar esto
    public boolean comprobarColisiones(Enemigo[] Enemigos) {
        for(int i = 0;i < Enemigos.length; i++) {
            if (Enemigos[i].getY == getPosicionX()) {
                if (getPosicionX() == Enemigos[i].getX()) {
                    return true;
                }
            }
        }
        return false;
    }
}