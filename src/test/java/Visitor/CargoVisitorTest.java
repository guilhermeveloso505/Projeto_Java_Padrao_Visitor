package Visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CargoVisitorTest {

    @Test
    void deveExibirAnalista() {
        Analista analista = new Analista(1, "Ana", new CargoNivel("Júnior"));

        CargoVisitor visitor = new CargoVisitor();
        assertEquals("Analista{id=1, nome='Ana', CargoNivel=Júnior}", visitor.exibir(analista));
    }

    @Test
    void deveExibirDesenvolvedor() {
        Desenvolvedor desenvolvedor = new Desenvolvedor(2, "Pedro", new CargoNivel("Pleno"));

        CargoVisitor visitor = new CargoVisitor();
        assertEquals("Desenvolvedor{id=2, nome='Pedro', CargoNivel=Pleno}", visitor.exibir(desenvolvedor));
    }

    @Test
    void deveExibirDesigner() {
        Designer designer = new Designer(3, "Paula", new CargoNivel("Sênior"));

        CargoVisitor visitor = new CargoVisitor();
        assertEquals("Designer{id=3, nome='Paula', CargoNivel=Sênior}", visitor.exibir(designer));
    }

}