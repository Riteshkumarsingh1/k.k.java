public class 551StudentAttendenceRecord {
    public static void main(String[] args){

    }
    static boolean  checkRecord(String s){
        int count A=0;
        int count L=0;
        for (int i=0; i<s.length;i++){
            if s.charAt (i) == A{
                count A++;
            }
            if s.charAt (i) ==L{
                count L++;
            }
            if (count A>1 || count L>2){
                return false;
            }

        }
        return true;
    }
    
}
