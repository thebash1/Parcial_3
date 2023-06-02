package com.mycompany.ediciondecodigo;

import java.io.*;
import java.util.ArrayList;

public class Archivo {
    
    File archivo = new File("partidos.txt");
    
    public void EscribirDatos(String fila){
        try {
            if(!archivo.exists()){
                archivo.createNewFile();
            }

            FileWriter escribir_fw = new FileWriter(archivo, true);
            try (BufferedWriter transferir_bw = new BufferedWriter(escribir_fw); PrintWriter imprimir_pw = new PrintWriter(transferir_bw)) {
                
                imprimir_pw.append(fila);
                transferir_bw.newLine();
            }
        
        } catch (IOException e) {
            System.out.println("Error");
        }
    } //cierre de metodo escribir datos 
    
    public ArrayList<Object []> LeerDatos() throws IOException{
        
        ArrayList<Object []> datos = new ArrayList();
        try {
            FileReader leer_fr = new FileReader(archivo);
            BufferedReader transferir_br = new BufferedReader(leer_fr);
            String fila = "";
            while((fila = transferir_br.readLine()) != null){
                Object [] ObjetoFila = fila.split(";");
                datos.add(ObjetoFila);
            }
                    
        } catch (FileNotFoundException e) {
        }
        
        return datos;
        
    } //cierre de metodo leer datos

    
    public void EliminarDatos(String id) throws IOException{
        ArrayList<Object []> DatosArchivo = this.LeerDatos();
        this.VaciarArchivo();
        for (Object[] equipo : DatosArchivo) {
            if(!String.valueOf(equipo[0]).equals(id)){
                String linea = String.valueOf(equipo[0])+";"+String.valueOf(equipo[1])+";"+String.valueOf(equipo[2])+"\n";
                this.EscribirDatos(linea);
            }
            
        }
    }
    
    public void VaciarArchivo(){
        try {
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            FileWriter escribir_fw = new FileWriter(archivo); 
            PrintWriter imprimir_pw;
            try (BufferedWriter tranferir_bw= new BufferedWriter(escribir_fw)) {
                imprimir_pw = new PrintWriter(tranferir_bw);
            }
            imprimir_pw.close();
                       
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
    public void ActualizarDatos(String id, String equipo, String entrenador) throws IOException{
        ArrayList <Object []> actualizar_datos = this.LeerDatos();
        this.VaciarArchivo();
        
        for (Object[] dato_obtenido : actualizar_datos) {
            if(String.valueOf(dato_obtenido[0]).equals(id)){
                VaciarArchivo();
                String obtener_fila = String.valueOf(dato_obtenido[0])+";"+String.valueOf(dato_obtenido[1])+";"+String.valueOf(dato_obtenido[2])+";";
                this.EscribirDatos(obtener_fila);
            }
        }
        
    }
}
