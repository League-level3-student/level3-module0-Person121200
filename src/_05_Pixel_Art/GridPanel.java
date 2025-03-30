package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel{

    private static final long serialVersionUID = 1L;
    private int windowWidth;
    private int windowHeight;
    private int pixelWidth;
    private int pixelHeight;
    private int rows;
    private int cols;

    // 1. Create a 2D array of pixels. Do not initialize it yet.
    Pixel[][] pixels;
    private Color color;

    public GridPanel(int w, int h, int r, int c) {
        this.windowWidth = w;
        this.windowHeight = h;
        this.rows = r;
        this.cols = c;

        this.pixelWidth = windowWidth / rows;
        this.pixelHeight = windowHeight / cols;

        color = Color.BLACK;

        setPreferredSize(new Dimension(windowWidth, windowHeight));

        // 2. Initialize the pixel array using the rows and cols variables.
        pixels = new Pixel[rows][cols];


        // 3. Iterate through the array and initialize each element to a new pixel.
        for(int i = 0; i< pixels.length; i++) {
        	for(int j = 0; j<pixels[i].length; j++) {
        		pixels[i][j] = new Pixel(i, j);
        	}
        }

    }

    public void setColor(Color c) {
        color = c;
    }

    public void clickPixel(int mouseX, int mouseY) {
        // 5. Use the mouseX and mouseY variables to change the color
        //    of the pixel that was clicked. *HINT* Use the pixel's dimensions.
    	if(mouseX > windowWidth) {
    		return;
    	}
    	if(mouseX < 0) {
    		return;
    	}
    	if(mouseY < 0) {
    		return;
    	}
    	if(mouseY > windowHeight) {
    		return;
    	}
    	
    	pixels[mouseX/pixelWidth][mouseY/pixelHeight].color = color;
    	System.out.println("REPAINTING");
    	repaint();



    }

    @Override
    public void paintComponent(Graphics g) {
    	
        for(int i = 0; i< pixels.length; i++) {
        	for(int j = 0; j<pixels[i].length; j++) {
        	    int cellSizeX = windowWidth/rows;
        	    int cellSizeY = windowHeight/cols;
        		g.setColor(pixels[i][j].color);
        		g.fillRect(pixels[i][j].x*cellSizeX, pixels[i][j].y*cellSizeY, cellSizeX, cellSizeY);
        	    g.setColor(Color.BLACK);

        		g.drawRect(pixels[i][j].x*cellSizeX, pixels[i][j].y*cellSizeY, cellSizeX, cellSizeY);


        	}
        }
        // 4. Iterate through the array.
        //    For every pixel in the list, fill in a rectangle using the pixel's color.
        //    Then, use drawRect to add a grid pattern to your display.

    }
}
