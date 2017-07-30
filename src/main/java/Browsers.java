import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Browsers {
    Firefox, Chrome, Safari;

    private static final List<Browsers> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Browsers pickBrowser() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
