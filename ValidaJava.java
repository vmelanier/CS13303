/**
 * Esta clase permite validar la instalación de <b><u>Java</u></b> por 
 * medio de las propiedades de sistema.
 * <ul>
 * <li>os.name</li>
 * <li>os.arch</li>
 * <li>java.vendor</li>
 * <li>java.version</li>
 * <li>java.home</li>
 * </ul>
 * 
 * Para más información visitar <a href="https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html"> The Java™ Tutorials / System Properties</a> 
 *
 * @author JM Lopez
 * @version 1.0
 * 
 */

public class ValidaJava {
    public static void main(String[] args){
        String propertyKeys[] = {"os.name", "os.arch", "user.dir", "user.home",
                                 "user.name", "java.vendor", "java.version", "java.home"};
        System.out.println("");
        System.out.println(String.format("Sistema Operativo: %s %s", System.getProperty(propertyKeys[0]),
                                                          System.getProperty(propertyKeys[1])));
        System.out.println(String.format("Proveedor de Java: %s", System.getProperty(propertyKeys[5])));
        System.out.println(String.format("Version de Java: %s ", System.getProperty(propertyKeys[6])));
        System.out.println(String.format("Java Home: %s", System.getProperty(propertyKeys[7])));
        System.out.println(String.format("Tiempo: %s", System.currentTimeMillis()));
        System.out.println(String.format("Si puedes leer esto %s (%s), completaste la actividad.",
            System.getProperty(propertyKeys[4]), System.getProperty(propertyKeys[3])));
        System.out.println("");
    }
}

