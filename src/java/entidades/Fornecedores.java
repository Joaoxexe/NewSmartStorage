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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_fornecedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedores.findAll", query = "SELECT f FROM Fornecedores f")
    , @NamedQuery(name = "Fornecedores.findByIdFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.idFornecedor = :idFornecedor")
    , @NamedQuery(name = "Fornecedores.findByNmFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.nmFornecedor = :nmFornecedor")
    , @NamedQuery(name = "Fornecedores.findByNmFantasiaFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.nmFantasiaFornecedor = :nmFantasiaFornecedor")
    , @NamedQuery(name = "Fornecedores.findByTelefoneFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.telefoneFornecedor = :telefoneFornecedor")
    , @NamedQuery(name = "Fornecedores.findByCnpjFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.cnpjFornecedor = :cnpjFornecedor")
    , @NamedQuery(name = "Fornecedores.findByEmailFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.emailFornecedor = :emailFornecedor")
    , @NamedQuery(name = "Fornecedores.findByNumeroEnderecoFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.numeroEnderecoFornecedor = :numeroEnderecoFornecedor")
    , @NamedQuery(name = "Fornecedores.findByFgAtivoFornecedore", query = "SELECT f FROM Fornecedores f WHERE f.fgAtivoFornecedore = :fgAtivoFornecedore")})
public class Fornecedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fornecedor")
    private Integer idFornecedor;
    @Size(max = 250)
    @Column(name = "nm_fornecedor")
    private String nmFornecedor;
    @Size(max = 250)
    @Column(name = "nm_fantasia_fornecedor")
    private String nmFantasiaFornecedor;
    @Size(max = 250)
    @Column(name = "telefone_fornecedor")
    private String telefoneFornecedor;
    @Size(max = 250)
    @Column(name = "cnpj_fornecedor")
    private String cnpjFornecedor;
    @Size(max = 250)
    @Column(name = "email_fornecedor")
    private String emailFornecedor;
    @Column(name = "numero_endereco_fornecedor")
    private Integer numeroEnderecoFornecedor;
    @Column(name = "fg_ativo_fornecedore")
    private Boolean fgAtivoFornecedore;
    @OneToMany(mappedBy = "idFornecedor")
    private Collection<Entradas> entradasCollection;
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    @ManyToOne
    private Enderecos idEndereco;

    public Fornecedores() {
    }

    public Fornecedores(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNmFornecedor() {
        return nmFornecedor;
    }

    public void setNmFornecedor(String nmFornecedor) {
        this.nmFornecedor = nmFornecedor;
    }

    public String getNmFantasiaFornecedor() {
        return nmFantasiaFornecedor;
    }

    public void setNmFantasiaFornecedor(String nmFantasiaFornecedor) {
        this.nmFantasiaFornecedor = nmFantasiaFornecedor;
    }

    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public Integer getNumeroEnderecoFornecedor() {
        return numeroEnderecoFornecedor;
    }

    public void setNumeroEnderecoFornecedor(Integer numeroEnderecoFornecedor) {
        this.numeroEnderecoFornecedor = numeroEnderecoFornecedor;
    }

    public Boolean getFgAtivoFornecedore() {
        return fgAtivoFornecedore;
    }

    public void setFgAtivoFornecedore(Boolean fgAtivoFornecedore) {
        this.fgAtivoFornecedore = fgAtivoFornecedore;
    }

    @XmlTransient
    public Collection<Entradas> getEntradasCollection() {
        return entradasCollection;
    }

    public void setEntradasCollection(Collection<Entradas> entradasCollection) {
        this.entradasCollection = entradasCollection;
    }

    public Enderecos getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Enderecos idEndereco) {
        this.idEndereco = idEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFornecedor != null ? idFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedores)) {
            return false;
        }
        Fornecedores other = (Fornecedores) object;
        if ((this.idFornecedor == null && other.idFornecedor != null) || (this.idFornecedor != null && !this.idFornecedor.equals(other.idFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Fornecedores[ idFornecedor=" + idFornecedor + " ]";
    }
    
}
