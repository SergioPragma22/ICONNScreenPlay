package starter.utilities;

import java.util.UUID;

public class EmailGenerator {


    public static String generateRandomEmail() {
        String uniqueID = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
        return "user" + uniqueID + "@test.com";
    }
}
