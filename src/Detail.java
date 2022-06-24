import java.util.List;

public class Detail {
    public List<Ligne> ligne;

    @Override
    public String toString() {
        String result = "Num | Nb | Designation\n";
        for (Ligne l: ligne) {
            result += l.toString() + "\n";
        }
        return result;
    }
}
