public class TapeDeckTestDrive {
    public static void main(String [] args){
        TapeDeck t=new TapeDeck();
        t.can_record=true;
        t.play_tape();
        if(t.can_record){
            t.record_tape();
        }
    }
}
class TapeDeck{
    boolean can_record=true;
    void play_tape(){
        System.out.println("tape playing");
    }
    void record_tape(){
        System.out.println("recording Tape");
    }
}
