import java.io.Serializable;
import java.util.HashMap;


@ApplicationScoped
public class RestManager implements Serializable {


    public static Object getZviratko;
    static HashMap<Integer, HashMap<String, String>> zviratko = new HashMap<>();
    static Integer number = 0;
    static String vek;
    static String nazev;


    public void getInZviratko() {
        if (number != null && zviratko.get(number) != null) {
            Response.ok(zviratko.get(number)).build();
        } else {
            Response.ok("zviratko neexistuje").build();
        }
    }

    public void deleteZviratko() {
        if (number != null) {
            zviratko.remove(number);
        }
    }

    public void noveZviratko() {

        if (nazev != null && vek != null) {
            HashMap<String, String> noveZviratko = new HashMap<>();
            noveZviratko.put("nazev", nazev);
            noveZviratko.put("vek", vek);
            zviratko.put(number, noveZviratko);
            number++;
            Response.ok(zviratko).build();
        } else {
            Response.ok("Vlozte jmeno a vek zviratka").build();
        }
    }

    public void zmenitZviratko(){
        if(zviratko.get(number) != null && number != null && nazev != null && vek != null){
            HashMap<String,String> noveZviratko = new HashMap<>();
            noveZviratko.put("nazev", nazev);
            noveZviratko.put("vek", vek);
            zviratko.put(number, noveZviratko);
        }
        Response.ok(zviratko).build();
    }
}