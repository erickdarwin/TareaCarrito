package pe.edu.upeu.registro;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.util.Size;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import pe.edu.upeu.registro.bean.Person;
import pe.edu.upeu.registro.bean.Producto;
import pe.edu.upeu.registro.dao.PersonDAD;
import pe.edu.upeu.registro.dao.ProductoDAO;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("pe.edu.upeu.registro", appContext.getPackageName());

        PersonDAD dao = new PersonDAD(appContext);
        Person person = new Person();
        person.setName("Omar");
        person.setLastNameF("Perez");
        person.setLastNameM("Perez2");
        dao.savePerson(person);

        List<Person> list = dao.findPersonAll();

        Log.i("list:::",list.size()+"");

        dao.close();



//        ProductoDAO dao =new ProductoDAO(appContext);
//        Producto producto=new Producto();
//        producto.setCodProducto(1);
//        producto.setDesProducto("galleta");
//        producto.setCantidad(5);
//        producto.setPrecioReal(5.00);
//        producto.setTotal(5.00);
//        dao.saveproducto(producto);
//        List<Producto> List =dao.findProductoAll();
//
//        Log.i("list:::",List.size()+"");
//        dao.close();
    }
}
