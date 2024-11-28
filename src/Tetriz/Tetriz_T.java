package Tetriz;

import java.awt.Color;

public class Tetriz_T extends Tetriz{

   
    public Tetriz_T(){
        crear(Color.magenta);
    }

    public void setXY(int x, int y){

        //   *
        // * * *
        b[0].x = x;
        b[0].y = y;
        b[1].x = x;
        b[1].y = y - Bloque.TAMANIO;
        b[2].x = x - Bloque.TAMANIO;
        b[2].y = y;
        b[3].x = x + Bloque.TAMANIO;
        b[3].y = y;
    }

    public void getDireccion1(){
 
        //   *
        // * * *
        temB[0].x = b[0].x;
        temB[0].y = b[0].y;
        temB[1].x = b[0].x;
        temB[1].y = b[0].y - Bloque.TAMANIO;
        temB[2].x = b[0].x - Bloque.TAMANIO;
        temB[2].y = b[0].y;
        temB[3].x = b[0].x + Bloque.TAMANIO;
        temB[3].y = b[0].y;

        actualizarXY(1);
    }

    public void getDireccion2(){

        // *
        // * * 
        // *
        temB[0].x = b[0].x;
        temB[0].y = b[0].y;
        temB[1].x = b[0].x + Bloque.TAMANIO;
        temB[1].y = b[0].y;
        temB[2].x = b[0].x;
        temB[2].y = b[0].y - Bloque.TAMANIO;
        temB[3].x = b[0].x;
        temB[3].y = b[0].y + Bloque.TAMANIO;

        actualizarXY(2);
    }

    public void getDireccion3(){

        // * * *
        //   *
        temB[0].x = b[0].x;
        temB[0].y = b[0].y;
        temB[1].x = b[0].x + Bloque.TAMANIO;
        temB[1].y = b[0].y;
        temB[2].x = b[0].x - Bloque.TAMANIO;
        temB[2].y = b[0].y;
        temB[3].x = b[0].x;
        temB[3].y = b[0].y + Bloque.TAMANIO;

        actualizarXY(3);
    }

    public void getDireccion4(){

        //   *
        // * * 
        //   *
        temB[0].x = b[0].x;
        temB[0].y = b[0].y;
        temB[1].x = b[0].x;
        temB[1].y = b[0].y - Bloque.TAMANIO;
        temB[2].x = b[0].x - Bloque.TAMANIO;
        temB[2].y = b[0].y;
        temB[3].x = b[0].x;
        temB[3].y = b[0].y + Bloque.TAMANIO;

        actualizarXY(4);
    }
    
}
