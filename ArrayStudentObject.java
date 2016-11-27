import java.util.ArrayList;
import java.util.Collections;
class ArrayStudentObject {
  private String name;
  private int studentNum;
  ArrayStudentObject(String name, int sNum) {
    this.name=name;
    this.studentNum=sNum;
  }
  public String getName() {
  return name;
  }
  public static void main(String[] args) {
    ArrayList<String> studentNameList=new ArrayList<String>();
    ArrayStudentObject s1=new ArrayStudentObject("odk",201611084);
    studentNameList.add(s1.getName());
    Collections.sort(studentNameList);
    System.out.println(studentNameList);
  }
}