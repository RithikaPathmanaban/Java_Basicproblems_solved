class Queue{
int a[] = new int[5];
int r = -1;
int f=-1;
int i;
public void Enqueue(int data){

if(r == a.length-1){

System.out.println("Queue is full");
}
else if(r==-1 && f ==-1){
r=0;
f=0;
a[r] = data;
}

else{
	r++;
	a[r]=data;
}
}


public void dequeue(){
if(r==-1 && f==-1){
System.out.println("Queue is empty");
}
else if(r == f){
System.out.println("Element poped"+ a[f]);
r=-1;
f=-1;
}
else{
System.out.println("Element poped"+ a[f]);
f++;
}
}
public void display(){
if(r==-1 && f==-1){
System.out.println("Queue is empty");
}
else{
for(i= f;i<=r;i++)
System.out.println(a[i]);}
}

public void peek(){

System.out.println("Peel " + a[f]);}
public static void main(S tring[] args){
Queue q = new Queue();
q.Enqueue(10);
q.Enqueue(20);
q.Enqueue(30);
q.dequeue();
q.display(); 
q.peek();
}
 
}