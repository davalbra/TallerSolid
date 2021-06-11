package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;


public abstract class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void anadirAderezo(Aderezo aderezo){
        this.aderezos.add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
        this.aderezos.remove(aderezo);
    }

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPrecioParcial() {
		return precioParcial;
	}

	public void setPrecioParcial(double precioParcial) {
		this.precioParcial = precioParcial;
	}

	public void setAderezos(ArrayList<Aderezo> aderezos) {
		this.aderezos = aderezos;
	}
    
   
}