/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import proyecto_entrega2.Item;
import proyecto_entrega2.Const;
import itemspoderes.Fundidor;

/**
 *
 * @author xavi
 */
public class Soplete extends Item {
    
    public Soplete(){
        
        this.poderes.add(Fundidor.INSTANCIA);
    }
    
   
    @Override
    public String getArchivoImagen(){
        return Const.ARCHIVO_SOPLETE;
    }
}
