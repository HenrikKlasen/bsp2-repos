package sha;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SecureHashingAlgorithm1Test {
  private SecureHashingAlgorithm1 sha1;

  @BeforeEach
  @DisplayName("Initial method")
  private void init() {
    sha1 = new SecureHashingAlgorithm1();
  }

  @Test
  @DisplayName("Secure Hashing testRun")
  public void testSecureHashing() {
    assertEquals("a9993e36 4706816a ba3e2571 7850c26c 9cd0d89d", sha1.hash("abc"));
    assertEquals("fd4cef7a 4e607f1f cc920ad6 329a6df2 df99a4e8", sha1.hash("hallo"));
    assertEquals("9f57098c 5534762d d3280230 2db78ada 1ba864f5", sha1.hash("Salut"));
    assertEquals("e1744a52 5099d9a5 3c0460ef 9cb7ab0e 4c4fc939", sha1.hash("SHA1"));
  }

  @Test
  @DisplayName("SHA1 multiblock")
  public void testSecureHashingMulti() {
    assertEquals(
        "84983e44 1c3bd26e baae4aa1 f95129e5 e54670f1",
        sha1.hash("abcdbcdecdefdefgefghfghighijhijkijkljklmklmnlmnomnopnopq"));
    assertEquals(
        "3ce1fb54 131a5393 af4e5853 ca7058f8 9d49c3af",
        sha1.hash(
            "This is a text containing nothing but the real hash value for this text. Ubi et orbi et cetera."));
    assertEquals(
        "bc292f9a bae0bd97 4478e676 40784928 e394ed5a",
        sha1.hash(
            "As this program will be divided into different classes and files, it needs some organization for the main functional requirements. It has to implement the SHA1 algorithm in a way, that it can be used as an alternative implementation of it. It also has to be written in modular code, which means to actively use functions and methods for structuring the source code. As it also includes a console user interface, the user will be interacting with the function:"));
  }
}
