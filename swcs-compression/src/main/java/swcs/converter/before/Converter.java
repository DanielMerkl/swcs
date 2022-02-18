package swcs.converter.before;

import java.io.File;

record Converter(File file) {

    File convert(CompressionType compressionType) {
        Compression compression = CompressionFactory.from(compressionType);
        return compression.compress(file);
    }

}
