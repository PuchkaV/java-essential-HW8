package task3;

public class Price {
    private String goods;
    private String store;
    private double price;

    public Price(String goods, String store, double price) {
        this.goods = goods;
        this.store = store;
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public String getGoods() {
        return goods;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "goods='" + goods + '\'' +
                ", store='" + store + '\'' +
                ", price=" + price +
                '}';
    }
}
