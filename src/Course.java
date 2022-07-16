public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    double averageNote;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbalNote = 0;
        double averageNote = 0.0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ile Ders Uyusmamaktadir.");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
