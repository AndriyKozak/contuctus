package data;

/**
 * Created by Andriy on 03.04.2017.
 */
public class UserRepository {

    public static User getIxlooUser () {
return new User("firstName", "lastName", "+380632222222", "andriy.kozak@xloo.com",
        "+380631111111", "ul. UPA", "Lviv", "oblast", "10001");
    }

    // TODO: Create a user with comments
    public static User getIxlooUserWithComments () {
        return new User("firstName", "lastName", "+380632222222", "andriy.kozak@xloo.com",
                "+380631111111", "ul. UPA", "Lviv", "oblast", "10001", "tratata");
    }

    // TODO: Create a user without ZIP
    public static User getIxlooUserWhithoutZip () {
        return new User("firstName", "lastName", "+380632222222", "andriy.kozak@xloo.com",
                "+380631111111", "ul. UPA", "Lviv", "oblast", "");
    }
}
