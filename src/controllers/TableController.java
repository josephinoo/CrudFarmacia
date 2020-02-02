/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Medicina;
import sun.security.pkcs11.Secmod;
import utils.ConnectionUtil;

import javax.swing.text.TabableView;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TableController implements Initializable {
    @FXML
    private TableView<Medicina> table;
    @FXML
    private TableColumn<Medicina,String> col_idMedicina;
    @FXML
    private TableColumn<Medicina,String> col_NombreComercial;
    @FXML
    private TableColumn<Medicina,String> col_NombreGenerico;
    @FXML
    private TableColumn<Medicina,String> col_Laboratorio;
    @FXML
    private TableColumn<Medicina,String> col_Valor;
    @FXML
    private TableColumn<Medicina,String> col_Descripcion;

    ObservableList<Medicina> oblist = FXCollections.observableArrayList();
    Connection con= ConnectionUtil.conDB();



    ResultSet rs;

    {
        try {
            rs = con.createStatement().executeQuery("SELECT * FROM Javimarc.Medicina;");
            while(rs.next()){

                oblist.add(new Medicina(rs.getString("idMedicina"),rs.getString("NombreComercial"),rs.getString("NombreGenerico"),rs.getString("Laboratorio"),rs.getString("Valor"),rs.getString("Descripcion")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public TableController() throws SQLException {
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        col_idMedicina.setCellValueFactory(new PropertyValueFactory<>("idMedicina"));
        col_NombreComercial.setCellValueFactory(new PropertyValueFactory<>("NombreComercial"));
        col_NombreGenerico.setCellValueFactory(new PropertyValueFactory<>("NombreGenerico"));
        col_Laboratorio.setCellValueFactory(new PropertyValueFactory<>("Laboratorio"));
        col_Valor.setCellValueFactory(new PropertyValueFactory<>("Valor"));
        col_Descripcion.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));
        table.setItems(oblist);



    }

    public void adaptar(){
        col_idMedicina.setCellValueFactory(new PropertyValueFactory<>("idMedicina"));
        col_NombreComercial.setCellValueFactory(new PropertyValueFactory<>("NombreComercial"));
        col_NombreGenerico.setCellValueFactory(new PropertyValueFactory<>("NombreGenerico"));
        col_Laboratorio.setCellValueFactory(new PropertyValueFactory<>("Laboratorio"));
        col_Valor.setCellValueFactory(new PropertyValueFactory<>("Valor"));
        col_Descripcion.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));
        table.setItems(oblist);

    }
}





