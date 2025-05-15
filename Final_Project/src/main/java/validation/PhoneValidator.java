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
public class PhoneValidator {
    private static final String PHONE_REGEX = "^(\\(\\d{3}\\)\\s?|\\d{3}[-.\\s]?)?\\d{3}[-.\\s]?\\d{4}$|^\\d{10}$";
    
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);
    
    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }
        return PHONE_PATTERN.matcher(phoneNumber).matches();
    }
}
