package es.cesalberca.practicaaccesodatos52;

import es.cesalberca.practicaaccesodatos52.controlador.Controlador;
import es.cesalberca.practicaaccesodatos52.modelo.ConectorBD;
import es.cesalberca.practicaaccesodatos52.modelo.Modelo;
import es.cesalberca.practicaaccesodatos52.vista.Vista;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = null;
        try {
            modelo = new Modelo();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Controlador controlador = new Controlador(vista, modelo);
    }
}
