package org.example;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        boolean[][] listofDoors = new boolean[1000][3];
        boolean win = true;

        // Заполним двери:
        for (int i = 0; i < listofDoors.length; i++) {
            for (int j = 0; j < listofDoors[i].length; j += 3) {
                j = random.nextInt(2);
                listofDoors[i][j] = win;
            }
        }

        // Играем без замены:
        int winner1 = 0;
        int loser1 = 0;
        for (boolean[] listofDoor : listofDoors) {
            int choiceDoor = random.nextInt(3);
            if (listofDoor[choiceDoor] == true) {
                winner1++;
            } else loser1++;
        }

        // Играем с заменой:
        int winner2 = 0;
        int loser2 = 0;
        for (boolean[] listofDoor : listofDoors) {
            int choiceDoor = random.nextInt(3);
            if (listofDoor[choiceDoor] != true) {
                int showDoor;
                do {
                    showDoor = random.nextInt(3);
                } while (showDoor == choiceDoor || listofDoor[showDoor] == true);
                if (listofDoor[3 - choiceDoor - showDoor] == true) {
                    winner2++;
                } else loser2++;
            } else loser2++;

        }

        System.out.println("Процент побед без замен = " + (double) winner1 / listofDoors.length + " (" + winner1 + ")");
        System.out.println("Процент побед с заменами = " + (double) winner2 / listofDoors.length + " (" + winner2 + ")");

        File file = new File("stats");
        try {
            FileWriter writer = new FileWriter("stats", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("Процент побед без замен = " + (double) winner1 / listofDoors.length + " (" + winner1 + ")\n");
            bufferWriter.write("Процент побед с заменами = " + (double) winner2 / listofDoors.length + " (" + winner2 + ")\n");
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}