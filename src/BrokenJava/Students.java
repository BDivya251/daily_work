package BrokenJava;
import java.util.*;
public class Students {
	public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opt = 0;

        while (opt != 3) {
            System.out.println("1. Add Fine");
            System.out.println("2. Pay Fine");
            System.out.println("3. Exit");
            opt = sc.nextInt();

            if (opt == 1) {
                System.out.print("Enter ID: ");
                String id = sc.next();
                System.out.print("Enter fine amount: ");
                double fine = sc.nextDouble();
                Student s = new Student(id, fine);
                map.put(id, s);
            } else if (opt == 2) {
                System.out.print("Enter ID: ");
                String id = sc.next();
                if (map.containsKey(id)) {
                    System.out.print("Enter payment amount: ");
                    double amt = sc.nextDouble();
                    if(map.get(id).getFine()>amt) {
                    	System.out.println("the amount is less than fine.Do full Payment");
                    }
                    else if(map.get(id).getFine()<amt) {
                    	System.out.println("Paid more amount than fine");
                    }
                    else {
                    map.get(id).payFine(amt);
                    System.out.println("Payment done!");}
                } else {
                    System.out.println("ID not found!");
                }
            } else if (opt == 3) {
                for (String id : map.keySet()) {
                    System.out.println("ID: " + id + " Fine: " + map.get(id).getFine());
                }
                break;
            }
            else {
            	System.out.println("Enter the correct option number");
            }
        }
    }
        
}