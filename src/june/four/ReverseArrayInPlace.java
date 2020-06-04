package june.four;

public class ReverseArrayInPlace {

	public void reverseString(char[] s) {
        int i = 0, pos = s.length;

        if(pos % 2 == 1) {
        	while(i <= pos / 2) {
            	char temp = s[i];
            	s[i] = s[pos - i - 1];
            	s[pos - i - 1] = temp;
            	
            	i++;
            }
        } else {
        	while(i < pos / 2) {
            	char temp = s[i];
            	s[i] = s[pos - i - 1];
            	s[pos - i - 1] = temp;
            	
            	i++;
            }
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArrayInPlace rev = new ReverseArrayInPlace();

		char[] c1 = {'h','e','l','l','o'};
		rev.reverseString(c1);
		
		for(char c : c1) 
			System.out.print(c+" ");

		System.out.println("");
		char[] c2 = "ashish".toCharArray();
		rev.reverseString(c2);

		for(char c : c2) 
			System.out.print(c+" ");

		System.out.println("");
		char[] c3 = "match".toCharArray();
		rev.reverseString(c3);

		for(char c : c3) 
			System.out.print(c+" ");

		System.out.println("");
		char[] c4 = "Hannah".toCharArray();
		rev.reverseString(c4);

		for(char c : c4) 
			System.out.print(c+" ");
	}

}
