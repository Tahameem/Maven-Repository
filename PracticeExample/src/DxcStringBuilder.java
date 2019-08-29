
public class DxcStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder str= new StringBuilder("StringBuilder");
		StringBuilder str1= new StringBuilder("StringBuilder");
		System.out.println(str.equals(str1));
		System.out.println(str.hashCode()+"and"+str1.hashCode());
		System.out.println(str==str1);
		System.out.println(str.toString().equals(str1.toString()));
		System.out.println("----------------------------------------------------------------");

		StringBuffer str2= new StringBuffer("String");
		StringBuffer str3= new StringBuffer("StringBuffer");
		
		str2.append("Buffer");
		System.out.println(str2.equals(str3));
		System.out.println(str2.hashCode()+"and"+str3.hashCode());
		System.out.println(str2==str3);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str2.toString().equals(str3.toString()));
		System.out.println("----------------------------------------------------------------");

		
		String str4= new String("StringBuffer");
		String str5= new String("StringBuffer");
		
		str4.concat("Buffer");
		System.out.println(str4.equals(str5));
		System.out.println(str4.hashCode()+"and"+str5.hashCode());
		System.out.println(str4==str5);
		System.out.println(str5);
		System.out.println(str4);
		
		System.out.println(str4.toString().equals(str5.toString()));
		
	}

}
