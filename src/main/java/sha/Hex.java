package sha;

public class Hex {
  private String message;
  /**
   * @param val
   * @throws IllegalArgumentException() if the given String does not contain Assigns private string
   *     to the initial value
   */
  public Hex(String val) {
    for (int i = 0; i < val.length(); i++) {
      if (!(val.charAt(i) == '0'
          || val.charAt(i) == '1'
          || val.charAt(i) == '2'
          || val.charAt(i) == '3'
          || val.charAt(i) == '4'
          || val.charAt(i) == '5'
          || val.charAt(i) == '6'
          || val.charAt(i) == '7'
          || val.charAt(i) == '8'
          || val.charAt(i) == '9'
          || val.charAt(i) == 'a'
          || val.charAt(i) == 'A'
          || val.charAt(i) == 'b'
          || val.charAt(i) == 'B'
          || val.charAt(i) == 'c'
          || val.charAt(i) == 'C'
          || val.charAt(i) == 'd'
          || val.charAt(i) == 'D'
          || val.charAt(i) == 'e'
          || val.charAt(i) == 'E'
          || val.charAt(i) == 'f'
          || val.charAt(i) == 'F')) {
        throw new IllegalArgumentException(
            "Hexadecimal values can only contain digits of values '0' - 'F'");
      }
    }
    message = val;
  }
  /**
   * Converts Hexadecimal into a binary
   *
   * @param hex
   * @return
   */
  public boolean[] Hex2Bin() {
    boolean[] array = new boolean[message.length() * 4];
    for (int i = 0; i < message.length(); i++) {
      switch (message.charAt(i)) {
        case '0':
          array[i * 4] = false;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = false;
          break;
        case '1':
          array[i * 4] = false;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = true;
          break;
        case '2':
          array[i * 4] = false;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = false;
          break;
        case '3':
          array[i * 4] = false;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = true;
          break;
        case '4':
          array[i * 4] = false;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = false;
          break;
        case '5':
          array[i * 4] = false;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = true;
          break;
        case '6':
          array[i * 4] = false;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = false;
          break;
        case '7':
          array[i * 4] = false;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = true;
          break;
        case '8':
          array[i * 4] = true;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = false;
          break;
        case '9':
          array[i * 4] = true;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = true;
          break;
        case 'a':
          array[i * 4] = true;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = false;
          break;
        case 'A':
          array[i * 4] = true;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = false;
          break;
        case 'b':
          array[i * 4] = true;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = true;
          break;
        case 'B':
          array[i * 4] = true;
          array[i * 4 + 1] = false;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = true;
          break;
        case 'c':
          array[i * 4] = true;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = false;
          break;
        case 'C':
          array[i * 4] = true;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = false;
          break;
        case 'd':
          array[i * 4] = true;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = true;
          break;
        case 'D':
          array[i * 4] = true;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = false;
          array[i * 4 + 3] = true;
          break;
        case 'e':
          array[i * 4] = true;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = false;
          break;
        case 'E':
          array[i * 4] = true;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = false;
          break;
        case 'f':
          array[i * 4] = true;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = true;
          break;
        case 'F':
          array[i * 4] = true;
          array[i * 4 + 1] = true;
          array[i * 4 + 2] = true;
          array[i * 4 + 3] = false;
          break;
      }
    }
    return array;
  }
}
