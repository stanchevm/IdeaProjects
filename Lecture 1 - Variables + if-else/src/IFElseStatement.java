import com.sun.org.apache.xpath.internal.operations.And;
import java.awt.*;

public class IFElseStatement {
    public static void main(String[] args) {
        String make = "Ford";
        String model = "Model T";
        if (make.equals("Ford")){
            System.out.println("We have a Ford");
            if (model.equals("Model T")){
                System.out.println("And it's a model T");
            }else{
                System.out.println("Let's hope it's a Mustang");
            }
        }else {
            System.out.println("This is not a Ford");
        }
        if (make.equals("Ford") && model.equals("Model T")){
            System.out.println("Yes");
        }

    }
}