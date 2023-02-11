package com.mensajes.mensajes_app;

import java.util.Scanner;

public class Inicio
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do
        {
            System.out.println("-------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. eliminar mensajes");
            System.out.println(" 4. editar mensajes");
            System.out.println(" 5. salir");
            System.out.println("-------------------------");
            //leemos la opcion del usuario
            System.out.print("  Opcion: ");
            opcion = sc.nextInt();
            System.out.println("-------------------------");

            switch (opcion)
            {
                case 1: MensajesService.crearMensaje(); break;

                case 2: MensajesService.listarMensajes(); break;

                case 3: MensajesService.borrarMensaje(); break;

                case 4: MensajesService.editarMensaje(); break;

                case 5: System.out.println("Adios\n-------------------------"); break;
            }
        }
        while(opcion != 5);
        sc.close();
    }
}
