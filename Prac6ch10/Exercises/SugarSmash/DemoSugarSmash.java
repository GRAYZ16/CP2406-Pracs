package SugarSmash;

public class DemoSugarSmash {

    public static void main(String[] args)
    {
        SugarSmashPlayer player1 = new SugarSmashPlayer(1, "Josh", 10);
        System.out.println("ID: " + player1.getPlayerID());
        System.out.println("Screen name: " + player1.getScreenName());
        player1.setHighScore(130, 0);
        System.out.println(player1.getHighScore(0) + '\n');
        player1.setHighScore(100, 1);
        System.out.println(player1.getHighScore(1) + '\n');

        player1.setHighScore(101, 8);
        player1.getHighScore(90);

        // Create premium player
        PremiumSugarSmashPlayer player2 = new PremiumSugarSmashPlayer(1, "Sara");
        player2.setHighScore(130, 0);
        System.out.println(player2.getHighScore(0) + '\n');
        player2.setHighScore(100, 1);
        System.out.println(player2.getHighScore(1) + '\n');

        player2.setHighScore(101, 8);
        player2.getHighScore(90);


    }

}
