/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeback.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@Entity
@SequenceGenerator(name = "CON_SEQ", sequenceName = "CON_SEQ", allocationSize = 1, initialValue = 1)
public class ContaCliente implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CON_SEQ")
    private Long id_customer;
    private String nm_customer;
    private Long cpf_cnpj;
    private boolean is_active;
    private double vl_total;

    public Long getId_customer() {
        return id_customer;
    }

    public String getNm_customer() {
        return nm_customer;
    }

    public void setNm_customer(String nm_customer) {
        this.nm_customer = nm_customer;
    }



    public void setNm_Customer(String name) {
        this.nm_customer = name;
    }

    public Long getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(Long cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public double getVl_total() {
        return vl_total;
    }

    public void setVl_total(double vl_total) {
        this.vl_total = vl_total;
    }

    @Override
    public String toString() {
        return "ContaCliente{" + "id_customer=" + id_customer + ", nm_customer=" + nm_customer + ", cpf_cnpj=" + cpf_cnpj + ", is_active=" + is_active + ", vl_total=" + vl_total + '}';
    }
    
    




    public ContaCliente(){};

    public ContaCliente(Long id_customer, String name, Long cpf_cnpj, boolean is_active, double vl_total) {
        this.id_customer = id_customer;
        this.nm_customer = name;
        this.cpf_cnpj = cpf_cnpj;
        this.is_active = is_active;
        this.vl_total = vl_total;
    }








   


}
