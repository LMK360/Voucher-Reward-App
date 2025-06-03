```java
package utils;

import java.io.*;
import java.time.*;

public class TimerUtils {
    private static final String FILE = "last_claim.txt";
    private static final long COOLDOWN = 60; // in minutes

    public static boolean isEligible() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE));
            String line = reader.readLine();
            reader.close();

            if (line != null) {
                LocalDateTime lastTime = LocalDateTime.parse(line);
                Duration diff = Duration.between(lastTime, LocalDateTime.now());
                return diff.toMinutes() >= COOLDOWN;
            }
        } catch (IOException e) {return true;
        }
        return true;
    }

    public static void saveLastClaimTime() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE));
            writer.write(LocalDateTime.now().toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving time.");
        }
    }
}
```
