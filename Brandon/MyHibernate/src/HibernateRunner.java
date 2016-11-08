/*

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HibernateRunner {
    private List<crewlist> myCrew;
    private HibernateConfig theHibernateUtility;

    public HibernateRunner() {
        theHibernateUtility = new HibernateConfig();}

    public static void main(String[] args){

        HibernateRunner RunnerInstance = new HibernateRunner();
        RunnerInstance.addCrewMember();

    }

    private void addCrewMember() {
        Session session = theHibernateUtility.getCurrentSession();

        Transaction transaction = session.beginTransaction();

        crewlist aCrewList = new crewlist();
        aCrewList.setFullName("David Shepard");
        aCrewList.setPosition("Captain");
        aCrewList.setRank("Commander");

        session.save(aCrewList);
        transaction.commit();

        System.out.println(aCrewList.getIdCrewList());
    }

    private void showCrew() {
        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query allUsersQuery = session.createQuery("select u from crewlist as u order by u.idCrewList");
    }
}
*/