public class Search {
	static int count;
	static int a[];
	static int left; 
	static int right;
	
public void run()	{
	newArray();
}	
	public void newArray() {
		int[] array = new int[12];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) Math.round((Math.random() * 15) - 5);	
				System.out.println(array[i]);
		}
	}
		
	int search(int count, int a[], int left, int right){
		if (left >= right) {
			return a[left] == count? left:-1;
		}
		int mid = (left + right) / 2;
		if (a[mid] == count) {
			return mid;
		}
		else if (a[mid] < count){
			return search(count, a, left, mid-1);
		}
		else{
			return search(count, a, mid+1, right);
			}
		}
}		


	
