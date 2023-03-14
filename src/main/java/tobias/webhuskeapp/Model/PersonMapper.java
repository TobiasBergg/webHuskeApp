package tobias.webhuskeapp.Model;

import tobias.webhuskeapp.Controller.AppStart;
import tobias.webhuskeapp.Controller.Entitet.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PersonMapper {

    private static Map<String, Person> personMap = AppStart.getPersonMap();

    protected static Map<String, Person> getAllPerson(){
        return personMap;
    }

    public static Person copyPerson(Person person){
        if (person == null){
            return null;
        }
        List<String> stringList = new LinkedList<>(person.getStringArrayList());
        return new Person(person.getNavn(), person.getKode(), stringList);
    }

    public static Person getPerson(String navn) {
        return copyPerson(personMap.getOrDefault(navn, null));
    }
}
