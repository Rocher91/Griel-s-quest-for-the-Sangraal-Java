/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_entrega2;

/**
 *
 * @author xavi
 */
public interface ObjetoEnEscena {
  
     String getArchivoImagen();
     boolean puedePasar(Jugador jugador);
     boolean pasa(Jugador j,Celda c);
  
}
