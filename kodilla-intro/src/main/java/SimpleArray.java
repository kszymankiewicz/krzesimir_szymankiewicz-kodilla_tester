public class SimpleArray {
    public static void main(String[] args) {
    // String[] movies = new String[] {"Harry Potter", "Lord of the Rings", "Forrest Gump"}; {jeden ze sposobów tworzenia tablicy}


        String[] games = new String[5]; // pusta tablica + wypełnienie elementów

        games[0] = "Diablo";
        games[1] = "Tomb rider";
        games[2] = "GTA";
        games[3] = "Fortnite";
        games[4] = "Counter Strike";

        String game = games[3];
        int numberOfElements = games.length;
        System.out.println(game);
        System.out.println(numberOfElements);


    }
}