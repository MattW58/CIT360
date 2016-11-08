import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TheNastyPaths {
    private static SessionFactory NastySessionFactory;
    public static void main(String[] args){

        //A Configuration
        ///////////////////////////////////////////////////////////////////////////////////////////////
        Configuration config = new Configuration();

        //Neglecting hibernate asset connections
        config.setProperty(null);
        config.setProperty(null);
        //Bad Connection
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/NutellaToast");
        //Wrong Login Information
        config.setProperty("hibernate.connection.username", "NotTheLogin");
        config.setProperty("hibernate.connection.password", "NotThePassword");
        config.setProperty("hibernate.id.new_generator_mappings", "false"); // I don't know what this does, but I need it.

        config.addAnnotatedClass(crewlist.class);

        //Open Session
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        NastySessionFactory = config.buildSessionFactory(serviceRegistry);

        Session userSession;
        Transaction userTransaction;

        userSession = NastySessionFactory.openSession();

        //Begin Transaction
        ///////////////////////////////////////////////////////////////////////////////////////////////
        userTransaction = userSession.beginTransaction();

        crewlist addCrew1 = new crewlist();
        addCrew1.setFullName(57132);   // Passing the wrong data-type to the DB
        addCrew1.setPosition(null);    // Passing NULL to a not-null field in the DB
        addCrew1.setRank();            // Leaving a field blank

        Janitor JanitorSquad = new Janitor(); // Inserting into a table that's not defined in Hibernate
        addCrew2.setFullName("Dave");
        addCrew2.setJob("Floor Mopping");
        addCrew2.setCurrentWork("Bathroom");

        //Save Session
        ///////////////////////////////////////////////////////////////////////////////////////////////
        userSession.save(addCrew1);
        //userSession.save(JanitorSquad);     Neglecting to save a session

        //Commit Transaction
        ///////////////////////////////////////////////////////////////////////////////////////////////
        //userTransaction.commit();           Failing to commit changes to the database
    }
}