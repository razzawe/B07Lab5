package lab4;
public class Heptagon {
	double sideLength, rotation; 
	Point position;
	
	Heptagon(double sideLength, double rotation, Point position){
		this.sideLength = sideLength; 
		this.rotation = rotation;
		this.position = position;
		//Simplify rotation
		this.rotation = rotation % (Math.pi*2/7);
	}
	
	double getArea(){
		return (7/4)*sideLength*sideLength*(1/Math.tan(Math.pi*2/7));
	}
	
	double getPerim(){
		return 7 * sideLength;
	}
	
	double getRadiusCorner(){
		return Math.cos((900 / 180) * Math.pi /14) * sideLength / 2;
	}
	
	double getRadiusBase(){
		return Math.tan((900 / 180) * Math.pi /14) * sideLength / 2;
	}
	
	
}
