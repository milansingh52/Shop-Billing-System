
package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegValidation 
{
    private Pattern name, email, phone, password, address;
    private Matcher matcher;
    
    String name_pattern = "^[a-zA-Z_\\s]{3,30}$";
    String email_pattern = "^[a-zA-Z_]([a-zA-Z0-9\\._%+-]+)@[a-zA-Z_0-9\\.-]+\\.[a-z]{2,3}$";
    String phone_pattern = "^[0-9]{10}";
    String pass_pattern = "^[a-zA-Z0-9]{5,20}";
    String add_pattern = "[a-zA-z0-9-_\\s]{3,40}$";
    
    public RegValidation()
    {
        name = Pattern.compile(name_pattern);
        email = Pattern.compile(email_pattern);
        phone = Pattern.compile(phone_pattern);
        password = Pattern.compile(pass_pattern);
        address = Pattern.compile(add_pattern);
    }
    
    // registration form validation 
    public boolean nameValidation(String emp_name)
    {
        matcher = name.matcher(emp_name);
        return matcher.matches();
    }
    public boolean emailValidation(String emp_email)
    {
        matcher = email.matcher(emp_email);
        return matcher.matches();
    }
    public boolean passwordValidation(String emp_pass)
    {
        matcher = password.matcher(emp_pass);
        return matcher.matches();
    }
    public boolean phoneValidation(String emp_phone)
    {
        matcher = phone.matcher(emp_phone);
        return matcher.matches();
    }
    public boolean addressValidation(String address1)
    {
        matcher = address.matcher(address1);
        return matcher.matches();
    }
}
