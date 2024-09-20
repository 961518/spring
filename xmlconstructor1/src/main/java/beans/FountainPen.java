package beans;

import myinterface.Ink;
import myinterface.Pen;
public class FountainPen implements Pen {

	Ink ink;
	public FountainPen(Ink ink) {
		this.ink = ink;
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Write with "+ink.getColor()+" ink of "+ink.getBrandName()+" brand");
	}

}
