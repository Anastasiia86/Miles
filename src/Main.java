public class Main {

    public static void main(String[] args) {

        int amount = 16_200;// стоимость билета
        int bonus = 20;// 20 рублей = 1 миля
        int bonusMile = amount/bonus;// расчет количество бонусных миль

        System.out.println( "Получайте мили за полеты,при покупке билета стоимостью " +amount+ " руб.,получаете " + bonusMile + " бонусных миль!" );
    }
}

