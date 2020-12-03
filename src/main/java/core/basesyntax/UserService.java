package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) throws UserNotFoundException {
        for (String record : records) {
            String[] parts = record.split(":");
            if (parts[0].equals(email)) {
                return Integer.parseInt(parts[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
