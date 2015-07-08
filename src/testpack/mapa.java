package testpack;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class mapa {
	//DIBUJANDO MAPA & ASIGNANDO VARIABLES
	
	       
	    int Altura = 10;
        int Anchura = 8;
        
        int mapaAlto = Altura;
	    int mapaAncho = Anchura;
	    private int[][] mapa2;
		private int sueloAncho, sueloAlto;

	    // [FILA][COLUMNA]
	    
	    private int[][] mapa = new int[mapaAncho][mapaAlto]; {
	    	//0 = suelo
	    	//1 = pared
	    				mapa[2][3] = 1; // altura, anchura
	    				mapa[4][4] = 1;
	    			
	    }
	    
	    private Image[] sueloImagen; // array
		
	    
	    public mapa(int mapaAncho, int mapaAlto){
	        this.mapaAncho = mapaAncho;
	        this.mapaAlto = mapaAlto;
	        this.sueloImagen = new Image[4]; // creo 2 sueloImagen
	        this.sueloImagen[0] = new ImageIcon(this.getClass().getResource("baldosa.png")).getImage(); // ASIGNANDO IMAGEN
	        this.sueloImagen[1] = new ImageIcon(this.getClass().getResource("pared.png")).getImage();
	        this.sueloAncho = this.sueloImagen[0].getWidth(null); // ANCHURA IMAGEN
	        this.sueloAlto = this.sueloImagen[0].getHeight(null); //ALTURA IMAGEN
	        
	       
	    }
	    
	    ////////////////////////////////////////////////////////////////////////////
	    
	    public int getMapWidthInTiles(){
	        return this.mapaAncho;
	    }

	    public int getMapHeightInTiles(){
	        return this.mapaAlto;
	    }

	    public int getTileWidth(){
	        return this.sueloAncho;
	    }

	    public int getTileHeight(){
	        return this.sueloAlto;
	    }

	    public Image getTileImage(int index, int index2){
	        return this.sueloImagen[mapa[index][index2]];
	        
	     
	    }
	    


}
