package net.franckbenault.testequals.v2;

public final class Point {
	
	
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


	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point))
			return false;
	
		Point other = (Point) obj;
		
		return (x == other.x) && (y == other.y);
		
		
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
