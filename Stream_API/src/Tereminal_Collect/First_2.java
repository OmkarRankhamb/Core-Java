package Tereminal_Collect;

import java.util.List;

public class First_2 {

	public static void main(String[] args) {
         
	String[] str =("acd","dfk","fgf","dddd","axdc","acd");
		str.stream()
	
		.map(i->new String(i).chars()
	//	.map(i->new StringBuffer(i).reverse().toString().toUpperCase())
		.distinct()
		.forEach(System.out::println);
	}

}