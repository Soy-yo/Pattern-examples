package structure.decorator;

/**
 * Decorator: reduces the weapon fire sound.
 *
 * @author Soy-yo
 */
public class Silencer implements Weapon {

  private Weapon attachedTo;

  public Silencer(Weapon attachedTo) {
    this.attachedTo = attachedTo;
  }

  @Override
  public String fire() {
    return attachedTo.fire().toLowerCase();
  }

}
