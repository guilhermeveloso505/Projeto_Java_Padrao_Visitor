package Visitor;

public class CargoVisitor implements Visitor {

    public String exibir(Cargo cargo) { return cargo.aceitar(this); }

    @Override
    public String exibirAnalista(Analista analista) {
        return "Analista{" +
                "id=" + analista.getId() +
                ", nome='" + analista.getNome() + '\'' +
                ", CargoNivel=" + analista.getNomeCargoNivel() +
                '}';
    }

    @Override
    public String exibirDesenvolvedor(Desenvolvedor desenvolvedor) {
        return "Desenvolvedor{" +
                "id=" + desenvolvedor.getId() +
                ", nome='" + desenvolvedor.getNome() + '\'' +
                ", CargoNivel=" + desenvolvedor.getNomeCargoNivel() +
                '}';
    }

    @Override
    public String exibirDesigner(Designer designer) {
        return "Designer{" +
                "id=" + designer.getId() +
                ", nome='" + designer.getNome() + '\'' +
                ", CargoNivel=" + designer.getNomeCargoNivel() +
                '}';
    }

}
