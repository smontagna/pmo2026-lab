class TestStudent {
  public static void main(String[] args) {
      Student mario = new Student("Mario", "Rossi", 1014, 2019);
      mario.printStudentInfo();

      Student luigi = new Student("Luigi", "Gentile", 1015, 2019);
      luigi.printStudentInfo();

      Student simone = new Student("Simone", "Bianchi", 1016, 2018);
      simone.printStudentInfo();

      Student andrea = new Student("Andrea", "Bracci", 1017, 2017);
      andrea.printStudentInfo();
  }
}
