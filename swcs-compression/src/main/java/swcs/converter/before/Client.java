package swcs.converter.before;

import java.io.File;

public class Client {

    public static void main(String[] args) {
        Converter converter = new Converter(new File("picture.tiff"));
        File file = converter.convert(CompressionType.JPG);
        // ...
    }
}
