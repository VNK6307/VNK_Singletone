import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (int elem : source) {
            if (elem < treshold) {
                logger.log("Элемент \"" + elem + "\" не проходит");
            } else {
                result.add(elem);
                logger.log("Элемент \"" + elem + "\" проходит");
            }
        }
        return result;
    }
}// class