package test9nov;

public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Poly");
		System.out.println(sb.append("Morph"));
		sb.reverse();
		String str = sb.toString();
		System.out.println(str.substring(5));
	}

}
