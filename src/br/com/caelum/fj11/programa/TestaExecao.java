package caelum.fj11.programa;

public class TestaExecao {
    public static void main(String[] args) {
        System.out.println("inicio main");
        m1();
        System.out.println("fim main");
    }
    public static void m1() {
        System.out.println("inicio m1");
        m2();
        System.out.println("fim m1");
    }
    public static void m2() {
        System.out.println("inicio m2");
        int[] nums = new int[5];
        for (int i = 0; i < 6; i++) {
            try{
                nums[i] = i * 2;
                System.out.println(nums[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Probema!");
            }

        }
        System.out.println("fim m2");
    }
}
