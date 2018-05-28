package creation.factory_method;

public class ReaderFactoryImp implements ReaderFactory {

  public Reader createReader(String filename) {
    String[] tokens = filename.split("\\.");
    if (tokens.length <= 1) {
      throw new IllegalArgumentException();
    }
    String extension = tokens[tokens.length - 1];
    switch (extension) {
      case "txt":
        return new TextReader(filename);
      case "mp3":
        return new MP3Reader(filename);
      default:
        throw new IllegalArgumentException();
    }
  }

}
