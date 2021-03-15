package co.unicauca.restaurant.server.access;

import co.unicauca.restaurant.commons.domain.User;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UserRepositoryImplArrays implements IUserRepository{
    
    private static List<User> users;
    /**
     * agrega objetos del tipo User al arreglo users
     */
    public void inicializar(){
        users.add(new User("luis97", "123", "Luis", "Arango", "987", "Empedrado", "00001", "larango@gmail.com"));
        users.add(new User("manu23", "456", "Manuel", "Diaz", "654", "Cajibio", "00002", "2manu3@gmail.com"));
        users.add(new User("Danifer", "789", "Daniela", "Fernandez", "321", "Palace", "00003", "danif@gmail.com"));
        users.add(new User("German00", "0000",  "German", "Arango", "987", "Empedrado", "00001", "larango@gmail.com"));
    }
    /**
     * Busca un user en el arreglo users
     * @param prmUserLoginName Nombre de usuario 
     * @return objeto User
     */
    @Override
    public User findUser(String prmUserLoginName) {
        for (User user : users) {
            if (user.getUserLoginName().equals(prmUserLoginName)) {
                return user;
            }
        }
        return null;
    }
    /**
     * Agrega un nuebo usuario y retorna su nombre de usuario
     * @param prmUser objeto User
     * @return Nombre de usuario
     */
    @Override
    public String createUser(User prmUser) {
        users.add(prmUser);
        return prmUser.getUserLoginName();
    }
    
}
