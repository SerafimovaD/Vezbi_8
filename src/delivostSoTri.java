import java.util.Scanner;
public class delivostSoTri {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.print("Da se ispecatat clenovi na niza koi ne se delivi so 3");
	System.out.print("Vnesi broj na clenovi vo niza");
	int n=input.nextInt();
	int niza[]=new int[n];
	System.out.println("Vnesi gi clenovite vo nizata:");
	for (int i = 0; i < niza.length; i++) {
		niza[i] = input.nextInt();
   }
	System.out.println("Clenovi koi ne se delivi so 3 se: ");
    for (int i = 0; i < niza.length; i++) {
	   if (niza[i] % 3 != 0) {
	   System.out.print(niza[i] + " ");
	     }
	}
}}

