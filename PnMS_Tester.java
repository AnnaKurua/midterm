package midterm.ana_kurua_2.task3;

public class PnMS_Tester {
    public static void main(String[] args) {
        PhoneNum num1 = new PhoneNum();
        num1.setName("Mariam");
        num1.setNum(555121315);

        PhoneNum num2 = new PhoneNum();
        num2.setName("Sophia");
        num2.setNum(599213243);

        PhoneNum num3 = new PhoneNum();
        num3.setName("Nini");
        num3.setNum(500112233);

        PnMS pnms = new PnMS();
        pnms.addNum(num1);
        pnms.addNum(num2);
        pnms.addNum(num3);

        pnms.removeNum(num3);

        pnms.printStorage();



    }
}
