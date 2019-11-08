package entidades;

import entidades.Clientes;
import entidades.Fornecedores;
import entidades.Funcionarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T13:12:04")
@StaticMetamodel(Enderecos.class)
public class Enderecos_ { 

    public static volatile SingularAttribute<Enderecos, String> paisEndereco;
    public static volatile CollectionAttribute<Enderecos, Fornecedores> fornecedoresCollection;
    public static volatile SingularAttribute<Enderecos, String> cepEndereco;
    public static volatile SingularAttribute<Enderecos, Integer> idEndereco;
    public static volatile SingularAttribute<Enderecos, String> ufEndereco;
    public static volatile SingularAttribute<Enderecos, String> bairroEndereco;
    public static volatile SingularAttribute<Enderecos, String> logradouroEndereco;
    public static volatile CollectionAttribute<Enderecos, Clientes> clientesCollection;
    public static volatile SingularAttribute<Enderecos, String> cidadeEndereco;
    public static volatile SingularAttribute<Enderecos, String> tipoLogradouroEndereco;
    public static volatile CollectionAttribute<Enderecos, Funcionarios> funcionariosCollection;

}