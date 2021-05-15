package L;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Program {
	
	public static int lru(ArrayList<Integer> numbers) {
		int faults = 0;
		int[] array = new int [3];
		int[] age = new int [3];
		int[] plb = new int [3];
		
		for(int i = 0; i < 3; i++){			//fill frames with -1, because they are
			array[i] = -1;					//are first initialized with 0 and that alters		
											//the result
			age[i] = 0;						//and set age to 0, since it was just used	
			plb[i] = 4;
		}

		for(int i = 0; i < numbers.size(); i++){

			for (int j = 0; j < 3; j++){
				age[j]++;
				plb[j]--;
			}

			int value = numbers.get(i);

			if ( !(isIn.isIn(value, 3, array)) ){
				faults++;
				int index = getOldest.getOldest(age);
				System.out.print(index);
				if(plb[index] > 0 && array[index] != -1){
					System.out.print('*');
					System.out.print("[" + array[0] + array[1] + array[2] + "]" + "\n");
					continue;
				}
					
				
				array[index] = value;
				age[index] = 0;
				plb[index] = 4;
				
				if(index == 0)
					System.out.print('A');
				if(index == 1)
					System.out.print('B');
				if(index == 2)
					System.out.print('C');	
			}
			else{
				for (int k = 0; k < 3; k++){
					if (array[k] == value){
						System.out.print(k);
						age[k] = 0;
						System.out.print('-');
					}
				}
			}
			
			System.out.print("[" + array[0] + array[1] + array[2] + "]" + "\n");
		}
		return faults;
	}
	
	
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	  
    	ArrayList<Integer> input = new ArrayList<>();
    	
    	Scanner sc = new Scanner(System.in);

    	String line;
    	while( sc.hasNext() ) {
    	        String data = sc.nextLine();
    	        String[] arr = data.split(",");
    	        int temp;
    	        for(int i = 0; i < arr.length; i++){
    	        	temp = Integer.parseInt(arr[i]);
    	        	if( temp < 0)
    	        		temp *=-1;
    	        	input.add(temp);
    	        }
    	}
    	
    	for(int i = 0; i < input.size(); i++)
    	{
    		int temp = 0;
    		if(input.get(i) < temp ){
    			temp = input.get(i);
    			temp*=-1;
    			input.set(i, temp);
    		}
    	}
    	
		int faults;
		
		faults = lru(input);
		System.out.println("\n" + faults);
    	}
    }

//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*String line;
while((line = br.readLine()) != null ) {
        String data = br.readLine();
        String[] arr = data.split(",");
        int temp;
        for(int i = 0; i < arr.length; i++){
        	temp = Integer.parseInt(arr[i]);
        	if( temp < 0)
        		temp *=-1;
        	input.add(temp);
        }
*/