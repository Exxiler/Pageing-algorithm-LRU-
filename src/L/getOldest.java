package L;

public class getOldest {

	static int getOldest(int[] arr) {
		int idx = 0, maxValue = 0;

		for (int i = 0; i < arr.length; i++){
			if(arr[i] > maxValue){
				maxValue = arr[i];
				idx = i;
			}
		}
		return idx;
	}
	
}
