import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		while(menu != 2) {
			System.out.println(" /$$$$$$$     /$$$$$                   /$$$$$ /$$$$$$$  /$$$$$$$$        /$$       /$$");
			System.out.println("| $$__  $$   |__  $$                  |__  $$| $$__  $$|__  $$__/       | $$      | $$ ");
			System.out.println("| $$  \\ $$      | $$                     | $$| $$  \\ $$   | $$  /$$$$$$ | $$$$$$$ | $$  /$$$$$$");
			System.out.println("| $$$$$$$       | $$     /$$$$$$         | $$| $$$$$$$/   | $$ |____  $$| $$__  $$| $$ /$$__  $$");
			System.out.println("| $$__  $$ /$$  | $$    |______/    /$$  | $$| $$____/    | $$  /$$$$$$$| $$  \\ $$| $$| $$$$$$$$");
			System.out.println("|  $$ \\ $$| $$  | $$               | $$  | $$| $$         | $$ / $$__ $$| $$  | $$| $$| $$_____/");
			System.out.println("| $$$$$$$/|  $$$$$$/               |  $$$$$$/| $$         | $$|  $$$$$$$| $$$$$$$/| $$|  $$$$$$$");
			System.out.println("|_______/  \\______/                 \\______/ |__/         |__/ \\_______/|_______/ |__/ \\_______/");
			
			System.out.println("");
			System.out.println("1. Start the Simulation");
			System.out.println("2. Close App");
			System.out.println("Choice >> ");
			menu = scan.nextInt();
			if(menu == 1) {
				Integer a = 0;
				Integer b = 0;
				while(!(a >= 1 &&  a <= 100)) {
					System.out.println("Input the first number [1 - 100](inclusive): ");
					a = scan.nextInt();
				}while(!(b >= 1 && b <= 100)) {
					System.out.println("Input the second number [1 - 100](inclusive): ");
					b = scan.nextInt();
				}
				scan.nextLine();
				String c = String.valueOf(a) + "+" + String.valueOf(b);
				String d = getCharForNumber(a);
				String e = getCharForNumber(b);
				Integer f = a*b;
				Double g = new Double(a)/ new Double(b);
				Boolean h = a==b;
				
				System.out.println("+=========================================================================================================================+");
				System.out.println("+  + (String type)  |  (Character Type)  |  * (Integer type)  |  / (Floating Type)  |  input 1 == input 2 (Boolean Type)  +");
				System.out.println("+=========================================================================================================================+");
				System.out.printf("+      %s      |       %s %s        |       %d        |        %f        |                %s                +\n",c,d,e,f,g,h);
				System.out.println("+=========================================================================================================================+");
				System.out.println("Press enter to Proceed..");
				scan.nextLine();
				System.out.println("+===========================================================+");
				System.out.println("+Data Type: Integer                                         +");
				System.out.println("+===========================================================+");
				System.out.println("+     +     |     -     |     *     |     /     |     %     +");
				System.out.println("+===========================================================+");
				System.out.printf("+    %d     |    %d     |     %d    |     %d    |     %d    +\n",a+b,a-b,a*b,a/b,a%b);
				System.out.println("+===========================================================+");
				System.out.println("Press enter to Proceed..");
				scan.nextLine();
				Boolean p1=null,p2=null;
		        boolean isBoolean = false;
		        while (!isBoolean) {
		        	System.out.println("Give me value for p1 [true |false]: ");
		            try {
		                p1 = scan.nextBoolean();
		                isBoolean = true;
		            } catch (InputMismatchException haiya) {
		                isBoolean = false;
		                scan.nextLine();
		            }
		        }
		        scan.nextLine();

		       isBoolean = false;
		        while (!isBoolean) {
		        	System.out.println("Give me value for p2 [true |false]: ");
		            try {
		                p2 = scan.nextBoolean();
		                isBoolean = true;
		            } catch (InputMismatchException fuiyoh) {
		                isBoolean = false;
		                scan.nextLine();
		            }
		        }
		        scan.nextLine();
				
				Boolean w,x,y,z;
				w = !p1;
				x = !p2;
				y = p1 && p2;
				z = p1 || p2;
				System.out.println("+=====================================================+");
				System.out.println("+Logical Table                                        +");
				System.out.println("+=====================================================+");
				System.out.println("+     !P1     |     !P2     |     &&     |     ||     +");
				System.out.println("+=====================================================+");
				System.out.printf( "+   %s    |  %s     |   %s   |   %s     +\n",w,x,y,z);
				System.out.println("+=====================================================+");
				scan.nextLine();
			}
		}
		System.out.println("thank you for using the apps!!");
		scan.close();
	}
	
	private static String getCharForNumber(int i) {
	    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	    if (i > 25) {
	        return null;
	    }
	    return Character.toString(alphabet[i]);
	}

}
