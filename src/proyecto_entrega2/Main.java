/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_entrega2;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author xavi
 */
public class Main {
    
    public static void main(String[]args){
        
        ControlJuego juego= new ControlJuego();
        try {
            
            String fName = System.getProperty("user.dir") + File.separator + "niveles.txt" ;
            juego.cargaNiveles(fName);
            
        } catch (ArchivoMalFormateadoException ex) {
            ex.getMessage();
            System.exit(-1);
        } catch (IOException e){
            e.getMessage();
            System.exit(-1);
        }
        juego.empiezaPartida();
        System.exit(0);
    }
       
}
