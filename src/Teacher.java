public class Teacher {
    String name;
    String telNo;
    String branch;

    Teacher(String name, String telNo, String branch) {
        this.name = name;
        this.telNo = telNo;
        this.branch = branch;
    }

    void print() {
        System.out.println("Isim : " + this.name);
        System.out.println("Brans : " + this.branch);
        System.out.println("Telefon Numarasi : " + this.telNo);
    }


}
