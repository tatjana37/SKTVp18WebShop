package entity;

import entity.Account;
import entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-23T01:08:45")
@StaticMetamodel(History.class)
public class History_ { 

    public static volatile SingularAttribute<History, Date> ReturnDate;
    public static volatile SingularAttribute<History, Product> product;
    public static volatile SingularAttribute<History, Long> id;
    public static volatile SingularAttribute<History, Date> takeOn;
    public static volatile SingularAttribute<History, Account> account;

}