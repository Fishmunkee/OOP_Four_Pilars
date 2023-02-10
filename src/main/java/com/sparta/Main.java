package com.sparta;

public class Main {
    public static void main(String[] args) {

        Werewolf werewolf = new Werewolf();
        Wraith wraith = new Wraith();

        werewolf.setHealth(50);
        wraith.setHealth(75);

        wraith.getHealth();
        werewolf.getHealth();
//
        Enemy [] enemies = {werewolf, wraith};
        enemies[0].talk();
        enemies[1].talk();

        werewolf.talk();
        wraith.talk();


    }
}