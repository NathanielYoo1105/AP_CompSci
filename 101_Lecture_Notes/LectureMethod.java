/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        greeting("Nathan");
        double num = raise(6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        System.out.print(num);
	}
	
	public static void greeting(String name){
	    System.out.println("Saulations " + name);
	    return;
	}
	
	public static double raise(double salary, int raise){
	    double amount = salary + (salary * (raise/100.0));
	    return amount;
	}
	
	public static void printAnimal(){
	    System.out.println(" __v_");
	    System.out.println("(____\\/{");
	    return;
	}
}