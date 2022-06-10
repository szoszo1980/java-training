package files;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FilesDemo {

    public static void main(String[] args) {

        var path = Path.of("MOCK_DATA.csv");
/*
        String content = "Baratleke,-6.9506,112.9961\n" +
                "Uzhhorod,48.6208,22.287883\n" +
                "Hengdian,29.1520649,120.3168231\n" +
                "Yushugou,43.897258,89.939332\n" +
                "Honiara,-9.4456381,159.9728999\n" +
                "Furudate,38.2643887,140.2604198\n" +
                "Lukavice,49.8229025,16.9204034\n" +
                "Olleros,-12.2179111,-76.5148607\n" +
                "Acton Vale,45.65007,-72.56582\n" +
                "Barrhead,54.1187723,-114.3954066";
  */
  var content = "" +
          "aaabababababababababbabababababbabbabba" +
          "aaabababababababababbabababababbabbabba" +
          "aaabababababababababbabababababbabbabba" +
          "aaabababababababababbabababababbabbabba" +
          "";
        //try (var reader = Files.newBufferedReader(path)) {
        //try (var reader = new BufferedReader(new StringReader(content))) {
        try(
                var reader = new BufferedReader(new StringReader(content));
                //var outputStream = Files.newOutputStream(Path.of("bytes.dat"));
                var outputStream = Files.newOutputStream(Path.of("bytes.dat"));
                ){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);

                byte[] bytes = line.getBytes();
                for (var b :bytes){
                    outputStream.write(b +1);
                }
            }
        } catch (IOException ioe) {
            log.error("Can not read file", ioe);

        }
    }
}
