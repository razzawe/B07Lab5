package lab5;

public class Heptagon {
	double sideLength, rotation;
	Point position;

	Heptagon(double sideLength, double rotation, Point position){
		this.sideLength = sideLength;
		this.rotation = rotation;
		this.position = position;
		//Simplify rotation
		this.rotation = rotation % ( Math.PI*2/7);
	}

	double getArea(){
		return (7/4)*sideLength*sideLength*(1/Math.tan( Math.PI/7));
	}

	double getPerimeter(){
		return 7 * sideLength;
	}

	double getRadiusCorner(){
		return (sideLength / 2)/Math.cos((900 / 180) *  Math.PI /14);
	}

	double getRadiusBase(){
		return Math.tan((900 / 180) *  Math.PI /14) * sideLength / 2;
	}


}
