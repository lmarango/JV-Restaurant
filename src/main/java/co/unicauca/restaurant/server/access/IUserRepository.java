package co.unicauca.restaurant.server.access;

import co.unicauca.restaurant.commons.domain.User;

/**
 * Interfaz del repositorio de Usuarios
 * @author Luis Arango
 */
public interface IUserRepository {
    /**
     * Busca un User por su nombre de usuario(Login)
     * @param prmUserLoginName Nombre de usuario(Login)
     * @return Objeto de tipo User
     */
    public User findUser(String prmUserLoginName);
    public String createUser(User prmUser);
}
