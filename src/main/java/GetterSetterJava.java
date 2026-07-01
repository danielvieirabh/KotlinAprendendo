public class GetterSetterJava {

    private int id;
    private int saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo > 10000) {
            return;
        }
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Danzin");
        System.out.println(animal.getNome());
    }
}
