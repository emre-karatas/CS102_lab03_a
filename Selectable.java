/**
 * Interface Selectable
 * @author Emre Karatas-22001641
 * @version v1.0 -30.06.2021
 */
public interface Selectable
{
    boolean getSelected();
    boolean contains(double x, double y);
    void setSelected(boolean selection);
}
