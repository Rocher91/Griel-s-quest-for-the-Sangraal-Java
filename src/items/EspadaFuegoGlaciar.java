/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import itemspoderes.ApagaFuegos;
import itemspoderes.Fundidor;
import proyecto_entrega2.Item;
import proyecto_entrega2.Const;


/**
 *
 * @author xavi
 */
public class EspadaFuegoGlaciar extends Item {
      
    public EspadaFuegoGlaciar(){
        
        this.poderes.add(ApagaFuegos.INSTANCIA);
        this.poderes.add(Fundidor.INSTANCIA);
    }
    
    @Override
    public String getArchivoImagen(){
        return Const.ARCHIVO_ESPADA;
    }

}