package structure.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AdapterTest {

  @Test
  void test() {
    Elephant elephant = new Elephant("Phanpy", "Pokemon", 1000.0f);
    WeighableKg adapter = new ElephantWeightAdapter(elephant);
    assertFalse(elephant.getWeightPounds() == adapter.getWeight(), "Different weight");
    assertEquals(450.0f, adapter.getWeight(), "Converted pounds to kilograms");
  }

}