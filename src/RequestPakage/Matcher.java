package RequestPakage;

import ExeptionsPakage.InputExeption;


/**
 * Created by georgipavlov on 23.02.16.
 */
public class Matcher {

    private static boolean match(String line) {
        if (line.equals("1") || line.equals("2") || line.equals("3")) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean matchQuantity(String line) {
        return line.matches("[-+]?\\d*\\.?\\d+");
    }

    private static boolean matchName(String line) {
       if(line.length() < 50){
           return true;
       }else {
           return false;
       }
    }

    public static int returnKey(String tryNumber,String exeptionMessage) throws InputExeption {
        int choice;
        if (match(tryNumber)) {
            choice = Integer.parseInt(tryNumber);
        } else {
            throw new InputExeption(exeptionMessage);
        }
        return choice;
    }

    public static int returnQuantity(String tryQuantity,String exeptionMessage) throws InputExeption {
        int quantity;
        if (matchQuantity(tryQuantity)) {
            quantity = Integer.parseInt(tryQuantity);
        } else {
            throw new InputExeption(exeptionMessage);
        }
        return quantity;
    }

    public static String returnName(String tryName,String exeptionMessage) throws InputExeption {
        if (matchName(tryName)) {
            return  tryName;
        } else {
            throw new InputExeption(exeptionMessage);
        }
    }
}
