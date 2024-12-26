import java.lang.Exception;
import java.util.regex.Matcher;
import java.util.regex.*;

class WrongLoginException extends Exception{
    WrongLoginException(String message){
        super(message);
    }
}

class WrongPasswordException extends Exception{
    WrongPasswordException(String message){
        super(message);
    }
}

class WrongМatchException extends Exception{
    WrongМatchException(String message){
        super(message);
    }
}

public class CheckPassword {
    static void checkPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException, WrongМatchException{
        Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{1,20}$");
        Matcher matcher = pattern.matcher(login);
        if (!matcher.matches()){
            throw new WrongLoginException("Логин не соответствует требованиям");
        }
        Matcher matcher1 = pattern.matcher(password);
        if (!matcher1.matches()){
            throw new WrongPasswordException("Пароль не соответствует требованиям");
        }
        if (password != confirmPassword){
            throw new WrongМatchException("Ваши пароли не совпадают");
        }
    }
    public static void main(String[] args) {
        try {
            checkPassword("dabra_52","slawamarlow_1","slawamarlow_2");
            System.out.println("Доступ предоставлен");
        }
        catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }
        catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }
        catch (WrongМatchException e){
            System.out.println(e.getMessage());
        }
    }
}
