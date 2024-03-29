package Zap;

public class TypeCastingBoxingUnboxing {
    public static void main(String[] args) {
        //int to byte
        int i = 128;
        byte bs = (byte)i;
        System.out.println(bs);

        //byte to int
        byte hs = 100;
        int ms = hs;
        System.out.println(ms);

//        double to folt

        double ds = 10.20;
        float fs = (float) ds;
        System.out.println(fs);

        // float to double

        float fd =10.60f;
        double dd = fd;
        System.out.println(dd);
    }

}
//
//        byte	1 byte	Stores whole numbers from -128 to 127
//        short	2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	Stores true or false values
//        char	2 bytes	Stores a single character/letter or ASCII values

//    Widening Casting (automatically) - converting a smaller type to a larger type size
//        byte -> short -> char -> int -> long -> float -> double
//
//        Narrowing Casting (manually) - converting a larger type to a smaller size type
//        double -> float -> long -> int -> char -> short -> byte
