package Prime_Number;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class sum_4 {

	public static void main(String[] args) {
		// String s = "dfghj"
		List<String> list = List.of("abcd", "ased", "sder");
		int sum = list.stream().map(i -> i.concat("patil").length()).reduce(0, (i, j) -> i + j);

		System.out.println(sum);

		System.out.println("=====================================");
		
		
		List<String> list1 = List.of("avbc", "sjwwo", "opei");
		List<String> list2 = List.of("avbc", "sjww", "opei");

		List<List<String>> list3 = List.of(list1, list2);

		List<Integer> map = list3.stream().flatMap(i -> i.stream()).map(i -> i.length())
				// .reduce(0,(i,j)->i+j)
				.collect(Collectors.toList());

		System.out.println(map);
		
		System.out.println("=====================================");
		
		List<Integer> list4 = List.of(1, 2, 5, 7, 2, 0 );
		
		IntStream.rangeClosed(1,7).filter(i->!list.contains(list4)).forEach(System.out::println);
		
		System.out.println("=============================================");
		
		
		
		List<Integer> list5= List.of(1,2,5,8,10,15,12);
		
		for(int i=1; i<=15; i++) {
			if(!list5.contains(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println("============================================");
		
		int sum1 = 9;
		int arr [] = { 1,2,3,4,5,6,7,8,9};
	//	int i;
	//	int j;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]+arr[j]==sum1) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
