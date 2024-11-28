package Tetriz;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Bloque extends Rectangle{

    public int x;
    public int y;
    public static final int TAMANIO = 30;
    public Color c;

    public Bloque(Color c){
        this.c = c;
    }

    public void dibujo(Graphics2D g2){

        g2.setColor(c);
        g2.fillRect(x, y, TAMANIO, TAMANIO);
    }
    
}
