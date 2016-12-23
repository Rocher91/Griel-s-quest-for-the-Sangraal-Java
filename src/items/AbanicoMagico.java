/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import itemspoderes.AmansaVientos;
import proyecto_entrega2.Item;
import proyecto_entrega2.Const;

/**
 *
 * @author xavi
 */
public class AbanicoMagico extends Item {
    
 public AbanicoMagico(){
        
        this.poderes.add(AmansaVientos.INSTANCIA);
 }      
    
@Override
public String getArchivoImagen(){
        return Const.ARCHIVO_ABANICO;
}

}