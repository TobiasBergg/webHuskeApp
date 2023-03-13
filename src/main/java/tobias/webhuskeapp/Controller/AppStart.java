package tobias.webhuskeapp.Controller;

import tobias.webhuskeapp.Controller.Entitet.Person;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.List;

public class AppStart implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce){

        List<Person> personList = new ArrayList<>();

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        ServletContextListener.super.contextDestroyed(sce);
    }
}
