package entidades;

import entidades.Enderecos;
import entidades.Entradas;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-09T11:23:18")
@StaticMetamodel(Fornecedores.class)
public class Fornecedores_ { 

    public static volatile SingularAttribute<Fornecedores, String> nmFornecedor;
    public static volatile SingularAttribute<Fornecedores, Boolean> fgAtivoFornecedore;
    public static volatile SingularAttribute<Fornecedores, Integer> idFornecedor;
    public static volatile SingularAttribute<Fornecedores, Integer> numeroEnderecoFornecedor;
    public static volatile SingularAttribute<Fornecedores, String> nmFantasiaFornecedor;
    public static volatile SingularAttribute<Fornecedores, String> cnpjFornecedor;
    public static volatile SingularAttribute<Fornecedores, Enderecos> idEndereco;
    public static volatile SingularAttribute<Fornecedores, String> telefoneFornecedor;
    public static volatile SingularAttribute<Fornecedores, String> emailFornecedor;
    public static volatile CollectionAttribute<Fornecedores, Entradas> entradasCollection;

}