package entidades;

import entidades.Enderecos;
import entidades.Saidas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-16T03:42:47")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> nmCliente;
    public static volatile SingularAttribute<Clientes, Character> sexoCliente;
    public static volatile SingularAttribute<Clientes, String> cpfCliente;
    public static volatile SingularAttribute<Clientes, String> telefoneCliente;
    public static volatile SingularAttribute<Clientes, Integer> idCliente;
    public static volatile SingularAttribute<Clientes, Enderecos> idEndereco;
    public static volatile SingularAttribute<Clientes, Integer> numeroEnderecoCliente;
    public static volatile SingularAttribute<Clientes, Date> dtNascimentoCliente;
    public static volatile CollectionAttribute<Clientes, Saidas> saidasCollection;
    public static volatile SingularAttribute<Clientes, Boolean> fgAtivoCliente;

}