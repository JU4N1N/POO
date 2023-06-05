package org.example.vista;

        import javax.swing.*;
        import java.awt.*;

public class VentanaBici extends JFrame {
    private JLabel lblID;
    private JLabel lblTipo;
    private JLabel lblMarca;
    private JLabel lblColor;
    private JLabel lblRueda;
    private JLabel lblUrl;
    private JTextField txtID;
    private JTextField txtTipo;
    private JTextField txtMarca;
    private JTextField txtColor;
    private JTextField txtRueda;
    private JTextField txtUrl;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JTable tblBicicleta;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel imagenBici;
    private JButton btnEliminar;
    private JTextField txtEliminar;
    private JButton btnActualizar;
    private JLabel lblEliminar;
    private JLabel lblActualizar;
    private JLabel lblTipoAct;
    private JLabel lblMarcaAct;
    private JLabel lblColorAct;
    private JLabel lblRuedaAct;
    private JLabel lblFotoAct;
    private JTextField txtTipoAct;
    private JTextField txtMarcaAct;
    private JTextField txtColorAct;
    private JTextField txtRuedaAct;
    private JTextField txtFotoAct;
    private JLabel lblIdAct;
    private JTextField txtIdAct;



    public VentanaBici(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(64, 120, 192));
        lblID = new JLabel("Id: ");
        lblTipo = new JLabel("Tipo: ");
        lblMarca = new JLabel("Marca: ");
        lblColor = new JLabel("Color: ");
        lblRueda = new JLabel("Medida de rueda: ");
        lblUrl = new JLabel("Foto: ");
        txtID = new JTextField(3);
        txtID.setText("0");
        txtID.setEnabled(false);
        txtTipo = new JTextField(35);
        txtMarca= new JTextField(15);
        txtColor = new JTextField(10);
        txtRueda = new JTextField(5);
        txtUrl = new JTextField(30);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblID);
        panel1.add(txtID);
        panel1.add(lblTipo);
        panel1.add(txtTipo);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblColor);
        panel1.add(txtColor);
        panel1.add(lblRueda);
        panel1.add(txtRueda);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);



        //Panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(64, 81, 94));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblBicicleta = new JTable();
        scrollPane = new JScrollPane(tblBicicleta);
        panel2.add(scrollPane);


        //Panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(64, 81, 94));
        imagenBici = new JLabel("...");
        panel3.add(imagenBici);


        //Panel4
        panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel4.setBackground(new Color(64, 120, 192, 255));
        lblEliminar = new JLabel("ELIMINAR campo (por medio del id): ");
        txtEliminar = new JTextField(5);
        btnEliminar = new JButton("Eliminar");
        lblActualizar = new JLabel("ACTUALIZAR:  " +
                "           ");
        btnActualizar = new JButton("Actualizar");
        lblTipoAct = new JLabel("Tip act: ");
        lblMarcaAct = new JLabel("Marca act: ");
        lblColorAct = new JLabel("Color act: ");
        lblRuedaAct = new JLabel("Rueda act: ");
        lblFotoAct = new JLabel("Foto act: ");
        txtTipoAct = new JTextField(35);
        txtMarcaAct = new JTextField(30);
        txtColorAct = new JTextField(15);
        txtRuedaAct = new JTextField(5);
        txtFotoAct = new JTextField(40);
        lblIdAct = new JLabel("¿En que Id?");
        txtIdAct = new JTextField(5);
        panel4.add(lblEliminar);
        panel4.add(txtEliminar);
        panel4.add(btnEliminar);
        panel4.add(lblActualizar);
        panel4.add(lblTipoAct);
        panel4.add(txtTipoAct);
        panel4.add(lblMarcaAct);
        panel4.add(txtMarcaAct);
        panel4.add(lblColorAct);
        panel4.add(txtColorAct);
        panel4.add(lblRuedaAct);
        panel4.add(txtRuedaAct);
        panel4.add(lblFotoAct);
        panel4.add(txtFotoAct);
        panel4.add(lblIdAct);
        panel4.add(txtIdAct);
        panel4.add(btnActualizar);



        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblColor() {
        return lblColor;
    }

    public void setLblColor(JLabel lblColor) {
        this.lblColor = lblColor;
    }

    public JLabel getLblRueda() {
        return lblRueda;
    }

    public void setLblRueda(JLabel lblRueda) {
        this.lblRueda = lblRueda;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(JTextField txtColor) {
        this.txtColor = txtColor;
    }

    public JTextField getTxtRueda() {
        return txtRueda;
    }

    public void setTxtRueda(JTextField txtRueda) {
        this.txtRueda = txtRueda;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblBicicleta() {
        return tblBicicleta;
    }

    public void setTblBicicleta(JTable tblBicicleta) {
        this.tblBicicleta = tblBicicleta;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getImagenBici() {
        return imagenBici;
    }

    public void setImagenBici(JLabel imagenBici) {
        this.imagenBici = imagenBici;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JTextField getTxtEliminar() {
        return txtEliminar;
    }

    public void setTxtEliminar(JTextField txtEliminar) {
        this.txtEliminar = txtEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }

    public JLabel getLblActualizar() {
        return lblActualizar;
    }

    public void setLblActualizar(JLabel lblActualizar) {
        this.lblActualizar = lblActualizar;
    }

    public JLabel getLblTipoAct() {
        return lblTipoAct;
    }

    public void setLblTipoAct(JLabel lblTipoAct) {
        this.lblTipoAct = lblTipoAct;
    }

    public JLabel getLblMarcaAct() {
        return lblMarcaAct;
    }

    public void setLblMarcaAct(JLabel lblMarcaAct) {
        this.lblMarcaAct = lblMarcaAct;
    }

    public JLabel getLblColorAct() {
        return lblColorAct;
    }

    public void setLblColorAct(JLabel lblColorAct) {
        this.lblColorAct = lblColorAct;
    }

    public JLabel getLblRuedaAct() {
        return lblRuedaAct;
    }

    public void setLblRuedaAct(JLabel lblRuedaAct) {
        this.lblRuedaAct = lblRuedaAct;
    }

    public JLabel getLblFotoAct() {
        return lblFotoAct;
    }

    public void setLblFotoAct(JLabel lblFotoAct) {
        this.lblFotoAct = lblFotoAct;
    }

    public JTextField getTxtTipoAct() {
        return txtTipoAct;
    }

    public void setTxtTipoAct(JTextField txtTipoAct) {
        this.txtTipoAct = txtTipoAct;
    }

    public JTextField getTxtMarcaAct() {
        return txtMarcaAct;
    }

    public void setTxtMarcaAct(JTextField txtMarcaAct) {
        this.txtMarcaAct = txtMarcaAct;
    }

    public JTextField getTxtColorAct() {
        return txtColorAct;
    }

    public void setTxtColorAct(JTextField txtColorAct) {
        this.txtColorAct = txtColorAct;
    }

    public JTextField getTxtRuedaAct() {
        return txtRuedaAct;
    }

    public void setTxtRuedaAct(JTextField txtRuedaAct) {
        this.txtRuedaAct = txtRuedaAct;
    }

    public JTextField getTxtFotoAct() {
        return txtFotoAct;
    }

    public void setTxtFotoAct(JTextField txtFotoAct) {
        this.txtFotoAct = txtFotoAct;
    }

    public JLabel getLblIdAct() {
        return lblIdAct;
    }

    public void setLblIdAct(JLabel lblIdAct) {
        this.lblIdAct = lblIdAct;
    }

    public JTextField getTxtIdAct() {
        return txtIdAct;
    }

    public void setTxtIdAct(JTextField txtIdAct) {
        this.txtIdAct = txtIdAct;
    }

    public void limpiar(){
        txtTipo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtRueda.setText("");
        txtUrl.setText("");
    }
    public void limpiar2(){
        txtTipoAct.setText("");
        txtMarcaAct.setText("");
        txtColorAct.setText("");
        txtRuedaAct.setText("");
        txtFotoAct.setText("");
    }
    public void limpiar3(){
        txtEliminar.setText("");
    }
}

