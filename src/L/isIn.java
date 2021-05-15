package L;

public class isIn {

	static boolean isIn(int value, int frames, int[] array) {

		for (int i = 0; i < frames; i++){
			if (array[i] == value){
				return true;
			}
		}
		return false;
	}
	
}
