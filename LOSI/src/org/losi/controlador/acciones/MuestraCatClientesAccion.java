package org.losi.controlador.acciones;

import java.awt.Container;
import org.losi.vistas.VistaPrincipal;
import org.losi.vistas.catalogos.Catalogo;

public class MuestraCatClientesAccion extends Accion{

    @Override
    public void tarea(Container contenedor, Object... args) {
        Catalogo catalogo = ((VistaPrincipal)contenedor).getClienteCatalogo();
        Accion.getAccion("MuestraCatalogo").ejecutar(contenedor, catalogo);
    }
    
}
