/* Singleton class means you can create only one object for the given class. You can create a
singleton class by making its constructor as private, so that you can restrict the creation of
the object. Provide a static method to get instance of the object, wherein you can handle the
object creation inside the class only.

For example, if you have a license for only one connection for your database or your JDBC driver
has trouble with multithreading, the Singleton makes sure that only one connection is made or that
only one thread can access the connection at a time.*/


public class Singleton
{
   private static Singleton singleton = new Singleton( );

   // A private Constructor prevents any other class from instantiating.
   private Singleton(){ }

   /* Static 'instance' method */
   public static Singleton getInstance()
   {
      return singleton;
   }

   // Other methods protected by singleton-ness
   protected static void demoMethod( )
   {
      System.out.println("demoMethod for singleton");
   }

   public static void main(String[] args)
   {
      Singleton tmp = Singleton.getInstance( );
      tmp.demoMethod();
   }
}