public class FizzBuzzGame {
    void FizzBuzz(){
        String result;
        for (int i = 0; i <100 ; i++) {
            if(i%15==0)
                result="FizzBuzz";
            else if(i%3==0)
                result="Fizz";
            else if(i%5==0)
                result="Buzz";
            else
                result=Integer.toString(i);
            System.out.println(result);
        }
    }
    public static void main(String[] args){
        FizzBuzzGame object=new FizzBuzzGame();
        object.FizzBuzz();
    }
}
