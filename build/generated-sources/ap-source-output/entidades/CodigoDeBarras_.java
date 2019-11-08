package entidades;

import entidades.Produtos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-07T12:47:48")
@StaticMetamodel(CodigoDeBarras.class)
public class CodigoDeBarras_ { 

    public static volatile SingularAttribute<CodigoDeBarras, Integer> codigo;
    public static volatile SingularAttribute<CodigoDeBarras, Integer> idBarras;
    public static volatile CollectionAttribute<CodigoDeBarras, Produtos> produtosCollection;

}