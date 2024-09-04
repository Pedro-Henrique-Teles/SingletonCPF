import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CPFGeneratorTest {

    @Test
    public void testGenerateCPF() {
        CPFGenerator cpfGenerator = CPFGenerator.getInstance();
        String cpf = cpfGenerator.generateCPF();
        assertNotNull(cpf, "O CPF não deve ser nulo.");
        assertEquals(11, cpf.length(), "O CPF deve ter 11 dígitos.");
    }

    @Test
    public void testSingletonInstance() {
        CPFGenerator instance1 = CPFGenerator.getInstance();
        CPFGenerator instance2 = CPFGenerator.getInstance();
        assertSame(instance1, instance2, "Ambas as instâncias devem ser as mesmas (Singleton).");
    }
}
