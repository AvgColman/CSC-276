public class Person {
    private String name;
    private String username;
    private int numFollowers;

    public Person(String name, String username, int numFollowers) {
        this.name = name;
        this.username = username;
        this.numFollowers = numFollowers;
    }
     //get name
    public String getName() {
        return name;
    }
      //get username
    public String getUsername() {
        return username;
    }
        //get amount of followers
    public int getNumFollowers() {
        return numFollowers;
    }
    //print
    public String toString() {
        return "Name: " + name + ", Username: " + username + ", Followers: " + numFollowers;
    }
}
