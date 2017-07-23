import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class JavaInterPython
 {
        public static void main(String[] args)
        {
                try{
                        System.out.println("start");

                    

                        // 将参数传递给Python并执行爬取学生信息的py文件
						  String pr = "python C:/Python27/py/studentInf/all.py" + " " + stuId + " " + stuPassword + " " + userId + " " + schoolId;
                          Process process = Runtime.getRuntime().exec(pr);
						  
                        BufferedReader in = new BufferedReader(new
                                InputStreamReader(pr.getInputStream()));
                        String line;
                        while ((line = in.readLine()) != null)
                         {
                            System.out.println(line);
                         }
                        in.close();
                        pr.waitFor();
                        System.out.println("end");
                } catch (Exception e){
                            e.printStackTrace();
                        }
         }
}
