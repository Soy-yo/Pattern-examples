package creation.singleton;

/**
 * Important object for an app. Its information an methods are needed in the whole app.
 *
 * @author Soy-yo
 */
public class ImportantObject {

  private static ImportantObject instance = new ImportantObject();

  public static ImportantObject getInstance() {
    return instance;
  }

  private ImportantObject() {
  }

}
