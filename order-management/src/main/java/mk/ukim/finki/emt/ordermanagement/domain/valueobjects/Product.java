package mk.ukim.finki.emt.ordermanagement.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Getter
public class Product implements ValueObject {

    private final ProductId id;
    private final String name;
    private final String description;
    private final Money price;

    private Product() {
        this.id = ProductId.randomId(ProductId.class);
        this.name = "";
        this.description = "";
        this.price = Money.valueOf(Currency.MKD, 0);
    }

    @JsonCreator
    public Product(ProductId id, String name, String description, Money price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
