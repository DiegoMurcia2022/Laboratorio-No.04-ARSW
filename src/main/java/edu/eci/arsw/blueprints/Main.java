package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("blueprintsContext.xml");
        BlueprintsServices blueprintsServices = applicationContext.getBean(BlueprintsServices.class);
        Set<Blueprint> allBlueprints = blueprintsServices.getAllBlueprints();

        blueprintsServices.getBlueprint("DiegoMurcia2022", "blueprin1");

        System.out.println("BREAK");
    }
}
