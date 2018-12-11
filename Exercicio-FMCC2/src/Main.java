
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("input" + File.separator + "Ciri.jpg");
        File file2 = new File("input" + File.separator + "Geraldao.jpg");
        File imgfinal = new File("output" + File.separator + "Final.jpg");
		
        BufferedImage img1 = ImageIO.read(file1);
        BufferedImage img2 = ImageIO.read(file2);
        
        int w = img1.getWidth();
        int h = img1.getHeight();
        
        
        Graphics2D graphics = img2.createGraphics();
        graphics.drawImage(img1, 0, 0, w, h, null);
        graphics.dispose();
        ImageIO.write(img2, "PNG", imgfinal);
	
	}
	
}
