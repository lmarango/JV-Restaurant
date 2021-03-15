package co.unicauca.restaurant.commons.domain;

/**
 *
 * @author Luis Arango
 */
public class Restaurant {
// <editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Identificador del restaurante
     */
    private String resID;
    /**
     * Nombre del administrador
     */
    private String userName;
    /**
     * Nombre del restaurante
     */
    private String resName;
    /**
     * Dirección del restaurante
     */
    private String resAddress;
    /**
     * Descripción del tipo de comida
     */
    private String resDescFood;
// </editor-fold>
//<editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor parametrizado de la clase Restaurant
     * @param resID Identificador del restaurante
     * @param userName Nombre del administrador
     * @param resName Nombre del Restaurante
     * @param resAddress Dirección del Restaurante
     * @param resDescFood DescdelTipo de comida
     */
    public Restaurant(String resID, String userName, String resName, String resAddress, String resDescFood) {
        this.resID = resID;
        this.userName = userName;
        this.resName = resName;
        this.resAddress = resAddress;
        this.resDescFood = resDescFood;
    }
    /**
     * Constructor no parametrizado por defecto de la clase Restaurant
     */
    public Restaurant() { }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Obtiene el identificador del restaurante
     * @return resID
     */
    public String getResID() {
        return resID;
    }
    /**
     * Obtiene el nombre del administrador
     * @return userName
     */
    public String getUserName() {
        return userName;
    }
    /**
     * Obtiene el nombre del restaurante
     * @return resName
     */
    public String getResName() {
        return resName;
    }
    /**
     * Obtiene la dirección del restaurante
     * @return resAddress
     */
    public String getResAddress() {
        return resAddress;
    }
    /**
     * Obtiene la descripción de la temática de comida del restaurante
     * @return resDescFood
     */
    public String getResDescFood() {
        return resDescFood;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Modifica el identificador del restaurante
     * @param resID nuevo identificador
     */
    public void setResID(String resID) {
        this.resID = resID;
    }
    /**
     * Modifica el nombre del administrador
     * @param userName nuevo nombre de administrador
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * Modifica el nombre del restaurante
     * @param resName Nuevo nombre del restaurante
     */
    public void setResName(String resName) {
        this.resName = resName;
    }
    /**
     * Modifica la dirección del restaurante
     * @param resAddress Nueva dirección
     */
    public void setResAddress(String resAddress) {
        this.resAddress = resAddress;
    }
    /**
     * Modifica la temática de la comida del restaurante 
     * @param resDescFood Nueva temática
     */
    public void setResDescFood(String resDescFood) {
        this.resDescFood = resDescFood;
    }
//</editor-fold>   
}
