import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        int balance = 357;
        int add = 200;
        int bonus = add > 1000 ? add / 100 : 0;
        //  int bonus = 0;
        //if (balance < 1000) {
        //  bonus = add / 100;
        //}
        int endBalance = add + balance;

        System.out.println("Итоговый баланс " + endBalance);
        System.out.println("Бонус " + bonus);
    }
}