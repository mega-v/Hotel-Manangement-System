package hotelmanagement;

import javax.swing.JOptionPane;

public class MyException extends Exception{

    private String message;

    public MyException(String message) {
        this.message = message;
        JOptionPane.showMessageDialog(null, message, "Problem", JOptionPane.ERROR_MESSAGE);
        
    }
    
}
