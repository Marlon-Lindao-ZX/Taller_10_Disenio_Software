package main;

public class Deportivo extends Vehiculo {

	public Deportivo(String nombre, String serie) {
		super(nombre,serie);
	}
	
	@Override
	public void definirPotencia() {
		this.setMaxPotencia(80);
		
	}

	@Override
	public void definirCombustible() {
		tanque = new TanqueCombustible(700); 
		
	}

	@Override
	public void definirVelocidades() {
		this.rpm = 1;
        this.velocidades = 6;
		
	}

}
