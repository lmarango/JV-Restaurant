package co.unicauca.restaurant.commons.domain;

/**
 *
 * @author Luis Arango
 */
public class User {
// <editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Nombre de usuario para logeo 
     */
    private String userLoginName;
    /**
     * Contraseña asociada al userLoginName
     */
    private String userPassword;
    /**
     * Nompre natural del usuario
     */
    private String userNames;
    /**
     * Apellido del usuario
     */
    private String userLastName;
    /**
     * Numero de cedula del usuario
     */
    private String userIDCard;
    /**
     * Dirección de domicilio del usuario 
     */
    private String userAddress;
    /**
     * Teléfono móvil del usuario
     */
    private String userMobile;
    /**
     * Correo electrónico del usuario
     */
    private String userEmail;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor parametrizado de la clase User
     * @param userLoginName Nombre para logeo en plataforma
     * @param userPassword Constraseña asociada al usuario
     * @param userNames Nombre natural del usuario  
     * @param userLastName Apellidos del usuario
     * @param userIDCard Numero de cédula del usuario
     * @param userAddress Dirección del usuario
     * @param userMobile Numero telefónico del usuario
     * @param userEmail Correo electrónico del usuario
     */
    public User(String userLoginName, String userPassword, String userNames, String userLastName, String userIDCard, String userAddress, String userMobile, String userEmail) {
        this.userLoginName = userLoginName;
        this.userPassword = userPassword;
        this.userNames = userNames;
        this.userLastName = userLastName;
        this.userIDCard = userIDCard;
        this.userAddress = userAddress;
        this.userMobile = userMobile;
        this.userEmail = userEmail;
    }
    /**
     * Constructor por defecto no parametrizado de la clase User
     */
    public User() { }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Obtine el nombre de logeo del usuario
     * @return UserLoginName
     */
    public String getUserLoginName() {
        return userLoginName;
    }
    /**
     * Obtiene la contraseña del usuario
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }
    /**
     * Obtiene el nombre(s) de pila del usuario
     * @return userNames
     */
    public String getUserNames() {
        return userNames;
    }
    /**
     * Obtiene el apellido del usuario 
     * @return userLastName
     */
    public String getUserLastName() {
        return userLastName;
    }
    /**
     * Obtiene el número de cédula del usuario
     * @return userIDCard
     */
    public String getUserIDCard() {
        return userIDCard;
    }
    /**
     * Obtiene la dirección del usario
     * @return userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }
    /**
     * Obtiene el número telefónico del usuario
     * @return userMobile
     */
    public String getUserMobile() {
        return userMobile;
    }
    /**
     * Obtiene el correo electrónico del usuario
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Modifica el nombre de usuario para logeo
     * @param userLoginName Nuevo nombre de usuario
     */
    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }
    /**
     * Modifica la contraseña del usuario
     * @param userPassword Nueva contraseña
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    /**
     * Modifica el nombre de pila del usuario
     * @param userNames Nuevo nombre
     */
    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }
    /**
     * Modifica el apellido del usaurio
     * @param userLastName Nuevo apellido
     */
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    /**
     * Modifica el número de cédula del usuario
     * @param userIDCard nuevo Número de cedula
     */
    public void setUserIDCard(String userIDCard) {
        this.userIDCard = userIDCard;
    }
    /**
     * Modifica la dirección de residencia del usuario
     * @param userAddress Nueva dirección
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    /**
     * Modifica el número telefónico del usuario
     * @param userMobile Nuevo número telefónico
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
    /**
     * Mofdifica el Email del usuario
     * @param userEmail Nuevo Email
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
//</editor-fold> 
}
