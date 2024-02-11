package cLIENT;

import pack1.*;

public class ClientApp {
public static void main(String[] args) {
	First ob = new First(10);
	Second sc = new Second("Rahul");
	System.out.println(ob.getId());
	System.out.println(sc.getName());
}
}
