package creation.factory_method;

/**
 * Factory that allows creation of different readers depending on the file type.
 *
 * @author Soy-yo
 */
public interface ReaderFactory {

  Reader createReader(String filename);

}
