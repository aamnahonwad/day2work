class College {
    private String collegeName;
    private int totalStudents;

    College(String name, int total) {   // constructor
        collegeName = name;
        totalStudents = total;
    }

    String getCollegeName() { return collegeName; }
    int getTotalStudents() { return totalStudents; }
}

class CollegeInfo {
    public static void main(String[] args) {
        College c = new College("ABC College", 1200);
        System.out.println(c.getCollegeName());
        System.out.println(c.getTotalStudents());
    }
}