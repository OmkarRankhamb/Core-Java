package Static_Refarance;

import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		 List<Long> list = List.of(12L,10l,10l,12123l,21312312l,123123123l);
		 
        Long sum=  list.stream()
        .reduce(0l,(i,j)->i+j);
           System.out.println(sum);
	}

}
