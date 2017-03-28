/**
 * Created by g.dolgin on 15.03.17.
 */
public class GeneralExe {
    public static void main (String[] args){
    final String TargetUrl = "http://hosting.rc17-10.newcp-dev.timeweb.ru/";
CreateNewHosting hosting = CreateNewHosting.Credentials();
System.out.println(hosting.getPass()+" "+hosting.getUserName());
    }




}
