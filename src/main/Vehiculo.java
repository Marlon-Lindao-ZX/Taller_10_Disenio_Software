package main;

public abstract class Vehiculo {
    protected int maxPotencia;
    protected int rpm;
    protected TanqueCombustible tanque;
    protected int velocidades;
    protected String name;
    protected String serie;
    protected Color color;
    protected ModoConduccion modo;
    protected TipoVehiculo tipo;
    
    public Vehiculo() {} 
    
    public Vehiculo(String nombre, String serie){
      this.serie =serie;
      name = nombre;
      color = new Color(255,255,255);
      modo = ModoConduccion.MANUAL;
      tipo = TipoVehiculo.TURISMO;
    }
    public ModoConduccion getModo(){ return modo; }
    public void setModo(ModoConduccion mode){modo = mode;}
    public TipoVehiculo getTipo(){return tipo;}
    public void setTipo(TipoVehiculo type){ tipo = type; }
    public int getMaxPotencia() { return maxPotencia;  }
    public int getMaxCombustible() {  return tanque.getMaxCombustible(); }
    public void setCombustible(final int fuel) {
      if (this.tanque.getMaxCombustible() >= fuel){ 
        this.tanque.setRestanteCombustible(fuel); 
      }
      else{ this.tanque.setRestanteCombustible(this.tanque.getMaxCombustible());
      }  
    }
    
    public void setMaxPotencia(int maxPotencia) {
		this.maxPotencia = maxPotencia;
	}
    
	/** Permite acelerar el vehiculo de acuerdo a su 
     * modo de conducción **/
    public void acelerar(){
      if(rpm < maxPotencia){
        switch (this.modo){
          case AUTOMATICO:
            //Verifica que no se pase de su máxima potencia
            if(verificarPotenciaYCombustible(rpm + 2)){ 
                rpm += 2; 
                tanque.setRestanteCombustible(tanque.getRestanteCombustible()-1); 
            }
            break;
          case MANUAL:
            //Verifica que no se pase de su máxima potencia
            if(verificarPotenciaYCombustible(rpm + 5)){ 
                rpm += 5; 
                tanque.setRestanteCombustible(tanque.getRestanteCombustible()-1); 
            }
            break;
        }
        verificarCombustible();
      }
    }
    
  public boolean verificarPotenciaYCombustible(int rpm) {
	  return this.maxPotencia > rpm && tanque.getRestanteCombustible() > 1;
  }
  
  public void verificarCombustible() {
	  if(tanque.getRestanteCombustible() == 0)
		  rpm = 0;
  }
  public void inicializar() {
	  definirPotencia();
	  definirCombustible();
	  definirVelocidades();
	  acelerar();
  }
  
  public abstract void definirPotencia();
  public abstract void definirCombustible();
  public abstract void definirVelocidades();
  
}
