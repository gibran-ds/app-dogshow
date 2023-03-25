/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.appdogshow;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroMascotas = 2;
        String[] mascotas = new String[numeroMascotas];
        
        // 2. Que permita almacenar los nombres de mascotas de los 
        // primeros 5 clientes que compren comida en su tienda.        
        // 3. La aplicación debe permitir agregar mascotas nuevas.
        // 4. También debe evitar que se agreguen mascotas sin nombre.
        // 5. Evitar mascotas con nombres con más de 20 caracteres. 
        for(int i = 0; i < numeroMascotas; i++){            
            // VERIFICAR NOMBRE DE MASCOTA NO VACÍO
            String mascota = "";
            do{
                System.out.println("Ingresa tu mascota");
                mascota = teclado.nextLine(); 
            }while(mascota.isBlank() || mascota.length() > 20);            
            System.out.println("Mascota guardada: " + mascota);
            mascotas[i] = mascota;            
        }        
        
        // 6. La aplicación debe mostrar la lista al iniciar el 
        // sistema y después de cada modificación.
        System.out.println("Mascotas registradas");
        for(int i = 0; i < numeroMascotas; i++){
            String nombreMascota = mascotas[i];
            if(nombreMascota == null){
                nombreMascota = "vacío";
            }
            System.out.printf("%d . %s %n", (i+1), nombreMascota);
        }        
    }
    
}
