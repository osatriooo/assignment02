package com.enigma.model;

public enum Directions {
    NORTH,
    WEST,
    EAST,
    SOUTH;

   public Directions right(){
        return Directions.values()[(ordinal()+1)%4];
    }

    public Directions left(){
        return Directions.values()[(ordinal()+3)%4];
    }
}




