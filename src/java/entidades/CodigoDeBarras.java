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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author João Victor
 */
@Entity
@Table(name = "tb_codigo_de_barras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CodigoDeBarras.findAll", query = "SELECT c FROM CodigoDeBarras c")
    , @NamedQuery(name = "CodigoDeBarras.findByIdBarras", query = "SELECT c FROM CodigoDeBarras c WHERE c.idBarras = :idBarras")
    , @NamedQuery(name = "CodigoDeBarras.findByCodigo", query = "SELECT c FROM CodigoDeBarras c WHERE c.codigo = :codigo")})
public class CodigoDeBarras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_barras")
    private Integer idBarras;
    @Column(name = "codigo")
    private Integer codigo;
    @OneToMany(mappedBy = "idBarras")
    private Collection<Produtos> produtosCollection;

    public CodigoDeBarras() {
    }

    public CodigoDeBarras(Integer idBarras) {
        this.idBarras = idBarras;
    }

    public Integer getIdBarras() {
        return idBarras;
    }

    public void setIdBarras(Integer idBarras) {
        this.idBarras = idBarras;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    public Collection<Produtos> getProdutosCollection() {
        return produtosCollection;
    }

    public void setProdutosCollection(Collection<Produtos> produtosCollection) {
        this.produtosCollection = produtosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBarras != null ? idBarras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodigoDeBarras)) {
            return false;
        }
        CodigoDeBarras other = (CodigoDeBarras) object;
        if ((this.idBarras == null && other.idBarras != null) || (this.idBarras != null && !this.idBarras.equals(other.idBarras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CodigoDeBarras[ idBarras=" + idBarras + " ]";
    }
    
}
