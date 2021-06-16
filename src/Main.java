public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_500;
        int oneMile = 20;
        int totalMiles = ticketPrice / oneMile;
        System.out.println("Начислено миль " + totalMiles);
    }
}