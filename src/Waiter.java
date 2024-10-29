public class Waiter implements IWaiter {
    @Override
    public void bringTheOrder(String dish_name) {
        System.out.println("Официает принёс "+dish_name);
    }
}
