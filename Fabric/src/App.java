import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.FireGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.HayGenerator;
import Fabric.ItemGenerator;
import Fabric.MetalGenerator;
import Fabric.SilverGenerator;
import Fabric.WaterGenerator;
import Fabric.WoodGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        
        // полиморфизм:
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();

        ItemGenerator f2 = new SilverGenerator();
        f2.openReward();

        ItemGenerator f3 = new GemGenerator();
        f3.openReward();

        // generate random items:
        List<ItemGenerator> generator = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            generator.add(new GemGenerator());
        }

        for(int i = 0; i < 5; i++){
            generator.add(new GoldGenerator());
        }

        for(int i = 0; i < 7; i++){
            generator.add(new SilverGenerator());
        }

        for(int i = 0; i < 10; i++){
            generator.add(new HayGenerator());
        }

        for(int i = 0; i < 10; i++){
            generator.add(new WoodGenerator());
        }

        for(int i = 0; i < 8; i++){
            generator.add(new MetalGenerator());
        }

        for(int i = 0; i < 20; i++){
            generator.add(new WaterGenerator());
        }

        for(int i = 0; i < 20; i++){
            generator.add(new FireGenerator());
        }


        // generator.add(f1);
        // generator.add(f2);
        // generator.add(f3);

        Random ran = new Random();
        for(int i = 0; i < 10; i++){
            int  index = ran.nextInt(82);
            generator.get(index).openReward();
        }
    }
}
