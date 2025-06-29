package interview.misc_programs_2025;

public class MoveEvenToStartOddToEnd {
	
	public static void main(String[] args) {
		int[] str = {1,2,6,2,5,4,1,3,5};
		
		int temp=0;
		for(int i=0; i<str.length; i++) {
			if(str[i]%2!=0) {
				for(int j=i; j<str.length; j++) {
					if(str[j]%2==0) {
						temp=str[i];
						str[i]=str[j];
						str[j]=temp;
					}
				}
			}
			System.out.print(str[i]);
		}
	}
}
