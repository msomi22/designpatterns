package demo.test;

public class QuickUnionUF {
	
	private int[] id;
	
	public QuickUnionUF(int n) {
		id = new int[n];
		for(int i=0;i<n;i++) {
			id[i] = i;
		}
	}
	
	public boolean isConnected(int a, int b) {
		return root(a) == root(b);
	}
	
	private int root(int i) {
		while(i != id[i]) {
			i = id[i];
		}
		return i;
	}
	public void union(int a, int b) {
		int i = root(a);
		int j = root(b);
		id[i] = j;
	}

}
