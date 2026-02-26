package Abstract_Factory_Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteProiect {

    @Test
    public void testLemn_create() {
        assertEquals("Topor_piatra.echipament() - Failed", "Topor de ", Topor_piatra.echipament());
    }

}
