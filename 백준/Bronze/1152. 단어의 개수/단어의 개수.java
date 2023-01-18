import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
        if(arr.length == 0)
            System.out.println(0);      
		else if(arr[0].length() == 0)
			System.out.println(arr.length-1);
		else
			System.out.println(arr.length);

		sc.close();
	}
}

