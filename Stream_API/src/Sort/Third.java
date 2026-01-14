package Sort;

import java.util.List;

public class Third {

	public static void main(String[] args) {
    List<Integer> list=List.of(21,34,22,56,87,34);
    
    list.stream().sorted((i,j)-> Integer.compare(j, i)).forEach(System.out::println);;
    
     
	}

}
