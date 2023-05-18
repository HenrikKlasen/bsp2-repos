package sha;

import static org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_1;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.time.StopWatch;

public class Performance {

  public static void main(String[] args) {
    StopWatch sw = new StopWatch();
    String output = "\\hline\n i & DigestUtils & BSP Implementation \\\\\n \\hline \n";
    DigestUtils du = new DigestUtils(SHA_1);
    SecureHashingAlgorithm1 sha1 = new SecureHashingAlgorithm1();
    for (int i = 0; i < 20; i++) {
      output += i + " & ";
      sw.start();
      du.digest("Hello world, this is a test input");
      sw.stop();
      output += sw.getNanoTime() / 1000 + "µs & ";
      sw.reset();
      sw.start();
      sha1.hash("Hello world, this is a test input");
      sw.stop();
      output += sw.getNanoTime() / 1000 + "µs \\\\\n \\hline \n";
      sw.reset();
    }
    System.out.println(output);
  }
}
