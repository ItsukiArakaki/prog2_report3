package jp.ac.uryukyu.ie.e215746;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test
   void attackTest(){
       int WarriorHP = 10;
       Warrior demoWarrior = new Warrior("デモ戦士", WarriorHP, 5);
       Enemy slime = new Enemy("スライムもどき", 100, 0);
       for(int i=0; i<3; i++){
           demoWarrior.attackWithWeaponSkill(slime);
           int reduce_hp = 100 - slime.getHitPoint();
           System.out.printf("%s", slime.getName() + "の残りHP" + (100 - reduce_hp));
          
       }
       assertEquals(WarriorHP, demoWarrior.getHitPoint());

    }
}
