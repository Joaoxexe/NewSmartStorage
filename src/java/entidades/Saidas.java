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
@Table(name = "tb_saidas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Saidas.findAll", query = "SELECT s FROM Saidas s")
    , @NamedQuery(name = "Saidas.findByIdSaida", query = "SELECT s FROM Saidas s WHERE s.idSaida = :idSaida")
    , @NamedQuery(name = "Saidas.findByDtSaida", query = "SELECT s FROM Saidas s WHERE s.dtSaida = :dtSaida")
    , @NamedQuery(name = "Saidas.findByQtdSaida", query = "SELECT s FROM Saidas s WHERE s.qtdSaida = :qtdSaida")
    , @NamedQuery(name = "Saidas.findByValorUnitario", query = "SELECT s FROM Saidas s WHERE s.valorUnitario = :valorUnitario")})
public class Saidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_saida")
    private Integer idSaida;
    @Column(name = "dt_saida")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;
    @Column(name = "qtd_saida")
    private Integer qtdSaida;
    @Column(name = "valor_unitario")
    private BigInteger valorUnitario;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private Clientes idCliente;
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id_funcionario")
    @ManyToOne
    private Funcionarios idFuncionario;
    @OneToMany(mappedBy = "idSaida")
    private Collection<Movimentacoes> movimentacoesCollection;

    public Saidas() {
    }

    public Saidas(Integer idSaida) {
        this.idSaida = idSaida;
    }

    public Integer getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(Integer idSaida) {
        this.idSaida = idSaida;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Integer getQtdSaida() {
        return qtdSaida;
    }

    public void setQtdSaida(Integer qtdSaida) {
        this.qtdSaida = qtdSaida;
    }

    public BigInteger getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigInteger valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    public Funcionarios getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionarios idFuncionario) {
        this.idFuncionario = idFuncionario;
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
        hash += (idSaida != null ? idSaida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saidas)) {
            return false;
        }
        Saidas other = (Saidas) object;
        if ((this.idSaida == null && other.idSaida != null) || (this.idSaida != null && !this.idSaida.equals(other.idSaida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Saidas[ idSaida=" + idSaida + " ]";
    }
    
}
