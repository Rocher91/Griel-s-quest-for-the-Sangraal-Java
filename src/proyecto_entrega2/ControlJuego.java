/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_entrega2;

import gui.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author xavi
 */
public class ControlJuego {

    private InterfazGrafica gui;
    private int nivel;
    private List<Nivel> niveles;

    public ControlJuego() {
        this.niveles = new ArrayList<Nivel>();
        this.nivel = 0;
        this.gui = new InterfazGrafica(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS);
    }

    public void cargaNiveles(String rutaFichero) throws ArchivoMalFormateadoException, IOException {

        int i = 0, aux;
        char[][] mapa = new char[Const.NIVEL_FILAS][Const.NIVEL_COLUMNAS];
        FileReader entrada = new FileReader(rutaFichero);
        BufferedReader mibuffer = new BufferedReader(entrada);

        String linea = mibuffer.readLine();

        while (linea != null && !linea.startsWith("===")) {

            if (linea.startsWith("---")) {
                niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS, mapa));
                mapa = new char[Const.NIVEL_FILAS][Const.NIVEL_COLUMNAS];

                if (i != Const.NIVEL_FILAS) {
                    i = 0;
                    throw new ArchivoMalFormateadoException("Se ha leído" + i + "filas");
                }

                i = 0;
            } else if (!linea.startsWith("//") && !linea.startsWith("---") && !linea.startsWith("===")) {

                //String lectura=linea.substring(0,Const.NIVEL_COLUMNAS);                      
                String lectura[] = linea.split("\\|");
//                      if(lectura[0].length()!=Const.NIVEL_FILAS) 
//                          throw new ArchivoMalFormateadoException("Error: El formato del archivo no es correcto tamaño de filas incorrecto");
                mapa[i] = lectura[0].toCharArray();
                aux = lectura[0].toCharArray().length;

                if (aux != Const.NIVEL_COLUMNAS) {
                    i = 0;
                    throw new ArchivoMalFormateadoException("Se ha leído" + aux + "columnas");
                }

                i++;
            }

            linea = mibuffer.readLine();
        }
    }

    public void empiezaPartida() {

        while (nivel < niveles.size()) {

            boolean fin = false;
            Nivel nivelActual = niveles.get(this.nivel).clonar();
            do {

                redibuja(nivelActual);
                gui.mensaje("Introduce el siguente movimiento");

                switch (gui.leeTeclaPulsada()) {

                    case InterfazGrafica.TECLA_ARRIBA:

                        if (nivelActual.getCelda(nivelActual.getJugador().getPosFila() - 1, nivelActual.getJugador().getPosCol()).puedePasar(nivelActual.getJugador())) {
                            fin = nivelActual.intentaMoverJugador(nivelActual.getJugador().getPosFila() - 1, nivelActual.getJugador().getPosCol());
                        }
                        break;

                    case InterfazGrafica.TECLA_ABAJO:

                        if (nivelActual.getCelda(nivelActual.getJugador().getPosFila() + 1, nivelActual.getJugador().getPosCol()).puedePasar(nivelActual.getJugador())) {
                            fin = nivelActual.intentaMoverJugador(nivelActual.getJugador().getPosFila() + 1, nivelActual.getJugador().getPosCol());
                        }
                        break;

                    case InterfazGrafica.TECLA_DERECHA:

                        if (nivelActual.getCelda(nivelActual.getJugador().getPosFila(), nivelActual.getJugador().getPosCol() + 1).puedePasar(nivelActual.getJugador())) {
                            fin = nivelActual.intentaMoverJugador(nivelActual.getJugador().getPosFila(), nivelActual.getJugador().getPosCol() + 1);
                        }
                        break;

                    case InterfazGrafica.TECLA_IZQUIERDA:

                        if (nivelActual.getCelda(nivelActual.getJugador().getPosFila(), nivelActual.getJugador().getPosCol() - 1).puedePasar(nivelActual.getJugador())) {
                            fin = nivelActual.intentaMoverJugador(nivelActual.getJugador().getPosFila(), nivelActual.getJugador().getPosCol() - 1);
                        }
                        break;

                    case InterfazGrafica.TECLA_R:

                        nivelActual = niveles.get(nivel).clonar();
                        break;
                }
            } while (fin != true);

            nivel++;
        }
    }

    private void redibuja(Nivel nivelActual) {

        for (int fila = 0; fila < Const.NIVEL_FILAS; fila++) {
            for (int columna = 0; columna < Const.NIVEL_COLUMNAS; columna++) {
                gui.colocaImagen(nivelActual.getCelda(fila, columna).getArchivoImagen(), fila, columna);
            }
        }

        gui.colocaImagen(Const.ARCHIVO_JUGADOR, nivelActual.getJugador().getPosFila(), nivelActual.getJugador().getPosCol());

        if (nivelActual.getJugador().getItem() != null) {
            gui.colocaImagen(nivelActual.getJugador().getItem().getArchivoImagen(), 0, Const.NIVEL_COLUMNAS - 1);
        } else {
            gui.colocaImagen(null, 0, Const.NIVEL_COLUMNAS - 1);
        }
    }

}
