package Tetriz;

import java.awt.Color;
import java.awt.Graphics2D;

import main.MovimientoTeclas;
import main.PlayManager;

public class Tetriz {

    public Bloque b[] = new Bloque[4];
    public Bloque temB[] = new Bloque[4];
    int contadorAutoCaida= 0;
    public int direccion = 1; //hay cuatro direcciones 1/2/3/4

    //boolean
    boolean chocaIzquierda, chocaDerecha, chocaAbajo;
    
    
    public void crear(Color c){

                //hay cuatro clases por q en un tetriz tiene cuatro bloques 
        b[0] = new Bloque(c);
        b[1] = new Bloque(c);
        b[2] = new Bloque(c);
        b[3] = new Bloque(c);
        temB[0] = new Bloque(c);
        temB[1] = new Bloque(c);
        temB[2] = new Bloque(c);
        temB[3] = new Bloque(c);
    }

    public void setXY(int x, int y){}

    //actualiza la direecion, se podria usar solo la matriz temporal, pero no, es mejor actualizar la matriz b[] para las colisciones
    public void actualizarXY(int direccion){

        this.direccion = direccion;

        b[0].x = temB[0].x;
        b[0].y = temB[0].y;
        b[1].x = temB[1].x;
        b[1].y = temB[1].y;
        b[2].x = temB[2].x;
        b[2].y = temB[2].y;
        b[3].x = temB[3].x;
        b[3].y = temB[3].y;


    }
    public void getDireccion1(){}
    public void getDireccion2(){}
    public void getDireccion3(){}
    public void getDireccion4(){}
    public void coliscionMovimiento(){}
    public void colicionRotacion(){}
    public void  actualizar(){

        //movimiento del bloque
        if(MovimientoTeclas.arribaBoton){

           switch (direccion) {
            case 1: getDireccion2(); break;
            case 2: getDireccion3(); break;
            case 3: getDireccion4(); break;
            case 4: getDireccion1(); break;
         }
            
            MovimientoTeclas.arribaBoton =false;


        }
        if(MovimientoTeclas.abajoBoton){

            b[0].y += Bloque.TAMANIO;
            b[1].y += Bloque.TAMANIO;
            b[2].y += Bloque.TAMANIO;
            b[3].y += Bloque.TAMANIO;
            contadorAutoCaida = 0;

            MovimientoTeclas.abajoBoton = false;

        }
        if(MovimientoTeclas.izquierdaBoton){

            b[0].x -= Bloque.TAMANIO;
            b[1].x -= Bloque.TAMANIO;
            b[2].x -= Bloque.TAMANIO;
            b[3].x -= Bloque.TAMANIO;
            contadorAutoCaida = 0;

            MovimientoTeclas.izquierdaBoton = false;

        }
        if(MovimientoTeclas.derechaBoton){

            b[0].x += Bloque.TAMANIO;
            b[1].x += Bloque.TAMANIO;
            b[2].x += Bloque.TAMANIO;
            b[3].x += Bloque.TAMANIO;
            contadorAutoCaida = 0;

            MovimientoTeclas.derechaBoton = false;

        }


        contadorAutoCaida++;

        if(contadorAutoCaida == PlayManager.intervaloCaida){

            b[0].y += Bloque.TAMANIO;
            b[1].y += Bloque.TAMANIO;
            b[2].y += Bloque.TAMANIO;
            b[3].y += Bloque.TAMANIO;
            contadorAutoCaida = 0;

        }
    };

    public void dibujar(Graphics2D g2){

        int margen = 5 ;

        g2.setColor(b[0].c);
        
        g2.fillRect(b[0].x + margen, b[0].y + margen, Bloque.TAMANIO - (margen*2), Bloque.TAMANIO - (margen*2));
        g2.fillRect(b[1].x + margen, b[1].y + margen, Bloque.TAMANIO - (margen*2), Bloque.TAMANIO - (margen*2));
        g2.fillRect(b[2].x + margen, b[2].y + margen, Bloque.TAMANIO - (margen*2), Bloque.TAMANIO - (margen*2));
        g2.fillRect(b[3].x + margen, b[3].y + margen, Bloque.TAMANIO - (margen*2), Bloque.TAMANIO - (margen*2));

    }
}
