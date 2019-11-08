/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author João Victor
 */
@Entity
@Table(name = "tb_enderecos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enderecos.findAll", query = "SELECT e FROM Enderecos e")
    , @NamedQuery(name = "Enderecos.findByIdEndereco", query = "SELECT e FROM Enderecos e WHERE e.idEndereco = :idEndereco")
    , @NamedQuery(name = "Enderecos.findByCepEndereco", query = "SELECT e FROM Enderecos e WHERE e.cepEndereco = :cepEndereco")
    , @NamedQuery(name = "Enderecos.findByBairroEndereco", query = "SELECT e FROM Enderecos e WHERE e.bairroEndereco = :bairroEndereco")
    , @NamedQuery(name = "Enderecos.findByLogradouroEndereco", query = "SELECT e FROM Enderecos e WHERE e.logradouroEndereco = :logradouroEndereco")
    , @NamedQuery(name = "Enderecos.findByPaisEndereco", query = "SELECT e FROM Enderecos e WHERE e.paisEndereco = :paisEndereco")
    , @NamedQuery(name = "Enderecos.findByCidadeEndereco", query = "SELECT e FROM Enderecos e WHERE e.cidadeEndereco = :cidadeEndereco")
    , @NamedQuery(name = "Enderecos.findByTipoLogradouroEndereco", query = "SELECT e FROM Enderecos e WHERE e.tipoLogradouroEndereco = :tipoLogradouroEndereco")
    , @NamedQuery(name = "Enderecos.findByUfEndereco", query = "SELECT e FROM Enderecos e WHERE e.ufEndereco = :ufEndereco")})
public class Enderecos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_endereco")
    private Integer idEndereco;
    @Size(max = 250)
    @Column(name = "cep_endereco")
    private String cepEndereco;
    @Size(max = 250)
    @Column(name = "bairro_endereco")
    private String bairroEndereco;
    @Size(max = 250)
    @Column(name = "logradouro_endereco")
    private String logradouroEndereco;
    @Size(max = 250)
    @Column(name = "pais_endereco")
    private String paisEndereco;
    @Size(max = 250)
    @Column(name = "cidade_endereco")
    private String cidadeEndereco;
    @Size(max = 250)
    @Column(name = "tipo_logradouro_endereco")
    private String tipoLogradouroEndereco;
    @Size(max = 3)
    @Column(name = "uf_endereco")
    private String ufEndereco;
    @OneToMany(mappedBy = "idEndereco")
    private Collection<Clientes> clientesCollection;
    @OneToMany(mappedBy = "idEndereco")
    private Collection<Fornecedores> fornecedoresCollection;
    @OneToMany(mappedBy = "idEndereco")
    private Collection<Funcionarios> funcionariosCollection;

    public Enderecos() {
    }

    public Enderecos(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        this.logradouroEndereco = logradouroEndereco;
    }

    public String getPaisEndereco() {
        return paisEndereco;
    }

    public void setPaisEndereco(String paisEndereco) {
        this.paisEndereco = paisEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getTipoLogradouroEndereco() {
        return tipoLogradouroEndereco;
    }

    public void setTipoLogradouroEndereco(String tipoLogradouroEndereco) {
        this.tipoLogradouroEndereco = tipoLogradouroEndereco;
    }

    public String getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(String ufEndereco) {
        this.ufEndereco = ufEndereco;
    }

    @XmlTransient
    public Collection<Clientes> getClientesCollection() {
        return clientesCollection;
    }

    public void setClientesCollection(Collection<Clientes> clientesCollection) {
        this.clientesCollection = clientesCollection;
    }

    @XmlTransient
    public Collection<Fornecedores> getFornecedoresCollection() {
        return fornecedoresCollection;
    }

    public void setFornecedoresCollection(Collection<Fornecedores> fornecedoresCollection) {
        this.fornecedoresCollection = fornecedoresCollection;
    }

    @XmlTransient
    public Collection<Funcionarios> getFuncionariosCollection() {
        return funcionariosCollection;
    }

    public void setFuncionariosCollection(Collection<Funcionarios> funcionariosCollection) {
        this.funcionariosCollection = funcionariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEndereco != null ? idEndereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enderecos)) {
            return false;
        }
        Enderecos other = (Enderecos) object;
        if ((this.idEndereco == null && other.idEndereco != null) || (this.idEndereco != null && !this.idEndereco.equals(other.idEndereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Enderecos[ idEndereco=" + idEndereco + " ]";
    }
    
}
