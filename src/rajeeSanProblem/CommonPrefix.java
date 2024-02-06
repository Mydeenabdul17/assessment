package rajeeSanProblem;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		StringBuffer res=new StringBuffer("");
        if(strs.length==1){
            System.out.println(strs[0]);
        }
        else {
        	int length=strs.length>0?strs[0].length():0;
            for(String str:strs){
                length=length>str.length()?str.length():length;
            }
            for(int i=0;i<length;i++){
                boolean b=false;
                for(int j=0;j<strs.length-1;j++){
                    if(strs[j].charAt(i)==strs[j+1].charAt(i)){
                        b=true;
                    }else{
                        b=false;
                        break;
                    }
                }
                if(b){
                    res.append(strs[0].charAt(i));
                }else{
                    break;
                }
            }
            System.out.println(res.toString());
        }
	}
}
