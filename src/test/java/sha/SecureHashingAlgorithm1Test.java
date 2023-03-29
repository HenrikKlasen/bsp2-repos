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
  }

  @Test
  @DisplayName("SHA1 multiblock")
  public void testSecureHashingMulti() {
    assertEquals(
        "84983e44 1c3bd26e baae4aa1 f95129e5 e54670f1",
        sha1.hash("abcdbcdecdefdefgefghfghighijhijkijkljklmklmnlmnomnopnopq"));
  }
}
