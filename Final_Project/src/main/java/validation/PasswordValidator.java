/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.util.regex.Pattern;

/**
 *
 * @author arenarune
 */
public class PasswordValidator {
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$";
    
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    
    public static String validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            return "Password is empty or null.";
        }
        
        StringBuilder explanation = new StringBuilder();
        
        if (password.length() < 8) {
            explanation.append("Password must be at least 8 characters long.\n");
        }
        
        if (!password.matches(".*[A-Z].*")) {
            explanation.append("Password must contain at least one uppercase letter.\n");
        }
        
        if (!password.matches(".*[a-z].*")) {
            explanation.append("Password must contain at least one lowercase letter.\n");
        }
        
        if (!password.matches(".*\\d.*")) {
            explanation.append("Password must contain at least one digit.\n");
        }

        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            explanation.append("Password must contain at least one special character.\n");
        }
        
        if (explanation.length() == 0) {
            return "Password is valid!";
        }
        
        return explanation.toString();
    }
    
}
