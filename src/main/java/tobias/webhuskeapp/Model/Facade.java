package tobias.webhuskeapp.Model;

import tobias.webhuskeapp.Controller.AppStart;
import tobias.webhuskeapp.Controller.Entitet.Person;

import java.util.Map;

public class Facade {
    public static Map<String, Person> getAllPerson() {
        return PersonMapper.getAllPerson();
    }

    public static Person getPerson(String navn) {
       return PersonMapper.getPerson(navn);
    }
}
