public class Client {
    public void makeAnOrder (IWaiter waiter, String dish_name)
    {
        waiter.bringTheOrder(dish_name);
    }
}
