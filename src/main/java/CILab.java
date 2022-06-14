public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        //removig whitespcases
        myString.trim();
        //saves each character in an array
        char[] myCharArray = myString.toCharArray();
        boolean isLowerCase = true;
        //check if all characters are uppercase
        if (myString.equals(myString.toUpperCase()))
            return true;
        //check if all characters are lowercase
        if (myString.equals(myString.toLowerCase()))
            return true;
        //check if first character is uppercase and the rest lowercase
        if (Character.isUpperCase(myCharArray[0]))
            for (int i = 1; i < myCharArray.length; i++)
                if (!Character.isLowerCase(myCharArray[i]))
                    isLowerCase = false;
                if(isLowerCase == true)
                    return true;
        return false;
    }
}

