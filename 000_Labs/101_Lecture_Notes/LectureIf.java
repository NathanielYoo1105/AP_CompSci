/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf {
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("You're a student whos just woken up. What will you do?");
        System.out.println("1. Brush your teeth and get ready for school");
        System.out.println("2. Make breakfast");
        System.out.println("3. Sleep in for a bit longer");
        
        int a1 = sc.nextInt();
        sc.nextLine();
        int a2 = 0;
        
        if(a1 == 1){
            System.out.println("You've gotten ready for school but realize it's already 8:15");
            System.out.println("1. Eat nothing and just go to school");
            System.out.println("2. Accept that you will be tardy and make breakfast");
            System.out.println("3. Check your phone for any assignments");
            
            a2 = sc.nextInt();
            sc.nextLine();
            
        } else if(a1 == 2){
            System.out.println("You've made breakfast but realize it's already 8:15");
            System.out.println("1. Eat on the way to school");
            System.out.println("2. Eat, then head to school");
            System.out.println("3. Forget school and enjoy your food");
            
            a2 = sc.nextInt();
            sc.nextLine();
            

        } else if(a1 == 3){
            System.out.println("You finally wake up and realize it's already 8:15");
            System.out.println("1. Quickly get ready and run to school");
            System.out.println("2. Take your time and accept you will be late");
            System.out.println("3. Skip school and go back to sleep");
            
            a2 = sc.nextInt();
            sc.nextLine();
            

        } else {
            System.out.println("You didn't type a correct answer!");
        }
        if(a2 == 1){
            System.out.println("You sprint to school but you reach a red light!");
            System.out.println("1. Wait for the light to turn green while you think of an excuse to tell your teacher.");
            System.out.println("2. Accept your fate and check you phone");
            System.out.println("3. Sprint across the road (You're really good at Crossy Road)");
            
            int a3 = sc.nextInt();
            sc.nextLine();
            if(a3 == 1){
                System.out.println("You finally get to school and realize the doors are already closed.");
                System.out.println("You pull out your phone to text your friend and realize");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("Today's Saturday");
            } else if(a3 == 2){
                System.out.println("You've accepted you will be late and check your phone");
                System.out.println("You look at the date and see that it's Saturday");
                System.out.println("You facepalm and take the walk of shame back home");
            } else if(a3 == 3){
                System.out.println("You try your luck and sprint across the street");
                System.out.println("Your years of Crossy Road have paid off and you get to the other side!");
                System.out.println("You hear the sound of tires screeching and realize you've caused an accident");
                System.out.println("You go to call 911 but realize that today's date is actually Saturday");
                System.out.println("___________________________________________");
                System.out.println("| Achievement Unlocked!: Cause an accident|");
                System.out.println("-------------------------------------------");
            } else {
                System.out.println("You didn't type a correct answer");
            }
            
        } else if(a2 == 2){
            System.out.println("You've eaten your breakfast but you're already late for school");
            System.out.println("1. Sprint to school");
            System.out.println("2. Make seconds");
            System.out.println("3. Text your friend saying you'll be late");
            
            int a3 = sc.nextInt();
            
            if(a3 == 1){
                System.out.println("You sprint to school but you reach a red light!");
                System.out.println("1. Wait for the light to turn green while you think of an excuse to tell your teacher.");
                System.out.println("2. Accept your fate and check you phone");
                System.out.println("3. Sprint across the road (You're really good at Crossy Road)");
                
                int a4 = sc.nextInt();
                sc.nextLine();
                if(a4 == 1){
                    System.out.println("You finally get to school and realize the doors are already closed.");
                    System.out.println("You pull out your phone to text your friend and realize");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println("Today's Saturday");
                } else if(a4 == 2){
                    System.out.println("You've accepted you will be late and check your phone");
                    System.out.println("You look at the date and see that it's Saturday");
                    System.out.println("You facepalm and take the walk of shame back home");
                } else if(a4 == 3){
                    System.out.println("You try your luck and sprint across the street");
                    System.out.println("Your years of Crossy Road have paid off and you get to the other side!");
                    System.out.println("You hear the sound of tires screeching and realize you've caused an accident");
                    System.out.println("You go to call 911 but realize that today's date is actually Saturday");
                    System.out.println("___________________________________________");
                    System.out.println("| Achievement Unlocked!: Cause an accident|");
                    System.out.println("-------------------------------------------");
                } else {
                    System.out.println("You didn't type a correct answer");
                }
            } else if(a3 == 2){
                System.out.println("You decide to make seconds and while you're at it take a look at the calendar.");
                System.out.println("You realize today is Saturday and enjoy your feast");
            } else if(a3 == 3){
                System.out.println("You decide to text your friend");
                System.out.println("You realize today is Saturday and go back to sleep");
            } else {
                System.out.println("You didn't type a correct answer");
            }
            
        } else if(a2 == 3){
            System.out.println("You decide to look at your phone for a bit and realize today is Saturday.");
            System.out.println("You go back to sleep");
        } else {
            System.out.println("You didn't type a correct answer!");
        }
	}
}