import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageProcessor extends IOProcessor {
    protected BufferedImage inputImage;
    protected BufferedImage outputImage;
    public ImageProcessor() { super(); }

    protected abstract void readInputFileName();
    protected abstract void readOutputFileName();

    /**
     * Salveaza imaginea cu numele specificat ca parametru
     * @param outputFileName
     */
    public void save(String outputFileName) {
        try {
            ImageIO.write(outputImage, Scalable.fileExtension, new File(outputFileName));
            System.out.printf("Fragment salvat cu succes cu numele %s\n", outputFileName);
        } catch (IOException e) {
            System.err.println("Nu s-a putut salva acest fragment");
        }
    }
}
