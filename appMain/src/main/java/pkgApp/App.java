package pkgApp;

import pkgNotif.Notif;
import pkgRep.Rep;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Rep<String> r = new Rep<>();
        Notif n = new Notif();
        r.addToList("pera");
        r.addToList("zika");
        r.printRep();
        n.sendNotif("report filled");
        
    }
}
