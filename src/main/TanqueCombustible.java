package main;

public class TanqueCombustible {
	int maxCombustible;
    int restanteCombustible;
    
	public TanqueCombustible(int maxCombustible) {
		this.maxCombustible = maxCombustible;
		this.restanteCombustible = maxCombustible;
	}

	public int getMaxCombustible() {
		return maxCombustible;
	}

	public void setMaxCombustible(int maxCombustible) {
		this.maxCombustible = maxCombustible;
	}

	public int getRestanteCombustible() {
		return restanteCombustible;
	}

	public void setRestanteCombustible(int restanteCombustible) {
		this.restanteCombustible = restanteCombustible;
	}
	
	
    
    
}
