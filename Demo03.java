import java.util.Scanner;


public class Demo03 {
public static void main(String[] args){
	System.out.println("input an number£º");
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
	if(num<10){
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	else{
		for(int i=1;i<=9;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(i);
			}
			System.out.println("");
		}
		for(int i=10;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
				System.out.print(arr[i-10]);
			}
				System.out.println("");
			}
	}
}
}

