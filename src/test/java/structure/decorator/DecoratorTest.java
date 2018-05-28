package structure.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTest {

  @Test
  void test() {
    Weapon ak47 = new AK47();
    Weapon shotgun = new Winchester();
    assertEquals("TA TA TA TA TA", ak47.fire(), "Simple weapon fire");
    assertEquals("BOOM", shotgun.fire(), "Simple weapon fire");

    Weapon singleFire = new SingleFireAttachment(ak47);
    assertEquals("TA", singleFire.fire(), "Properly added attachment");

    Weapon silenced = new Silencer(ak47);
    assertEquals("ta ta ta ta ta", silenced.fire(), "Properly added attachment");

    Weapon silencedAndSingleFire = new Silencer(singleFire);
    assertEquals("ta", silencedAndSingleFire.fire(), "Two attachments");

    Weapon silencedShotgun = new Silencer(shotgun);
    assertEquals("boom", silencedShotgun.fire(), "Properly added attachment");
  }

}