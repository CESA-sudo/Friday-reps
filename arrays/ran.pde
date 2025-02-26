String [] groupMembers = new String[3];

void setup() {
  groupMembers[0]= "Samuel";
  groupMembers[1]= "John";
  groupMembers[2]= "Nami";

  int x = 0;//counter

  for (String g : groupMembers) {
    x++;
    println (x+". " +g);
  }

  int randomMembers =(int)random(0, 3);
  println (groupMembers[randomMembers] );

String lastName = lastMember();
println(lastName);
}

String lastMember() {
  int index= groupMembers.length-1;
  return groupMembers[index];
}
