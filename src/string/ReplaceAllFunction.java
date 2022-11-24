package string;

public class ReplaceAllFunction {

	public static void main(String[] args) {
		
		//we want to display output only 1234
		String str="str1234";
        String str1=str.replaceAll("[^0-9]","");
         System.out.println(str1);
	}

}
