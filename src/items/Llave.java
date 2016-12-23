/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import proyecto_entrega2.Item;
import proyecto_entrega2.Const;
import itemspoderes.AbrePuertas;

/**
 *
 * @author xavi
 */
public class Llave extends Item {
    
    public Llave(){
        
        this.poderes.add(AbrePuertas.INSTANCIA);
    }
    
     @Override
    public String getArchivoImagen(){
        return Const.ARCHIVO_LLAVE;
    }
}
