import java.util.Scanner;
public class User {
    int lvl;
    int cash;
    int damage;
    int hp;
    String username;
    public User(int u_lvl, int u_cash, int u_dam, int u_hp){
        lvl=u_lvl;
        cash=u_cash;
        damage=u_dam;
        hp=u_hp;
    }

    public String registration(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ваше ім'я: ");
        username = sc.nextLine();
        return username;
    }

    void shop() {
        Armor first_set = new Armor("Light armor", 150, 20, 1);
        Armor middle_set = new Armor("Kabuto soldier armor", 400, 40, 3);
        Armor final_set = new Armor("Snake armor", 600, 80,  5);

        Weapon knives = new Weapon("Knives", 1, 150, 25);
        Weapon knuckles = new Weapon("Knuckles", 3, 300, 45);
        Weapon sai = new Weapon("Sai", 4, 700, 65);
        Weapon katana = new Weapon("Katana", 5, 1300, 100);

        System.out.println("Ви потрапили в магазин!");
        System.out.println("Ось зброя та броня, які вам доступні:");
        System.out.println("Ваш баланс: " + cash);

        if (lvl == 1) {
            System.out.println("11 " + knives.name + " Шкода: " + knives.damage + " Ціна: " + knives.price);
            System.out.println("21 " + first_set.name + " Захист: " + first_set.def + " Ціна: " + first_set.price);
            System.out.println(" ");
        } else if (lvl <= 3) {
            System.out.println("11 " + knives.name + " Шкода: " + knives.damage + " Ціна: " + knives.price);
            System.out.println("12 " + knuckles.name + " Шкода: " + knuckles.damage + " " + knuckles.price);
            System.out.println(" ");
            System.out.println("21 " + first_set.name + " Захист: " + first_set.def + " Ціна: " + first_set.price);
            System.out.println("22 " + middle_set.name + " Захист: " + middle_set.def + " Ціна: " + middle_set.price);
            System.out.println(" ");
        } else if (lvl <= 4) {
            System.out.println("11 " + knives.name + " Шкода: " + knives.damage + " Ціна: " + knives.price);
            System.out.println("12 " + knuckles.name + " Шкода: " + knuckles.damage + " " + knuckles.price);
            System.out.println("13 " + sai.name + " Шкода: " + sai.damage + " " + sai.price);
            System.out.println(" ");
            System.out.println("21 " + first_set.name + " Захист: " + first_set.def + " Ціна: " + first_set.price);
            System.out.println("22 " + middle_set.name + " Захист: " + middle_set.def + " Ціна: " +middle_set.price);
            System.out.println(" ");
        } else {
            System.out.println("11 " + knives.name + " Шкода: " + knives.damage + " Ціна: " + knives.price);
            System.out.println("12 " + knuckles.name + " Шкода: " + knuckles.damage + " " + knuckles.price);
            System.out.println("13 " + sai.name + " Шкода: " + sai.damage + " Ціна: " + sai.price);
            System.out.println("14 " + katana.name + " Шкода: " + katana.damage + " Ціна: " + katana.price);
            System.out.println(" ");
            System.out.println("21 " + first_set.name + " Захист: " + first_set.def + " Ціна: " + first_set.price);
            System.out.println("22 " + middle_set.name + " Захист: " + middle_set.def + " Ціна: " + middle_set.price);
            System.out.println("23 " + final_set.name + " Захист: " + final_set.def + " Ціна: " + final_set.price);
            System.out.println(" ");

        }
        System.out.println("Бажаєте щось купити? \n 0 якщо ні");

        Scanner sc = new Scanner(System.in);
        int buynum;
        buynum = sc.nextInt();
        if (buynum != 0) {
            switch (buynum) {
                case 11:
                    if (knives.price > cash) {
                        System.out.println("Недостатньо коштів");
                    } else {
                        damage += knives.damage;
                        cash -= knives.price;
                        System.out.println("0 щоб вийти в меню або номер іншого товару");
                    }
                    break;
                case 12:
                    if (knives.price > cash) {
                        System.out.println("Недостатньо коштів");
                    } else {
                        damage += knuckles.damage;
                        System.out.println("0 щоб вийти в меню або номер іншого товару");
                    }
                    break;
                case 13:
                    if (sai.price > cash) {
                        System.out.println("Недостатньо коштів");
                    } else {
                        damage += sai.damage;
                        System.out.println("0 щоб вийти в меню або номер іншого товару");
                    }
                    break;
                case 14:
                    if (katana.price > cash) {
                        System.out.println("Недостатньо коштів");
                    } else {
                        damage += katana.damage;
                        System.out.println("0 щоб вийти в меню або номер іншого товару");
                    }
                    break;
                case 21:
                    if (first_set.price > cash) {
                        System.out.println("Недостатньо коштів");
                    } else {
                        hp += first_set.def;
                        System.out.println("0 щоб вийти в меню або номер іншого товару");
                    }
                    break;
                case 22:
                    if (middle_set.price > cash) {
                        System.out.println("Недостатньо коштів");
                    } else {
                        hp += middle_set.def;
                        System.out.println("0 щоб вийти в меню або номер іншого товару");
                    }
                    break;
                case 23:
                    if (final_set.price > cash) {
                        System.out.println("Недостатньо коштів");
                    } else {
                        hp += final_set.def;
                        System.out.println("0 щоб вийти в меню або номер іншого товару");
                    }
                    break;
            }
        }
        else{
            Main.main(new String[]{"hi"});
        }
    }
}
