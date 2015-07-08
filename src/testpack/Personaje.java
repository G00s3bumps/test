package testpack;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Personaje {

	private int i, j, index;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private Base base;
    
    public Personaje() {
        
        initCraft();
    }
    
    private void initCraft() {
        
       // ImageIcon ii = new ImageIcon("held.gif");
        image = new ImageIcon(getClass().getResource("held.gif")).getImage();
        
        x = 0;
        y = 0;
    }

    
    
   
    public void move() {
        x += dx;
        y += dy;
     //   coor2[2][3] = 1;
        
       if ( x <= 64 && x >=32 &&y >=0 && y <=32){
        	//System.out.println(Base.getID);
        	//System.out.println("ESTAS EN EL CUADRO 2");
        	x += dx = 2;
        	
       }
    }
    
    

    
    
    public void coor(int i, int j, int index){
    	
    	
    	this.i = i;
    	this.j = j;
    	this.index = index;
    	//System.out.println(this.i + " " + this.j + " " + this.index);
    	
    	 if ( i == 0){
    		// System.out.println("hay");
    	
    		 
    	 }
    	 
    	 
    	 int[][] coor2 = new int[8][10];
    	 coor2[2][3] = 10;
    	 for(int b = 0; i < 8; i++){
    			for(int c = 0; j < 10; j++){
    		//		System.out.println(coor2[i][j]);
    			}
    		//	System.out.println();
    		}
    	 
    }
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
    
    
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
