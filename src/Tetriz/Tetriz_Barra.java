package Tetriz;

import java.awt.Color;

public class Tetriz_Barra extends Tetriz{

    public Tetriz_Barra(){
        crear(Color.cyan);
    }

    public void setXY(int x, int y){

        // * * * *

        b[0].x = x;
        b[0].y = y;
        b[1].x = x - Bloque.TAMANIO;
        b[1].y = y;
        b[2].x = x + Bloque.TAMANIO;
        b[2].y = y;
        b[3].x = x + 2*Bloque.TAMANIO;
        b[3].y = y;
    }

    public void getDireccion1(){

        //   centro
        // * * * *
        temB[0].x = b[0].x;
        temB[0].y = b[0].y;
        temB[1].x = b[0].x - Bloque.TAMANIO;
        temB[1].y = b[0].y;
        temB[2].x = b[0].x + Bloque.TAMANIO;
        temB[2].y = b[0].y;
        temB[3].x = b[0].x + 2*Bloque.TAMANIO;
        temB[3].y = b[0].y;

        actualizarXY(1);
    }

    public void getDireccion2(){

        // *
        // * centro
        // *
        // *
        temB[0].x = b[0].x;
        temB[0].y = b[0].y;
        temB[1].x = b[0].x;
        temB[1].y = b[0].y - Bloque.TAMANIO;
        temB[2].x = b[0].x;
        temB[2].y = b[0].y + Bloque.TAMANIO;
        temB[3].x = b[0].x;
        temB[3].y = b[0].y + 2*Bloque.TAMANIO;

        actualizarXY(2);

    }

    public void getDireccion3(){
      
        //     Centro
        // * * * *
        
        getDireccion1();

        actualizarXY(3);
    }

    public void getDireccion4(){

        // *
        // * centro
        // *
        // *
        
        getDireccion2();

        actualizarXY(4);
    }

    
}
