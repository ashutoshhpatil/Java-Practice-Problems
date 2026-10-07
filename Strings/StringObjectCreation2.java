package Strings;

public class StringObjectCreation2 {
    public static void main(String[] args) {

        String s =new String("Durga");

        s.concat("Software");

        s=s.concat("Solutions");

        System.out.println(s);
    }
}

/*
* Total objects created = 6

Object	               Location
"Durga"	                SCP
new String("Durga")	    Heap
"Software"	            SCP
"DurgaSoftware"	        Heap
"Solutions"	            SCP
"DurgaSolutions"	   Heap
* */