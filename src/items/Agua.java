/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import proyecto_entrega2.Item;
import proyecto_entrega2.Const;
import itemspoderes.ApagaFuegos;

/**
 *
 * @author xavi
 */
public class Agua extends Item {
    
    public Agua(){
        
        this.poderes.add(ApagaFuegos.INSTANCIA);
    }
    
    @Override
    public String getArchivoImagen(){
        return Const.ARCHIVO_AGUA;
    }

}
