package main;

public class Rally extends Vehiculo{

	public Rally(String nombre, String serie) {
		super(nombre,serie);
	}
	
	@Override
	public void definirPotencia() {
		this.setMaxPotencia(70);
		
	}

	@Override
	public void definirCombustible() {
		tanque = new TanqueCombustible(1100);
		
	}

	@Override
	public void definirVelocidades() {
		 this.rpm = 1;
         this.velocidades = 5;
		
	}
	
	
}
