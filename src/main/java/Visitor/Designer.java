package Visitor;

public class Designer implements Cargo {

    private int id;
    private String nome;
    private CargoNivel cargoNivel;

    public Designer(int id, String nome, CargoNivel cargoNivel) {
        this.id = id;
        this.nome = nome;
        this.cargoNivel = cargoNivel;
    }

    public int getId() { return id; }

    public String getNome() { return nome; }

    public String getNomeCargoNivel() { return this.cargoNivel.getNome(); }

    public String aceitar(Visitor visitor) {
        return visitor.exibirDesigner(this);
    }
}
