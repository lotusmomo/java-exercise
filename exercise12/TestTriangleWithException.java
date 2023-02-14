class IllegalTriangleException extends Exception {
  public IllegalTriangleException(String message) {
    super(message);
  }
}

class TriangleWithException {
  private double side1;
  private double side2;
  private double side3;

  public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException {
    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } else {
      throw new IllegalTriangleException("Invalid triangle sides");
    }
  }
}

class TestTriangleWithException {
  public static void main(String[] args) {
    try {
      TriangleWithException TriA = new TriangleWithException(3, 4, 5);
      System.out.println("Triangle created successfully");
    } catch (IllegalTriangleException ex) {
      System.out.println(ex.getMessage());
    }
    try {
      TriangleWithException TriB = new TriangleWithException(3, 4, 5);
      System.out.println("Triangle created successfully");
    } catch (IllegalTriangleException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
