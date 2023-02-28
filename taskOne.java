public class taskOne {
    public String reverseWords(String s) {
    
        StringBuilder str=new StringBuilder(s);
        
        s=str.reverse().toString().trim()+" ";
        
        String word="",ans=""; int fg=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                fg=0;
                word=s.charAt(i)+word;
            }
            else if(fg==0) 
            {
                ans+=" "+word;
                fg=1;
                word="";
            }
        }
        return ans.trim();
    }
}