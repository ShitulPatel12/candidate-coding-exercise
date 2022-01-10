package pojos;

import enums.PromotionType;

import java.math.BigDecimal;

/**
 * Created by River Island
 */
public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private PromotionType promotionType;

    public Product(int id, String name, BigDecimal price, PromotionType promotionType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.promotionType = promotionType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public PromotionType getPromotionType() {
        return promotionType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", promotionType=" + promotionType.name() +
                '}';
    }
}