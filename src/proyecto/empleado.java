/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Date;

/**
 *
 * @author gocargo
 */
public class empleado {
    private Date fechaDeIngreso;
    private String cargo;
    private String tipoDeContrato;
    private String EPS;
    private String ARL;
    private String pension;
    private int cesantias;

    public empleado(Date fechaDeIngreso, String cargo, String tipoDeContrato, String EPS, String ARL, String pension, int cesantias) {
        this.fechaDeIngreso = fechaDeIngreso;
        this.cargo = cargo;
        this.tipoDeContrato = tipoDeContrato;
        this.EPS = EPS;
        this.ARL = ARL;
        this.pension = pension;
        this.cesantias = cesantias;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getARL() {
        return ARL;
    }

    public void setARL(String ARL) {
        this.ARL = ARL;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public int getCesantias() {
        return cesantias;
    }

    public void setCesantias(int cesantias) {
        this.cesantias = cesantias;
    }
    
    
    
}
