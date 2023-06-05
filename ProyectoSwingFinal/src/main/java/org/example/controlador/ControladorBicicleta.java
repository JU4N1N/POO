
package org.example.controlador;

import org.example.modelo.Bicicleta;
import org.example.modelo.ModeloTablaBici;
import org.example.persistencia.BicicletaDAO;
import org.example.vista.VentanaBici;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorBicicleta extends MouseAdapter {
    private VentanaBici view;
    private ModeloTablaBici modelo;

    public ControladorBicicleta(VentanaBici view) {
        this.view = view;
        modelo = new ModeloTablaBici();
        this.view.getTblBicicleta().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblBicicleta().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos();
            this.view.getTblBicicleta().setModel(modelo);
            this.view.getTblBicicleta().updateUI();
        }

        if(e.getSource() == this.view.getTblBicicleta()){
            int index = this.view.getTblBicicleta().getSelectedRow();
            Bicicleta tmp = modelo.getBiciIndex(index);
            try {
                this.view.getImagenBici().setIcon(tmp.getImagen());
            }catch (MalformedURLException mfue){
                System.out.println(e.toString());
            }
        }

        if(e.getSource() == this.view.getBtnAgregar()){
            Bicicleta bici = new Bicicleta();
            bici.setId(0);
            bici.setTipo(this.view.getTxtTipo().getText());
            bici.setMarca(this.view.getTxtMarca().getText());
            bici.setColor(this.view.getTxtColor().getText());
            bici.setRueda(Integer.parseInt(this.view.getTxtRueda().getText()));
            bici.setUrl(this.view.getTxtUrl().getText());
            if(modelo.agregarBici(bici)){
                JOptionPane.showMessageDialog(view, "Se agrego correctamente","Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblBicicleta().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Revisar la conexión",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }

        if(e.getSource()== this.view.getBtnEliminar()){
            this.view.getTxtEliminar().getText();
            BicicletaDAO bdao = new BicicletaDAO();
            try {
                if(bdao.delete(this.view.getTxtEliminar().getText())){
                    JOptionPane.showConfirmDialog(view, "¿Seguro que quieres eliminar este campo?", "Aviso", JOptionPane.YES_NO_OPTION);
                    this.view.getTblBicicleta().updateUI();
                    this.view.getImagenBici().updateUI();
                }
            }catch (SQLException sqle){
                JOptionPane.showMessageDialog(view, "No se pudo eliminar", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar3();
        }

        if(e.getSource() == this.view.getBtnActualizar()){
            Bicicleta bici = new Bicicleta();
            bici.setId(0);
            bici.setTipo(this.view.getTxtTipoAct().getText());
            bici.setMarca(this.view.getTxtMarcaAct().getText());
            bici.setColor(this.view.getTxtColorAct().getText());
            bici.setRueda(Integer.parseInt(this.view.getTxtRuedaAct().getText()));
            bici.setUrl(this.view.getTxtFotoAct().getText());
            bici.setId(Integer.parseInt(this.view.getTxtIdAct().getText()));
            if(modelo.actualizarBici(bici)){
                JOptionPane.showConfirmDialog(view, "¿Seguro que quieres actualizar este campo?", "Aviso", JOptionPane.YES_NO_OPTION);
                this.view.getTblBicicleta().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo actualizar", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            this.view. limpiar2();
        }
        this.view. limpiar2();
    }
}


