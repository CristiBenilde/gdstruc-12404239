import java.util.Objects;

public class Cards
{
    private String names;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return Objects.equals(names, cards.names);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(names);
    }

    @Override
    public String toString()
    {
        return "CardStack{" +
                "names='" + names + '\'' +
                '}';
    }

    public Cards(String names) {
        this.names = names;
    }

    public String getNames()
    {
        return names;
    }

    public void setNames(String names)
    {
        this.names = names;
    }


}
