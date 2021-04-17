public class JavaProgrammer implements OOP_Programmer {

    @Override
    public void writeCode() {
        System.out.println("writing Java code" );
    }

    @Override
    public void readCode(String code) {
        System.out.println("writing Java " + code );

    }

    @Override
    public int estimate() {
        System.out.println("Java estimation 10" );

        return 10;
    }

    @Override
    public void createObject() {

    }
}
