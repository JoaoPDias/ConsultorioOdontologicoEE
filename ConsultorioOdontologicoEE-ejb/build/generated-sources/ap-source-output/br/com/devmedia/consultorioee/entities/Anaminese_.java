package br.com.devmedia.consultorioee.entities;

import br.com.devmedia.consultorioee.entities.Customer;
import br.com.devmedia.consultorioee.entities.Orcamento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-26T00:48:53")
@StaticMetamodel(Anaminese.class)
public class Anaminese_ { 

    public static volatile SingularAttribute<Anaminese, String> ansdescricaDst;
    public static volatile SingularAttribute<Anaminese, Boolean> ansmedicacaoContinua;
    public static volatile SingularAttribute<Anaminese, Boolean> ansAlergia;
    public static volatile SingularAttribute<Anaminese, Boolean> ansPraticaexercicio;
    public static volatile SingularAttribute<Anaminese, Integer> ansId;
    public static volatile SingularAttribute<Anaminese, String> ansdescricaoDoenca;
    public static volatile SingularAttribute<Anaminese, Boolean> ansFuma;
    public static volatile SingularAttribute<Anaminese, String> ansdescricaoAlergia;
    public static volatile SingularAttribute<Anaminese, String> ansObs;
    public static volatile SingularAttribute<Anaminese, Customer> ansCustomer;
    public static volatile SingularAttribute<Anaminese, String> ansdescricaooperacaoRecente;
    public static volatile SingularAttribute<Anaminese, Boolean> ansDst;
    public static volatile SingularAttribute<Anaminese, String> ansdescricaoMedicacaoContinua;
    public static volatile SingularAttribute<Anaminese, Boolean> ansdoencaHereditaria;
    public static volatile SingularAttribute<Anaminese, Boolean> ansoperacaoRecente;
    public static volatile SingularAttribute<Anaminese, Orcamento> ansOrcamento;

}