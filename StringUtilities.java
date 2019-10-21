
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue += valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder a = new StringBuilder();
        a.append(valueToBeReversed);
        a = a.reverse();
        
        return a.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        System.out.println(word);
        int middle = word.length()/2;
        char mid = word.charAt(middle);
        return mid;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        
        System.out.println(charToRemove);
        StringBuilder newString = new StringBuilder(value);
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) == charToRemove){
                newString.deleteCharAt(i);
                value = newString.toString();
            }
        }
        
        return newString.toString();
        
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return sentence.substring(sentence.lastIndexOf(" ")+1);
    }
}
