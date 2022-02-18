package swcs.converter.before;

import java.util.HashMap;
import java.util.Map;

final class CompressionFactory {

    private static final Map<CompressionType, Compression> CONVERTERS;

    static {
        CONVERTERS = new HashMap<>();
        CONVERTERS.put(CompressionType.JPG, new JPGCompression());
        CONVERTERS.put(CompressionType.PNG, new PNGCompression());
    }

    private CompressionFactory() {
    }

    static Compression from(CompressionType type) {
        return CONVERTERS.get(type);
    }
}
