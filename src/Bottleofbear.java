public class Bottleofbear {
    public void print_song(int bottles){
        String word="bottles";
        while(bottles>0)
        {
            if(bottles==1)
            {
                word="bottle";
            }
            System.out.println(bottles+" "+word+" of the bear on the wall");
            System.out.println(bottles+" "+word+" of the bear");
            System.out.println("Take on down");
            System.out.println("Pass it around");
            bottles--;
            if(bottles==0)
            {
                System.out.println("No more bottles of the beer on the wall");
            }
        }
    }
}
