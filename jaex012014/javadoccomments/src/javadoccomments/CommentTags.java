package javadoccomments; 

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.Serializable;

/**
 * 
 * @author Java Student
 * @version 1.5
 */
public class CommentTags implements Serializable {
    /**
     * 
     * @param a First String for concationation
     * @param b Second String for concatination
     * @return Return concatinated strings
     */
    public String concatMethod(String a, String b){
        return a + b;
    }
    /**
     * @exception ArithmeticException
     * @see ArithmeticException
     * @since 1.4
     */
    public void exceptionComment(){
        throw new ArithmeticException();
    }
    
    /**
     * @serial point_x include
     */
    public int point_x;
    
    /**
     * @deprecated this method is deprecated
     */ 
    public void depricatedMethod(){
        
    }
}
