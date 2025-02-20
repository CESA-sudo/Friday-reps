
class Person {
  String PersonName;
  int PersonAge;


  Person(String name, int age ) {
    PersonName= name;
    PersonAge = age;
  }
  void printInfo() {
    println (PersonName + " " + PersonAge + " " );
  }
  void hasBirthday () {
    PersonAge++;
  }
}
