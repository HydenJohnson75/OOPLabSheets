package LabSheet8.exercise2;

public class Validator extends Vehicle{
    String reg;
    boolean valid;

    public boolean isValidRegistrationNumber(String reg){
        for(int i = 0;i <reg.length(); i++){
            if(reg.length() >= 6  && reg.length() <=12){
                if(Character.isDigit(reg.charAt(0)) && Character.isDigit(reg.charAt(1))){
                    if(reg.charAt(2) == '-'){
                        if((Character.isUpperCase(reg.charAt(3)) && Character.isUpperCase(reg.charAt(4)) && reg.charAt(5) == '-') || Character.isLowerCase(reg.charAt(3)) && reg.charAt(4) == '-'){

                        }
                        else valid = false;
                    }
                    else valid = false;
                }
                else valid = false;
            }
            else
                valid = false;
        }
        return valid;
    }
}
