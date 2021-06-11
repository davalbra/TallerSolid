/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Leche.LecheDeslactosada;
import Leche.LecheDescremada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
    
	public class ManejadorDeLeche {
	    
	    protected LecheEntera leche_Cambio;

	    public ManejadorDeLeche(LecheEntera leche_Cambio) {
	        this.leche_Cambio = leche_Cambio;
	    }
	    
	    public void cambiarTipoLeche(Postre postre){
	        postre.cambiarLeche(leche_Cambio);
	    }
	}
