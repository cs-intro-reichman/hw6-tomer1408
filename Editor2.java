import java.awt.Color;

public class Editor2 {

    public static void main(String[] args) {
        String fileName = args[0];           
        int newWidth = Integer.parseInt(args[1]); 
        int newHeight = Integer.parseInt(args[2]); 

        Color[][] imageIn = Runigram.read(fileName);	

        Color[][] imageOut = Runigram.scaled(imageIn, newWidth, newHeight);	

        Runigram.setCanvas(imageIn); 
        Runigram.display(imageIn);
        StdDraw.pause(3000); 

        Color[][] tempCanvas = new Color[newHeight][newWidth];
        Runigram.setCanvas(tempCanvas);
        Runigram.display(imageOut);							
    }
}
