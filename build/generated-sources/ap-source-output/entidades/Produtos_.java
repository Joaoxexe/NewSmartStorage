package entidades;

import entidades.CodigoDeBarras;
import entidades.Movimentacoes;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T13:12:04")
@StaticMetamodel(Produtos.class)
public class Produtos_ { 

    public static volatile SingularAttribute<Produtos, Integer> idProduto;
    public static volatile SingularAttribute<Produtos, String> nmProduto;
    public static volatile CollectionAttribute<Produtos, Movimentacoes> movimentacoesCollection;
    public static volatile SingularAttribute<Produtos, CodigoDeBarras> idBarras;
    public static volatile SingularAttribute<Produtos, Boolean> fgAtivoProdutos;

}