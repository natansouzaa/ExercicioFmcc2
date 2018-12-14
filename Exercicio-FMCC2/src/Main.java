
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome da primeira imagem (junto com o seu formato, exemplo: img.jpg): ");
		String primeiraImg = input.next();
		System.out.println("A seguir digite a opacidade desejada da primeira imagem: ");
		float opacidadeImg1 = input.nextFloat();
		System.out.println("Digite o nome da segunda imagem (junto com o seu formato, exemplo: img.jpg) :");
		String segundaImg = input.next();
		System.out.println("A seguir digite a opacidade desejada da primeira imagem: ");
		float opacidadeImg2 = input.nextFloat();
		
		File file1 = new File("input" + File.separator + primeiraImg);
        File file2 = new File("input" + File.separator + segundaImg);
		
        BufferedImage img1 = ImageIO.read(file1);
        BufferedImage img2 = ImageIO.read(file2);
        
        Fade efeito = new Fade(img1, opacidadeImg1, img2, opacidadeImg2);
        
        BufferedImage imgFinal = ImageIO.read(efeito.aplicaEfeito());
        
        System.out.println("Efeito aplicado com sucesso!");	
	}	
}
