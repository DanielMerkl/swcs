package swcs.converter.before;

import java.io.File;

@FunctionalInterface
public interface Compression {

    File compress(File input);

}
