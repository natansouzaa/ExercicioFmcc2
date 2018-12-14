import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fade {

	private BufferedImage img1;
	private BufferedImage img2;
	private float opacidadeImg1;
	private float opacidadeImg2;
	
	public Fade(BufferedImage img1, float opacidadeImg1, BufferedImage img2, float opacidadeImg2) {
		this.img1 = img1;
		this.img2 = img2;
		this.opacidadeImg1 = opacidadeImg1;
		this.opacidadeImg2 = opacidadeImg2;
	}
	
	public File aplicaEfeito() throws IOException {
		File file3 = new File("output" + File.separator + "imgFinal");
		
        int w = this.img1.getWidth();
        int h = this.img1.getHeight();
        
        Graphics2D graphics = this.img2.createGraphics();
        graphics.drawImage(this.img1, 0, 0, w, h, null);
        graphics.dispose();
        ImageIO.write(this.img2, "PNG", file3);
		
		return file3;
	}
	
}
