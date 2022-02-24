import java.util.ArrayList;
import java.util.Collections;

public class fruit implements Comparable<Object>{
    private int id;
    private String name;
    private Object taste;

    fruit(int id, String name, String taste){
        this.id=id;
        this.name=name;
        this.taste=taste;
    }
    @Override
    public int compareTo(Object o) {
        fruit f = (fruit) o;
        return this.id - f.id ;
    }

    public static void main(String[] args) {


        ArrayList<fruit> fruitList = new ArrayList<fruit>();
        fruit apple = new fruit(1, "Apple", "Sweet");
        fruit orange = new fruit(2, "Orange", "Sour");
        fruit banana = new fruit(4, "Banana", "Sweet");
        fruit grape = new fruit(3, "Grape", "Sweet and Sour");

        fruitList.add(apple);
        fruitList.add(orange);
        fruitList.add(banana);
        fruitList.add(grape);
        Collections.sort(fruitList);
        fruitList.forEach(fruit -> {
            System.out.println(fruit.getId() + " " + fruit.getName() + " " +
                    fruit.getTaste());
        });
//        System.out.println(fruitList);
    }

    private Object getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getTaste() {
        return taste;
    }

    public void setTaste(Object taste) {
        this.taste = taste;
    }
}