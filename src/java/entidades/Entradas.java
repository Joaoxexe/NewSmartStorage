/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author João Victor
 */
@Entity
@Table(name = "tb_entradas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entradas.findAll", query = "SELECT e FROM Entradas e")
    , @NamedQuery(name = "Entradas.findByIdEntrada", query = "SELECT e FROM Entradas e WHERE e.idEntrada = :idEntrada")
    , @NamedQuery(name = "Entradas.findByDtEntrada", query = "SELECT e FROM Entradas e WHERE e.dtEntrada = :dtEntrada")
    , @NamedQuery(name = "Entradas.findByQtdEntrada", query = "SELECT e FROM Entradas e WHERE e.qtdEntrada = :qtdEntrada")
    , @NamedQuery(name = "Entradas.findByValorUnitario", query = "SELECT e FROM Entradas e WHERE e.valorUnitario = :valorUnitario")})
public class Entradas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entrada")
    private Integer idEntrada;
    @Column(name = "dt_entrada")
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;
    @Column(name = "qtd_entrada")
    private Integer qtdEntrada;
    @Column(name = "valor_unitario")
    private BigInteger valorUnitario;
    @JoinColumn(name = "id_fornecedor", referencedColumnName = "id_fornecedor")
    @ManyToOne
    private Fornecedores idFornecedor;
    @OneToMany(mappedBy = "idEntrada")
    private Collection<Movimentacoes> movimentacoesCollection;

    public Entradas() {
    }

    public Entradas(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public Integer getQtdEntrada() {
        return qtdEntrada;
    }

    public void setQtdEntrada(Integer qtdEntrada) {
        this.qtdEntrada = qtdEntrada;
    }

    public BigInteger getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigInteger valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Fornecedores getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Fornecedores idFornecedor) {
        this.idFornecedor = idFornecedor;
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
        hash += (idEntrada != null ? idEntrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entradas)) {
            return false;
        }
        Entradas other = (Entradas) object;
        if ((this.idEntrada == null && other.idEntrada != null) || (this.idEntrada != null && !this.idEntrada.equals(other.idEntrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Entradas[ idEntrada=" + idEntrada + " ]";
    }
    
}
