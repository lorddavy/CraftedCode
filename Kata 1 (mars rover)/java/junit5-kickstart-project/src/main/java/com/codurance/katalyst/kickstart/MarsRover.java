package com.codurance.katalyst.kickstart;


public class MarsRover {
    int positionX = 0;
    int positionY = 0;
    String positionD = "N";

    public String Execute( String command) {


        String result = "";

        for(int i =0; i<command.length(); i++) {
            char movement = command.charAt(i);
            move(movement);
        }
        result = positionX+":"+positionY+":"+positionD;
        return result;
    }

    private void move (char movement)
    {
        if (movement == 'M') {
            positionY++;
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
