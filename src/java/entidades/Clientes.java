/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author João Victor
 */
@Entity
@Table(name = "tb_clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findByIdCliente", query = "SELECT c FROM Clientes c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Clientes.findByNmCliente", query = "SELECT c FROM Clientes c WHERE c.nmCliente = :nmCliente")
    , @NamedQuery(name = "Clientes.findByCpfCliente", query = "SELECT c FROM Clientes c WHERE c.cpfCliente = :cpfCliente")
    , @NamedQuery(name = "Clientes.findByTelefoneCliente", query = "SELECT c FROM Clientes c WHERE c.telefoneCliente = :telefoneCliente")
    , @NamedQuery(name = "Clientes.findByNumeroEnderecoCliente", query = "SELECT c FROM Clientes c WHERE c.numeroEnderecoCliente = :numeroEnderecoCliente")
    , @NamedQuery(name = "Clientes.findBySexoCliente", query = "SELECT c FROM Clientes c WHERE c.sexoCliente = :sexoCliente")
    , @NamedQuery(name = "Clientes.findByDtNascimentoCliente", query = "SELECT c FROM Clientes c WHERE c.dtNascimentoCliente = :dtNascimentoCliente")
    , @NamedQuery(name = "Clientes.findByFgAtivoCliente", query = "SELECT c FROM Clientes c WHERE c.fgAtivoCliente = :fgAtivoCliente")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Size(max = 250)
    @Column(name = "nm_cliente")
    private String nmCliente;
    @Size(max = 250)
    @Column(name = "cpf_cliente")
    private String cpfCliente;
    @Size(max = 250)
    @Column(name = "telefone_cliente")
    private String telefoneCliente;
    @Column(name = "numero_endereco_cliente")
    private Integer numeroEnderecoCliente;
    @Column(name = "sexo_cliente")
    private Character sexoCliente;
    @Column(name = "dt_nascimento_cliente")
    @Temporal(TemporalType.DATE)
    private Date dtNascimentoCliente;
    @Column(name = "fg_ativo_cliente")
    private Boolean fgAtivoCliente;
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    @ManyToOne
    private Enderecos idEndereco;
    @OneToMany(mappedBy = "idCliente")
    private Collection<Saidas> saidasCollection;

    public Clientes() {
    }

    public Clientes(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public Integer getNumeroEnderecoCliente() {
        return numeroEnderecoCliente;
    }

    public void setNumeroEnderecoCliente(Integer numeroEnderecoCliente) {
        this.numeroEnderecoCliente = numeroEnderecoCliente;
    }

    public Character getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(Character sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public Date getDtNascimentoCliente() {
        return dtNascimentoCliente;
    }

    public void setDtNascimentoCliente(Date dtNascimentoCliente) {
        this.dtNascimentoCliente = dtNascimentoCliente;
    }

    public Boolean getFgAtivoCliente() {
        return fgAtivoCliente;
    }

    public void setFgAtivoCliente(Boolean fgAtivoCliente) {
        this.fgAtivoCliente = fgAtivoCliente;
    }

    public Enderecos getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Enderecos idEndereco) {
        this.idEndereco = idEndereco;
    }

    @XmlTransient
    public Collection<Saidas> getSaidasCollection() {
        return saidasCollection;
    }

    public void setSaidasCollection(Collection<Saidas> saidasCollection) {
        this.saidasCollection = saidasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Clientes[ idCliente=" + idCliente + " ]";
    }
    
}
