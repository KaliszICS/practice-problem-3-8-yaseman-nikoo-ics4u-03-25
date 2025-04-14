import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int fib(int num){
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		return fibHelper(num, map);
	}
	public static int fibHelper(int n, HashMap<Integer,Integer> map){
		if(n==0){
			map.put(n,0);
			return 0;
		}
		if(n==1){
			map.put(n,1);
			return 1;
		}
		if(map.containsKey(n)){
			return map.get(n);
		}
		int x = fibHelper(n-1, map)+ fibHelper(n-2, map);
		map.put(n,x);
		return x;

	}
	
}
