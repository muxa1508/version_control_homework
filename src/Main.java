public class Main {
    public static void main(String[] args) {

        int[] sales = {100, 200, 250, 300, 400, 200};

        SalesManager salesManaged = new SalesManager(sales);

        System.out.println(salesManaged.max());

    }
}
