package org.example.modelo;

        import org.example.persistencia.InterfazDAO;

        import javax.swing.*;
        import java.awt.*;
        import java.net.MalformedURLException;
        import java.net.URL;

public class Bicicleta {
    private int id;
    private String tipo;
    private String marca;
    private String color;
    private int Rueda;
    private String url;

    public Bicicleta() {
    }

    public Bicicleta(int id, String tipo, String marca, String color, int rueda, String url) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
        Rueda = rueda;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRueda() {
        return Rueda;
    }

    public void setRueda(int rueda) {
        Rueda = rueda;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", color=" + color +
                ", Rueda=" + Rueda +
                ", url=" + url +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImage = new URL(this.url);
        return new ImageIcon(urlImage);
    }

}