public class HexConverter {
  public static int hexToDecimal(String hexString) throws NumberFormatException {
    // 正则表达式，用于判断字符串是否是十六进制数
    String hexPattern = "^[0-9a-fA-F]+$";
    // 如果字符串不是十六进制数，抛出异常
    if (!hexString.matches(hexPattern)) {
      throw new NumberFormatException();
    }
    // 转换为十进制数
    int decimal = Integer.parseInt(hexString, 16);
    return decimal;
  }
  
  public static void main(String[] args) {
    try {
      int decimal1 = hexToDecimal("12345"); // 正常转换
      System.out.println(decimal1);
      int decimal2 = hexToDecimal("abcde"); // 正常转换
      System.out.println(decimal2);
      int decimal3 = hexToDecimal("1234g"); // 抛出异常
      System.out.println(decimal3);
    } catch (NumberFormatException e) {
      System.out.println("Illegal hex string");
    }
  }
}