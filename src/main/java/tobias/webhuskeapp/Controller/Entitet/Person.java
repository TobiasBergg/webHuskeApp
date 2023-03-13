package tobias.webhuskeapp.Controller.Entitet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static jdk.internal.org.jline.utils.Colors.s;

public class Person {

    List<String> stringArrayList;
    String navn;
    String kode;


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
}
