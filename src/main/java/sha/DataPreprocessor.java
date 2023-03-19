package sha;

public class DataPreprocessor {

  public DataPreprocessor() {}

  /**
   * This pads the message according to NIST.FIPS.180-4.pdf chapter 5.1
   *
   * @param message
   * @return result, the padded message
   */
  private String paddedMessage(String message) {
    String result = "";
    for (int i = 0; i < message.length(); i++) {
      result += Long.toString((long) message.charAt(i), 16);
    }

    result += 8;
    System.out.println(result);
    while (((result.length() + 16) % 128) != 0) {
      result += 0;
    }
    String appender = Long.toString((long) (message.length() * 8), 16);
    while (appender.length() != 16) {
      appender = 0 + appender;
    }
    result += appender;
    System.out.println(result);
    return result;
  }
  /**
   * This parses the message into an two dimensional array of
   *
   * @param message
   * @return
   */
  public long[][] parseMessage(String message) {
    String p = paddedMessage(message);
    /*This creates the return array
     * x-axis: number of 512 bit submessages
     * y-axis: 16 32-bit messages.
     */
    long[][] result = new long[p.length() / 128][16];
    for (int i = 0; i < p.length() / 128; i++) {
      for (int j = 0; j < 16; j++) {
        result[i][j] = Long.parseLong(p.substring(i * 4 + j * 4, i * 4 + j * 4 + 8), 16);
        System.out.println(result[i][j]);
      }
    }
    return result;
  }
}
