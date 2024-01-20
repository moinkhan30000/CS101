public class test {
    public static void main(String[] args) {
        Date s1 = new Date(2023,9,29);
        Date s2 = new Date(2023,9, 30);
        boolean f = s1.isBefore(s2);
        String m = s1.toString();
        int d = s1.daysBetween(s2)
        
       ;
        System.out.println(f);
         
    
    }
    
}
