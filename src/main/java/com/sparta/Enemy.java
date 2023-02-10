package com.sparta;

public class Enemy {
    public void getHealth() {
        System.out.println(health);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int health;

    public void talk(){
        System.out.println("I will kill you!");
    }
}
