package me.jacob_creator.inclass5_1;

public class Driver {

    public static void main(String[] args) {
        double x = 5,y = 5, z = 5;

        Player[] players = {new Player("Nick"), new Player("Gold"), new Player("Lollero")};

            players[0].setLocation(1.5,1.5,1.5);
            players[1].setLocation(3, 2, 2);
            players[2].setLocation(40,3,3);

        for (Player player : players) {
            if (player.nearby(x, y, z)) {
                System.out.println(player.getName() + " is near the flag, " + "They are at " + player.getLocation() + "!");
            }
        }
    }
}
