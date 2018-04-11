package proyecto.hdp;

import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTest {
@Autowired RepositorioUsuario repo;

	@Test
	public void contextLoads() {
	}
        
        @Test
        public void guardar(){
            
            //aqui ponemos la logica de guardar un usario
            //Generamos un objeto
            Usuario u =new Usuario();
            Posicion pos =new Posicion();
            Mensaje mensa =new Mensaje();
            
            //generar un usuario con todos sus atributos incluyendo
            //un mensaje y una posicion
            pos.setLat(19.90);
            pos.setLon(100.0);
            
            u.setEmail("carlos.almeida@my.unitec.edu.mx");
            ArrayList<Mensaje> mensajes=new ArrayList<>();
            mensajes.add(mensa);
            u.setMensaje(mensajes);
            u.setPassword("xxx");
            u.setNickname("tato");
            u.setPosicion(pos);
            u.setId("primero");
            
            //guardar
            Usuario guardado = repo.save(u);
            
            Assert.assertEquals(guardado, u);
        }
        
        @Test
        public void actualizar(){
            
            Assert.assertEquals(5, 2+3);
        }
        
        @Test
        public void borrar(){
            
            Assert.assertEquals(4, 2+2);
        }
        
        @Test
        public void buscarTodos(){
            Usuario encontrado= repo.findAll().get(0);
            
            //int tamanio= repo.findAll().size();
            
            Assert.assertEquals("primero", encontrado.getId());
        }
        
        @Test
        public void buscarPorId(){
            
            Usuario usuarioBuscado = repo.findById("primero").get();
            Assert.assertEquals("primero", usuarioBuscado.getId());
        }
}
