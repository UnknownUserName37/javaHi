public class gas {
    public static void main(String[] args) {

        System.out.println("Считаем хуету уничтожающую планету, но позволяющую водить");

        int oktanNum = 95;
        int amount = 15;

        double gasolina92price = 60.2;
        double gasolina95price = 67.33;

        double gasolinaPrice = 0;

        if (oktanNum == 92) gasolinaPrice = gasolina92price;

        else if (oktanNum == 95) gasolinaPrice = gasolina95price;

        else System.out.println("Всё это тщетная хуйня, не пытайся это посчитать. Такой бенз не толкают.");

        if (amount <1) {
            System.out.println("Столько не льётся. ");
            amount = 0;
        }

        System.out.println("Цена выбранного топлива " + gasolinaPrice + " руб." + ", но я бы сказа не топлива, а этой хуеты");

        double orderPrice = gasolinaPrice * amount;

        System.out.println("Всего залили на " + orderPrice + " деревянных");
    }
}
