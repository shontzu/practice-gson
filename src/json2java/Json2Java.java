
package json2java;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class Json2Java {

    public static void main(String[] args) throws FileNotFoundException {
        // initialize the Gson library
        Gson gs = new Gson();

        //initialize file by stating directory
        File f = new File("C:\\Users\\V310 Admin\\Desktop\\Json2Java\\src\\json2java\\newjson.json");
        // read file that is initialized
        FileReader fr = new FileReader(f);

        List<Circle> cr;
        cr = gs.fromJson(fr, new TypeToken<LinkedList<Circle>>() { // token in Java like map in JavaScript?
        }.getType());

        //loop and print
        System.out.println(cr);
        for (Circle c : cr) {
            System.out.println(c.getRad() + " " + c.getAreaSize());
        }

        //todo: all classes constructors here      
  }
  public static class Circle {

      private double rad;
      private double areaSize;

      public Circle(double rad) {
          this.rad = rad;
      }

      public double getRad() {
          return rad;
      }

      public void setRad(double rad) {
          this.rad = rad;
      }

      public double getAreaSize() {
          double asize = 3.14 * rad * rad;
          return asize;
      }

  }
}
