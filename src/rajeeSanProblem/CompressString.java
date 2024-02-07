package rajeeSanProblem;

public class CompressString {

	public static void main(String[] args) {
		String str = "xyyyzzzabb";
		System.out.println(new CompressString().compress(str));
	}
	
	public String compress(String str) {
		StringBuffer res = new StringBuffer();
		int length=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(i-1)) {
				res.append(str.charAt(i-1));
				if(length>1)
				res.append(length);
				length=1;
			}else {
				length++;
			}
		}
		res.append(str.charAt(str.length()-1));
		res.append(length);
		return res.toString();
	}
}
