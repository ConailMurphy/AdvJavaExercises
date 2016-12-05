/**
 * Created by cm63 on 28/11/16.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PredictRainfall {
    private Scanner input;

    /**
     * tries to read rainfall levels from a source file,
     * otherwise throws file not found exception
     * @param dataSource
     * @throws FileNotFoundException
     */
    public PredictRainfall(String dataSource) throws FileNotFoundException {
        try {
            this.input = new Scanner(new File(dataSource));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    /**
     * uses three rainfall readings to predict future rainfall levels
     * @param reading1
     * @param reading2
     * @param reading3
     */
    public void predictRainfall(float reading1,float reading2,float reading3) {
    }
}

