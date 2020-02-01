

public class User {
    private String name;
    private int age;


    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {


        User arek = new User("Arek", 34);
        User bartek = new User("Bartek", 38);
        User czeslaw = new User("Czesław", 15);
        User dawid = new User("Dawid", 24);
        User ernest = new User("Ernest", 56);
        User grazyna = new User("Grażyna", 100);

        User[] users = {arek, bartek, czeslaw, dawid, ernest, grazyna};
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }
        double average = sum / (double) users.length;
        System.out.println(average);
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName());
            }
        }
        int oldestUser = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > oldestUser) {
                oldestUser = users[i].getAge();
            }
        }
        System.out.println(oldestUser);

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() == oldestUser) {
                System.out.println(users[i].getName());
            }
        }
        int youngestUser = users[0].getAge();
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < youngestUser) {
                youngestUser = users[i].getAge();
            }
        }
        System.out.println(youngestUser);

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() == youngestUser) {
                System.out.println(users[i].getName());
            }
        }

    }
}





