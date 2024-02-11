package jdbcdemo;
import java.util.*;
public class MyNum{

private int num;


public MyNum(int num){
this.num=num;
}
public int getNum() {
	return num;
}


public void setNum(int num) {
	this.num = num;
}
}

class Demo{
public static void main(String[] args){

ArrayList<MyNum> l1 = new ArrayList<>();
l1.add(new MyNum(100));
l1.add(new MyNum(200));
l1.add(new MyNum(300));
l1.add(new MyNum(400));

Iterator it=l1.iterator();

while(it.hasNext()){

System.out.println((it));
}
}


}