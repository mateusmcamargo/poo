public class User {
    
    // class atributes: doc number (int) and name (String)
    int doc;
    String name;
    
    // method ('function') used to insert data in User object
    public void insertData() {
        
        // local variables
        int doc     = 1;
        String name = "Mateus";
        
        // assigning local variables to instance atributes
        // 'this.doc' refers to the class atribute, while 'doc' and 'name' are local
        this.doc  = doc;
        this.name = name;
        
    }
    
    // method ('function') used to show data stored in user object
    public void showData() {
        
        // print data in console
        System.out.println("DOC.: " + doc);
        System.out.println("NAME: " + name);
        
    }
    
    // main method
    public static void main(String arg[]) {
        
        // create new user object
        User user = new User();
        
        // call methods
        user.insertData();
        user.showData();
        
    }
    
}
