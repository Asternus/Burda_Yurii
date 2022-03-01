package burda.hw15.task2;

import com.burda.hw15.task2.Box;
import com.burda.hw15.task2.Main;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class MainTest {

    Box box = new Box(10);
    Box box1 = new Box(18);

    @Test(expected = IllegalArgumentException.class)
    public void buildNull1Compare() {
        Main.buildCompare().compare(box, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void buildNull2Compare() {
        Main.buildCompare().compare(null, box);
    }

    @Test(expected = IllegalArgumentException.class)
    public void doubleNull1Compare() {
        Main.buildCompare().compare(null, null);
    }

    @Test
    public void buildCompare() {
        int actual = Main.buildCompare().compare(box, box1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void buildTreeSet() {
        List<Box> lstBox = new ArrayList<>();
        lstBox.add(new Box(0));
        lstBox.add(new Box(88));
        lstBox.add(new Box(77));
        lstBox.add(new Box(15));
        lstBox.add(new Box(11));
        TreeSet<Box> expected = Main.buildTreeSet(lstBox);
        TreeSet<Box> actual = Main.buildTreeSet(Main.addBox());
        assertEquals(expected, actual);
    }
}