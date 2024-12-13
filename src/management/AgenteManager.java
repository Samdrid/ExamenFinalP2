package management;

import entities.Agente;
import utils.ConsoleUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class AgenteManager {
    private ArrayList<Agente> agentes;
    private ArrayList<Equipo> equipos;

    public AgenteManager() {
        this.agentes = new ArrayList<>();

    }

    public class asignarEquipo {
        this.equipos = new ArrayList<>();
   
    }
    public void asignarEquipo(String equipo) {
        
        public int asignarEquipo(String equipo) {
    
          try (Scanner contenido = new Scanner(new File(equipo))) {
            return Integer.parseInt(contenido.nextLine());
          } 
          catch (FileNotFoundException e ) {
            logger.warn("equipo no encontrado.");
            return 0; } 
        } 
            
    }
  

    public void registrarAgente() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente: ");
        ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

        String nombre = ConsoleUtils.leerTexto("Ingrese el nombre del agente: ");
        String habilidad = ConsoleUtils.leerTexto("Ingrese la habilidad especial del agente: ");

        Agente nuevoAgente = new Agente(id, nombre, habilidad);
        agentes.add(nuevoAgente);
        System.out.println("Agente registrado con éxito.");
    }

    public void mostrarAgentes() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }
        System.out.println("=== Lista de Agentes ===");
        for (Agente agente : agentes) {
            System.out.println(agente);
        }
    }

    public void mostrarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menú Agentes ===");
            System.out.println("1. Registrar Agente");
            System.out.println("2. Mostrar Agentes");
            System.out.println("3. Salir");
            int opcion = ConsoleUtils.leerEntero("Seleccione una opción: ");
            ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

            switch (opcion) {
                case 1 -> registrarAgente();
                case 2 -> mostrarAgentes();
                case 3 -> continuar = false;
                default -> System.out.println("Opción no válida.");
            }
        }
    }
} 