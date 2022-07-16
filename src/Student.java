public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addBulkVerbalNote(int nVerbal1, int nVerbal2, int nVerbal3) {
        if (nVerbal1 >= 0 && nVerbal1 <= 100) {
            this.c1.verbalNote = nVerbal1;
        }
        if (nVerbal2 >= 0 && nVerbal2 <= 100) {
            this.c2.verbalNote = nVerbal2;
        }
        if (nVerbal3 >= 0 && nVerbal3 <= 100) {
            this.c3.verbalNote = nVerbal3;
        }

    }

    void calcAverage() {
        double c1Average = (this.c1.note * 0.7) + (this.c1.verbalNote * .3);
        double c2Average = (this.c2.note * 0.8) + (this.c2.verbalNote * .2);
        double c3Average = (this.c3.note * 0.75) + (this.c3.verbalNote * .25);
        double GPA = (c1Average + c2Average + c3Average) / 3;
        this.average = GPA;
    }

    void isPass() {
        printNote();
        if (this.average >= 70) {
            System.out.println("TEBRIKLER SINIFI GECTINIZ.");
            this.isPass = true;
        } else {
            System.out.println("SINIFI GECEMEDINIZ.");
            this.isPass = false;
        }

    }

    void printNote() {
        System.out.println("=========================");
        System.out.println("Ogrenci Adi : " + this.name);
        System.out.println("");
        System.out.println(this.c1.name + " Yazili Notunuz : " + this.c1.note
                + "\nSozlu Notunuz : " + this.c1.verbalNote);
        System.out.println("");
        System.out.println(this.c2.name + " Yazili Notunuz : " + this.c2.note
                + "\nSozlu Notunuz : " + this.c2.verbalNote);
        System.out.println("");
        System.out.println(this.c3.name + " Yazili  Notunuz : " + this.c3.note
                + "\nSozlu Notunuz : " + this.c3.verbalNote);
        System.out.println("=========================");
    }

}
