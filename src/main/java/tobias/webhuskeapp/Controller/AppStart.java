package tobias.webhuskeapp.Controller;

import tobias.webhuskeapp.Controller.Entitet.Person;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.*;

public class AppStart implements ServletContextListener {

    private static Map<String, Person> personMap;

    @Override
    public void contextInitialized(ServletContextEvent sce){

        List<Person> personList = new ArrayList<>();

        Person person = new Person("Sander","1","Mors nummer");
        Person person1 = new Person("Bastian","12","Cykelhjelm");
        Person person2 = new Person("Tobias","123","En gris");
        Person person3 = new Person("Nik","1234","Mad");

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personMap = new TreeMap<>();

        for (Person element : personList) {
            personMap.put(element.getNavn(), element);
        }

        sce.getServletContext().setAttribute("personer", personMap);

    }

    public static Map<String, Person> getPersonMap(){
        return personMap;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        ServletContextListener.super.contextDestroyed(sce);
    }
}
