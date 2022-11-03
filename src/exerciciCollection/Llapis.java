package exerciciCollection;

import java.util.Objects;

public class Llapis implements Comparable<Llapis>{
    int color;
    float gruix;

    public Llapis(int color) {
        if(color >= 0 && color <=7) this.color = color;
        else System.out.println("Error, color no existent");
    }
    public Llapis(int color, float gruix) {
        if(color >= 0 && color <=7) this.color = color;
        //else System.out.println("Error, color no existent"); this.color = 0;

        if(gruix >= 0.1f && gruix <=3f) this.gruix = gruix;
        //else System.out.println("Error, gruix no existent"); this.gruix = 0.1f;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        this.gruix = gruix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Llapis llapis = (Llapis) o;
        return color == llapis.color && Float.compare(llapis.gruix, gruix) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, gruix);
    }

    @Override
    public String toString() {
        return "Llapis{" +
                "color=" + color +
                ", gruix=" + gruix +
                '}';
    }

    @Override
    public int compareTo(Llapis o) {
        if(this.color > o.color) return 1;
        else if(this.color < o.color) return -1;
        else return 0;
    }
}