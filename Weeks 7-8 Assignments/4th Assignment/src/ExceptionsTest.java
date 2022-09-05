import java.io.File;
import java.io.IOException;

public class ExceptionsTest {
    
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
            
                if (i == 0) {
                    String variable = null;
            
                    if (variable == null) {
                        throw new NullPointerException("Variable is null");
                    }
                } 
                
                else if (i == 1) {
                    File file = null;
            
                        if (file == null) {
                            throw new IOException("File does not exist");
                        }
                } 
                
                else if (i == 2) {
                    throw new ExceptionA("Invalid index value");
                } 
                
                else if (i == 3) {
                    throw new ExceptionB("Invalid index value");
                } 
                
                else {
                    throw new Exception("Generic Exception");
                }  
            } 
            
            catch (NullPointerException exception) {System.out.println("NullPointerException: " + exception.getMessage());} 
            catch (IOException exception) {System.out.println("IOException: " + exception.getMessage());}
            catch (ExceptionA exception) {System.out.println("ExceptionA: " + exception.getMessage());}  
            catch (ExceptionB exception) {System.out.println("ExceptionB: " + exception.getMessage());} 
            catch (Exception exception) {System.out.println(exception.getMessage());}  
        }
    }
}
