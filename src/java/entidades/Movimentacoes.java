/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author João Victor
 */
@Entity
@Table(name = "tb_movimentacoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimentacoes.findAll", query = "SELECT m FROM Movimentacoes m")
    , @NamedQuery(name = "Movimentacoes.findByIdMovimentacao", query = "SELECT m FROM Movimentacoes m WHERE m.idMovimentacao = :idMovimentacao")})
public class Movimentacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_movimentacao")
    private Integer idMovimentacao;
    @JoinColumn(name = "id_entrada", referencedColumnName = "id_entrada")
    @ManyToOne
    private Entradas idEntrada;
    @JoinColumn(name = "id_produto", referencedColumnName = "id_produto")
    @ManyToOne
    private Produtos idProduto;
    @JoinColumn(name = "id_saida", referencedColumnName = "id_saida")
    @ManyToOne
    private Saidas idSaida;

    public Movimentacoes() {
    }

    public Movimentacoes(Integer idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public Integer getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(Integer idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public Entradas getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Entradas idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Produtos getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produtos idProduto) {
        this.idProduto = idProduto;
    }

    public Saidas getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(Saidas idSaida) {
        this.idSaida = idSaida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimentacao != null ? idMovimentacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentacoes)) {
            return false;
        }
        Movimentacoes other = (Movimentacoes) object;
        if ((this.idMovimentacao == null && other.idMovimentacao != null) || (this.idMovimentacao != null && !this.idMovimentacao.equals(other.idMovimentacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Movimentacoes[ idMovimentacao=" + idMovimentacao + " ]";
    }
    
}
