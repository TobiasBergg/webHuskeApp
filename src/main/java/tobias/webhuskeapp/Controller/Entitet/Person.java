package tobias.webhuskeapp.Controller.Entitet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    String navn;
    String kode;
    List<String> stringArrayList;

    public Person(String navn, String kode, List<String> stringArrayList) {
        this.navn = navn;
        this.kode = kode;
        this.stringArrayList = new ArrayList<>(stringArrayList);
    }

    public Person(String navn, String kode, String s) {
        this.navn = navn;
        this.kode = kode;
        String [] strings = s.split(",");
        this.stringArrayList = new ArrayList<>(Arrays.asList(strings));
    }


    public String getNavn() {
        return navn;
    }

    public String getKode() {
        return kode;
    }

    public List<String> getStringArrayList() {
        return stringArrayList;
    }
}
