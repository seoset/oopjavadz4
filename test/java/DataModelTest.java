import model.DataModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DataModelTest {

    @Test
    public void testCalculateOne() {
        int[][] output = new int[][]{{1}};
        DataModel model = new DataModel();
        model.setFirst(new int[]{1});
        model.setSecond(new int[]{1});
        assertArrayEquals(output, model.calculate());
    }

    @Test
    public void testCalculateFirstMulti() {
        int[][] output = new int[][]{{4}, {8}, {12}};
        DataModel model = new DataModel();
        model.setFirst(new int[]{1,2,3});
        model.setSecond(new int[]{4});
        assertArrayEquals(output, model.calculate());
    }

    @Test
    public void testCalculateSecondMulti() {
        int[][] output = new int[][]{{4,8,12}};
        DataModel model = new DataModel();
        model.setFirst(new int[]{4});
        model.setSecond(new int[]{1,2,3});
        assertArrayEquals(output, model.calculate());
    }

    @Test
    public void testCalculateAllMulti() {
        int[][] output = new int[][]{{1,2,3}, {2,4,6}, {3,6,9}};
        DataModel model = new DataModel();
        model.setFirst(new int[]{1,2,3});
        model.setSecond(new int[]{1,2,3});
        assertArrayEquals(output, model.calculate());
    }

}
