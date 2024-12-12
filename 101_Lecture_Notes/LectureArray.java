/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 5, 8, 8, 8, 2, 4, 4};
        
        for(int i = 0; i < arr.length; i++){
            System.out.println("Index " + i + " has a value of " + arr[i]);
        }
        
        for(int i = 0; i < arr.length; i+=2){ // prints out even values
            System.out.println("Index " + i + " has a value of " + arr[i]);
        }
        
        for(int i = 0; i < arr.length-1; i+=2){
            System.out.println(arr[i] + " " + arr[i+1]);
        }
        
        dupeCheck = 8;
        for(int i = 0; i < arr.length; i++){
            if(dupeCheck == arr[i])
                System.out.println(i);
        }
        
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1])
                System.out.println("Indexes " + i + " and " + (i+1) + " are consecutive");
        }
        
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                min = arr[i];
            }
        }
	}
}