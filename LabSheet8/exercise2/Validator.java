package LabSheet8.exercise2;

public class Validator {

    public static boolean isValidRegistrationNumber(String reg){

        boolean valid = false;

            if(reg.length() >= 6  && reg.length() <=12){
                if(Character.isDigit(reg.charAt(0)) && Character.isDigit(reg.charAt(1))){
                    if(reg.charAt(2) == '-'){
                        if(Character.isUpperCase(reg.charAt(3)) && reg.charAt(4) == '-'){
                            for(int i = 4;i <reg.length(); i++) {
                                if (Character.isDigit(reg.charAt(i))) {
                                    valid = true;
                                }
                            }
                        }
                        else if(Character.isUpperCase(reg.charAt(3)) && Character.isUpperCase(reg.charAt(4)) && reg.charAt(5) == '-' && Character.isDigit(reg.charAt(6))){
                            for(int i = 5;i <reg.length(); i++){
                                if(Character.isDigit(reg.charAt(i))){
                                    valid = true;
                                }
                            }
                        }
                        else valid = false;
                    }
                    else valid = false;
                }
                else valid = false;
            }
            else
                valid = false;

        return valid;
    }
}
