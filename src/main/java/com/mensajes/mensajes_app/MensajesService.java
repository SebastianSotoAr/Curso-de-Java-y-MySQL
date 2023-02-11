package com.mensajes.mensajes_app;

import java.util.Scanner;

public class MensajesService
{
    public static void crearMensaje()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu mensaje: ");
        String mensaje = sc.nextLine();
        System.out.print("Nombre del autor: ");
        String autor = sc.nextLine();
        MensajesDAO.crearMensajeDB(new Mensajes(mensaje, autor));
    }

    public static void listarMensajes() {MensajesDAO.leerMensajeDB();}

    public static void borrarMensaje()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Id del mensaje a borrar: ");
        int idMensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(idMensaje);
    }

    public static void editarMensaje()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el id: ");
        int id_mensaje = sc.nextInt();
        sc.nextLine();
        System.out.print("Escribe el nuevo mensaje: ");
        String mensaje = sc.nextLine();
        MensajesDAO.actualizarMensajeDB(new Mensajes(id_mensaje, mensaje));
    }
}
