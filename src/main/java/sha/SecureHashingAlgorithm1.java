package sha;

public class SecureHashingAlgorithm1 {
  /*
   * Constructor for instanciation
   */
  public SecureHashingAlgorithm1() {}
  /**
   * Method for Rotate Left
   *
   * @param x
   * @return boolean[] for rotating binary values to the left, x being w-bit
   */
  public void rotateLeft(boolean[] x) {}
  /**
   * Method Ch(x,y,z) for 0 <= t <= 19
   *
   * @param x,y,z
   * @return boolean[] (x && y) xor (!x && z)
   */
  public boolean[] ch(boolean[] x, boolean[] y, boolean[] z) {
    boolean[] t = new boolean[1];
    return t;
  }
  /**
   * Method for parity, 20 <= t <= 39 60 <= t <= 79
   *
   * @param x,y,z
   * @return boolean[] x xor y xor z
   */
  public boolean[] parity(boolean[] x, boolean[] y, boolean[] z) {
    boolean[] t = new boolean[1];
    return t;
  }

  /**
   * Method for Major(x,y,z) 40 <= t <= 59
   *
   * @param x,y,z
   * @return boolean[] (x && y) xor (x && z) xor (y && z)
   */
  public boolean[] maj(boolean[] x, boolean[] y, boolean[] z) {
    boolean[] t = new boolean[1];
    return t;
  }
}
