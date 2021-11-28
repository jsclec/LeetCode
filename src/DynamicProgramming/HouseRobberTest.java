package DynamicProgramming;

public class HouseRobberTest {
    public static void main(String[] args){
        HouseRobber hr = new HouseRobber();
        int[] street  = {21, 32, 14, 5, 16, 13, 7, 23, 4, 2, 19, 21, 10};
        System.out.println(hr.robSomeHouses(street));
    }

}
