package pe.ist.crm.entity;

import java.util.Date;

public class Compras { 
    private String concepto;
    private String numero;
    private String empresa;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private Date fechaPago;
    private String estado;

    public Compras() {
    }

    public Compras(String concepto, String numero, String empresa, Date fechaEmision, Date fechaVencimiento, Date fechaPago, String estado) {
        this.concepto = concepto;
        this.numero = numero;
        this.empresa = empresa;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaPago = fechaPago;
        this.estado = estado;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

       
    
}
