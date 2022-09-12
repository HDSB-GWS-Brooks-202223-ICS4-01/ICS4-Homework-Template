public class Question4 {
 
	public static void main(String[] args) {
 

        String original = "software";
        String result = new String("hi");
        int index = original.indexOf('a');
     
/*1*/	result = index;
/*2*/	result = result + original.substring(0,1);
/*3*/	result = result + " " + original.length();
/*4*/   result = result.replace('i', 'j');
        
        System.out.println(result);
    }
} 

