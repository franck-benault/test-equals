package net.franckbenault.testequals.v6;


public class ColorPoint extends Point {
	
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
		
	}
	
	@Override
	public boolean canEquals(Object obj) {
		return obj instanceof ColorPoint;
	}
	

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}



	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ColorPoint)) 
			return false;
		if (!(super.equals(obj)))
			return false;
		ColorPoint other = (ColorPoint) obj;
		if (!other.canEquals(this))
			return false;

		return other.color==color;
				
		
	}



	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}

}
