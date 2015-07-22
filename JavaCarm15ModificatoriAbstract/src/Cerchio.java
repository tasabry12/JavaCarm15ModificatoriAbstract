
public class Cerchio extends Esempio{
	
	private double raggio;



	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public double calcolaArea() {
		return Math.PI * (getRaggio() * 2);
		
	}

}
