package string;

public class replaceAll {

	public static void main(String[] args) {

    String  name = "ash#w@ini$";
    String str1=name.replaceAll("#","");
    System.out.println(str1);
		
		String name1="w e l c o m e";
		String s1=name1.replaceAll(" ", "");
		System.out.println(s1);
		
		String name3="Kr3t4ka";
		String s2=name3.replaceAll("[^a-zA-Z]", "i");
		System.out.println(s2);
		
		String name4="Kr3t4ka";
		String s3=name3.replaceAll("[a-zA-Z]", "i");
		System.out.println(s3);
	}

}
