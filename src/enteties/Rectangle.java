/*Logo, a fórmula para calcular a diagonal é expressa da seguinte maneira:
 * d2= b2+h2 ou d=√b2+h2
 * Onde,
 * d: diagonal
 * b: base
 * h: altura
*/
package enteties;

public class Rectangle {
	
	public double Widht;
	public double Height;
	
	public double area(){
		return Widht*Height;
		
	} 
	
	public double perimeter() {
		return (Widht+Height)*2;
	}
	
	public double diagonal() {
		return Math.sqrt(Widht*Widht + Height*Height);
	}

}

