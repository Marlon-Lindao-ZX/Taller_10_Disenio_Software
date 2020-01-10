package main;

public class Otro extends Vehiculo {

	public Otro(String nombre, String serie) {
		super(nombre,serie);
	}
	@Override
	public void definirPotencia() {
		 this.setMaxPotencia(50);
		
	}

	@Override
	public void definirCombustible() {
		tanque = new TanqueCombustible(500);
		
	}

	@Override
	public void definirVelocidades() {
		this.rpm = 1;
        this.velocidades = 5;
		
	}

}
