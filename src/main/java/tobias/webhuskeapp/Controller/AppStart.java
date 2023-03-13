package tobias.webhuskeapp.Controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppStart implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce){

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        ServletContextListener.super.contextDestroyed(sce);
    }
}
