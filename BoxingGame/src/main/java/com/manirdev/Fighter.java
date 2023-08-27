package com.manirdev;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    public int hit(Fighter john){
        System.out.println(this.name + " => " + john.name + " "
        + this.damage + " struck damage");
        if (john.dodge()){
            System.out.println(john.name + " dodge incoming damage.");
            return john.health;
        }
        if (john.health - this.damage < 0){
            return 0;
        }
        return john.health - this.damage;
    }

    public boolean dodge(){
        // 0.0 to 99.9
        double  randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
