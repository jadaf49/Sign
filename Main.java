public class Main
{
    public static void main(String[]args)
    {
        Sign sign1=new Sign("ABC222DE",3); 
        System.out.println(sign1.numberofLines()); //should print 3
        System.out.println(sign1.getLines()); // should print ABC;222;DE
        
        Sign sign2=new Sign("ABCD",10);
        System.out.println(sign2.numberofLines());
        System.out.println(sign2.getLines());

        Sign sign3=new Sign("ABCDEF",6);
        System.out.println(sign3.numberofLines());
        System.out.println(sign3.getLines());

        Sign sign4=new Sign("",4);
        System.out.println(sign4.numberofLines());
        System.out.println(sign4.getLines());

        Sign sign5=new Sign("AB_CD_EF",2);
        System.out.println(sign5.numberofLines());
        System.out.println(sign5.getLines());

    }
}