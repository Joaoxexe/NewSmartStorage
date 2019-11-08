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
@Table(name = "tb_funcionarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionarios.findAll", query = "SELECT f FROM Funcionarios f")
    , @NamedQuery(name = "Funcionarios.findByIdFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.idFuncionario = :idFuncionario")
    , @NamedQuery(name = "Funcionarios.findByNmFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.nmFuncionario = :nmFuncionario")
    , @NamedQuery(name = "Funcionarios.findByCpfFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.cpfFuncionario = :cpfFuncionario")
    , @NamedQuery(name = "Funcionarios.findByDtNascimentoFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.dtNascimentoFuncionario = :dtNascimentoFuncionario")
    , @NamedQuery(name = "Funcionarios.findByLoginFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.loginFuncionario = :loginFuncionario")
    , @NamedQuery(name = "Funcionarios.findBySenhaFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.senhaFuncionario = :senhaFuncionario")
    , @NamedQuery(name = "Funcionarios.findByTelefoneFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.telefoneFuncionario = :telefoneFuncionario")
    , @NamedQuery(name = "Funcionarios.findByEmailFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.emailFuncionario = :emailFuncionario")
    , @NamedQuery(name = "Funcionarios.findByNumeroEnderecoFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.numeroEnderecoFuncionario = :numeroEnderecoFuncionario")
    , @NamedQuery(name = "Funcionarios.findBySexoFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.sexoFuncionario = :sexoFuncionario")
    , @NamedQuery(name = "Funcionarios.findByFgAtivoFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.fgAtivoFuncionario = :fgAtivoFuncionario")})
public class Funcionarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_funcionario")
    private Integer idFuncionario;
    @Size(max = 250)
    @Column(name = "nm_funcionario")
    private String nmFuncionario;
    @Size(max = 250)
    @Column(name = "cpf_funcionario")
    private String cpfFuncionario;
    @Column(name = "dt_nascimento_funcionario")
    @Temporal(TemporalType.DATE)
    private Date dtNascimentoFuncionario;
    @Size(max = 250)
    @Column(name = "login_funcionario")
    private String loginFuncionario;
    @Size(max = 250)
    @Column(name = "senha_funcionario")
    private String senhaFuncionario;
    @Size(max = 250)
    @Column(name = "telefone_funcionario")
    private String telefoneFuncionario;
    @Size(max = 250)
    @Column(name = "email_funcionario")
    private String emailFuncionario;
    @Column(name = "numero_endereco_funcionario")
    private Integer numeroEnderecoFuncionario;
    @Column(name = "sexo_funcionario")
    private Character sexoFuncionario;
    @Column(name = "fg_ativo_funcionario")
    private Boolean fgAtivoFuncionario;
    @OneToMany(mappedBy = "idFuncionario")
    private Collection<Saidas> saidasCollection;
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    @ManyToOne
    private Enderecos idEndereco;

    public Funcionarios() {
    }

    public Funcionarios(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNmFuncionario() {
        return nmFuncionario;
    }

    public void setNmFuncionario(String nmFuncionario) {
        this.nmFuncionario = nmFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public Date getDtNascimentoFuncionario() {
        return dtNascimentoFuncionario;
    }

    public void setDtNascimentoFuncionario(Date dtNascimentoFuncionario) {
        this.dtNascimentoFuncionario = dtNascimentoFuncionario;
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public Integer getNumeroEnderecoFuncionario() {
        return numeroEnderecoFuncionario;
    }

    public void setNumeroEnderecoFuncionario(Integer numeroEnderecoFuncionario) {
        this.numeroEnderecoFuncionario = numeroEnderecoFuncionario;
    }

    public Character getSexoFuncionario() {
        return sexoFuncionario;
    }

    public void setSexoFuncionario(Character sexoFuncionario) {
        this.sexoFuncionario = sexoFuncionario;
    }

    public Boolean getFgAtivoFuncionario() {
        return fgAtivoFuncionario;
    }

    public void setFgAtivoFuncionario(Boolean fgAtivoFuncionario) {
        this.fgAtivoFuncionario = fgAtivoFuncionario;
    }

    @XmlTransient
    public Collection<Saidas> getSaidasCollection() {
        return saidasCollection;
    }

    public void setSaidasCollection(Collection<Saidas> saidasCollection) {
        this.saidasCollection = saidasCollection;
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
        hash += (idFuncionario != null ? idFuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionarios)) {
            return false;
        }
        Funcionarios other = (Funcionarios) object;
        if ((this.idFuncionario == null && other.idFuncionario != null) || (this.idFuncionario != null && !this.idFuncionario.equals(other.idFuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Funcionarios[ idFuncionario=" + idFuncionario + " ]";
    }
    
}
