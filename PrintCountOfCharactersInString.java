package interview.misc_programs_2025;

import java.util.Arrays;

public class PrintCountOfCharactersInString {

	public static void main(String[] args) {
		 String str = "aabbbccccddddd";
	        int[] freq=new int[256];
	        boolean[] printed=new boolean[256];
	        StringBuilder result=new StringBuilder();
	        for(int i=0;i<str.length();i++)
	        {
	            freq[str.charAt(i)]++;
	        }
	        for(int i=0;i<str.length();i++)
	        {
	            char ch=str.charAt(i);
	            if(!printed[ch])
	            {
	                result.append(ch).append(freq[ch]);
	                printed[ch]=true;
	            }
	        }
	        System.out.println(result.toString());
	}
}