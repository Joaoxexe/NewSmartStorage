package entidades;

import entidades.Fornecedores;
import entidades.Movimentacoes;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T13:12:04")
@StaticMetamodel(Entradas.class)
public class Entradas_ { 

    public static volatile SingularAttribute<Entradas, Fornecedores> idFornecedor;
    public static volatile CollectionAttribute<Entradas, Movimentacoes> movimentacoesCollection;
    public static volatile SingularAttribute<Entradas, Date> dtEntrada;
    public static volatile SingularAttribute<Entradas, Integer> qtdEntrada;
    public static volatile SingularAttribute<Entradas, Integer> idEntrada;
    public static volatile SingularAttribute<Entradas, BigInteger> valorUnitario;

}