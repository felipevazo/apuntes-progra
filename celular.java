* 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class celular
{
    static Scanner entrada=new Scanner(System.in);
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private boolean estado;
    private String tamaño;
    linterna linterna;
    /**
     * Constructor for objects of class celular
     */
    public celular(String marca,String modelo,boolean estado,String tamaño)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.estado=estado;
        this.tamaño=tamaño;
        linterna=new linterna();
        
    }

    
    public void encenderlinterna()
    {
       linterna.encenderLinterna();
    }
    public void mostrardatoslinterna()
    {
        linterna.mostrar();
    } 
    public void descargLinterna() throws InterruptedException
    {
        linterna.descargarBateria();
        
    }
    public void apagarlinterna()
    {
        linterna.apagarLinterna();
        
    }
    
    public String toString()
    {
        String mensaje="El celular es de marca "+marca+", de modelo "+modelo+", su estado es "+estado+", su tamaño es "+tamaño+" y tiene una linterna "+linterna;
        
        return mensaje;
    }
    public void Mostrardatos()
    {
        System.out.println(toString());
    }
}
