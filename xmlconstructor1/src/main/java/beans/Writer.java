package beans;
import myinterface.Pen;
public class Writer {
	private Pen pen;
	public Writer(Pen pen)
	{
		this.pen=pen;
	}
	public void write() {
		pen.write();
	}

}
