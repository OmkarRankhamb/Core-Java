package Sort;

import java.util.List;

public class Used_Comparator {

	public static void main(String[] args) {

       List.of(12,34,54,34,56,32)
       .stream()
       .sorted((i,j)-> Integer.compare(i, j)).distinct().filter(i->i>20).skip(3)
       .peek(i->System.out.println(i+"A")).map(i->i*2).forEach(System.out::println);
	}

}
