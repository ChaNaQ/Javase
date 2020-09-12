/**
 * @ 作者：
 * @ 功能：
 * @ 日期 2020/9/10 4:30 下午
 */
public class Student {
    private  String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void study(){
        System.out.println("学生学习");
    }

}
