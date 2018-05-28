package creation.factory_method;

/**
 * Product created by the factory that will allow to read a file.
 *
 * @author Soy-yo
 */
abstract class Reader {

  protected String filename;

  public Reader(String filename) {
    this.filename = filename;
  }

  abstract String read();

}
