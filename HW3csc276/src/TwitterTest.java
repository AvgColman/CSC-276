import java.util.Random;

public class TwitterTest {
    public static void main(String[] args) {
            //users
        Person[] userPersons = {
            new Person("Carson", "@carson", 300),
            new Person("Bob", "@bob", 100),
            new Person("Chad", "@Chad", 400)
        };
         //random followers
        Twitter twitter = new Twitter(userPersons);
        twitter.printAllUsers();
        System.out.println("Followers: " + twitter.calculateTotalFollowers());
        String[] randomNames = {"Kassidee", "Eoin", "Gavin", "Tom", "Ava", "Isabella", "Mason", "Ethan", "Sophia", "Lucas"};
        Person[] randomPersons = new Person[20];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String randomName = randomNames[random.nextInt(randomNames.length)];
            String randomUsername = "@" + randomName.toLowerCase();
            int randomFollowers = random.nextInt(100) + 1;
            randomPersons[i] = new Person(randomName, randomUsername, randomFollowers);
        }

        Twitter randomTwitter = new Twitter(randomPersons);
        randomTwitter.printAllUsers();
        System.out.println("Followers: " + randomTwitter.calculateTotalFollowers());
    }
}
