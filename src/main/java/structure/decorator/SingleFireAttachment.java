package structure.decorator;

/**
 * Decorator: makes the weapon semi-auto.
 *
 * @author Soy-yo
 */
public class SingleFireAttachment implements Weapon {

  private Weapon attachedTo;

  public SingleFireAttachment(Weapon attachedTo) {
    this.attachedTo = attachedTo;
  }

  @Override
  public String fire() {
    return attachedTo.fire().split("\\s+")[0];
  }

}
