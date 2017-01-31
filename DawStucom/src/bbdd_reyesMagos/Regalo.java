/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_reyesMagos;

/**
 *
 * @author albertomendezhernandez
 */
public class Regalo {
    private int codigo;
    private String nombre;
    private String beneficiario;

    public Regalo(int codigo, String nombre, String beneficiario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.beneficiario = beneficiario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
}
