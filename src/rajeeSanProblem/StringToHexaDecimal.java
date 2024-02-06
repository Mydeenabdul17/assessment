package rajeeSanProblem;

public class StringToHexaDecimal {

	public static void main(String[] args) {
		System.out.println(convertToHexadecimal("hello world"));
	}
	public static String convertToHexadecimal(String word) {
        StringBuilder hexBuilder = new StringBuilder();
        for (char c : word.toCharArray()) {
            String hexValue = Integer.toHexString(c);
            hexBuilder.append(hexValue);
        }
        return hexBuilder.toString();
    }
}
