package br.com.devmedia.consultorioee.entities;

import br.com.devmedia.consultorioee.entities.Anaminese;
import br.com.devmedia.consultorioee.entities.Orcamento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-26T00:48:53")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> cusMother;
    public static volatile SingularAttribute<Customer, String> cusState;
    public static volatile SingularAttribute<Customer, String> cusworkAdress;
    public static volatile SingularAttribute<Customer, String> cusComplement;
    public static volatile ListAttribute<Customer, Orcamento> orcamentoList;
    public static volatile SingularAttribute<Customer, String> cusName;
    public static volatile SingularAttribute<Customer, String> cusCity;
    public static volatile SingularAttribute<Customer, Date> cusBirthday;
    public static volatile SingularAttribute<Customer, String> cusObs;
    public static volatile SingularAttribute<Customer, Integer> cusAge;
    public static volatile SingularAttribute<Customer, String> cusOcupation;
    public static volatile SingularAttribute<Customer, String> cusworkName;
    public static volatile SingularAttribute<Customer, String> cusFather;
    public static volatile SingularAttribute<Customer, String> cuscelNumber;
    public static volatile SingularAttribute<Customer, String> cusworkObs;
    public static volatile SingularAttribute<Customer, String> cusTelephone;
    public static volatile SingularAttribute<Customer, Integer> cusId;
    public static volatile ListAttribute<Customer, Anaminese> anamineseList;
    public static volatile SingularAttribute<Customer, String> cusAdress;
    public static volatile SingularAttribute<Customer, String> cusworkNumber;

}