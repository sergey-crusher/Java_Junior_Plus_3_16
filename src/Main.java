public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Client client = new Client();

        client.makeAnOrder(waiter, "пюрешку");

        client.makeAnOrder(new IWaiter() {
            @Override
            public void bringTheOrder(String dish_name) {
                System.out.println("Аноним принёс "+dish_name);
            }
        }, "котлетку");
    }
}