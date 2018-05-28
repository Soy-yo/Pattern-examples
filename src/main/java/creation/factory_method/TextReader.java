package creation.factory_method;

public class TextReader extends Reader {

  public TextReader(String filename) {
    super(filename);
  }

  public String read() {
    return "Reading text file: " + filename;
  }

}
