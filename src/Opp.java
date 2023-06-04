import java.util.Scanner;

public class Opp {
    String name;
    int lvl;
    int hp;
    int damage;
    public Opp(String o_name, int o_hp, int o_damage){
        name=o_name;
        hp=o_hp;
        damage=o_damage;
    }
    String fight(int u_hp, int u_damage) {
        Scanner action = new Scanner(System.in);
        String result = null;
        while (u_hp > 0 || hp > 0) {
            int oact = (int) (Math.random() * 2 + 1);
            System.out.println("Виберіть дію:\n1.Удар \n2.Блок");
            int act = action.nextInt();
            int prob = (int) (Math.random() * 8 + 1);
            if (act == 1 && oact == 1) {
                if (prob == 1 || prob == 2 || prob == 3) {
                    hp -= u_damage;
                    System.out.println("Ви нанесли удар противнику -" + u_damage + "\n HP противника: " + hp);
                } else if (prob == 4 || prob == 5) {
                    System.out.println("Удари не пройшли\n Ваше HP: " + u_hp + "\n HP противника: " + hp);
                } else {
                    u_hp -= damage;
                    System.out.println("Противник наніс удар вам -" + damage * 0.8 + "\n ваше HP: " + u_hp);
                }
            } else if (act == 1 && oact == 2) {
                if (prob == 1 || prob == 2) {
                    hp -= u_damage * 0.8;
                    System.out.println("Ви нанесли удар противнику -" + u_damage * 0.8 + "\n HP противника: " + hp);
                } else {
                    System.out.println("Удар не пройшов, блок противника\n Ваше HP: " + u_hp + "\n HP противника: " + hp);
                }
            } else if (act == 2 && oact == 1) {
                if (prob == 6 || prob == 7) {
                    u_hp -= damage * 0.8;
                    System.out.println("Противник наніс удар вам -" + damage * 0.8 + "\n ваше HP: " + u_hp);
                } else {
                    System.out.println("Удар не пройшов, заблоковано\n Ваше HP: " + u_hp + "\n HP противника: " + hp);
                }
            } else {
                System.out.println("Два блоки\n Ваше HP: " + u_hp + "\n HP противника: " + hp);
            }
            if (u_hp > 0 && hp <= 0) {
                result = "win";
                break;
            } else if(hp > 0 && u_hp <= 0) {
                result = "lose";
                break;
            } else{}
        }
        return result;
    }


}
