package AndrewWebServices;

import java.util.HashMap;
import java.util.Map;

/*
 * InMemoryDatabase is a fake for the AndrewWS database which is used to improve test efficiency.
 * Remember, fakes are fully functional classes with simplified implementation.
 * What is the simplest core functionality that we need for a functional database?
 * 
 * Hint: there are two methods you need to implement
 */
public class InMemoryDatabase extends Database/* should there be something here? */ {
    // Implement your fake database here
    private Map<String, Integer> accounts = new HashMap<>();

    public InMemoryDatabase() {
        // Initialize with some data if necessary
        accounts.put("Scotty", 17214); // Example account
    }

    public int getPassword(String accountName) {
        return accounts.getOrDefault(accountName, 0);
    }

    public void setPassword(String accountName, int password) {
        accounts.put(accountName, password);
    }
}