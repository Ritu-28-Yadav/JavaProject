public class Student2{
public static void main(String[]args){


String st= "absdksldf";
int len =st.length();

String reverse="";
System.out.println("Original : " +st);

for(int i=len-1;i>=0;i--){
reverse=reverse+st.charAt(i);
}
System.out.println("reverse : "+reverse);
}
}

