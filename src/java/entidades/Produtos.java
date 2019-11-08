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
@Table(name = "tb_produtos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p")
    , @NamedQuery(name = "Produtos.findByIdProduto", query = "SELECT p FROM Produtos p WHERE p.idProduto = :idProduto")
    , @NamedQuery(name = "Produtos.findByNmProduto", query = "SELECT p FROM Produtos p WHERE p.nmProduto = :nmProduto")
    , @NamedQuery(name = "Produtos.findByFgAtivoProdutos", query = "SELECT p FROM Produtos p WHERE p.fgAtivoProdutos = :fgAtivoProdutos")})
public class Produtos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produto")
    private Integer idProduto;
    @Size(max = 250)
    @Column(name = "nm_produto")
    private String nmProduto;
    @Column(name = "fg_ativo_produtos")
    private Boolean fgAtivoProdutos;
    @JoinColumn(name = "id_barras", referencedColumnName = "id_barras")
    @ManyToOne
    private CodigoDeBarras idBarras;
    @OneToMany(mappedBy = "idProduto")
    private Collection<Movimentacoes> movimentacoesCollection;

    public Produtos() {
    }

    public Produtos(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public Boolean getFgAtivoProdutos() {
        return fgAtivoProdutos;
    }

    public void setFgAtivoProdutos(Boolean fgAtivoProdutos) {
        this.fgAtivoProdutos = fgAtivoProdutos;
    }

    public CodigoDeBarras getIdBarras() {
        return idBarras;
    }

    public void setIdBarras(CodigoDeBarras idBarras) {
        this.idBarras = idBarras;
    }

    @XmlTransient
    public Collection<Movimentacoes> getMovimentacoesCollection() {
        return movimentacoesCollection;
    }

    public void setMovimentacoesCollection(Collection<Movimentacoes> movimentacoesCollection) {
        this.movimentacoesCollection = movimentacoesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Produtos[ idProduto=" + idProduto + " ]";
    }
    
}
