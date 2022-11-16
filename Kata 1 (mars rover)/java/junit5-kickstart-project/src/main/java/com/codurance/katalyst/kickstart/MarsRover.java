package com.codurance.katalyst.kickstart;


public class MarsRover {
    int positionX = 0;
    int positionY = 0;
    String positionD = "N";

    public String execute(String command) {


        String result = "";

        for (int i = 0; i < command.length(); i++) {
            char movement = command.charAt(i);
            move(movement);
        }
        result = positionX + ":" + positionY + ":" + positionD;
        return result;
    }

    private void move (char movement) {
        int max = 9;
        int min = 0;

        if (movement == 'M') {
            switch (positionD) {
                case "N":
                    positionY = (positionY == max) ? 0 : positionY + 1;
                    break;
                case "E":
                    positionX = (positionX == max) ? 0 : positionX + 1;
                    break;
                case "S":
                    positionY = (positionY == min) ? 9 : positionY - 1;
                    break;
                case "W":
                    positionX = (positionX == min) ? 9 : positionX - 1;
                    break;
            }
        }
        if (movement == 'R') {
            switch (positionD)
            {
                case "N": positionD = "E"; break;
                case "E": positionD = "S"; break;
                case "S": positionD = "W"; break;
                case "W": positionD = "N"; break;
            }
        }
        if (movement == 'L') {
            switch (positionD)
            {
                case "N": positionD = "W"; break;
                case "W": positionD = "S"; break;
                case "S": positionD = "E"; break;
                case "E": positionD = "N"; break;
            }
        }
    }
}
