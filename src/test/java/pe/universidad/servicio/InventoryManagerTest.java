package pe.universidad.servicio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {
/*
    @Test
    void testAgregarItemNuevo() {
        InventoryManager manager = new InventoryManager();
        manager.addItem("Laptop", 5);
        assertEquals(5, manager.getStock("Laptop"));
    }
 */

      @Test
    void testCantidadNegativa() {

        InventoryManager manager = new InventoryManager();
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> manager.addItem("Mouse", -1));
        assertEquals("La cantidad no puede ser negativa o cero", ex.getMessage());
    }
    
   
    /* 
    @Test
    void testNombreVacio() {
        InventoryManager manager = new InventoryManager();
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> manager.addItem("", 5));
        assertEquals("El nombre del producto no puede estar vacío", ex.getMessage());
    }
    /* 

    /* 
    @Test
    void testNombreSoloEspacios() {
        InventoryManager manager = new InventoryManager();
        assertThrows(IllegalArgumentException.class,
                () -> manager.addItem("   ", 5));
    }
    */ 

     /* 
    @Test
    void testSumarCantidadProductoExistente() {
        InventoryManager manager = new InventoryManager();
        manager.addItem("Laptop", 5);
        manager.addItem("Laptop", 3);
        assertEquals(8, manager.getStock("Laptop"));
    }
*/
    /*
    @Test
    void testCantidadMayorAlMaximo() {
        InventoryManager manager = new InventoryManager();
        assertThrows(IllegalArgumentException.class,
                () -> manager.addItem("TV", 1500));
    }

    */
}

