 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer a = 1;
          for(int i = 1; i <= number; i++){
              a *= i;
            }
          return a;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] acronym = phrase.split(" ");
          String acro = "";
          for (int i = 0; i < acronym.length; i++){
              acro += acronym[i].charAt(0);
              
            }
          return acro.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          
          int shiftValue = 3;
          System.out.println(word);
          char[] result = new char[word.length()];
          for (int i = 0; i < result.length; i++) {
              System.out.println(result[i]);/*
              if(word.charAt(i) == 120 || word.charAt(i) == 121 || word.charAt(i) == 122){
                  result[i] = (char)((word.charAt(i) + 13 - (int)'a') % 26 + (int)'a');
                  System.out.println(result[i]);
                }*/
                if((char)(word.charAt(i)) > 120 || i == 1){
                    result[i] = (char) (word.charAt(i) - 26);
                }
                result[i] = (char) (word.charAt(i) + shiftValue);
                
            }
           String destString = new String(result);
          
          return destString;
      }
}
