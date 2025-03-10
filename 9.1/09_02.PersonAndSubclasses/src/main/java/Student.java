public class Student extends Person{
    private int studyCredit;
    public Student(String name, String address){
        super(name, address);
        this.studyCredit = 0;
    }
    public void study(){
        studyCredit++;
    }
    public int credits(){
        return studyCredit;
    }
    @Override
    public String toString(){
        return getName() + "\n  " + getAddress() + "  \n  Study credits " + studyCredit;
    }
}
