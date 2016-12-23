/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_entrega2;

import java.io.IOException;

/**
 *
 * @author xavi
 */
public class ArchivoMalFormateadoException extends IOException {

    /**
     * Creates a new instance of <code>ArchivoMalFormateadoException</code>
     * without detail message.
     */
    public ArchivoMalFormateadoException() {
    }

    /**
     * Constructs an instance of <code>ArchivoMalFormateadoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ArchivoMalFormateadoException(String msg) {
        super(msg);
    }
}
