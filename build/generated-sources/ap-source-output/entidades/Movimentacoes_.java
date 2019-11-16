package entidades;

import entidades.Entradas;
import entidades.Produtos;
import entidades.Saidas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-16T03:42:47")
@StaticMetamodel(Movimentacoes.class)
public class Movimentacoes_ { 

    public static volatile SingularAttribute<Movimentacoes, Produtos> idProduto;
    public static volatile SingularAttribute<Movimentacoes, Integer> idMovimentacao;
    public static volatile SingularAttribute<Movimentacoes, Entradas> idEntrada;
    public static volatile SingularAttribute<Movimentacoes, Saidas> idSaida;

}