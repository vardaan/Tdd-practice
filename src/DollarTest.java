import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Vardan sharma on 24/4/16.
 */
public class DollarTest {

  @Test public void testDollarMultiplication() {
    Money five = Money.dollar(5);
    assertThat("shouls be equal", five.times(3).equals(Money.dollar(15)));
    assertThat("shouls be equal", five.times(2).equals(Money.dollar(10)));
  }

  @Test public void testFrancMultiplication() {
    Money five = Money.franc(5);
    assertThat("shouls be equal", five.times(2).equals(Money.franc(10)));
    assertThat("shouls be equal", five.times(3).equals(Money.franc(15)));
  }

  @Test public void testEquality() {
    assertThat("Equality fails", Money.dollar(5).equals(Money.dollar(5)));
    assertThat("Equality fails", !Money.dollar(6).equals(Money.dollar(5)));
    assertThat("Equality fails", Money.franc(5).equals(Money.franc(5)));
    assertThat("Equality fails", !Money.franc(6).equals(Money.franc(5)));
  }

  @Test public void testCurrency() {
    assertThat("not matched", Money.franc(5).currency().equals("CHF"));
    assertThat("not matched", Money.dollar(5).currency().equals("USD"));
  }

  @Test public void testSimpleAddition() {
    Money five = Money.dollar(5);
    Money sum = five.plus(2);
    assertThat("Not matched", sum.equals(Money.dollar(7)));
  }
}