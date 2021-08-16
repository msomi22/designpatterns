package demo.test;

public class UM {
	
	private int[] ids;
	
	/**
	 * O(N^2) This is okay since will run once
	 * 
	 * @param size
	 */
	public UM(int size) {
		ids = new int[size];
		for(int i=0;i<size;i++) {
			ids[i] = i;
		}
	}
	
	/** O(N^2) for union of N inputs. For every input, we have a loop.
	 *  This is not acceptbale since can not scale
	 *  
	 * @param a
	 * @param b
	 */
	public void union(int a, int b) {
		int aval = ids[a];
		int bval = ids[b];
		for(int i=0;i<ids.length;i++) {
			if(ids[i] == aval) {
				ids[i] = bval;
			}
		}
		
	}
	
	public boolean isConnected(int a, int b) {
		return ids[a] == ids[b];
	}
	
	public void print() {
		for(int i=0;i<ids.length;i++) {
			System.out.print(+ids[i] + " ");
			//System.out.print("["+ i + "," + ids[i] + "] ");
		}
		System.out.println();
	}

}
