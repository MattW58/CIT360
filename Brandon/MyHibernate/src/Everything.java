import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Everything {
    private static SessionFactory TheOneAndOnlySessionFactory;
    public static void main(String[] args){

        //A Configuration
        ///////////////////////////////////////////////////////////////////////////////////////////////
        Configuration config = new Configuration();

        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/crewroster");
        config.setProperty("hibernate.connection.username", "root");
        config.setProperty("hibernate.connection.password", "password");
        config.setProperty("hibernate.id.new_generator_mappings", "false");

        config.addAnnotatedClass(crewlist.class);

        //Open Session
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        TheOneAndOnlySessionFactory = config.buildSessionFactory(serviceRegistry);

        Session userSession;
        Transaction userTransaction;

        userSession = TheOneAndOnlySessionFactory.openSession();

        //Begin Transaction
        ///////////////////////////////////////////////////////////////////////////////////////////////
        userTransaction = userSession.beginTransaction();

        crewlist addCrew1 = new crewlist();
        addCrew1.setFullName("David Shepard");
        addCrew1.setPosition("Captain");
        addCrew1.setRank("Captain");

        crewlist addCrew2 = new crewlist();
        addCrew2.setFullName("Grunt");
        addCrew2.setPosition("Security");
        addCrew2.setRank("Lieutenant");

        crewlist addCrew3 = new crewlist();
        addCrew3.setFullName("Miranda");
        addCrew3.setPosition("Operations");
        addCrew3.setRank("Lieutenant");

        //Save Session
        ///////////////////////////////////////////////////////////////////////////////////////////////
        userSession.save(addCrew1);
        userSession.save(addCrew2);
        userSession.save(addCrew3);

        //Commit Transaction
        ///////////////////////////////////////////////////////////////////////////////////////////////
        userTransaction.commit();
    }
}