/**
 * Generate exponentially distributed values   
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Mar. 28, 2021
 */

import java.util.Random;

public class ExpoDistribution{
    public static double next(double lambda, Random rand) {
        double nextValue = rand.nextDouble();
        // can't take the log of zero... so let's make certain we don't
        while(nextValue == 1.0)
            nextValue = rand.nextDouble();
        return Math.log(1.0 - nextValue)/(-lambda);
    }

}
