package retrofit2;

import java.io.IOException;

public class CustomIoException extends IOException {

  private IOException ioException;

  public CustomIoException(IOException ioException) {
    this.ioException = ioException;
  }
}
