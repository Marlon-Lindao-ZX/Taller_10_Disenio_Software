package main;

public class Turismo extends Vehiculo {

	public Turismo(String nombre, String serie) {
		super(nombre,serie);
	}
	
	@Override
	public void definirPotencia() {
		this.setMaxPotencia(50);
		
	}

	@Override
	public void definirCombustible() {
		tanque = new TanqueCombustible(1000);
		
	}

	@Override
	public void definirVelocidades() {
		this.rpm = 1;
        this.velocidades = 5;
		
	}

}
