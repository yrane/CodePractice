public class StrRotation {

	public static void main(String[] args) {
		String str1 = "waterbottle";
		String str2 = "bottlewater";
		
		
		String strnew = str1 + str1;
		if (str1.length() != str2.length())
		{	
			System.out.println("Rotation: False");
			System.exit(0);
		}
		if(strnew.toLowerCase().contains(str2.toLowerCase()))
			System.out.println("Rotation: True");
		else
			System.out.println("Rotation: False");

	}

}
