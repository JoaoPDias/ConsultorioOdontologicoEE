/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devmedia.consultorioee.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jpdia
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anaminese.findAll", query = "SELECT a FROM Anaminese a")})
public class Anaminese implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "ans_id", nullable = false)
    private Integer ansId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ans_fuma", nullable = false)
    private boolean ansFuma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ans_praticaexercicio", nullable = false)
    private boolean ansPraticaexercicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ans_doencaHereditaria", nullable = false)
    private boolean ansdoencaHereditaria;
    @Size(max = 255)
    @Column(name = "ans_descricaoDoenca", length = 255)
    private String ansdescricaoDoenca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ans_operacaoRecente", nullable = false)
    private boolean ansoperacaoRecente;
    @Size(max = 255)
    @Column(name = "ans_descricaooperacaoRecente", length = 255)
    private String ansdescricaooperacaoRecente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ans_medicacaoContinua", nullable = false)
    private boolean ansmedicacaoContinua;
    @Size(max = 255)
    @Column(name = "ans_descricaoMedicacaoContinua", length = 255)
    private String ansdescricaoMedicacaoContinua;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ans_alergia", nullable = false)
    private boolean ansAlergia;
    @Size(max = 255)
    @Column(name = "ans_descricaoAlergia", length = 255)
    private String ansdescricaoAlergia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ans_dst", nullable = false)
    private boolean ansDst;
    @Size(max = 255)
    @Column(name = "ans_descricaDst", length = 255)
    private String ansdescricaDst;
    @Lob
    @Size(max = 65535)
    @Column(name = "ans_obs", length = 65535)
    private String ansObs;
    @JoinColumn(name = "ans_customer", referencedColumnName = "cus_id", nullable = false)
    @ManyToOne(optional = false)
    private Customer ansCustomer;
    @JoinColumn(name = "ans_orcamento", referencedColumnName = "orc_id", nullable = false)
    @ManyToOne(optional = false)
    private Orcamento ansOrcamento;

    public Anaminese() {
    }

    public Anaminese(Integer ansId) {
        this.ansId = ansId;
    }

    public Anaminese(Integer ansId, boolean ansFuma, boolean ansPraticaexercicio, boolean ansdoencaHereditaria, boolean ansoperacaoRecente, boolean ansmedicacaoContinua, boolean ansAlergia, boolean ansDst) {
        this.ansId = ansId;
        this.ansFuma = ansFuma;
        this.ansPraticaexercicio = ansPraticaexercicio;
        this.ansdoencaHereditaria = ansdoencaHereditaria;
        this.ansoperacaoRecente = ansoperacaoRecente;
        this.ansmedicacaoContinua = ansmedicacaoContinua;
        this.ansAlergia = ansAlergia;
        this.ansDst = ansDst;
    }

    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public boolean getAnsFuma() {
        return ansFuma;
    }

    public void setAnsFuma(boolean ansFuma) {
        this.ansFuma = ansFuma;
    }

    public boolean getAnsPraticaexercicio() {
        return ansPraticaexercicio;
    }

    public void setAnsPraticaexercicio(boolean ansPraticaexercicio) {
        this.ansPraticaexercicio = ansPraticaexercicio;
    }

    public boolean getAnsdoencaHereditaria() {
        return ansdoencaHereditaria;
    }

    public void setAnsdoencaHereditaria(boolean ansdoencaHereditaria) {
        this.ansdoencaHereditaria = ansdoencaHereditaria;
    }

    public String getAnsdescricaoDoenca() {
        return ansdescricaoDoenca;
    }

    public void setAnsdescricaoDoenca(String ansdescricaoDoenca) {
        this.ansdescricaoDoenca = ansdescricaoDoenca;
    }

    public boolean getAnsoperacaoRecente() {
        return ansoperacaoRecente;
    }

    public void setAnsoperacaoRecente(boolean ansoperacaoRecente) {
        this.ansoperacaoRecente = ansoperacaoRecente;
    }

    public String getAnsdescricaooperacaoRecente() {
        return ansdescricaooperacaoRecente;
    }

    public void setAnsdescricaooperacaoRecente(String ansdescricaooperacaoRecente) {
        this.ansdescricaooperacaoRecente = ansdescricaooperacaoRecente;
    }

    public boolean getAnsmedicacaoContinua() {
        return ansmedicacaoContinua;
    }

    public void setAnsmedicacaoContinua(boolean ansmedicacaoContinua) {
        this.ansmedicacaoContinua = ansmedicacaoContinua;
    }

    public String getAnsdescricaoMedicacaoContinua() {
        return ansdescricaoMedicacaoContinua;
    }

    public void setAnsdescricaoMedicacaoContinua(String ansdescricaoMedicacaoContinua) {
        this.ansdescricaoMedicacaoContinua = ansdescricaoMedicacaoContinua;
    }

    public boolean getAnsAlergia() {
        return ansAlergia;
    }

    public void setAnsAlergia(boolean ansAlergia) {
        this.ansAlergia = ansAlergia;
    }

    public String getAnsdescricaoAlergia() {
        return ansdescricaoAlergia;
    }

    public void setAnsdescricaoAlergia(String ansdescricaoAlergia) {
        this.ansdescricaoAlergia = ansdescricaoAlergia;
    }

    public boolean getAnsDst() {
        return ansDst;
    }

    public void setAnsDst(boolean ansDst) {
        this.ansDst = ansDst;
    }

    public String getAnsdescricaDst() {
        return ansdescricaDst;
    }

    public void setAnsdescricaDst(String ansdescricaDst) {
        this.ansdescricaDst = ansdescricaDst;
    }

    public String getAnsObs() {
        return ansObs;
    }

    public void setAnsObs(String ansObs) {
        this.ansObs = ansObs;
    }

    public Customer getAnsCustomer() {
        return ansCustomer;
    }

    public void setAnsCustomer(Customer ansCustomer) {
        this.ansCustomer = ansCustomer;
    }

    public Orcamento getAnsOrcamento() {
        return ansOrcamento;
    }

    public void setAnsOrcamento(Orcamento ansOrcamento) {
        this.ansOrcamento = ansOrcamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ansId != null ? ansId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anaminese)) {
            return false;
        }
        Anaminese other = (Anaminese) object;
        if ((this.ansId == null && other.ansId != null) || (this.ansId != null && !this.ansId.equals(other.ansId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.devmedia.consultorioee.entities.Anaminese[ ansId=" + ansId + " ]";
    }
    
}
