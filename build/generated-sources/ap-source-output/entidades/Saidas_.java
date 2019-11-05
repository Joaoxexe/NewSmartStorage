package entidades;

import entidades.Clientes;
import entidades.Funcionarios;
import entidades.Movimentacoes;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-05T14:06:53")
@StaticMetamodel(Saidas.class)
public class Saidas_ { 

    public static volatile SingularAttribute<Saidas, Clientes> idCliente;
    public static volatile SingularAttribute<Saidas, Date> dtSaida;
    public static volatile CollectionAttribute<Saidas, Movimentacoes> movimentacoesCollection;
    public static volatile SingularAttribute<Saidas, Integer> qtdSaida;
    public static volatile SingularAttribute<Saidas, Funcionarios> idFuncionario;
    public static volatile SingularAttribute<Saidas, Integer> idSaida;
    public static volatile SingularAttribute<Saidas, BigInteger> valorUnitario;

}