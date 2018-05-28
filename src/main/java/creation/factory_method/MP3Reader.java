package creation.factory_method;

public class MP3Reader extends Reader {

  public MP3Reader(String filename) {
    super(filename);
  }

  public String read() {
    return "Reading MP3 file: " + filename;
  }

}
