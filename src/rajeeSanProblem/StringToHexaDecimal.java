package rajeeSanProblem;

public class StringToHexaDecimal {

	public static void main(String[] args) {
//		System.out.println(convertToHexadecimal("hello world"));
		String res= "";
		for(char ch : "hello world".toCharArray()) {
			res+=ConvertToHexadecimal(ch);
		}
		System.out.println(res);
	}
	public static String convertToHexadecimal(String word) {
        StringBuilder hexBuilder = new StringBuilder();
        for (char c : word.toCharArray()) {
            String hexValue = Integer.toHexString(c);
            hexBuilder.append(hexValue);
        }
        return hexBuilder.toString();
    }
	public static String ConvertToHexadecimal(int num){
        int r;
        String bin="";

        System.out.println(num);
        do{
            r=num%16;
            num=num/16;

            if(r==10)
            bin="A"+bin;

            else if(r==11)
            bin="B"+bin;

            else if(r==12)
            bin="C"+bin;

            else if(r==13)
            bin="D"+bin;

            else if(r==14)
            bin="E"+bin;

            else if(r==15)
            bin="F"+bin;

            else
            bin=r+bin;
        }while(num!=0);

        return bin;
    }
}
