package entidades;

import entidades.Enderecos;
import entidades.Saidas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T20:53:24")
@StaticMetamodel(Funcionarios.class)
public class Funcionarios_ { 

    public static volatile SingularAttribute<Funcionarios, Integer> numeroEnderecoFuncionario;
    public static volatile SingularAttribute<Funcionarios, String> emailFuncionario;
    public static volatile SingularAttribute<Funcionarios, String> nmFuncionario;
    public static volatile SingularAttribute<Funcionarios, Enderecos> idEndereco;
    public static volatile SingularAttribute<Funcionarios, String> cpfFuncionario;
    public static volatile SingularAttribute<Funcionarios, Integer> idFuncionario;
    public static volatile SingularAttribute<Funcionarios, String> telefoneFuncionario;
    public static volatile SingularAttribute<Funcionarios, Date> dtNascimentoFuncionario;
    public static volatile SingularAttribute<Funcionarios, Boolean> fgAtivoFuncionario;
    public static volatile SingularAttribute<Funcionarios, String> loginFuncionario;
    public static volatile CollectionAttribute<Funcionarios, Saidas> saidasCollection;
    public static volatile SingularAttribute<Funcionarios, String> senhaFuncionario;
    public static volatile SingularAttribute<Funcionarios, Character> sexoFuncionario;

}