Student[] students = new Student [10];

void setup() {
  /*String[] StudentName = {"Samuel", " Nami","Daniel","Emil","Oliver","Carl","John","Karl","Chris","Ben"};
   int n= 0;
   for (String g : StudentName) {
   n++;
   println (n+". " +g);
   }*/

  ArrayList<Student>names= new ArrayList();
  names.add (new Student("Daniel"));
  names.add (new Student("Samuel"));
  names.add (new Student("Nami"));
  names.add (new Student("John"));
  names.add (new Student("Emil"));
  names.add (new Student("Oliver"));
  names.add (new Student("Carl"));
  names.add (new Student("Ben"));
  names.add (new Student("Chris"));
  names.add (new Student("Karl"));


  for (int s = 0; s < names.size(); s++) {

    println(names.get(s).getNames());// how to print out an array list
  }
}
