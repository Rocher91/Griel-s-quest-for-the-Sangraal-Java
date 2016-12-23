/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import proyecto_entrega2.Item;
import proyecto_entrega2.Const;
import itemspoderes.Rompedor;

/**
 *
 * @author xavi
 */
public class Pico extends Item {
    
    public Pico(){
        
        this.poderes.add(Rompedor.INSTANCIA);
    }
    
     @Override
    public String getArchivoImagen(){
        return Const.ARCHIVO_PICO;
    }
}
