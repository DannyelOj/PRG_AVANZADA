/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author SALAI
 */
public class CDirecciones {
    String calle1;
    String calle2;

    public CDirecciones(String calle1, String calle2) {
        this.calle1 = calle1;
        this.calle2 = calle2;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    @Override
    public String toString() {
        return "Direcciones{" + "calle1=" + calle1 + ", calle2=" + calle2 + '}';
    }
}
