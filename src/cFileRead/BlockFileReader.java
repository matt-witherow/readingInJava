package cFileRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlockFileReader {

  private final String _path;

  public BlockFileReader(String path) {
    _path = path;
  }

  public List<String> read() {

    try (Stream<String> lines = Files.lines(Paths.get(_path))) {
      return lines
              .map(this::parse)
              .collect(Collectors.toList());
    } catch (IOException e) {
        e.printStackTrace();
        return Collections.emptyList();
    }
  }

  public String parse(String s){

    String[] values = s.split(",");
    try {

      return String.format("We need %d %ss in %s", parseNumber(values[1])
              ,values[0]
              ,values[2]);
    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
      return null;
    }
  }

  private static Integer parseNumber(String s) throws NumberFormatException {
    return Integer.valueOf(s.trim().replace("u", ""));
  }
}

