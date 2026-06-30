package Collection.set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
public class Sets {
    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("A");
        return hashSet;
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        return linkedHashSet;

    }

  public Set<Contacto> construirTreeSetConComparador() {
    Set<Contacto> tCSet = new TreeSet<>((c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));
    tCSet.add(new Contacto("Juan", "Perez", "123456789"));
    tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
    tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
    tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
    tCSet.add(new Contacto("Juan", "Perez", "123456789")); // duplicado
    return tCSet;
    }

  public Set<Contacto> contruirHashSet() {
    Set<Contacto> hSet = new HashSet<>();
    Contacto c1 = new Contacto("Juan", "Perez", "1234567890");
    Contacto c2 = new Contacto("Juan", "Lopez", "");
    hSet.add(c1);
    hSet.add(c2);
    return hSet;
    }
}