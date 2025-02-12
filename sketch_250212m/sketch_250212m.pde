
int Terning1;
int Terning2;
int sum=0;

while(sum<=21){
Terning1=int(random(1,14));
Terning2=int(random(1,14));
sum=Terning1+Terning2;
println("Sum is:"+sum);
}
if (sum==21){
println("WIN:"+sum);
}else if (sum >21){
println("BUST:"+sum);
}else {

}
