public class anagram {
    public static void main(String args[]){
        int count1[] = new int[26];
        int count2[] = new int[26];
        int flag=0;
        
        char[] firstWord = args[0].toLowerCase().toCharArray();   
        char[] secondWord = args[1].toLowerCase().toCharArray();

        if(firstWord.length == secondWord.length){
            
            for(int i=0;i<firstWord.length;i++){

                count1[firstWord[i]-97]++;
                count2[secondWord[i]-97]++;
                
            }

           for (int i=0;i<26;i++){

            if(count1[i]!=count2[i]){
                flag=1;
                break;
            }
           }
        }
        else
        flag=1;

        if(flag==1){

            System.out.println("Not an anagram");
        }
        else{
            System.out.println("Anagram");
        }