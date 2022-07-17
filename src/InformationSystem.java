public class InformationSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ayse", "05551112233", "TUR");
        Teacher t2 = new Teacher("Fatma","05449992233", "MAT");
        Teacher t3 = new Teacher("Hayriye","05332225566", "KMY");

        Course turkce = new Course("Turkce", "101", "TUR");
        turkce.addTeacher(t1);
        Course mat = new Course("Matematik","101", "MAT");
        mat.addTeacher(t2);
        Course kimya = new Course("Kimya", "102", "KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali", "123", "5",turkce,mat,kimya);
        s1.addBulkExamNote(87,65,78);
        s1.addBulkVerbalNote(80,75,88);
        s1.isPass();


        Student s2 = new Student("Ahmet", "4125", "5", turkce,mat,kimya);
        s2.addBulkExamNote(40,45,30);
        s2.addBulkVerbalNote(10,25,60);
        s2.isPass();
    }
}

