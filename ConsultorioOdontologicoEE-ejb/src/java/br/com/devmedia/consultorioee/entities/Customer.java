/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devmedia.consultorioee.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jpdia
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "cus_id", nullable = false)
    private Integer cusId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "cus_name", nullable = false, length = 225)
    private String cusName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cus_age", nullable = false)
    private int cusAge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cus_adress", nullable = false, length = 255)
    private String cusAdress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "cus_state", nullable = false, length = 2)
    private String cusState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cus_city", nullable = false, length = 255)
    private String cusCity;
    @Lob
    @Size(max = 65535)
    @Column(name = "cus_complement", length = 65535)
    private String cusComplement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cus_mother", nullable = false, length = 255)
    private String cusMother;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cus_father", nullable = false, length = 255)
    private String cusFather;
    @Lob
    @Size(max = 65535)
    @Column(name = "cus_obs", length = 65535)
    private String cusObs;
    @Size(max = 255)
    @Column(name = "cus_ocupation", length = 255)
    private String cusOcupation;
    @Size(max = 45)
    @Column(name = "cus_workNumber", length = 45)
    private String cusworkNumber;
    @Size(max = 15)
    @Column(name = "cus_celNumber", length = 15)
    private String cuscelNumber;
    @Size(max = 45)
    @Column(name = "cus_workName", length = 45)
    private String cusworkName;
    @Size(max = 255)
    @Column(name = "cus_workAdress", length = 255)
    private String cusworkAdress;
    @Lob
    @Size(max = 65535)
    @Column(name = "cus_workObs", length = 65535)
    private String cusworkObs;
    @Size(max = 255)
    @Column(name = "cus_telephone", length = 255)
    private String cusTelephone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cus_birthday", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date cusBirthday;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orcCustomer")
    private List<Orcamento> orcamentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ansCustomer")
    private List<Anaminese> anamineseList;

    public Customer() {
    }

    public Customer(Integer cusId) {
        this.cusId = cusId;
    }

    public Customer(Integer cusId, String cusName, int cusAge, String cusAdress, String cusState, String cusCity, String cusMother, String cusFather, Date cusBirthday) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusAge = cusAge;
        this.cusAdress = cusAdress;
        this.cusState = cusState;
        this.cusCity = cusCity;
        this.cusMother = cusMother;
        this.cusFather = cusFather;
        this.cusBirthday = cusBirthday;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getCusAge() {
        return cusAge;
    }

    public void setCusAge(int cusAge) {
        this.cusAge = cusAge;
    }

    public String getCusAdress() {
        return cusAdress;
    }

    public void setCusAdress(String cusAdress) {
        this.cusAdress = cusAdress;
    }

    public String getCusState() {
        return cusState;
    }

    public void setCusState(String cusState) {
        this.cusState = cusState;
    }

    public String getCusCity() {
        return cusCity;
    }

    public void setCusCity(String cusCity) {
        this.cusCity = cusCity;
    }

    public String getCusComplement() {
        return cusComplement;
    }

    public void setCusComplement(String cusComplement) {
        this.cusComplement = cusComplement;
    }

    public String getCusMother() {
        return cusMother;
    }

    public void setCusMother(String cusMother) {
        this.cusMother = cusMother;
    }

    public String getCusFather() {
        return cusFather;
    }

    public void setCusFather(String cusFather) {
        this.cusFather = cusFather;
    }

    public String getCusObs() {
        return cusObs;
    }

    public void setCusObs(String cusObs) {
        this.cusObs = cusObs;
    }

    public String getCusOcupation() {
        return cusOcupation;
    }

    public void setCusOcupation(String cusOcupation) {
        this.cusOcupation = cusOcupation;
    }

    public String getCusworkNumber() {
        return cusworkNumber;
    }

    public void setCusworkNumber(String cusworkNumber) {
        this.cusworkNumber = cusworkNumber;
    }

    public String getCuscelNumber() {
        return cuscelNumber;
    }

    public void setCuscelNumber(String cuscelNumber) {
        this.cuscelNumber = cuscelNumber;
    }

    public String getCusworkName() {
        return cusworkName;
    }

    public void setCusworkName(String cusworkName) {
        this.cusworkName = cusworkName;
    }

    public String getCusworkAdress() {
        return cusworkAdress;
    }

    public void setCusworkAdress(String cusworkAdress) {
        this.cusworkAdress = cusworkAdress;
    }

    public String getCusworkObs() {
        return cusworkObs;
    }

    public void setCusworkObs(String cusworkObs) {
        this.cusworkObs = cusworkObs;
    }

    public String getCusTelephone() {
        return cusTelephone;
    }

    public void setCusTelephone(String cusTelephone) {
        this.cusTelephone = cusTelephone;
    }

    public Date getCusBirthday() {
        return cusBirthday;
    }

    public void setCusBirthday(Date cusBirthday) {
        this.cusBirthday = cusBirthday;
    }

    @XmlTransient
    public List<Orcamento> getOrcamentoList() {
        return orcamentoList;
    }

    public void setOrcamentoList(List<Orcamento> orcamentoList) {
        this.orcamentoList = orcamentoList;
    }

    @XmlTransient
    public List<Anaminese> getAnamineseList() {
        return anamineseList;
    }

    public void setAnamineseList(List<Anaminese> anamineseList) {
        this.anamineseList = anamineseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cusId != null ? cusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.cusId == null && other.cusId != null) || (this.cusId != null && !this.cusId.equals(other.cusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.devmedia.consultorioee.entities.Customer[ cusId=" + cusId + " ]";
    }
    
}
