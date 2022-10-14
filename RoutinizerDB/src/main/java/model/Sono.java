package model;

public class Sono {
	private String Id_Usuario;
	private double segunda;
	private double terca;
	private double quarta;
	private double quinta;	
	private double sexta;
	private double sabado;
	private double domingo;
	
	public Sono() {
		Id_Usuario = "-1";
		segunda = 0.0;
		terca = 0.0;
		quarta = 0.0;
		quinta = 0.0;
		sexta = 0.0;
		sabado = 0.0;
		domingo = 0.0;
	}

	public Sono(String Id_Usuario, double segunda, double terca, double quarta, double quinta, double sexta, double sabado, double domingo) {
		setId_Usuario(Id_Usuario);
		setSegunda(segunda);
		setTerca(terca);
		setQuarta(quarta);
		setQuinta(quinta);
		setSexta(sexta);
		setSabado(sabado);
		setDomingo(domingo);
	}		
	
	public String getId_Usuario() {
		return Id_Usuario;
	}

	public void setId_Usuario(String Id_Usuario) {
		this.Id_Usuario = Id_Usuario;
	}

	
	public double getSegunda() {
		return segunda;
	}

	public void setSegunda(double segunda) {
		this.segunda = segunda;
	}

	public double getTerca() {
		return terca;
	}

	public void setTerca(double terca) {
		this.terca = terca;
	}

	public double getQuarta() {
		return quarta;
	}

	public void setQuarta(double quarta) {
		this.quarta = quarta;
	}
	
	public double getQuinta() {
		return quinta;
	}

	public void setQuinta(double quinta) {
		this.quinta = quinta;
	}

	public double getSexta() {
		return sexta;
	}

	public void setSexta(double sexta) {
		this.sexta = sexta;
	}
	
	public double getSabado() {
		return sabado;
	}

	public void setSabado(double sabado) {
		this.sabado = sabado;
	}
	
	public double getDomingo() {
		return domingo;
	}

	public void setDomingo(double domingo) {
		this.domingo = domingo;
	}
}