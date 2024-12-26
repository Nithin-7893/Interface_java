interface food
{  
void show();  
}  
class Fruits implements food 
{  
public void show()
{
System.out.println("**PRINTING FRUITS**");
System.out.println("APPLE"+"\nORANGE"+"\nBANANA");
}
}
class Vegetables implements food
{
public void show()
{
System.out.println("**PRINTING VEGETABLES**");
System.out.println("BRINJAL"+"\nCARROT"+"\nBEETROOT");
} 
}
class Interface
{   
public static void main(String args[])
{  
Fruits f = new Fruits(); 
Vegetables v=new Vegetables(); 
f.show();  
v.show();
 }  
}  
