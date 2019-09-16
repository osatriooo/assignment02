package com.enigma.model;

import java.util.Arrays;

public class Robot {
    Directions directions;
    private Integer postX;
    private Integer postY;
    private Integer daya = 0;
    private char[] commands;

    private final String FRONT = "F";
    private final String RIGHT = "R";
    private final String LEFT = "L";
    private final String BACK = "B";

    public Robot(Integer x, Integer y, Directions directions) {
        this.postX = x;
        this.postY = y;
        this.directions = directions;
    }

    public void fullDaya(int daya) {
        this.daya = this.daya + daya;
    }

    public void instruction(String movement, Directions directions) {
        switch (movement) {
            case RIGHT:
                turnRight();
                break;
            case LEFT:
                turnLeft();
                break;
            case FRONT:
                forward();
                break;
        }
    }

    public void turnRight() {
        this.directions = this.directions.right();
    }

    public void turnLeft() {
        this.directions = this.directions.left();
    }

    public void forward() {
        if (directions.equals(Directions.NORTH)) {
            this.postY++;
            this.directions = Directions.NORTH;
        } else if (directions.equals(Directions.EAST)) {
            this.postX++;
            this.directions = Directions.EAST;
        } else if (directions.equals(Directions.SOUTH)) {
            this.postX--;
            this.directions = Directions.SOUTH;
        } else if (directions.equals(Directions.WEST)) {
            this.postX--;
            this.directions = Directions.SOUTH;
        } else {
            System.out.println("Your instruction if failed");
        }
    }

    public char[] setCommands(String commands) {
        return this.commands = commands.toCharArray();
    }


    public void run() {
        for (int i = 0; i < commands.length; i++) {
            if (daya == 0) {
                System.out.println("Empty Battery");
            } else {
                instruction(String.valueOf(commands[i]), this.directions);
                System.out.println(this.commands[i] + getPosition() + " " + this.directions);
                if ((i + 1) % 3 == 0) {
                    daya = daya - 1;
                }
            }
        }
    }

        public String print () {
            return "Robot{" +
                    "postX = " + postX +
                    ", postY = " + postY +
                    ", daya = " + daya +
                    ", commands = " + Arrays.toString(commands) +
                    ", Arah = " + directions +
                    '}';
        }
        public String getPosition () {
            return (" " + "(" + "X" + this.postX + " " + "Y" + this.postY + ")");
        }
    }



