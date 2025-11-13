package BrokenJava;

public class Student {
	 String id;
	 double fine;

    public Student(String i, double f) {
        this.id = i;
        this.fine = f; 
    }

    public void payFine(double amount) {
    	
        this.fine = this.fine - amount; 
        if(this.fine<0) {
        	this.fine=0;
        }
    }

    public double getFine() {
        return this.fine;
    }
}
