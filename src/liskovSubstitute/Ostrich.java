package liskovSubstitute;

/**
 * Created by DostM on 7/16/2020.
 */
public class Ostrich extends Bird {
    @Override
    public String fly() {
        return "Ostrich is bird but can not fly";
    }
}
