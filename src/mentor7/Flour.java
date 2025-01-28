package mentor7;

public class Flour {
    public static void main(String[] args) {
        System.out.println(packFlour.canPack(1,0,4));
        System.out.println(packFlour.canPack(1,0,5));
        System.out.println(packFlour.canPack(0,5,4));
        System.out.println(packFlour.canPack(2,2,11));
        System.out.println(packFlour.canPack(-3,2,12));
        System.out.println(packFlour.canPack(3,-2,-12));

    }
}