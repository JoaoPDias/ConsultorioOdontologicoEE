package br.com.devmedia.consultorioee.entities;

import br.com.devmedia.consultorioee.entities.Orcamento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-26T00:48:53")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, Boolean> usuAdministrator;
    public static volatile SingularAttribute<Users, String> usuLogin;
    public static volatile SingularAttribute<Users, Integer> usuId;
    public static volatile ListAttribute<Users, Orcamento> orcamentoList;
    public static volatile SingularAttribute<Users, String> usuPassword;
    public static volatile SingularAttribute<Users, Boolean> usuDentista;
    public static volatile SingularAttribute<Users, String> usuName;

}