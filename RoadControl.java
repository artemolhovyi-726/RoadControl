import core.*;

import java.util.Objects;

public class RoadControl {
    public static void main(String[] args) {
        Camera car = new Camera();
        boolean is_active = true;

        while (is_active) {
            if (car.isCars_weight()) {
                System.out.println("Access granted welcome:  " + car.getCars_number());
            } else
                System.out.println("Access denied: " + car.getCars_number());

            if (Objects.equals(car.getCars_number(), car.getCars_number())){
                is_active = false;
            }
        }
    }
}
