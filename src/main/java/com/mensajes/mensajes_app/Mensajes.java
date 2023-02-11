package com.mensajes.mensajes_app;

public class Mensajes {
    int idMensaje;
    String mensaje;
    String autorMensaje;
    String fechaMensaje;

    public Mensajes() {}

    public Mensajes(String mensaje, String autorMensaje) {
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
    }

    public Mensajes(int idMensaje, String mensaje) {
        this.idMensaje = idMensaje;
        this.mensaje = mensaje;
    }

    public Mensajes(int idMensaje, String mensaje, String autorMensaje, String fechaMensaje) {
        this.idMensaje = idMensaje;
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }

    @Override
    public String toString()
    {
        return "Mensaje\n{" +
                "\n\tidMensaje: " + idMensaje +
                "\n\tmensaje: " + mensaje +
                "\n\tautorMensaje: " + autorMensaje +
                "\n\tfechaMensaje: " + fechaMensaje +
                "\n}";
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
