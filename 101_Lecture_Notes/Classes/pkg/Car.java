/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    //Global variables
	String model;
	double maxSpeed;
	boolean isElectric;
	String color;
    
    //Constructors
	public Car(){
		//These are all private variables
		model = "Bus";
		maxSpeed = 1.1;
		isElectric = false;
		color = "Blue & Red";
	}
	
	public Car(String m, double s, String c){
		model = m;
		maxSpeed = s;
		isElectric = false;
		color = c;
	}
    
    public void paint(String c){
        color = c;
    }
    
    public void vroom(){
        int count = 0;
        while(count < maxSpeed) {
    		System.out.print(model + " goes VROOOOOOOM");
    		count = count + 10;
        }
	}
	
	public String getModel(){
		return model;
	}

    
}