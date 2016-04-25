/**
 * Created by Vardan sharma on 24/4/16.
 */
public class Money {
  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || !(o instanceof Money)) return false;
    Money money = (Money) o;
    return amount == money.amount && currency.equals(money.currency);
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  @Override public String toString() {
    return "Money{" +
        "amount=" + amount +
        ", currency='" + currency + '\'' +
        '}';
  }

  public String currency() {
    return currency;
  }

  public Money plus(int addition) {
    return new Money(amount + addition, currency);
  }
}
