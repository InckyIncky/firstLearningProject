package lesson8;

public class Pencil {
    private int price;
    private String producerName;

    public Pencil(int price, String producerName) {
        this.price = price;
        this.producerName = producerName;

    }

    @Override
    public int hashCode() {
        if (producerName.equals(null)) {
            return 29 * price;
        } else {
            return 29 * price + producerName.hashCode();
        }
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pencil pencil = (Pencil) obj;

        if (price == pencil.price) {
            if (producerName.equals(pencil.producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Firma " + producerName + " i ego cena" + price;
    }

}
