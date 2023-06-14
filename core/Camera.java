package core;

import java.util.Objects;
import java.util.Random;

public class Camera {

    private static final int light_cars_max_weight = 3500;
    private static final int big_cars_max_weight = 10000;

    Random random = new Random();

    public String getCars_number(){
        return String.format("%04d", random.nextInt(10000));
    }

    private int getCars_weight(){
        return random.nextInt(13500);
    }

    private String getCars_type(){
        short choice = (short) random.nextInt(-100, 100);

        String cars_type;
        if(choice >= 0)
            cars_type = "light";
        else
            cars_type = "big";

        return cars_type;
    }

    public boolean isCars_weight(){
        boolean is_cars_weight;

        if (getCars_weight() <= light_cars_max_weight && Objects.equals(getCars_type(), "light")){
            is_cars_weight = true;
        } else is_cars_weight = getCars_weight() <= big_cars_max_weight && Objects.equals(getCars_type(), "big");

        return is_cars_weight;
    }
}
