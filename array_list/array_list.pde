int [] arr = new int [10];// this is a way to make a array but no list
arr [1] = 3;
int q = arr[3];


ArrayList<Integer>alist= new ArrayList();// how u make an arraylist
//alist.add(0, 1); // u can also try alist.add(1)
//alist.add(1, 3);// means we want to add 3 into index 1

for (int i =0; i< 10; i++) {// arraylist is .size
  alist.add(i);// make a loop that adds values into indexes
}

/*for (int i =0; i< arr.length; i++) { //array is .lenght
  arr[i]=i;
  println(arr[i]);
}*/

for (int n =0; n< alist.size(); n++) {
  int value = alist.get(n); //u add (int) after the equals sign if it wasn'defined  when making the arraylist
  println(alist.get(n));// how to print out an array list
}

for (int k : alist){
  println(k);

}
