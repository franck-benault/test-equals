package net.franckbenault.testequals.v1;

public class Point {
	
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}


	public boolean equals(Point obj) {
		if (getClass() != obj.getClass())
			return false;
	
		
		return (x == obj.x) && (y == obj.y);
		
		
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	

}
