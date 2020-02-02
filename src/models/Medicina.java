/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Medicina {

    String idMedicina,NombreComercial,NombreGenerico,Laboratorio,Valor,Descripcion;

    public Medicina(String idMedicina, String nombreComercia, String nombreGenerico, String laboratorio, String valor, String descripcion) {
        this.idMedicina = idMedicina;
        NombreComercial = nombreComercia;
        NombreGenerico = nombreGenerico;
        Laboratorio = laboratorio;
        Valor = valor;
        Descripcion = descripcion;
    }

    public String getIdMedicina() {
        return idMedicina;
    }

    public void setIdMedicina(String idMedicina) {
        this.idMedicina = idMedicina;
    }

    public String getNombreComercial() {
        return NombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        NombreComercial = nombreComercial;
    }

    public String getNombreGenerico() {
        return NombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        NombreGenerico = nombreGenerico;
    }

    public String getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        Laboratorio = laboratorio;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
