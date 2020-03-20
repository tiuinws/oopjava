package multiplayerAttack;

import alfianLib.*;

public class multiplayerAttack {

    public static void main(String[] args) {
        fn fun = new fn(); // create new object with name fun
        Player player1 = new Player("A", 100); Player player2 = new Player("B", 50);
        Weapon sniper = new Weapon("Sniper Rifle", 15);
        Weapon shotGun = new Weapon("Sniper Gun", 7);
        Armor rompiBaja = new Armor("Rompi Baja", 10);
        Armor bajuBesi = new Armor("Baju Besi", 5);

        player1.equipWeapon(sniper);
        player1.equipArmor(rompiBaja);
        player1.diplay();

        player2.equipWeapon(shotGun);
        player2.equipArmor(bajuBesi);
        player2.diplay();

        fn.outln("\nPERTEMPURAAAN\n\nEpisode - 1\n");
        player1.attack(player2);
        player1.diplay();
        player2.diplay();
        fn.outln("\nEpisode - 2\n");
        player2.attack(player1);
        player1.diplay();
        player2.diplay();
    }
}

class Player {
    fn fun = new fn(); // create new object with name fun
    String name; double health; int level; Weapon weapon; Armor armor;
    Player(String name, double health) { this.name = name; this.health = health; }
    void attack(Player opp) {
        double atkPow = this.weapon.atkPow;
        fn.outln(this.name + " attacking " + opp.name + " with power " + atkPow);
        opp.defence(atkPow);
    }
    void defence(double atkPow) {
        double damage;
        if (this.armor.defPow < atkPow) { damage = atkPow - this.armor.defPow; } else { damage = 0; }
        this.health -= damage;
        fn.outln(this.name + " gets damage " + damage);
    }
    void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    void equipArmor(Armor armor) { this.armor = armor; }
    void diplay() {
        fn.outln("\nName : " + this.name);
        fn.outln("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon {
    fn fun = new fn(); // create new object with name fun
    double atkPow; String name;
    Weapon(String name, double atkPow){ this.name = name; this.atkPow = atkPow; }
    void display(){ fn.outln("Weapon : " + this.name + " , attack : " + this.atkPow); }
}

class Armor {
    fn fun = new fn(); // create new object with name fun
    double defPow;String name;
    Armor(String name, double defPow){ this.name = name; this.defPow = defPow; }
    void display(){ fn.outln("Armor : " + this.name + " , defence : " + this.defPow); }
}