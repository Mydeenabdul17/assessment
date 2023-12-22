package assessment_ZSGS_2;

import java.util.Scanner;

public class Question3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Question3 qn=new Question3();
		System.out.println("Enter the text");
		String text=sc.nextLine();
		System.out.println(qn.frequency(text));
	}
	
	
	//function to convert sentence to Array
	public String[] toArray(String text) {
		int size=1;
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)==' ') {
				size++;
			}
		}
		String[] words=new String[size];
		String word="";
		for(int i=0,j=0;i<text.length();i++) {
			if(text.charAt(i)==' ') {
				words[j]=word;
				j++;
				word="";
			}
			word+=text.charAt(i);
			if(i==text.length()-1) {
				words[j]=word;
			}
		}
		return words;
	}
	
	
	//function to find frequency
	public String frequency(String text) {
		String words[]=toArray(text);
		String[][]frequency=new String[numberOfUniqueWords(text)][2];
		String res="";
		for(int i=0,in=0;i<words.length;i++) {
			int count=1;
			if(!words[i].equals(" ")) {
				for(int j=i+1;j<words.length;j++) {
					if(words[i].equals(words[j])) {
						count++;
						words[j]=" ";
					}
				}
				frequency[in][0]=words[i];				
				frequency[in][1]=""+count;
				in++;
			}
		}
		
		//to sort in decending order based on frequency
		sort(frequency);

		for(int i=0;i<frequency.length;i++) {
			res+=frequency[i][0]+"-"+frequency[i][1];
			if(i!=frequency.length-1) {
				res+=" , ";
			}
		}
		return res;
	}
	
	
	//function to sort in decending order based on frequency
	private void sort(String[][] frequency) {
		for(int i=0;i<frequency.length;i++) {
			for(int j=0;j<frequency.length-1;j++) {
				if(Integer.parseInt(frequency[j][1])<Integer.parseInt(frequency[j+1][1])){
					String[]temp=frequency[j];
					frequency[j]=frequency[j+1];
					frequency[j+1]=temp;
				}
			}
		}
	}


	//to count the number of unique words in given sentence
	public int numberOfUniqueWords(String text) {
		String[]words=toArray(text); 
		int count=0;
		for(int i=0;i<words.length;i++) {
			if(words[i]!=" ") {
				count++;
				for(int j=i+1;j<words.length;j++) {
					if(words[j].equals(words[i])) {
						words[j]=" ";
					}
				}
			}
		}
		return count;
	}
}
