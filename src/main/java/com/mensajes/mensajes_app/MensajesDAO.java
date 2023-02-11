package com.mensajes.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO
{

    public static void crearMensajeDB(Mensajes mensaje)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection connection = conexion.getConnection();
            PreparedStatement ps;
            String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
            ps=connection.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setString(2, mensaje.getAutorMensaje());
            ps.executeUpdate();
            System.out.println("Mensaje creado");
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
    }

    public static void leerMensajeDB()
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection connection = conexion.getConnection();
            PreparedStatement ps;
            String query = "SELECT * FROM mensajes";
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Mensajes mensaje = new Mensajes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                System.out.println(mensaje);
            }
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
    }

    public static void borrarMensajeDB(int idMensaje)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection connection = conexion.getConnection();
            PreparedStatement ps;
            String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, idMensaje);
            ps.executeUpdate();
            System.out.println("se elimino el mensaje");
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
    }

    public static void actualizarMensajeDB(Mensajes mensaje) {
        Conexion conexion = new Conexion();
        try
        {
            Connection connection = conexion.getConnection();
            PreparedStatement ps;
            String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setInt(2, mensaje.getIdMensaje());
            ps.executeUpdate();
            System.out.println("se actualizo el mensaje");
        }
        catch (SQLException e) {System.out.println(e.getMessage());
        }
    }
}
