class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();

        for(String s:strs){
            sb.append(s.length()).append('#').append(s);

        }
        return sb.toString();


    }

    public List<String> decode(String str) {
List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int hash = str.indexOf('#', i);
            
            int len = Integer.parseInt(str.substring(i, hash));
            
           
            res.add(str.substring(hash + 1, hash + 1 + len));
            
           
            i = hash + 1 + len;
        }
        
        return res;
    }
}
