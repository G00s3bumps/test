package testpack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Base extends JPanel implements ActionListener {

	private int posX, posY;
	private mapa mapa;
    private Timer timer;
    private Personaje pj = new Personaje();
    int test;
    private final int DELAY = 10;
    int posYnuevo;
    int posXnuevo;

 
    public Base() {

        iniciarBase();
    }
    
    private void iniciarBase() {
        
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        //CREANDO NUEVOS OBJETOS
       // personaje = new Personaje();
        mapa = new mapa(0, 0);
        
        //
        timer = new Timer(DELAY, this);
        timer.start();   
        
        
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;

        int index = 0; // ID imagen
        int x = mapa.Anchura;
        int y = mapa.Altura;
        
        
        //añadir: si el personaje está sobre i = and j = 0 hacer algo
        
        while(index<(x*y)){
        	//añadir imagenes
            for(int i=0; i<x; i++){
                for(int j=0; j<y; j++){
                    g2d.drawImage(mapa.getTileImage(i, j), posX, posY, this);
                    posX += 32;
                    //tamaño de cada cuadro 32pixeles
                    index++;
                   
                    //System.out.println(mapa.getMap(i, j));
					System.out.println(i + " " + j + " - " + posX + " , " + posY + " INDEX: " + index ); //donde estan situados el suelo
                    test++;
                    
                   pj.coor(i, j, index);
                  
                } 
                posX = 0;
                
                posY += 32;
             
                
               
            }
            posY = 0;
            
        }
        
        
        
        g2d.drawImage(pj.getImage(), pj.getX(), pj.getY(), this); 
        
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
   
    
    //TECLADO

    @Override
    public void actionPerformed(ActionEvent e) {
        
    	pj.move();
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
        	pj.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
        	pj.keyPressed(e);
        }
    }
}